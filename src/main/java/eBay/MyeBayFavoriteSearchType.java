
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * 				Type defining the <b>FavoriteSearch</b> container returned in
 * 				<b>GetMyeBayBuying</b>. The <b>FavoriteSearch</b> container
 * 				consists of options and filtering used in a buyer's Saved Search on My eBay, and is
 * 				only returned in <b>GetMyeBayBuying</b> if the <b>FavoriteSearches</b>
 * 				container is included the request, and if there is at least one Saved Search for
 * 				the buyer.
 * 			
 * 
 * <p>Java class for MyeBayFavoriteSearchType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MyeBayFavoriteSearchType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SearchName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SearchQuery" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QueryKeywords" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CategoryID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ItemSort" type="{urn:ebay:apis:eBLBaseComponents}SimpleItemSortCodeType" minOccurs="0"/>
 *         &lt;element name="SortOrder" type="{urn:ebay:apis:eBLBaseComponents}SortOrderCodeType" minOccurs="0"/>
 *         &lt;element name="EndTimeFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EndTimeTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="MaxDistance" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ItemType" type="{urn:ebay:apis:eBLBaseComponents}ItemTypeCodeType" minOccurs="0"/>
 *         &lt;element name="PriceMax" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="PriceMin" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="Currency" type="{urn:ebay:apis:eBLBaseComponents}CurrencyCodeType" minOccurs="0"/>
 *         &lt;element name="BidCountMax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BidCountMin" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SearchFlag" type="{urn:ebay:apis:eBLBaseComponents}SearchFlagCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PaymentMethod" type="{urn:ebay:apis:eBLBaseComponents}PaymentMethodSearchCodeType" minOccurs="0"/>
 *         &lt;element name="PreferredLocation" type="{urn:ebay:apis:eBLBaseComponents}PreferredLocationCodeType" minOccurs="0"/>
 *         &lt;element name="SellerID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SellerIDExclude" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ItemsAvailableTo" type="{urn:ebay:apis:eBLBaseComponents}CountryCodeType" minOccurs="0"/>
 *         &lt;element name="ItemsLocatedIn" type="{urn:ebay:apis:eBLBaseComponents}CountryCodeType" minOccurs="0"/>
 *         &lt;element name="SellerBusinessType" type="{urn:ebay:apis:eBLBaseComponents}SellerBusinessCodeType" minOccurs="0"/>
 *         &lt;element name="Condition" type="{urn:ebay:apis:eBLBaseComponents}ItemConditionCodeType" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="QuantityOperator" type="{urn:ebay:apis:eBLBaseComponents}QuantityOperatorCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MyeBayFavoriteSearchType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "searchName",
    "searchQuery",
    "queryKeywords",
    "categoryID",
    "itemSort",
    "sortOrder",
    "endTimeFrom",
    "endTimeTo",
    "maxDistance",
    "postalCode",
    "itemType",
    "priceMax",
    "priceMin",
    "currency",
    "bidCountMax",
    "bidCountMin",
    "searchFlag",
    "paymentMethod",
    "preferredLocation",
    "sellerID",
    "sellerIDExclude",
    "itemsAvailableTo",
    "itemsLocatedIn",
    "sellerBusinessType",
    "condition",
    "quantity",
    "quantityOperator"
})
public class MyeBayFavoriteSearchType {

