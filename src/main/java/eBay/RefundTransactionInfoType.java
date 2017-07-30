
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * 				Type defining the <strong>Refund</strong> container, which consists of detailed information on an In-Store Pickup item refund.
 * 				<br/><br/>
 * 				<span class="tablenote">
 * 				<strong>Note:</strong> At this time, the In-Store Pickup feature is generally only available to large retail merchants, and can only be applied to multi-quantity, fixed-price listings.
 * 				</span>
 * 			
 * 
 * <p>Java class for RefundTransactionInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RefundTransactionInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RefundStatus" type="{urn:ebay:apis:eBLBaseComponents}PaymentTransactionStatusCodeType" minOccurs="0"/>
 *         &lt;element name="RefundType" type="{urn:ebay:apis:eBLBaseComponents}RefundSourceTypeCodeType" minOccurs="0"/>
 *         &lt;element name="RefundTo" type="{urn:ebay:apis:eBLBaseComponents}UserIdentityType" minOccurs="0"/>
 *         &lt;element name="RefundTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="RefundAmount" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="ReferenceID" type="{urn:ebay:apis:eBLBaseComponents}TransactionReferenceType" minOccurs="0"/>
 *         &lt;element name="FeeOrCreditAmount" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RefundTransactionInfoType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "refundStatus",
    "refundType",
    "refundTo",
    "refundTime",
    "refundAmount",
    "referenceID",
    "feeOrCreditAmount"
})
public class RefundTransactionInfoType {

    @XmlElement(name = "RefundStatus", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected PaymentTransactionStatusCodeType refundStatus;
    @XmlElement(name = "RefundType", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected RefundSourceTypeCodeType refundType;
    @XmlElement(name = "RefundTo", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected UserIdentityType refundTo;
    @XmlElement(name = "RefundTime", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar refundTime;
    @XmlElement(name = "RefundAmount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType refundAmount;
    @XmlElement(name = "ReferenceID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected TransactionReferenceType referenceID;
    @XmlElement(name = "FeeOrCreditAmount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType feeOrCreditAmount;

    /**
     * Gets the value of the refundStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTransactionStatusCodeType }
     *     
     */
    public PaymentTransactionStatusCodeType getRefundStatus() {
        return refundStatus;
    }

    /**
     * Sets the value of the refundStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTransactionStatusCodeType }
     *     
     */
    public void setRefundStatus(PaymentTransactionStatusCodeType value) {
        this.refundStatus = value;
    }

    /**
     * Gets the value of the refundType property.
     * 
     * @return
     *     possible object is
     *     {@link RefundSourceTypeCodeType }
     *     
     */
    public RefundSourceTypeCodeType getRefundType() {
        return refundType;
    }

    /**
     * Sets the value of the refundType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefundSourceTypeCodeType }
     *     
     */
    public void setRefundType(RefundSourceTypeCodeType value) {
        this.refundType = value;
    }

    /**
     * Gets the value of the refundTo property.
     * 
     * @return
     *     possible object is
     *     {@link UserIdentityType }
     *     
     */
    public UserIdentityType getRefundTo() {
        return refundTo;
    }

    /**
     * Sets the value of the refundTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserIdentityType }
     *     
     */
    public void setRefundTo(UserIdentityType value) {
        this.refundTo = value;
    }

    /**
     * Gets the value of the refundTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRefundTime() {
        return refundTime;
    }

    /**
     * Sets the value of the refundTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRefundTime(XMLGregorianCalendar value) {
        this.refundTime = value;
    }

    /**
     * Gets the value of the refundAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getRefundAmount() {
        return refundAmount;
    }

    /**
     * Sets the value of the refundAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setRefundAmount(AmountType value) {
        this.refundAmount = value;
    }

    /**
     * Gets the value of the referenceID property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionReferenceType }
     *     
     */
    public TransactionReferenceType getReferenceID() {
        return referenceID;
    }

    /**
     * Sets the value of the referenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionReferenceType }
     *     
     */
    public void setReferenceID(TransactionReferenceType value) {
        this.referenceID = value;
    }

    /**
     * Gets the value of the feeOrCreditAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getFeeOrCreditAmount() {
        return feeOrCreditAmount;
    }

    /**
     * Sets the value of the feeOrCreditAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setFeeOrCreditAmount(AmountType value) {
        this.feeOrCreditAmount = value;
    }

}
