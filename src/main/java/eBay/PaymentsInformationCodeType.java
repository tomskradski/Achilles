
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This type is deprecated.
 * 			
 * 
 * <p>Java class for PaymentsInformationCodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentsInformationCodeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Payments" type="{urn:ebay:apis:eBLBaseComponents}PaymentInformationCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentsInformationCodeType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "payments"
})
public class PaymentsInformationCodeType {

    @XmlElement(name = "Payments", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected PaymentInformationCodeType payments;

    /**
     * Gets the value of the payments property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInformationCodeType }
     *     
     */
    public PaymentInformationCodeType getPayments() {
        return payments;
    }

    /**
     * Sets the value of the payments property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInformationCodeType }
     *     
     */
    public void setPayments(PaymentInformationCodeType value) {
        this.payments = value;
    }

}
