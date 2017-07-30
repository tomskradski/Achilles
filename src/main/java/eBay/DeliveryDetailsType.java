
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This type is used by the <b>DeliveryDetails</b>	container that is returned by <b>GetOrders</b> and other order management calls. The <b>DeliveryDetails</b> container is only applicable and returned if the buyer purchased a digital gift card, and is either keeping the gift card or giving that gift card to another person.
 * 			
 * 
 * <p>Java class for DeliveryDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeliveryDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Recipient" type="{urn:ebay:apis:eBLBaseComponents}DigitalDeliveryUserType" minOccurs="0"/>
 *         &lt;element name="Sender" type="{urn:ebay:apis:eBLBaseComponents}DigitalDeliveryUserType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryDetailsType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "recipient",
    "sender"
})
public class DeliveryDetailsType {

    @XmlElement(name = "Recipient", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected DigitalDeliveryUserType recipient;
    @XmlElement(name = "Sender", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected DigitalDeliveryUserType sender;

    /**
     * Gets the value of the recipient property.
     * 
     * @return
     *     possible object is
     *     {@link DigitalDeliveryUserType }
     *     
     */
    public DigitalDeliveryUserType getRecipient() {
        return recipient;
    }

    /**
     * Sets the value of the recipient property.
     * 
     * @param value
     *     allowed object is
     *     {@link DigitalDeliveryUserType }
     *     
     */
    public void setRecipient(DigitalDeliveryUserType value) {
        this.recipient = value;
    }

    /**
     * Gets the value of the sender property.
     * 
     * @return
     *     possible object is
     *     {@link DigitalDeliveryUserType }
     *     
     */
    public DigitalDeliveryUserType getSender() {
        return sender;
    }

    /**
     * Sets the value of the sender property.
     * 
     * @param value
     *     allowed object is
     *     {@link DigitalDeliveryUserType }
     *     
     */
    public void setSender(DigitalDeliveryUserType value) {
        this.sender = value;
    }

}
