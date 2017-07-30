
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
 * 				Contains information about a single line item (transaction) in an order created
 * 				through Selling Manager.
 * 			
 * 
 * <p>Java class for SellingManagerSoldTransactionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SellingManagerSoldTransactionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InvoiceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransactionID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SaleRecordID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ItemID" type="{urn:ebay:apis:eBLBaseComponents}ItemIDType" minOccurs="0"/>
 *         &lt;element name="QuantitySold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ItemPrice" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="SubtotalAmount" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="ItemTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ListingType" type="{urn:ebay:apis:eBLBaseComponents}ListingTypeCodeType" minOccurs="0"/>
 *         &lt;element name="Relisted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="WatchCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="StartPrice" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="ReservePrice" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="SecondChanceOfferSent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CustomLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SoldOn" type="{urn:ebay:apis:eBLBaseComponents}TransactionPlatformCodeType" minOccurs="0"/>
 *         &lt;element name="ListedOn" type="{urn:ebay:apis:eBLBaseComponents}TransactionPlatformCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Shipment" type="{urn:ebay:apis:eBLBaseComponents}ShipmentType" minOccurs="0"/>
 *         &lt;element name="CharityListing" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Variation" type="{urn:ebay:apis:eBLBaseComponents}VariationType" minOccurs="0"/>
 *         &lt;element name="OrderLineItemID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SellingManagerSoldTransactionType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "invoiceNumber",
    "transactionID",
    "saleRecordID",
    "itemID",
    "quantitySold",
    "itemPrice",
    "subtotalAmount",
    "itemTitle",
    "listingType",
    "relisted",
    "watchCount",
    "startPrice",
    "reservePrice",
    "secondChanceOfferSent",
    "customLabel",
    "soldOn",
    "listedOn",
    "shipment",
    "charityListing",
    "variation",
    "orderLineItemID"
})
public class SellingManagerSoldTransactionType {

