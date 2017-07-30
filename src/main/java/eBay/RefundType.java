
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * 				Contains information about a single Half.com refund.
 * 			
 * 
 * <p>Java class for RefundType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RefundType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RefundFromSeller" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalRefundToBuyer" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="RefundTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="RefundID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RefundTransactionArray" type="{urn:ebay:apis:eBLBaseComponents}RefundTransactionArrayType" minOccurs="0"/>
 *         &lt;element name="RefundAmount" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="RefundStatus" type="{urn:ebay:apis:eBLBaseComponents}RefundStatusCodeType" minOccurs="0"/>
 *         &lt;element name="RefundFailureReason" type="{urn:ebay:apis:eBLBaseComponents}RefundFailureReasonType" minOccurs="0"/>
 *         &lt;element name="RefundFundingSourceArray" type="{urn:ebay:apis:eBLBaseComponents}RefundFundingSourceArrayType" minOccurs="0"/>
 *         &lt;element name="ExternalReferenceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RefundRequestedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="RefundCompletionTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EstimatedRefundCompletionTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="SellerNoteToBuyer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RefundType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "refundFromSeller",
    "totalRefundToBuyer",
    "refundTime",
    "refundID",
    "refundTransactionArray",
    "refundAmount",
    "refundStatus",
    "refundFailureReason",
    "refundFundingSourceArray",
    "externalReferenceID",
    "refundRequestedTime",
    "refundCompletionTime",
    "estimatedRefundCompletionTime",
    "sellerNoteToBuyer"
})
public class RefundType {

    @XmlElement(name = "RefundFromSeller", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType refundFromSeller;
    @XmlElement(name = "TotalRefundToBuyer", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType totalRefundToBuyer;
    @XmlElement(name = "RefundTime", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar refundTime;
    @XmlElement(name = "RefundID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String refundID;
    @XmlElement(name = "RefundTransactionArray", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected RefundTransactionArrayType refundTransactionArray;
    @XmlElement(name = "RefundAmount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType refundAmount;
    @XmlElement(name = "RefundStatus", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected RefundStatusCodeType refundStatus;
    @XmlElement(name = "RefundFailureReason", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected RefundFailureReasonType refundFailureReason;
    @XmlElement(name = "RefundFundingSourceArray", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected RefundFundingSourceArrayType refundFundingSourceArray;
    @XmlElement(name = "ExternalReferenceID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String externalReferenceID;
    @XmlElement(name = "RefundRequestedTime", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar refundRequestedTime;
    @XmlElement(name = "RefundCompletionTime", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar refundCompletionTime;
    @XmlElement(name = "EstimatedRefundCompletionTime", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar estimatedRefundCompletionTime;
    @XmlElement(name = "SellerNoteToBuyer", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String sellerNoteToBuyer;

    /**
     * Gets the value of the refundFromSeller property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getRefundFromSeller() {
        return refundFromSeller;
    }

    /**
     * Sets the value of the refundFromSeller property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setRefundFromSeller(AmountType value) {
        this.refundFromSeller = value;
    }

    /**
     * Gets the value of the totalRefundToBuyer property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalRefundToBuyer() {
        return totalRefundToBuyer;
    }

    /**
     * Sets the value of the totalRefundToBuyer property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalRefundToBuyer(AmountType value) {
        this.totalRefundToBuyer = value;
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
     * Gets the value of the refundID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundID() {
        return refundID;
    }

    /**
     * Sets the value of the refundID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundID(String value) {
        this.refundID = value;
    }

    /**
     * Gets the value of the refundTransactionArray property.
     * 
     * @return
     *     possible object is
     *     {@link RefundTransactionArrayType }
     *     
     */
    public RefundTransactionArrayType getRefundTransactionArray() {
        return refundTransactionArray;
    }

    /**
     * Sets the value of the refundTransactionArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefundTransactionArrayType }
     *     
     */
    public void setRefundTransactionArray(RefundTransactionArrayType value) {
        this.refundTransactionArray = value;
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
     * Gets the value of the refundStatus property.
     * 
     * @return
     *     possible object is
     *     {@link RefundStatusCodeType }
     *     
     */
    public RefundStatusCodeType getRefundStatus() {
        return refundStatus;
    }

    /**
     * Sets the value of the refundStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefundStatusCodeType }
     *     
     */
    public void setRefundStatus(RefundStatusCodeType value) {
        this.refundStatus = value;
    }

    /**
     * Gets the value of the refundFailureReason property.
     * 
     * @return
     *     possible object is
     *     {@link RefundFailureReasonType }
     *     
     */
    public RefundFailureReasonType getRefundFailureReason() {
        return refundFailureReason;
    }

    /**
     * Sets the value of the refundFailureReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefundFailureReasonType }
     *     
     */
    public void setRefundFailureReason(RefundFailureReasonType value) {
        this.refundFailureReason = value;
    }

    /**
     * Gets the value of the refundFundingSourceArray property.
     * 
     * @return
     *     possible object is
     *     {@link RefundFundingSourceArrayType }
     *     
     */
    public RefundFundingSourceArrayType getRefundFundingSourceArray() {
        return refundFundingSourceArray;
    }

    /**
     * Sets the value of the refundFundingSourceArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefundFundingSourceArrayType }
     *     
     */
    public void setRefundFundingSourceArray(RefundFundingSourceArrayType value) {
        this.refundFundingSourceArray = value;
    }

    /**
     * Gets the value of the externalReferenceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalReferenceID() {
        return externalReferenceID;
    }

    /**
     * Sets the value of the externalReferenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalReferenceID(String value) {
        this.externalReferenceID = value;
    }

    /**
     * Gets the value of the refundRequestedTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRefundRequestedTime() {
        return refundRequestedTime;
    }

    /**
     * Sets the value of the refundRequestedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRefundRequestedTime(XMLGregorianCalendar value) {
        this.refundRequestedTime = value;
    }

    /**
     * Gets the value of the refundCompletionTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRefundCompletionTime() {
        return refundCompletionTime;
    }

    /**
     * Sets the value of the refundCompletionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRefundCompletionTime(XMLGregorianCalendar value) {
        this.refundCompletionTime = value;
    }

    /**
     * Gets the value of the estimatedRefundCompletionTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEstimatedRefundCompletionTime() {
        return estimatedRefundCompletionTime;
    }

    /**
     * Sets the value of the estimatedRefundCompletionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEstimatedRefundCompletionTime(XMLGregorianCalendar value) {
        this.estimatedRefundCompletionTime = value;
    }

    /**
     * Gets the value of the sellerNoteToBuyer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerNoteToBuyer() {
        return sellerNoteToBuyer;
    }

    /**
     * Sets the value of the sellerNoteToBuyer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerNoteToBuyer(String value) {
        this.sellerNoteToBuyer = value;
    }

}
