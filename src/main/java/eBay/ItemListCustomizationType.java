
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Defines how a list of items should be returned.
 * 			
 * 
 * <p>Java class for ItemListCustomizationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemListCustomizationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Include" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ListingType" type="{urn:ebay:apis:eBLBaseComponents}ListingTypeCodeType" minOccurs="0"/>
 *         &lt;element name="Sort" type="{urn:ebay:apis:eBLBaseComponents}ItemSortTypeCodeType" minOccurs="0"/>
 *         &lt;element name="DurationInDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IncludeNotes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Pagination" type="{urn:ebay:apis:eBLBaseComponents}PaginationType" minOccurs="0"/>
 *         &lt;element name="OrderStatusFilter" type="{urn:ebay:apis:eBLBaseComponents}OrderStatusFilterCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemListCustomizationType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "include",
    "listingType",
    "sort",
    "durationInDays",
    "includeNotes",
    "pagination",
    "orderStatusFilter"
})
public class ItemListCustomizationType {

    @XmlElement(name = "Include", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean include;
    @XmlElement(name = "ListingType", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected ListingTypeCodeType listingType;
    @XmlElement(name = "Sort", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected ItemSortTypeCodeType sort;
    @XmlElement(name = "DurationInDays", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer durationInDays;
    @XmlElement(name = "IncludeNotes", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean includeNotes;
    @XmlElement(name = "Pagination", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected PaginationType pagination;
    @XmlElement(name = "OrderStatusFilter", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected OrderStatusFilterCodeType orderStatusFilter;

    /**
     * Gets the value of the include property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInclude() {
        return include;
    }

    /**
     * Sets the value of the include property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInclude(Boolean value) {
        this.include = value;
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
     * Gets the value of the sort property.
     * 
     * @return
     *     possible object is
     *     {@link ItemSortTypeCodeType }
     *     
     */
    public ItemSortTypeCodeType getSort() {
        return sort;
    }

    /**
     * Sets the value of the sort property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSortTypeCodeType }
     *     
     */
    public void setSort(ItemSortTypeCodeType value) {
        this.sort = value;
    }

    /**
     * Gets the value of the durationInDays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDurationInDays() {
        return durationInDays;
    }

    /**
     * Sets the value of the durationInDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDurationInDays(Integer value) {
        this.durationInDays = value;
    }

    /**
     * Gets the value of the includeNotes property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeNotes() {
        return includeNotes;
    }

    /**
     * Sets the value of the includeNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeNotes(Boolean value) {
        this.includeNotes = value;
    }

    /**
     * Gets the value of the pagination property.
     * 
     * @return
     *     possible object is
     *     {@link PaginationType }
     *     
     */
    public PaginationType getPagination() {
        return pagination;
    }

    /**
     * Sets the value of the pagination property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaginationType }
     *     
     */
    public void setPagination(PaginationType value) {
        this.pagination = value;
    }

    /**
     * Gets the value of the orderStatusFilter property.
     * 
     * @return
     *     possible object is
     *     {@link OrderStatusFilterCodeType }
     *     
     */
    public OrderStatusFilterCodeType getOrderStatusFilter() {
        return orderStatusFilter;
    }

    /**
     * Sets the value of the orderStatusFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderStatusFilterCodeType }
     *     
     */
    public void setOrderStatusFilter(OrderStatusFilterCodeType value) {
        this.orderStatusFilter = value;
    }

}