    @XmlElement(name = "SearchName", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String searchName;
    @XmlElement(name = "SearchQuery", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String searchQuery;
    @XmlElement(name = "QueryKeywords", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String queryKeywords;
    @XmlElement(name = "CategoryID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String categoryID;
    @XmlElement(name = "ItemSort", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected SimpleItemSortCodeType itemSort;
    @XmlElement(name = "SortOrder", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected SortOrderCodeType sortOrder;
    @XmlElement(name = "EndTimeFrom", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endTimeFrom;
    @XmlElement(name = "EndTimeTo", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endTimeTo;
    @XmlElement(name = "MaxDistance", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer maxDistance;
    @XmlElement(name = "PostalCode", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String postalCode;
    @XmlElement(name = "ItemType", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected ItemTypeCodeType itemType;
    @XmlElement(name = "PriceMax", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType priceMax;
    @XmlElement(name = "PriceMin", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType priceMin;
    @XmlElement(name = "Currency", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected CurrencyCodeType currency;
    @XmlElement(name = "BidCountMax", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer bidCountMax;
    @XmlElement(name = "BidCountMin", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer bidCountMin;
    @XmlElement(name = "SearchFlag", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected List<SearchFlagCodeType> searchFlag;
    @XmlElement(name = "PaymentMethod", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected PaymentMethodSearchCodeType paymentMethod;
    @XmlElement(name = "PreferredLocation", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected PreferredLocationCodeType preferredLocation;
    @XmlElement(name = "SellerID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<String> sellerID;
    @XmlElement(name = "SellerIDExclude", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<String> sellerIDExclude;
    @XmlElement(name = "ItemsAvailableTo", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected CountryCodeType itemsAvailableTo;
    @XmlElement(name = "ItemsLocatedIn", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected CountryCodeType itemsLocatedIn;
    @XmlElement(name = "SellerBusinessType", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected SellerBusinessCodeType sellerBusinessType;
    @XmlElement(name = "Condition", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected ItemConditionCodeType condition;
    @XmlElement(name = "Quantity", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer quantity;
    @XmlElement(name = "QuantityOperator", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected QuantityOperatorCodeType quantityOperator;

    /**
     * Gets the value of the searchName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchName() {
        return searchName;
    }

    /**
     * Sets the value of the searchName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchName(String value) {
        this.searchName = value;
    }

    /**
     * Gets the value of the searchQuery property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchQuery() {
        return searchQuery;
    }

    /**
     * Sets the value of the searchQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchQuery(String value) {
        this.searchQuery = value;
    }

    /**
     * Gets the value of the queryKeywords property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryKeywords() {
        return queryKeywords;
    }

    /**
     * Sets the value of the queryKeywords property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryKeywords(String value) {
        this.queryKeywords = value;
    }

    /**
     * Gets the value of the categoryID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryID() {
        return categoryID;
    }

    /**
     * Sets the value of the categoryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryID(String value) {
        this.categoryID = value;
    }

    /**
     * Gets the value of the itemSort property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleItemSortCodeType }
     *     
     */
    public SimpleItemSortCodeType getItemSort() {
        return itemSort;
    }

    /**
     * Sets the value of the itemSort property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleItemSortCodeType }
     *     
     */
    public void setItemSort(SimpleItemSortCodeType value) {
        this.itemSort = value;
    }

    /**
     * Gets the value of the sortOrder property.
     * 
     * @return
     *     possible object is
     *     {@link SortOrderCodeType }
     *     
     */
    public SortOrderCodeType getSortOrder() {
        return sortOrder;
    }

    /**
     * Sets the value of the sortOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortOrderCodeType }
     *     
     */
    public void setSortOrder(SortOrderCodeType value) {
        this.sortOrder = value;
    }

    /**
     * Gets the value of the endTimeFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndTimeFrom() {
        return endTimeFrom;
    }

    /**
     * Sets the value of the endTimeFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndTimeFrom(XMLGregorianCalendar value) {
        this.endTimeFrom = value;
    }

    /**
     * Gets the value of the endTimeTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndTimeTo() {
        return endTimeTo;
    }

    /**
     * Sets the value of the endTimeTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndTimeTo(XMLGregorianCalendar value) {
        this.endTimeTo = value;
    }

    /**
     * Gets the value of the maxDistance property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxDistance() {
        return maxDistance;
    }

    /**
     * Sets the value of the maxDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxDistance(Integer value) {
        this.maxDistance = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the itemType property.
     * 
     * @return
     *     possible object is
     *     {@link ItemTypeCodeType }
     *     
     */
    public ItemTypeCodeType getItemType() {
        return itemType;
    }

    /**
     * Sets the value of the itemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemTypeCodeType }
     *     
     */
    public void setItemType(ItemTypeCodeType value) {
        this.itemType = value;
    }

    /**
     * Gets the value of the priceMax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPriceMax() {
        return priceMax;
    }

    /**
     * Sets the value of the priceMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPriceMax(AmountType value) {
        this.priceMax = value;
    }

    /**
     * Gets the value of the priceMin property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPriceMin() {
        return priceMin;
    }

    /**
     * Sets the value of the priceMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPriceMin(AmountType value) {
        this.priceMin = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCodeType }
     *     
     */
    public CurrencyCodeType getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCodeType }
     *     
     */
    public void setCurrency(CurrencyCodeType value) {
        this.currency = value;
    }

    /**
     * Gets the value of the bidCountMax property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBidCountMax() {
        return bidCountMax;
    }

    /**
     * Sets the value of the bidCountMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBidCountMax(Integer value) {
        this.bidCountMax = value;
    }

    /**
     * Gets the value of the bidCountMin property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBidCountMin() {
        return bidCountMin;
    }

    /**
     * Sets the value of the bidCountMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBidCountMin(Integer value) {
        this.bidCountMin = value;
    }

    /**
     * Gets the value of the searchFlag property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchFlag property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchFlag().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchFlagCodeType }
     * 
     * 
     */
    public List<SearchFlagCodeType> getSearchFlag() {
        if (searchFlag == null) {
            searchFlag = new ArrayList<SearchFlagCodeType>();
        }
        return this.searchFlag;
    }

    /**
     * Gets the value of the paymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMethodSearchCodeType }
     *     
     */
    public PaymentMethodSearchCodeType getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Sets the value of the paymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMethodSearchCodeType }
     *     
     */
    public void setPaymentMethod(PaymentMethodSearchCodeType value) {
        this.paymentMethod = value;
    }

    /**
     * Gets the value of the preferredLocation property.
     * 
     * @return
     *     possible object is
     *     {@link PreferredLocationCodeType }
     *     
     */
    public PreferredLocationCodeType getPreferredLocation() {
        return preferredLocation;
    }

    /**
     * Sets the value of the preferredLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreferredLocationCodeType }
     *     
     */
    public void setPreferredLocation(PreferredLocationCodeType value) {
        this.preferredLocation = value;
    }

    /**
     * Gets the value of the sellerID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sellerID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSellerID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSellerID() {
        if (sellerID == null) {
            sellerID = new ArrayList<String>();
        }
        return this.sellerID;
    }

    /**
     * Gets the value of the sellerIDExclude property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sellerIDExclude property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSellerIDExclude().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSellerIDExclude() {
        if (sellerIDExclude == null) {
            sellerIDExclude = new ArrayList<String>();
        }
        return this.sellerIDExclude;
    }

    /**
     * Gets the value of the itemsAvailableTo property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCodeType }
     *     
     */
    public CountryCodeType getItemsAvailableTo() {
        return itemsAvailableTo;
    }

    /**
     * Sets the value of the itemsAvailableTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCodeType }
     *     
     */
    public void setItemsAvailableTo(CountryCodeType value) {
        this.itemsAvailableTo = value;
    }

    /**
     * Gets the value of the itemsLocatedIn property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCodeType }
     *     
     */
    public CountryCodeType getItemsLocatedIn() {
        return itemsLocatedIn;
    }

    /**
     * Sets the value of the itemsLocatedIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCodeType }
     *     
     */
    public void setItemsLocatedIn(CountryCodeType value) {
        this.itemsLocatedIn = value;
    }

    /**
     * Gets the value of the sellerBusinessType property.
     * 
     * @return
     *     possible object is
     *     {@link SellerBusinessCodeType }
     *     
     */
    public SellerBusinessCodeType getSellerBusinessType() {
        return sellerBusinessType;
    }

    /**
     * Sets the value of the sellerBusinessType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellerBusinessCodeType }
     *     
     */
    public void setSellerBusinessType(SellerBusinessCodeType value) {
        this.sellerBusinessType = value;
    }

    /**
     * Gets the value of the condition property.
     * 
     * @return
     *     possible object is
     *     {@link ItemConditionCodeType }
     *     
     */
    public ItemConditionCodeType getCondition() {
        return condition;
    }

    /**
     * Sets the value of the condition property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemConditionCodeType }
     *     
     */
    public void setCondition(ItemConditionCodeType value) {
        this.condition = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantity(Integer value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the quantityOperator property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityOperatorCodeType }
     *     
     */
    public QuantityOperatorCodeType getQuantityOperator() {
        return quantityOperator;
    }

    /**
     * Sets the value of the quantityOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityOperatorCodeType }
     *     
     */
    public void setQuantityOperator(QuantityOperatorCodeType value) {
        this.quantityOperator = value;
    }

}
