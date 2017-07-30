package com.radar.achilles.services.vendorServices.ebay;

import com.radar.achilles.persist.entity.AchillesItemEntity;
import org.springframework.stereotype.Component;

/**
 * Created by Skradski on 7/27/2017.
 */
@Component
public interface EbayService {
    void updateListedItem(AchillesItemEntity entity);

    void listNewItem(AchillesItemEntity entity);

    String testEbayAPICall();
}
