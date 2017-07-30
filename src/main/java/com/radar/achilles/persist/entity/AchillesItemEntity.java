package com.radar.achilles.persist.entity;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by Skradski on 7/27/2017.
 */
@Entity
@Table(name = "achillesitementity")
public class AchillesItemEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String source;
    private Boolean isListed;
    private Boolean needsListed;
    private Boolean needsUpdate;
    private Boolean needsRemoved;
    private Date dateListed;
    private Date dateUpdated;
    private Date dateRemoved;

    private Integer itemId;
    private Integer parentId;
    private String name;
    private Double msrp;
    private Double salePrice;
    private String upc;

    @Lob
    @Column(length = 10000)
    private String longDescription;

    @Lob
    @Column(length = 1000)
    private String thumbnailImage;

    @Lob
    @Column(length = 1000)
    private String mediumImage;

    @Lob
    @Column(length = 1000)
    private String largeImage;

    @Lob
    @Column(length = 1000)
    private String productTrackingUrl;
    private Double standardShippingRate;
    private Boolean marketplace;
    private String modelNumber;
    @Lob
    @Column(length = 1000)
    private String productUrl;
    private String categoryNode;
    private String stock;
    private Boolean availableOnline;

    public Boolean getNeedsListed() {
        return needsListed;
    }

    public void setNeedsListed(Boolean needsListed) {
        this.needsListed = needsListed;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Date getDateListed() {
        return dateListed;
    }

    public void setDateListed(Date dateListed) {
        this.dateListed = dateListed;
    }

    public Date getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public Date getDateRemoved() {
        return dateRemoved;
    }

    public void setDateRemoved(Date dateRemoved) {
        this.dateRemoved = dateRemoved;
    }

    public Boolean getIsListed() {
        return isListed;
    }

    public void setIsListed(Boolean isListed) {
        this.isListed = isListed;
    }

    public Boolean getNeedsUpdate() {
        return needsUpdate;
    }

    public void setNeedsUpdate(Boolean needsUpdate) {
        this.needsUpdate = needsUpdate;
    }

    public Boolean getNeedsRemoved() {
        return needsRemoved;
    }

    public void setNeedsRemoved(Boolean needsRemoved) {
        this.needsRemoved = needsRemoved;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMsrp() {
        return msrp;
    }

    public void setMsrp(Double msrp) {
        this.msrp = msrp;
    }

    public Double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
    }

    public String getUpc() {
        return upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public String getThumbnailImage() {
        return thumbnailImage;
    }

    public void setThumbnailImage(String thumbnailImage) {
        this.thumbnailImage = thumbnailImage;
    }

    public String getMediumImage() {
        return mediumImage;
    }

    public void setMediumImage(String mediumImage) {
        this.mediumImage = mediumImage;
    }

    public String getLargeImage() {
        return largeImage;
    }

    public void setLargeImage(String largeImage) {
        this.largeImage = largeImage;
    }

    public String getProductTrackingUrl() {
        return productTrackingUrl;
    }

    public void setProductTrackingUrl(String productTrackingUrl) {
        this.productTrackingUrl = productTrackingUrl;
    }

    public Double getStandardShippingRate() {
        return standardShippingRate;
    }

    public void setStandardShippingRate(Double standardShippingRate) {
        this.standardShippingRate = standardShippingRate;
    }

    public Boolean getMarketplace() {
        return marketplace;
    }

    public void setMarketplace(Boolean marketplace) {
        this.marketplace = marketplace;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getProductUrl() {
        return productUrl;
    }

    public void setProductUrl(String productUrl) {
        this.productUrl = productUrl;
    }

    public String getCategoryNode() {
        return categoryNode;
    }

    public void setCategoryNode(String categoryNode) {
        this.categoryNode = categoryNode;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public Boolean getAvailableOnline() {
        return availableOnline;
    }

    public void setAvailableOnline(Boolean availableOnline) {
            this.availableOnline = availableOnline;
        }

}
