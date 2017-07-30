package com.radar.achilles.services.vendorServices.walmart;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.radar.achilles.cdm.WalmartItem;
import com.radar.achilles.persist.entity.WalMartItemEntity;
import com.radar.achilles.persist.repo.WalMartEntityRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Skradski on 4/1/2017.
 */
@Service
public class WalmartServiceImpl implements WalmartService{

    private static final String WALMART_URI = "http://api.walmartlabs.com";
    private static final String PAGINATED_PATH = "/v1/paginated/items?";
    private static final String SEARCH_PATH = "/v1/search?";
    private static final String DATA_FEEDS_PATH = "/v1/feeds/rollback?";
    private static final String API_KEY = "apiKey=gdb2frtdxr9g8965cybkp5ty";
    private static final String JSON_RESPONSE_FORMAT = "format=json";

    private static final Logger log = LoggerFactory.getLogger(WalmartServiceImpl.class);

    @Autowired
    public WalMartEntityRepo walMartEntityRepo;

    @Override
    public List<WalmartItem> getItemListByCategoryId(String id) {
        RestTemplate restfulCall = new RestTemplate();

        String catID = "&category=" + id;
        String URI = WALMART_URI + PAGINATED_PATH + JSON_RESPONSE_FORMAT + catID
                + "&" + API_KEY;

        String response = null;
        boolean isSuccess = false;
        int attempts = 0;
        while (!isSuccess){
            try {
                attempts++;
                response = restfulCall.getForObject(URI, String.class);
            } catch (Exception e){
                log.error("*************** Error during REST call! ****************");
                StackTraceElement[] elements = e.getStackTrace();
                log.error(elements[1].toString());
            }
            if (response != null) isSuccess = true;
            if (attempts == 20) break;
        }

        if (isSuccess){
            List<WalmartItem> list = new ArrayList<>();
            try {
                list = parseWalmartDataFeedResponseIntoList(response);
            } catch (IOException e) {
                e.printStackTrace();
            }

            List<WalmartItem> filteredList = filterListWithCriteria(list, "available");

            return filteredList;
        }
        else {
            return null;
        }

    }

    private List<WalmartItem> parseWalmartDataFeedResponseIntoList(String response) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        WalmartPaginatedResponse walmartPaginatedResponse = mapper.readValue(response, WalmartPaginatedResponse.class);

        ArrayList<WalmartItem> list = walmartPaginatedResponse.getItems();
        return list;
    }

    // filters based on OR....filters if filter1 or filter2 or filter3
    private List<WalmartItem> filterListWithCriteria(List<WalmartItem> list, String filter){
        List<WalmartItem> filteredList = new ArrayList<>();

        for (WalmartItem item : list){
            if (item.getStock().equalsIgnoreCase(filter) &&
                    item.getAvailableOnline()){
                filteredList.add(item);
            }
        }

        return filteredList;
    }
}
