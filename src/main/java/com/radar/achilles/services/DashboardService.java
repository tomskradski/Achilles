package com.radar.achilles.services;

import com.radar.achilles.cdm.WalmartItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Skradski on 7/26/2017.
 */
@Component
public interface DashboardService {

    Boolean runPrototypeAchilles();

    Boolean convertToAchillesItems();

    Boolean updateEbay();
}
