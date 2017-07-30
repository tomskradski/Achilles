
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
 * 				Enables a seller to send an order invoice to a buyer. Where applicable, updates
 * 				to shipping, payment methods, and sales tax made in this request are applied to
 * 				the specified order as a whole and to the individual order line items whose data
 * 				are stored in individual <b>Transaction</b> objects.
 * 			
 * 
 * <p>Java class for SendInvoiceRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SendInvoiceRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="ItemID" type="{urn:ebay:apis:eBLBaseComponents}ItemIDType" minOccurs="0"/>
 *         &lt;element name="TransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderID" type="{urn:ebay:apis:eBLBaseComponents}OrderIDType" minOccurs="0"/>
 *         &lt;element name="InternationalShippingServiceOptions" type="{urn:ebay:apis:eBLBaseComponents}InternationalShippingServiceOptionsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ShippingServiceOptions" type="{urn:ebay:apis:eBLBaseComponents}ShippingServiceOptionsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SalesTax" type="{urn:ebay:apis:eBLBaseComponents}SalesTaxType" minOccurs="0"/>
 *         &lt;element name="InsuranceOption" type="{urn:ebay:apis:eBLBaseComponents}InsuranceOptionCodeType" minOccurs="0"/>
 *         &lt;element name="InsuranceFee" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="PaymentMethods" type="{urn:ebay:apis:eBLBaseComponents}BuyerPaymentMethodCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PayPalEmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CheckoutInstructions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmailCopyToSeller" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CODCost" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="SKU" type="{urn:ebay:apis:eBLBaseComponents}SKUType" minOccurs="0"/>
 *         &lt;element name="OrderLineItemID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdjustmentAmount" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendInvoiceRequestType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "itemID",
    "transactionID",
    "orderID",
    "internationalShippingServiceOptions",
    "shippingServiceOptions",
    "salesTax",
    "insuranceOption",
    "insuranceFee",
    "paymentMethods",
    "payPalEmailAddress",
    "checkoutInstructions",
    "emailCopyToSeller",
    "codCost",
    "sku",
    "orderLineItemID",
    "adjustmentAmount"
})
public class SendInvoiceRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "ItemID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String itemID;
    @XmlElement(name = "TransactionID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String transactionID;
    @XmlElement(name = "OrderID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String orderID;
    @XmlElement(name = "InternationalShippingServiceOptions", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<InternationalShippingServiceOptionsType> internationalShippingServiceOptions;
    @XmlElement(name = "ShippingServiceOptions", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<ShippingServiceOptionsType> shippingServiceOptions;
    @XmlElement(name = "SalesTax", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected SalesTaxType salesTax;
    @XmlElement(name = "InsuranceOption", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected InsuranceOptionCodeType insuranceOption;
    @XmlElement(name = "InsuranceFee", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType insuranceFee;
    @XmlElement(name = "PaymentMethods", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected List<BuyerPaymentMethodCodeType> paymentMethods;
    @XmlElement(name = "PayPalEmailAddress", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String payPalEmailAddress;
    @XmlElement(name = "CheckoutInstructions", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String checkoutInstructions;
    @XmlElement(name = "EmailCopyToSeller", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean emailCopyToSeller;
    @XmlElement(name = "CODCost", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType codCost;
    @XmlElement(name = "SKU", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String sku;
    @XmlElement(name = "OrderLineItemID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String orderLineItemID;
    @XmlElement(name = "AdjustmentAmount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType adjustmentAmount;

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
     * Gets the value of the internationalShippingServiceOptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the internationalShippingServiceOptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInternationalShippingServiceOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InternationalShippingServiceOptionsType }
     * 
     * 
     */
    public List<InternationalShippingServiceOptionsType> getInternationalShippingServiceOptions() {
        if (internationalShippingServiceOptions == null) {
            internationalShippingServiceOptions = new ArrayList<InternationalShippingServiceOptionsType>();
        }
        return this.internationalShippingServiceOptions;
    }

    /**
     * Gets the value of the shippingServiceOptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shippingServiceOptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShippingServiceOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShippingServiceOptionsType }
     * 
     * 
     */
    public List<ShippingServiceOptionsType> getShippingServiceOptions() {
        if (shippingServiceOptions == null) {
            shippingServiceOptions = new ArrayList<ShippingServiceOptionsType>();
        }
        return this.shippingServiceOptions;
    }

    /**
     * Gets the value of the salesTax property.
     * 
     * @return
     *     possible object is
     *     {@link SalesTaxType }
     *     
     */
    public SalesTaxType getSalesTax() {
        return salesTax;
    }

    /**
     * Sets the value of the salesTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesTaxType }
     *     
     */
    public void setSalesTax(SalesTaxType value) {
        this.salesTax = value;
    }

    /**
     * Gets the value of the insuranceOption property.
     * 
     * @return
     *     possible object is
     *     {@link InsuranceOptionCodeType }
     *     
     */
    public InsuranceOptionCodeType getInsuranceOption() {
        return insuranceOption;
    }

    /**
     * Sets the value of the insuranceOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceOptionCodeType }
     *     
     */
    public void setInsuranceOption(InsuranceOptionCodeType value) {
        this.insuranceOption = value;
    }

    /**
     * Gets the value of the insuranceFee property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getInsuranceFee() {
        return insuranceFee;
    }

    /**
     * Sets the value of the insuranceFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setInsuranceFee(AmountType value) {
        this.insuranceFee = value;
    }

    /**
     * Gets the value of the paymentMethods property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentMethods property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentMethods().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BuyerPaymentMethodCodeType }
     * 
     * 
     */
    public List<BuyerPaymentMethodCodeType> getPaymentMethods() {
        if (paymentMethods == null) {
            paymentMethods = new ArrayList<BuyerPaymentMethodCodeType>();
        }
        return this.paymentMethods;
    }

    /**
     * Gets the value of the payPalEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayPalEmailAddress() {
        return payPalEmailAddress;
    }

    /**
     * Sets the value of the payPalEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayPalEmailAddress(String value) {
        this.payPalEmailAddress = value;
    }

    /**
     * Gets the value of the checkoutInstructions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckoutInstructions() {
        return checkoutInstructions;
    }

    /**
     * Sets the value of the checkoutInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckoutInstructions(String value) {
        this.checkoutInstructions = value;
    }

    /**
     * Gets the value of the emailCopyToSeller property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmailCopyToSeller() {
        return emailCopyToSeller;
    }

    /**
     * Sets the value of the emailCopyToSeller property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmailCopyToSeller(Boolean value) {
        this.emailCopyToSeller = value;
    }

    /**
     * Gets the value of the codCost property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCODCost() {
        return codCost;
    }

    /**
     * Sets the value of the codCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCODCost(AmountType value) {
        this.codCost = value;
    }

    /**
     * Gets the value of the sku property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSKU() {
        return sku;
    }

    /**
     * Sets the value of the sku property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSKU(String value) {
        this.sku = value;
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

    /**
     * Gets the value of the adjustmentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAdjustmentAmount() {
        return adjustmentAmount;
    }

    /**
     * Sets the value of the adjustmentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAdjustmentAmount(AmountType value) {
        this.adjustmentAmount = value;
    }

}
