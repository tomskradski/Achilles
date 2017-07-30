
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * 				Retrieves order line item information for a specified <b>ItemID</b>.&nbsp;<b>Also for Half.com</b>. The call returns zero, one, or multiple order line items, depending on the number of items sold from the listing. <br><br> You can retrieve order line item data for a specific time range or number of days. If you don't specify a range or number of days, order line item data will be returned for the past 30 days. This call cannot retrieve sales older than 90 days old.
 * 			
 * 
 * <p>Java class for GetItemTransactionsRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetItemTransactionsRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="ItemID" type="{urn:ebay:apis:eBLBaseComponents}ItemIDType" minOccurs="0"/>
 *         &lt;element name="ModTimeFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ModTimeTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="TransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pagination" type="{urn:ebay:apis:eBLBaseComponents}PaginationType" minOccurs="0"/>
 *         &lt;element name="IncludeFinalValueFee" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IncludeContainingOrder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Platform" type="{urn:ebay:apis:eBLBaseComponents}TransactionPlatformCodeType" minOccurs="0"/>
 *         &lt;element name="NumberOfDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IncludeVariations" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OrderLineItemID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetItemTransactionsRequestType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "itemID",
    "modTimeFrom",
    "modTimeTo",
    "transactionID",
    "pagination",
    "includeFinalValueFee",
    "includeContainingOrder",
    "platform",
    "numberOfDays",
    "includeVariations",
    "orderLineItemID"
})
public class GetItemTransactionsRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "ItemID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String itemID;
    @XmlElement(name = "ModTimeFrom", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modTimeFrom;
    @XmlElement(name = "ModTimeTo", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modTimeTo;
    @XmlElement(name = "TransactionID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String transactionID;
    @XmlElement(name = "Pagination", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected PaginationType pagination;
    @XmlElement(name = "IncludeFinalValueFee", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean includeFinalValueFee;
    @XmlElement(name = "IncludeContainingOrder", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean includeContainingOrder;
    @XmlElement(name = "Platform", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected TransactionPlatformCodeType platform;
    @XmlElement(name = "NumberOfDays", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer numberOfDays;
    @XmlElement(name = "IncludeVariations", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean includeVariations;
    @XmlElement(name = "OrderLineItemID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String orderLineItemID;

    /**
     * Gets the value of the itemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemID() {
        return itemID;
    }

    /**
     * Sets the value of the itemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemID(String value) {
        this.itemID = value;
    }

    /**
     * Gets the value of the modTimeFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModTimeFrom() {
        return modTimeFrom;
    }

    /**
     * Sets the value of the modTimeFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModTimeFrom(XMLGregorianCalendar value) {
        this.modTimeFrom = value;
    }

    /**
     * Gets the value of the modTimeTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModTimeTo() {
        return modTimeTo;
    }

    /**
     * Sets the value of the modTimeTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModTimeTo(XMLGregorianCalendar value) {
        this.modTimeTo = value;
    }

    /**
     * Gets the value of the transactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionID() {
        return transactionID;
    }

    /**
     * Sets the value of the transactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionID(String value) {
        this.transactionID = value;
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
     * Gets the value of the includeFinalValueFee property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeFinalValueFee() {
        return includeFinalValueFee;
    }

    /**
     * Sets the value of the includeFinalValueFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeFinalValueFee(Boolean value) {
        this.includeFinalValueFee = value;
    }

    /**
     * Gets the value of the includeContainingOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeContainingOrder() {
        return includeContainingOrder;
    }

    /**
     * Sets the value of the includeContainingOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeContainingOrder(Boolean value) {
        this.includeContainingOrder = value;
    }

    /**
     * Gets the value of the platform property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionPlatformCodeType }
     *     
     */
    public TransactionPlatformCodeType getPlatform() {
        return platform;
    }

    /**
     * Sets the value of the platform property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionPlatformCodeType }
     *     
     */
    public void setPlatform(TransactionPlatformCodeType value) {
        this.platform = value;
    }

    /**
     * Gets the value of the numberOfDays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfDays() {
        return numberOfDays;
    }

    /**
     * Sets the value of the numberOfDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfDays(Integer value) {
        this.numberOfDays = value;
    }

    /**
     * Gets the value of the includeVariations property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeVariations() {
        return includeVariations;
    }

    /**
     * Sets the value of the includeVariations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeVariations(Boolean value) {
        this.includeVariations = value;
    }

    /**
     * Gets the value of the orderLineItemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderLineItemID() {
        return orderLineItemID;
    }

    /**
     * Sets the value of the orderLineItemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderLineItemID(String value) {
        this.orderLineItemID = value;
    }

}