    @XmlElement(name = "InvoiceNumber", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String invoiceNumber;
    @XmlElement(name = "TransactionID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Long transactionID;
    @XmlElement(name = "SaleRecordID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Long saleRecordID;
    @XmlElement(name = "ItemID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String itemID;
    @XmlElement(name = "QuantitySold", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer quantitySold;
    @XmlElement(name = "ItemPrice", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType itemPrice;
    @XmlElement(name = "SubtotalAmount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType subtotalAmount;
    @XmlElement(name = "ItemTitle", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String itemTitle;
    @XmlElement(name = "ListingType", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected ListingTypeCodeType listingType;
    @XmlElement(name = "Relisted", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean relisted;
    @XmlElement(name = "WatchCount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer watchCount;
    @XmlElement(name = "StartPrice", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType startPrice;
    @XmlElement(name = "ReservePrice", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType reservePrice;
    @XmlElement(name = "SecondChanceOfferSent", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean secondChanceOfferSent;
    @XmlElement(name = "CustomLabel", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String customLabel;
    @XmlElement(name = "SoldOn", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected TransactionPlatformCodeType soldOn;
    @XmlElement(name = "ListedOn", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected List<TransactionPlatformCodeType> listedOn;
    @XmlElement(name = "Shipment", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected ShipmentType shipment;
    @XmlElement(name = "CharityListing", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean charityListing;
    @XmlElement(name = "Variation", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected VariationType variation;
    @XmlElement(name = "OrderLineItemID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String orderLineItemID;

    /**
     * Gets the value of the invoiceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * Sets the value of the invoiceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceNumber(String value) {
        this.invoiceNumber = value;
    }

    /**
     * Gets the value of the transactionID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTransactionID() {
        return transactionID;
    }

    /**
     * Sets the value of the transactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTransactionID(Long value) {
        this.transactionID = value;
    }

    /**
     * Gets the value of the saleRecordID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSaleRecordID() {
        return saleRecordID;
    }

    /**
     * Sets the value of the saleRecordID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSaleRecordID(Long value) {
        this.saleRecordID = value;
    }

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
     * Gets the value of the quantitySold property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantitySold() {
        return quantitySold;
    }

    /**
     * Sets the value of the quantitySold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantitySold(Integer value) {
        this.quantitySold = value;
    }

    /**
     * Gets the value of the itemPrice property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getItemPrice() {
        return itemPrice;
    }

    /**
     * Sets the value of the itemPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setItemPrice(AmountType value) {
        this.itemPrice = value;
    }

    /**
     * Gets the value of the subtotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getSubtotalAmount() {
        return subtotalAmount;
    }

    /**
     * Sets the value of the subtotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setSubtotalAmount(AmountType value) {
        this.subtotalAmount = value;
    }

    /**
     * Gets the value of the itemTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemTitle() {
        return itemTitle;
    }

    /**
     * Sets the value of the itemTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemTitle(String value) {
        this.itemTitle = value;
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
     * Gets the value of the relisted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRelisted() {
        return relisted;
    }

    /**
     * Sets the value of the relisted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRelisted(Boolean value) {
        this.relisted = value;
    }

    /**
     * Gets the value of the watchCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWatchCount() {
        return watchCount;
    }

    /**
     * Sets the value of the watchCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWatchCount(Integer value) {
        this.watchCount = value;
    }

    /**
     * Gets the value of the startPrice property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getStartPrice() {
        return startPrice;
    }

    /**
     * Sets the value of the startPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setStartPrice(AmountType value) {
        this.startPrice = value;
    }

    /**
     * Gets the value of the reservePrice property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getReservePrice() {
        return reservePrice;
    }

    /**
     * Sets the value of the reservePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setReservePrice(AmountType value) {
        this.reservePrice = value;
    }

    /**
     * Gets the value of the secondChanceOfferSent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSecondChanceOfferSent() {
        return secondChanceOfferSent;
    }

    /**
     * Sets the value of the secondChanceOfferSent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSecondChanceOfferSent(Boolean value) {
        this.secondChanceOfferSent = value;
    }

    /**
     * Gets the value of the customLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomLabel() {
        return customLabel;
    }

    /**
     * Sets the value of the customLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomLabel(String value) {
        this.customLabel = value;
    }

    /**
     * Gets the value of the soldOn property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionPlatformCodeType }
     *     
     */
    public TransactionPlatformCodeType getSoldOn() {
        return soldOn;
    }

    /**
     * Sets the value of the soldOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionPlatformCodeType }
     *     
     */
    public void setSoldOn(TransactionPlatformCodeType value) {
        this.soldOn = value;
    }

    /**
     * Gets the value of the listedOn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listedOn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListedOn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionPlatformCodeType }
     * 
     * 
     */
    public List<TransactionPlatformCodeType> getListedOn() {
        if (listedOn == null) {
            listedOn = new ArrayList<TransactionPlatformCodeType>();
        }
        return this.listedOn;
    }

    /**
     * Gets the value of the shipment property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentType }
     *     
     */
    public ShipmentType getShipment() {
        return shipment;
    }

    /**
     * Sets the value of the shipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentType }
     *     
     */
    public void setShipment(ShipmentType value) {
        this.shipment = value;
    }

    /**
     * Gets the value of the charityListing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCharityListing() {
        return charityListing;
    }

    /**
     * Sets the value of the charityListing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCharityListing(Boolean value) {
        this.charityListing = value;
    }

    /**
     * Gets the value of the variation property.
     * 
     * @return
     *     possible object is
     *     {@link VariationType }
     *     
     */
    public VariationType getVariation() {
        return variation;
    }

    /**
     * Sets the value of the variation property.
     * 
     * @param value
     *     allowed object is
     *     {@link VariationType }
     *     
     */
    public void setVariation(VariationType value) {
        this.variation = value;
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
