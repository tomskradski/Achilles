
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * 				This type is not currently in use.
 * 				
 * 			
 * 
 * <p>Java class for ShippingEstimatedDeliveryInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShippingEstimatedDeliveryInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OriginalDeliveryEstimatedTimeMin" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="OriginalDeliveryEstimatedTimeMax" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShippingEstimatedDeliveryInfoType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "originalDeliveryEstimatedTimeMin",
    "originalDeliveryEstimatedTimeMax"
})
public class ShippingEstimatedDeliveryInfoType {

    @XmlElement(name = "OriginalDeliveryEstimatedTimeMin", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar originalDeliveryEstimatedTimeMin;
    @XmlElement(name = "OriginalDeliveryEstimatedTimeMax", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar originalDeliveryEstimatedTimeMax;

    /**
     * Gets the value of the originalDeliveryEstimatedTimeMin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOriginalDeliveryEstimatedTimeMin() {
        return originalDeliveryEstimatedTimeMin;
    }

    /**
     * Sets the value of the originalDeliveryEstimatedTimeMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOriginalDeliveryEstimatedTimeMin(XMLGregorianCalendar value) {
        this.originalDeliveryEstimatedTimeMin = value;
    }

    /**
     * Gets the value of the originalDeliveryEstimatedTimeMax property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOriginalDeliveryEstimatedTimeMax() {
        return originalDeliveryEstimatedTimeMax;
    }

    /**
     * Sets the value of the originalDeliveryEstimatedTimeMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOriginalDeliveryEstimatedTimeMax(XMLGregorianCalendar value) {
        this.originalDeliveryEstimatedTimeMax = value;
    }

}
