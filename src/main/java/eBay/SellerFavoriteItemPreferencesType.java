
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Contains the data for the seller favorite item preferences, i.e.  the manual or automatic selection criteria to display items for buyer's favourite seller opt in email marketing.
 * 			
 * 
 * <p>Java class for SellerFavoriteItemPreferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SellerFavoriteItemPreferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SearchKeywords" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StoreCategoryID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ListingType" type="{urn:ebay:apis:eBLBaseComponents}ListingTypeCodeType" minOccurs="0"/>
 *         &lt;element name="SearchSortOrder" type="{urn:ebay:apis:eBLBaseComponents}StoreItemListSortOrderCodeType" minOccurs="0"/>
 *         &lt;element name="MinPrice" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="MaxPrice" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="FavoriteItemID" type="{urn:ebay:apis:eBLBaseComponents}ItemIDType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SellerFavoriteItemPreferencesType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "searchKeywords",
    "storeCategoryID",
    "listingType",
    "searchSortOrder",
    "minPrice",
    "maxPrice",
    "favoriteItemID"
})
public class SellerFavoriteItemPreferencesType {

    @XmlElement(name = "SearchKeywords", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String searchKeywords;
    @XmlElement(name = "StoreCategoryID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Long storeCategoryID;
    @XmlElement(name = "ListingType", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected ListingTypeCodeType listingType;
    @XmlElement(name = "SearchSortOrder", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected StoreItemListSortOrderCodeType searchSortOrder;
    @XmlElement(name = "MinPrice", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType minPrice;
    @XmlElement(name = "MaxPrice", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType maxPrice;
    @XmlElement(name = "FavoriteItemID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<String> favoriteItemID;

    /**
     * Gets the value of the searchKeywords property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchKeywords() {
        return searchKeywords;
    }

    /**
     * Sets the value of the searchKeywords property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchKeywords(String value) {
        this.searchKeywords = value;
    }

    /**
     * Gets the value of the storeCategoryID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStoreCategoryID() {
        return storeCategoryID;
    }

    /**
     * Sets the value of the storeCategoryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStoreCategoryID(Long value) {
        this.storeCategoryID = value;
    }

    /**
     * Gets the value of the listingType property.
     * 
     * @return
     *     possible object is
     *     {@link ListingTypeCodeType }
     *     
     */
    public ListingTypeCodeType getListingType() {
        return listingType;
    }

    /**
     * Sets the value of the listingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListingTypeCodeType }
     *     
     */
    public void setListingType(ListingTypeCodeType value) {
        this.listingType = value;
    }

    /**
     * Gets the value of the searchSortOrder property.
     * 
     * @return
     *     possible object is
     *     {@link StoreItemListSortOrderCodeType }
     *     
     */
    public StoreItemListSortOrderCodeType getSearchSortOrder() {
        return searchSortOrder;
    }

    /**
     * Sets the value of the searchSortOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoreItemListSortOrderCodeType }
     *     
     */
    public void setSearchSortOrder(StoreItemListSortOrderCodeType value) {
        this.searchSortOrder = value;
    }

    /**
     * Gets the value of the minPrice property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getMinPrice() {
        return minPrice;
    }

    /**
     * Sets the value of the minPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setMinPrice(AmountType value) {
        this.minPrice = value;
    }

    /**
     * Gets the value of the maxPrice property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getMaxPrice() {
        return maxPrice;
    }

    /**
     * Sets the value of the maxPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setMaxPrice(AmountType value) {
        this.maxPrice = value;
    }

    /**
     * Gets the value of the favoriteItemID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the favoriteItemID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFavoriteItemID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFavoriteItemID() {
        if (favoriteItemID == null) {
            favoriteItemID = new ArrayList<String>();
        }
        return this.favoriteItemID;
    }

}
