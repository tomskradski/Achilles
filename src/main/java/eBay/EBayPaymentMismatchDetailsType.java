
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * 				This type is deprecated.
 * 			
 * 
 * <p>Java class for eBayPaymentMismatchDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="eBayPaymentMismatchDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MismatchType" type="{urn:ebay:apis:eBLBaseComponents}MismatchTypeCodeType" minOccurs="0"/>
 *         &lt;element name="ActionRequiredBy" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="MismatchAmount" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eBayPaymentMismatchDetailsType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "mismatchType",
    "actionRequiredBy",
    "mismatchAmount"
})
public class EBayPaymentMismatchDetailsType {

    @XmlElement(name = "MismatchType", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected MismatchTypeCodeType mismatchType;
    @XmlElement(name = "ActionRequiredBy", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actionRequiredBy;
    @XmlElement(name = "MismatchAmount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType mismatchAmount;

    /**
     * Gets the value of the mismatchType property.
     * 
     * @return
     *     possible object is
     *     {@link MismatchTypeCodeType }
     *     
     */
    public MismatchTypeCodeType getMismatchType() {
        return mismatchType;
    }

    /**
     * Sets the value of the mismatchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MismatchTypeCodeType }
     *     
     */
    public void setMismatchType(MismatchTypeCodeType value) {
        this.mismatchType = value;
    }

    /**
     * Gets the value of the actionRequiredBy property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActionRequiredBy() {
        return actionRequiredBy;
    }

    /**
     * Sets the value of the actionRequiredBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActionRequiredBy(XMLGregorianCalendar value) {
        this.actionRequiredBy = value;
    }

    /**
     * Gets the value of the mismatchAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getMismatchAmount() {
        return mismatchAmount;
    }

    /**
     * Sets the value of the mismatchAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setMismatchAmount(AmountType value) {
        this.mismatchAmount = value;
    }

}
