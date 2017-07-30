
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 * 				This type is used by the <b>DigitalDeliverySelected</b>	container that is returned by <b>GetOrders</b> and other order management calls. The <b>DigitalDeliverySelected</b> container is only applicable and returned if the buyer purchased a digital gift card for themselves, or is giving the digital gift card to someone else as a gift.
 * 			
 * 
 * <p>Java class for DigitalDeliverySelectedType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DigitalDeliverySelectedType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DeliveryMethod" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="DeliveryStatus" type="{urn:ebay:apis:eBLBaseComponents}DeliveryStatusType" minOccurs="0"/>
 *         &lt;element name="DeliveryDetails" type="{urn:ebay:apis:eBLBaseComponents}DeliveryDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DigitalDeliverySelectedType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "deliveryMethod",
    "deliveryStatus",
    "deliveryDetails"
})
public class DigitalDeliverySelectedType {

    @XmlElement(name = "DeliveryMethod", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String deliveryMethod;
    @XmlElement(name = "DeliveryStatus", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected DeliveryStatusType deliveryStatus;
    @XmlElement(name = "DeliveryDetails", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected DeliveryDetailsType deliveryDetails;

    /**
     * Gets the value of the deliveryMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryMethod() {
        return deliveryMethod;
    }

    /**
     * Sets the value of the deliveryMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryMethod(String value) {
        this.deliveryMethod = value;
    }

    /**
     * Gets the value of the deliveryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryStatusType }
     *     
     */
    public DeliveryStatusType getDeliveryStatus() {
        return deliveryStatus;
    }

    /**
     * Sets the value of the deliveryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryStatusType }
     *     
     */
    public void setDeliveryStatus(DeliveryStatusType value) {
        this.deliveryStatus = value;
    }

    /**
     * Gets the value of the deliveryDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryDetailsType }
     *     
     */
    public DeliveryDetailsType getDeliveryDetails() {
        return deliveryDetails;
    }

    /**
     * Sets the value of the deliveryDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryDetailsType }
     *     
     */
    public void setDeliveryDetails(DeliveryDetailsType value) {
        this.deliveryDetails = value;
    }

}