
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * 				Contains the order status, e.g. the buyer's online
 * 				payment and whether the checkout process for the order is complete.
 * 			
 * 
 * <p>Java class for TransactionStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionStatusType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="eBayPaymentStatus" type="{urn:ebay:apis:eBLBaseComponents}PaymentStatusCodeType" minOccurs="0"/>
 *         &lt;element name="CheckoutStatus" type="{urn:ebay:apis:eBLBaseComponents}CheckoutStatusCodeType" minOccurs="0"/>
 *         &lt;element name="LastTimeModified" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PaymentMethodUsed" type="{urn:ebay:apis:eBLBaseComponents}BuyerPaymentMethodCodeType" minOccurs="0"/>
 *         &lt;element name="CompleteStatus" type="{urn:ebay:apis:eBLBaseComponents}CompleteStatusCodeType" minOccurs="0"/>
 *         &lt;element name="BuyerSelectedShipping" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PaymentHoldStatus" type="{urn:ebay:apis:eBLBaseComponents}PaymentHoldStatusCodeType" minOccurs="0"/>
 *         &lt;element name="IntegratedMerchantCreditCardEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="eBayPaymentMismatchDetails" type="{urn:ebay:apis:eBLBaseComponents}eBayPaymentMismatchDetailsType" minOccurs="0"/>
 *         &lt;element name="InquiryStatus" type="{urn:ebay:apis:eBLBaseComponents}InquiryStatusCodeType" minOccurs="0"/>
 *         &lt;element name="ReturnStatus" type="{urn:ebay:apis:eBLBaseComponents}ReturnStatusCodeType" minOccurs="0"/>
 *         &lt;element name="PaymentInstrument" type="{urn:ebay:apis:eBLBaseComponents}BuyerPaymentInstrumentCodeType" minOccurs="0"/>
 *         &lt;element name="DigitalStatus" type="{urn:ebay:apis:eBLBaseComponents}DigitalStatusCodeType" minOccurs="0"/>
 *         &lt;element name="CancelStatus" type="{urn:ebay:apis:eBLBaseComponents}CancelStatusCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionStatusType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "eBayPaymentStatus",
    "checkoutStatus",
    "lastTimeModified",
    "paymentMethodUsed",
    "completeStatus",
    "buyerSelectedShipping",
    "paymentHoldStatus",
    "integratedMerchantCreditCardEnabled",
    "eBayPaymentMismatchDetails",
    "inquiryStatus",
    "returnStatus",
    "paymentInstrument",
    "digitalStatus",
    "cancelStatus"
})
public class TransactionStatusType {

