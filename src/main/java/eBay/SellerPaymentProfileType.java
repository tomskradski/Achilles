
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Type defining the <b>SellerPaymentProfile</b> container, which is used in an 
 * 				Add/Revise/Relist Trading API call to reference a Business Policies payment profile.
 * 			
 * 
 * <p>Java class for SellerPaymentProfileType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SellerPaymentProfileType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaymentProfileID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PaymentProfileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SellerPaymentProfileType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "paymentProfileID",
    "paymentProfileName"
})
public class SellerPaymentProfileType {

    @XmlElement(name = "PaymentProfileID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Long paymentProfileID;
    @XmlElement(name = "PaymentProfileName", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String paymentProfileName;

    /**
     * Gets the value of the paymentProfileID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPaymentProfileID() {
        return paymentProfileID;
    }

    /**
     * Sets the value of the paymentProfileID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPaymentProfileID(Long value) {
        this.paymentProfileID = value;
    }

    /**
     * Gets the value of the paymentProfileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentProfileName() {
        return paymentProfileName;
    }

    /**
     * Sets the value of the paymentProfileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentProfileName(String value) {
        this.paymentProfileName = value;
    }

}
