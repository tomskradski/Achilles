
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * 				A payment between Half.com and a seller. The financial value of a payment is
 * 				typically based on an amount that a buyer paid to Half.com for one order line
 * 				item, plus the buyer's shipping cost, minus Half.com's commission.
 * 			
 * 
 * <p>Java class for SellerPaymentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SellerPaymentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ItemID" type="{urn:ebay:apis:eBLBaseComponents}ItemIDType" minOccurs="0"/>
 *         &lt;element name="TransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderID" type="{urn:ebay:apis:eBLBaseComponents}OrderIDType" minOccurs="0"/>
 *         &lt;element name="SellerInventoryID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrivateNotes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExternalProductID" type="{urn:ebay:apis:eBLBaseComponents}ExternalProductIDType" minOccurs="0"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentType" type="{urn:ebay:apis:eBLBaseComponents}PaymentTypeCodeType" minOccurs="0"/>
 *         &lt;element name="TransactionPrice" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="ShippingReimbursement" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="Commission" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="AmountPaid" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="PaidTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
@XmlType(name = "SellerPaymentType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "itemID",
    "transactionID",
    "orderID",
    "sellerInventoryID",
    "privateNotes",
    "externalProductID",
    "title",
    "paymentType",
    "transactionPrice",
    "shippingReimbursement",
    "commission",
    "amountPaid",
    "paidTime",
    "orderLineItemID"
})
public class SellerPaymentType {

    @XmlElement(name = "ItemID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String itemID;
    @XmlElement(name = "TransactionID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String transactionID;
    @XmlElement(name = "OrderID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String orderID;
    @XmlElement(name = "SellerInventoryID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String sellerInventoryID;
    @XmlElement(name = "PrivateNotes", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String privateNotes;
    @XmlElement(name = "ExternalProductID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected ExternalProductIDType externalProductID;
    @XmlElement(name = "Title", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String title;
    @XmlElement(name = "PaymentType", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected PaymentTypeCodeType paymentType;
    @XmlElement(name = "TransactionPrice", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType transactionPrice;
    @XmlElement(name = "ShippingReimbursement", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType shippingReimbursement;
    @XmlElement(name = "Commission", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType commission;
    @XmlElement(name = "AmountPaid", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType amountPaid;
    @XmlElement(name = "PaidTime", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar paidTime;
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
     * Gets the value of the sellerInventoryID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerInventoryID() {
        return sellerInventoryID;
    }

    /**
     * Sets the value of the sellerInventoryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerInventoryID(String value) {
        this.sellerInventoryID = value;
    }

    /**
     * Gets the value of the privateNotes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrivateNotes() {
        return privateNotes;
    }

    /**
     * Sets the value of the privateNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrivateNotes(String value) {
        this.privateNotes = value;
    }

    /**
     * Gets the value of the externalProductID property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalProductIDType }
     *     
     */
    public ExternalProductIDType getExternalProductID() {
        return externalProductID;
    }

    /**
     * Sets the value of the externalProductID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalProductIDType }
     *     
     */
    public void setExternalProductID(ExternalProductIDType value) {
        this.externalProductID = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the paymentType property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTypeCodeType }
     *     
     */
    public PaymentTypeCodeType getPaymentType() {
        return paymentType;
    }

    /**
     * Sets the value of the paymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTypeCodeType }
     *     
     */
    public void setPaymentType(PaymentTypeCodeType value) {
        this.paymentType = value;
    }

    /**
     * Gets the value of the transactionPrice property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTransactionPrice() {
        return transactionPrice;
    }

    /**
     * Sets the value of the transactionPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTransactionPrice(AmountType value) {
        this.transactionPrice = value;
    }

    /**
     * Gets the value of the shippingReimbursement property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getShippingReimbursement() {
        return shippingReimbursement;
    }

    /**
     * Sets the value of the shippingReimbursement property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setShippingReimbursement(AmountType value) {
        this.shippingReimbursement = value;
    }

    /**
     * Gets the value of the commission property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCommission() {
        return commission;
    }

    /**
     * Sets the value of the commission property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCommission(AmountType value) {
        this.commission = value;
    }

    /**
     * Gets the value of the amountPaid property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmountPaid() {
        return amountPaid;
    }

    /**
     * Sets the value of the amountPaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmountPaid(AmountType value) {
        this.amountPaid = value;
    }

    /**
     * Gets the value of the paidTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPaidTime() {
        return paidTime;
    }

    /**
     * Sets the value of the paidTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPaidTime(XMLGregorianCalendar value) {
        this.paidTime = value;
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