    @XmlElement(namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected PaymentStatusCodeType eBayPaymentStatus;
    @XmlElement(name = "CheckoutStatus", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected CheckoutStatusCodeType checkoutStatus;
    @XmlElement(name = "LastTimeModified", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastTimeModified;
    @XmlElement(name = "PaymentMethodUsed", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected BuyerPaymentMethodCodeType paymentMethodUsed;
    @XmlElement(name = "CompleteStatus", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected CompleteStatusCodeType completeStatus;
    @XmlElement(name = "BuyerSelectedShipping", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean buyerSelectedShipping;
    @XmlElement(name = "PaymentHoldStatus", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected PaymentHoldStatusCodeType paymentHoldStatus;
    @XmlElement(name = "IntegratedMerchantCreditCardEnabled", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean integratedMerchantCreditCardEnabled;
    @XmlElement(namespace = "urn:ebay:apis:eBLBaseComponents")
    protected EBayPaymentMismatchDetailsType eBayPaymentMismatchDetails;
    @XmlElement(name = "InquiryStatus", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected InquiryStatusCodeType inquiryStatus;
    @XmlElement(name = "ReturnStatus", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected ReturnStatusCodeType returnStatus;
    @XmlElement(name = "PaymentInstrument", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected BuyerPaymentInstrumentCodeType paymentInstrument;
    @XmlElement(name = "DigitalStatus", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected DigitalStatusCodeType digitalStatus;
    @XmlElement(name = "CancelStatus", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected CancelStatusCodeType cancelStatus;

    /**
     * Gets the value of the eBayPaymentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentStatusCodeType }
     *     
     */
    public PaymentStatusCodeType getEBayPaymentStatus() {
        return eBayPaymentStatus;
    }

    /**
     * Sets the value of the eBayPaymentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentStatusCodeType }
     *     
     */
    public void setEBayPaymentStatus(PaymentStatusCodeType value) {
        this.eBayPaymentStatus = value;
    }

    /**
     * Gets the value of the checkoutStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CheckoutStatusCodeType }
     *     
     */
    public CheckoutStatusCodeType getCheckoutStatus() {
        return checkoutStatus;
    }

    /**
     * Sets the value of the checkoutStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckoutStatusCodeType }
     *     
     */
    public void setCheckoutStatus(CheckoutStatusCodeType value) {
        this.checkoutStatus = value;
    }

    /**
     * Gets the value of the lastTimeModified property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastTimeModified() {
        return lastTimeModified;
    }

    /**
     * Sets the value of the lastTimeModified property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastTimeModified(XMLGregorianCalendar value) {
        this.lastTimeModified = value;
    }

    /**
     * Gets the value of the paymentMethodUsed property.
     * 
     * @return
     *     possible object is
     *     {@link BuyerPaymentMethodCodeType }
     *     
     */
    public BuyerPaymentMethodCodeType getPaymentMethodUsed() {
        return paymentMethodUsed;
    }

    /**
     * Sets the value of the paymentMethodUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuyerPaymentMethodCodeType }
     *     
     */
    public void setPaymentMethodUsed(BuyerPaymentMethodCodeType value) {
        this.paymentMethodUsed = value;
    }

    /**
     * Gets the value of the completeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CompleteStatusCodeType }
     *     
     */
    public CompleteStatusCodeType getCompleteStatus() {
        return completeStatus;
    }

    /**
     * Sets the value of the completeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompleteStatusCodeType }
     *     
     */
    public void setCompleteStatus(CompleteStatusCodeType value) {
        this.completeStatus = value;
    }

    /**
     * Gets the value of the buyerSelectedShipping property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBuyerSelectedShipping() {
        return buyerSelectedShipping;
    }

    /**
     * Sets the value of the buyerSelectedShipping property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBuyerSelectedShipping(Boolean value) {
        this.buyerSelectedShipping = value;
    }

    /**
     * Gets the value of the paymentHoldStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentHoldStatusCodeType }
     *     
     */
    public PaymentHoldStatusCodeType getPaymentHoldStatus() {
        return paymentHoldStatus;
    }

    /**
     * Sets the value of the paymentHoldStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentHoldStatusCodeType }
     *     
     */
    public void setPaymentHoldStatus(PaymentHoldStatusCodeType value) {
        this.paymentHoldStatus = value;
    }

    /**
     * Gets the value of the integratedMerchantCreditCardEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIntegratedMerchantCreditCardEnabled() {
        return integratedMerchantCreditCardEnabled;
    }

    /**
     * Sets the value of the integratedMerchantCreditCardEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIntegratedMerchantCreditCardEnabled(Boolean value) {
        this.integratedMerchantCreditCardEnabled = value;
    }

    /**
     * Gets the value of the eBayPaymentMismatchDetails property.
     * 
     * @return
     *     possible object is
     *     {@link EBayPaymentMismatchDetailsType }
     *     
     */
    public EBayPaymentMismatchDetailsType getEBayPaymentMismatchDetails() {
        return eBayPaymentMismatchDetails;
    }

    /**
     * Sets the value of the eBayPaymentMismatchDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link EBayPaymentMismatchDetailsType }
     *     
     */
    public void setEBayPaymentMismatchDetails(EBayPaymentMismatchDetailsType value) {
        this.eBayPaymentMismatchDetails = value;
    }

    /**
     * Gets the value of the inquiryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link InquiryStatusCodeType }
     *     
     */
    public InquiryStatusCodeType getInquiryStatus() {
        return inquiryStatus;
    }

    /**
     * Sets the value of the inquiryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link InquiryStatusCodeType }
     *     
     */
    public void setInquiryStatus(InquiryStatusCodeType value) {
        this.inquiryStatus = value;
    }

    /**
     * Gets the value of the returnStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnStatusCodeType }
     *     
     */
    public ReturnStatusCodeType getReturnStatus() {
        return returnStatus;
    }

    /**
     * Sets the value of the returnStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnStatusCodeType }
     *     
     */
    public void setReturnStatus(ReturnStatusCodeType value) {
        this.returnStatus = value;
    }

    /**
     * Gets the value of the paymentInstrument property.
     * 
     * @return
     *     possible object is
     *     {@link BuyerPaymentInstrumentCodeType }
     *     
     */
    public BuyerPaymentInstrumentCodeType getPaymentInstrument() {
        return paymentInstrument;
    }

    /**
     * Sets the value of the paymentInstrument property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuyerPaymentInstrumentCodeType }
     *     
     */
    public void setPaymentInstrument(BuyerPaymentInstrumentCodeType value) {
        this.paymentInstrument = value;
    }

    /**
     * Gets the value of the digitalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link DigitalStatusCodeType }
     *     
     */
    public DigitalStatusCodeType getDigitalStatus() {
        return digitalStatus;
    }

    /**
     * Sets the value of the digitalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link DigitalStatusCodeType }
     *     
     */
    public void setDigitalStatus(DigitalStatusCodeType value) {
        this.digitalStatus = value;
    }

    /**
     * Gets the value of the cancelStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CancelStatusCodeType }
     *     
     */
    public CancelStatusCodeType getCancelStatus() {
        return cancelStatus;
    }

    /**
     * Sets the value of the cancelStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelStatusCodeType }
     *     
     */
    public void setCancelStatus(CancelStatusCodeType value) {
        this.cancelStatus = value;
    }

}
