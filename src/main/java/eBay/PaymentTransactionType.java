
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
 * 				This type contains details about the allocation of funds to one payee from a buyer payment for a specified order.
 * 			
 * 
 * <p>Java class for PaymentTransactionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentTransactionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaymentStatus" type="{urn:ebay:apis:eBLBaseComponents}PaymentTransactionStatusCodeType" minOccurs="0"/>
 *         &lt;element name="Payer" type="{urn:ebay:apis:eBLBaseComponents}UserIdentityType" minOccurs="0"/>
 *         &lt;element name="Payee" type="{urn:ebay:apis:eBLBaseComponents}UserIdentityType" minOccurs="0"/>
 *         &lt;element name="PaymentTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PaymentAmount" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="ReferenceID" type="{urn:ebay:apis:eBLBaseComponents}TransactionReferenceType" minOccurs="0"/>
 *         &lt;element name="FeeOrCreditAmount" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="PaymentReferenceID" type="{urn:ebay:apis:eBLBaseComponents}TransactionReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentTransactionType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "paymentStatus",
    "payer",
    "payee",
    "paymentTime",
    "paymentAmount",
    "referenceID",
    "feeOrCreditAmount",
    "paymentReferenceID"
})
public class PaymentTransactionType {

    @XmlElement(name = "PaymentStatus", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected PaymentTransactionStatusCodeType paymentStatus;
    @XmlElement(name = "Payer", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected UserIdentityType payer;
    @XmlElement(name = "Payee", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected UserIdentityType payee;
    @XmlElement(name = "PaymentTime", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar paymentTime;
    @XmlElement(name = "PaymentAmount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType paymentAmount;
    @XmlElement(name = "ReferenceID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected TransactionReferenceType referenceID;
    @XmlElement(name = "FeeOrCreditAmount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType feeOrCreditAmount;
    @XmlElement(name = "PaymentReferenceID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<TransactionReferenceType> paymentReferenceID;

    /**
     * Gets the value of the paymentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTransactionStatusCodeType }
     *     
     */
    public PaymentTransactionStatusCodeType getPaymentStatus() {
        return paymentStatus;
    }

    /**
     * Sets the value of the paymentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTransactionStatusCodeType }
     *     
     */
    public void setPaymentStatus(PaymentTransactionStatusCodeType value) {
        this.paymentStatus = value;
    }

    /**
     * Gets the value of the payer property.
     * 
     * @return
     *     possible object is
     *     {@link UserIdentityType }
     *     
     */
    public UserIdentityType getPayer() {
        return payer;
    }

    /**
     * Sets the value of the payer property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserIdentityType }
     *     
     */
    public void setPayer(UserIdentityType value) {
        this.payer = value;
    }

    /**
     * Gets the value of the payee property.
     * 
     * @return
     *     possible object is
     *     {@link UserIdentityType }
     *     
     */
    public UserIdentityType getPayee() {
        return payee;
    }

    /**
     * Sets the value of the payee property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserIdentityType }
     *     
     */
    public void setPayee(UserIdentityType value) {
        this.payee = value;
    }

    /**
     * Gets the value of the paymentTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPaymentTime() {
        return paymentTime;
    }

    /**
     * Sets the value of the paymentTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPaymentTime(XMLGregorianCalendar value) {
        this.paymentTime = value;
    }

    /**
     * Gets the value of the paymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPaymentAmount() {
        return paymentAmount;
    }

    /**
     * Sets the value of the paymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPaymentAmount(AmountType value) {
        this.paymentAmount = value;
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

    /**
     * Gets the value of the paymentReferenceID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentReferenceID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentReferenceID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionReferenceType }
     * 
     * 
     */
    public List<TransactionReferenceType> getPaymentReferenceID() {
        if (paymentReferenceID == null) {
            paymentReferenceID = new ArrayList<TransactionReferenceType>();
        }
        return this.paymentReferenceID;
    }

}
