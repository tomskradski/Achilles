
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * 				This type defines the <b>PaymentHoldDetails</b> container, which
 * 				consists of information related to the payment hold on the order, including the
 * 				reason why the buyer's payment for the order is being held, the expected 
 * 				release date of the funds into the seller's account, and possible action(s) the
 * 				seller can take to expedite the payout of funds into their account.
 * 			
 * 
 * <p>Java class for PaymentHoldDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentHoldDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExpectedReleaseDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="RequiredSellerActionArray" type="{urn:ebay:apis:eBLBaseComponents}RequiredSellerActionArrayType" minOccurs="0"/>
 *         &lt;element name="NumOfReqSellerActions" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PaymentHoldReason" type="{urn:ebay:apis:eBLBaseComponents}PaymentHoldReasonCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentHoldDetailType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "expectedReleaseDate",
    "requiredSellerActionArray",
    "numOfReqSellerActions",
    "paymentHoldReason"
})
public class PaymentHoldDetailType {

    @XmlElement(name = "ExpectedReleaseDate", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expectedReleaseDate;
    @XmlElement(name = "RequiredSellerActionArray", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected RequiredSellerActionArrayType requiredSellerActionArray;
    @XmlElement(name = "NumOfReqSellerActions", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer numOfReqSellerActions;
    @XmlElement(name = "PaymentHoldReason", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected PaymentHoldReasonCodeType paymentHoldReason;

    /**
     * Gets the value of the expectedReleaseDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpectedReleaseDate() {
        return expectedReleaseDate;
    }

    /**
     * Sets the value of the expectedReleaseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpectedReleaseDate(XMLGregorianCalendar value) {
        this.expectedReleaseDate = value;
    }

    /**
     * Gets the value of the requiredSellerActionArray property.
     * 
     * @return
     *     possible object is
     *     {@link RequiredSellerActionArrayType }
     *     
     */
    public RequiredSellerActionArrayType getRequiredSellerActionArray() {
        return requiredSellerActionArray;
    }

    /**
     * Sets the value of the requiredSellerActionArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequiredSellerActionArrayType }
     *     
     */
    public void setRequiredSellerActionArray(RequiredSellerActionArrayType value) {
        this.requiredSellerActionArray = value;
    }

    /**
     * Gets the value of the numOfReqSellerActions property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumOfReqSellerActions() {
        return numOfReqSellerActions;
    }

    /**
     * Sets the value of the numOfReqSellerActions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumOfReqSellerActions(Integer value) {
        this.numOfReqSellerActions = value;
    }

    /**
     * Gets the value of the paymentHoldReason property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentHoldReasonCodeType }
     *     
     */
    public PaymentHoldReasonCodeType getPaymentHoldReason() {
        return paymentHoldReason;
    }

    /**
     * Sets the value of the paymentHoldReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentHoldReasonCodeType }
     *     
     */
    public void setPaymentHoldReason(PaymentHoldReasonCodeType value) {
        this.paymentHoldReason = value;
    }

}
