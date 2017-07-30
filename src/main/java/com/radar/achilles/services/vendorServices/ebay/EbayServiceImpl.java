package com.radar.achilles.services.vendorServices.ebay;

import com.ebay.sdk.ApiAccount;
import com.ebay.sdk.ApiCall;
import com.ebay.sdk.ApiContext;
import com.ebay.sdk.ApiCredential;
import com.radar.achilles.persist.entity.AchillesItemEntity;
import eBay.AddFixedPriceItemRequestType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by Skradski on 7/27/2017.
 */
@Service
public class EbayServiceImpl  implements  EbayService{

    private static final Logger logger = LoggerFactory.getLogger(EbayServiceImpl.class);


    @PostConstruct
    public void initialize(){
        Properties keys = new Properties();
        try {
            keys.load(new FileInputStream("/resources/key.properties"));
        } catch (IOException e){
            logger.error("************** Error loading key.properties *******************");
            logger.error(e.getMessage());
        }


        ApiAccount account = new ApiAccount();
        account.setDeveloper(keys.getProperty("devId"));
        account.setApplication(keys.getProperty("appId"));
        account.setCertificate(keys.getProperty("certId"));

        ApiCredential credential = new ApiCredential();
        credential.setApiAccount(account);
        credential.seteBayToken(keys.getProperty("sandboxToken"));

        ApiContext context = new ApiContext();
        context.setApiCredential(credential);
        context.setApiServerUrl(keys.getProperty("ebayURL"));
        context.setTimeout(180000);
        context.setWSDLVersion(keys.getProperty("wsdlVersion"));

   }

    @Override
    public void updateListedItem(AchillesItemEntity entity) {

    }

    @Override
    public void listNewItem(AchillesItemEntity entity) {


    }

    @Override
    public String testEbayAPICall() {
        String time = "test time";
        ApiCall apiCall = new ApiCall();

        return time;
    }
}
