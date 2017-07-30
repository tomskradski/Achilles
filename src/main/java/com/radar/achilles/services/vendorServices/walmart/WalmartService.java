package com.radar.achilles.services.vendorServices.walmart;

import com.radar.achilles.cdm.WalmartItem;
import com.radar.achilles.persist.entity.WalMartItemEntity;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Skradski on 4/1/2017.
 */
@Component
public interface WalmartService {

    List<WalmartItem> getItemListByCategoryId(String id);

}
