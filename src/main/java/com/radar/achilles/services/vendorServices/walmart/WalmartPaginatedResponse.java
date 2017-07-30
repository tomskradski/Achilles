package com.radar.achilles.services.vendorServices.walmart;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.radar.achilles.cdm.WalmartItem;

import java.util.ArrayList;

/**
 * Created by Skradski on 5/13/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WalmartPaginatedResponse {

    private String nextPage;
    private ArrayList<WalmartItem> items;

    public String getNextPage() {
        return nextPage;
    }

    public void setNextPage(String nextPage) {
        this.nextPage = nextPage;
    }

    public ArrayList<WalmartItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<WalmartItem> items) {
        this.items = items;
    }
}
