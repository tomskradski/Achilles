package com.radar.achilles.controllers;

import com.radar.achilles.cdm.WalmartItem;
import com.radar.achilles.services.DashboardService;
import com.radar.achilles.services.vendorServices.walmart.WalmartService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@RestController
public class DashboardController {

    private static final Logger logger = LoggerFactory.getLogger(DashboardController.class);

//    @Autowired
//    public WalmartService walmartService;

    @Autowired
    public DashboardService dashboardService;

    @RequestMapping("/user")
    public Principal user (Principal user){
        return user;
    }

    @RequestMapping("/getWalmartDigitalCameras")
    public Boolean getWalmartDigitalCameras (){
        logger.info("DashboardController.getWalmartDigitalCameras called");

        return dashboardService.runPrototypeAchilles();
    }

    @RequestMapping("/convertToAchillesItems")
    public Boolean convertToAchillesItems(){
        logger.info("DashboardController.convertToAchillesItems");

        return dashboardService.convertToAchillesItems();
    }

    @RequestMapping("/updateEbay")
    public Boolean updateEbay() {
        logger.info("DashboardConroller.updateEbay");

        return dashboardService.updateEbay();
    }

//    @RequestMapping(value = "/walmartItemsByCategory")
//    public @ResponseBody List<WalmartItem> walmartItemsByCategory(@RequestParam String id) {
//        logger.info("walmartItemsByCategory controller method called");
//
//        List <WalmartItem> returnList;
//
//        returnList = walmartService.getItemListByCategoryId(id);
//
//        return returnList;
//    }



    // ***************** TESTING ANGULAR MAPPINGS *********************
    @RequestMapping("/resource")
    public Map<String, Object> home() {
        Map<String, Object> model = new HashMap<>();
        model.put("id", UUID.randomUUID().toString());
        model.put("content", "Hello World");
        return model;
    }
}

 
