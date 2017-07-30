
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This type is deprecated.
 * 			
 * 
 * <p>Java class for RefundFailureReasonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RefundFailureReasonType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RefundFailureCode" type="{urn:ebay:apis:eBLBaseComponents}RefundFailureCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RefundFailureReasonType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "refundFailureCode"
})
public class RefundFailureReasonType {

    @XmlElement(name = "RefundFailureCode", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected RefundFailureCodeType refundFailureCode;

    /**
     * Gets the value of the refundFailureCode property.
     * 
     * @return
     *     possible object is
     *     {@link RefundFailureCodeType }
     *     
     */
    public RefundFailureCodeType getRefundFailureCode() {
        return refundFailureCode;
    }

    /**
     * Sets the value of the refundFailureCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefundFailureCodeType }
     *     
     */
    public void setRefundFailureCode(RefundFailureCodeType value) {
        this.refundFailureCode = value;
    }

}
