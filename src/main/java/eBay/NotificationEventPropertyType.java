
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Defines properties associated with a particular event.
 * 			
 * 
 * <p>Java class for NotificationEventPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotificationEventPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EventType" type="{urn:ebay:apis:eBLBaseComponents}NotificationEventTypeCodeType" minOccurs="0"/>
 *         &lt;element name="Name" type="{urn:ebay:apis:eBLBaseComponents}NotificationEventPropertyNameCodeType" minOccurs="0"/>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationEventPropertyType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "eventType",
    "name",
    "value"
})
public class NotificationEventPropertyType {

    @XmlElement(name = "EventType", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected NotificationEventTypeCodeType eventType;
    @XmlElement(name = "Name", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected NotificationEventPropertyNameCodeType name;
    @XmlElement(name = "Value", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String value;

    /**
     * Gets the value of the eventType property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationEventTypeCodeType }
     *     
     */
    public NotificationEventTypeCodeType getEventType() {
        return eventType;
    }

    /**
     * Sets the value of the eventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationEventTypeCodeType }
     *     
     */
    public void setEventType(NotificationEventTypeCodeType value) {
        this.eventType = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationEventPropertyNameCodeType }
     *     
     */
    public NotificationEventPropertyNameCodeType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationEventPropertyNameCodeType }
     *     
     */
    public void setName(NotificationEventPropertyNameCodeType value) {
        this.name = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

}
