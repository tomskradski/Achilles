
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * 				Type defining the <b>CheckoutStatus</b> container that is returned in 
 * 				<b>GetOrders</b> and <b>GetOrderTransactions</b> to indicate 
 * 				the current checkout status of the order.
 * 			
 * 
 * <p>Java class for CheckoutStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckoutStatusType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="eBayPaymentStatus" type="{urn:ebay:apis:eBLBaseComponents}PaymentStatusCodeType" minOccurs="0"/>
 *         &lt;element name="LastModifiedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PaymentMethod" type="{urn:ebay:apis:eBLBaseComponents}BuyerPaymentMethodCodeType" minOccurs="0"/>
 *         &lt;element name="Status" type="{urn:ebay:apis:eBLBaseComponents}CompleteStatusCodeType" minOccurs="0"/>
 *         &lt;element name="IntegratedMerchantCreditCardEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="eBayPaymentMismatchDetails" type="{urn:ebay:apis:eBLBaseComponents}eBayPaymentMismatchDetailsType" minOccurs="0"/>
 *         &lt;element name="PaymentInstrument" type="{urn:ebay:apis:eBLBaseComponents}BuyerPaymentInstrumentCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckoutStatusType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "eBayPaymentStatus",
    "lastModifiedTime",
    "paymentMethod",
    "status",
    "integratedMerchantCreditCardEnabled",
    "eBayPaymentMismatchDetails",
    "paymentInstrument"
})
public class CheckoutStatusType {

    @XmlElement(namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected PaymentStatusCodeType eBayPaymentStatus;
    @XmlElement(name = "LastModifiedTime", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedTime;
    @XmlElement(name = "PaymentMethod", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected BuyerPaymentMethodCodeType paymentMethod;
    @XmlElement(name = "Status", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected CompleteStatusCodeType status;
    @XmlElement(name = "IntegratedMerchantCreditCardEnabled", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean integratedMerchantCreditCardEnabled;
    @XmlElement(namespace = "urn:ebay:apis:eBLBaseComponents")
    protected EBayPaymentMismatchDetailsType eBayPaymentMismatchDetails;
    @XmlElement(name = "PaymentInstrument", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected BuyerPaymentInstrumentCodeType paymentInstrument;

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
     * Gets the value of the lastModifiedTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModifiedTime() {
        return lastModifiedTime;
    }

    /**
     * Sets the value of the lastModifiedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModifiedTime(XMLGregorianCalendar value) {
        this.lastModifiedTime = value;
    }

    /**
     * Gets the value of the paymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link BuyerPaymentMethodCodeType }
     *     
     */
    public BuyerPaymentMethodCodeType getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Sets the value of the paymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuyerPaymentMethodCodeType }
     *     
     */
    public void setPaymentMethod(BuyerPaymentMethodCodeType value) {
        this.paymentMethod = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link CompleteStatusCodeType }
     *     
     */
    public CompleteStatusCodeType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompleteStatusCodeType }
     *     
     */
    public void setStatus(CompleteStatusCodeType value) {
        this.status = value;
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

}
