
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Enables a seller to do various tasks after the creation of a single line item or
 * 				multiple line item (Combined Payment) order. Typically, this call is used after the order has been paid
 * 				by the buyer, but it can be called by the seller beforehand. Typical post-
 * 				payment tasks available to this call include marking the order as paid, marking
 * 				the order as shipped, providing shipment tracking details, and leaving feedback
 * 				for the buyer.
 * 			
 * 
 * <p>Java class for CompleteSaleRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompleteSaleRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="ItemID" type="{urn:ebay:apis:eBLBaseComponents}ItemIDType" minOccurs="0"/>
 *         &lt;element name="TransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FeedbackInfo" type="{urn:ebay:apis:eBLBaseComponents}FeedbackInfoType" minOccurs="0"/>
 *         &lt;element name="Shipped" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Paid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ListingType" type="{urn:ebay:apis:eBLBaseComponents}ListingTypeCodeType" minOccurs="0"/>
 *         &lt;element name="Shipment" type="{urn:ebay:apis:eBLBaseComponents}ShipmentType" minOccurs="0"/>
 *         &lt;element name="OrderID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "CompleteSaleRequestType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "itemID",
    "transactionID",
    "feedbackInfo",
    "shipped",
    "paid",
    "listingType",
    "shipment",
    "orderID",
    "orderLineItemID"
})
public class CompleteSaleRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "ItemID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String itemID;
    @XmlElement(name = "TransactionID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String transactionID;
    @XmlElement(name = "FeedbackInfo", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected FeedbackInfoType feedbackInfo;
    @XmlElement(name = "Shipped", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean shipped;
    @XmlElement(name = "Paid", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean paid;
    @XmlElement(name = "ListingType", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected ListingTypeCodeType listingType;
    @XmlElement(name = "Shipment", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected ShipmentType shipment;
    @XmlElement(name = "OrderID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String orderID;
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
     * Gets the value of the feedbackInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FeedbackInfoType }
     *     
     */
    public FeedbackInfoType getFeedbackInfo() {
        return feedbackInfo;
    }

    /**
     * Sets the value of the feedbackInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeedbackInfoType }
     *     
     */
    public void setFeedbackInfo(FeedbackInfoType value) {
        this.feedbackInfo = value;
    }

    /**
     * Gets the value of the shipped property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShipped() {
        return shipped;
    }

    /**
     * Sets the value of the shipped property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShipped(Boolean value) {
        this.shipped = value;
    }

    /**
     * Gets the value of the paid property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPaid() {
        return paid;
    }

    /**
     * Sets the value of the paid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPaid(Boolean value) {
        this.paid = value;
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
     * Gets the value of the orderID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderID() {
        return orderID;
    }

    /**
     * Sets the value of the orderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderID(String value) {
        this.orderID = value;
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
