package com.radar.achilles.services;

import com.radar.achilles.cdm.WalmartItem;
import com.radar.achilles.persist.entity.AchillesItemEntity;
import com.radar.achilles.persist.entity.WalMartItemEntity;
import com.radar.achilles.persist.repo.AchillesItemEntityRepo;
import com.radar.achilles.persist.repo.WalMartEntityRepo;
import com.radar.achilles.services.vendorServices.ebay.EbayService;
import com.radar.achilles.services.vendorServices.walmart.WalmartService;
import eBay.AddFixedPriceItemRequestType;
import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by Skradski on 7/26/2017.
 */
@Service
public class DashboardServiceImpl implements DashboardService {

    @Autowired public WalmartService walmartService;
    @Autowired public EbayService ebayService;

    @Autowired public WalMartEntityRepo walMartEntityRepo;

    @Autowired public AchillesItemEntityRepo achillesItemEntityRepo;

    MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();

    @Override
    public Boolean runPrototypeAchilles() {
        mapperFactory.classMap(WalmartItem.class, WalMartItemEntity.class).byDefault().register();
        MapperFacade mapper = mapperFactory.getMapperFacade();

        List<WalmartItem> list = walmartService.getItemListByCategoryId("3944_133277_1096663");
        List<WalMartItemEntity> entityList = new ArrayList<>();

        // map to entity
        if (list != null ){
            for (WalmartItem item : list){
                entityList.add(mapper.map(item, WalMartItemEntity.class));
            }

            //persist to db
            for (WalMartItemEntity entity : entityList){
                walMartEntityRepo.save(entity);
            }
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Boolean convertToAchillesItems() {
        List<WalMartItemEntity> walMartItemEntityList = (List<WalMartItemEntity>)walMartEntityRepo.findAll();

        // map WalmartItemEntity to AchillesItemEntity
        mapperFactory.classMap(WalMartItemEntity.class, AchillesItemEntity.class).byDefault().register();
        MapperFacade mapper = mapperFactory.getMapperFacade();

        for (WalMartItemEntity walMartItemEntity: walMartItemEntityList){
            AchillesItemEntity newEntity = mapper.map(walMartItemEntity, AchillesItemEntity.class);
            AchillesItemEntity oldEntity = achillesItemEntityRepo.findByItemId(newEntity.getItemId());

            //check to see if exists in list, if not set for new ebay listing and add to db

            if (oldEntity == null){
                newEntity.setIsListed(false);
                newEntity.setNeedsListed(true);
                newEntity.setSource("walmart");
                achillesItemEntityRepo.save(newEntity);
            } else {
                // must account for all changes in status of item
                if (newEntity.getSalePrice() >= oldEntity.getSalePrice()){
                    oldEntity.setNeedsUpdate(true);
                    achillesItemEntityRepo.save(oldEntity);
                }
                // TODO: add additional logic for price/availability changes, etc
            }
            return true;
        }

        return false;
    }

    @Override
    public Boolean updateEbay() {
        List<AchillesItemEntity> list = (List<AchillesItemEntity>)achillesItemEntityRepo.findAll();

        for (AchillesItemEntity entity: list){
            if (entity.getNeedsUpdate()){
                ebayService.updateListedItem(entity);
                //update entity and re-save
                entity.setNeedsListed(false);
                entity.setDateUpdated(new Date(Calendar.getInstance().getTime().getTime()));
                achillesItemEntityRepo.save(entity);

                // make the ebay call
                AddFixedPriceItemRequestType requestType = new AddFixedPriceItemRequestType();

            }else if (entity.getNeedsListed() && entity.getIsListed()!=true){
                ebayService.listNewItem(entity);
                //update entity and re-save
                entity.setDateListed(new Date(Calendar.getInstance().getTime().getTime()));
                entity.setIsListed(true);
                entity.setNeedsListed(false);
                achillesItemEntityRepo.save(entity);
            }
        }

        return true;
    }
}
