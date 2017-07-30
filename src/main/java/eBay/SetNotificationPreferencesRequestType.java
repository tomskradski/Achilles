
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Manages notification and alert preferences for applications and users.
 * 			
 * 
 * <p>Java class for SetNotificationPreferencesRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetNotificationPreferencesRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="ApplicationDeliveryPreferences" type="{urn:ebay:apis:eBLBaseComponents}ApplicationDeliveryPreferencesType" minOccurs="0"/>
 *         &lt;element name="UserDeliveryPreferenceArray" type="{urn:ebay:apis:eBLBaseComponents}NotificationEnableArrayType" minOccurs="0"/>
 *         &lt;element name="UserData" type="{urn:ebay:apis:eBLBaseComponents}NotificationUserDataType" minOccurs="0"/>
 *         &lt;element name="EventProperty" type="{urn:ebay:apis:eBLBaseComponents}NotificationEventPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DeliveryURLName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetNotificationPreferencesRequestType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "applicationDeliveryPreferences",
    "userDeliveryPreferenceArray",
    "userData",
    "eventProperty",
    "deliveryURLName"
})
public class SetNotificationPreferencesRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "ApplicationDeliveryPreferences", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected ApplicationDeliveryPreferencesType applicationDeliveryPreferences;
    @XmlElement(name = "UserDeliveryPreferenceArray", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected NotificationEnableArrayType userDeliveryPreferenceArray;
    @XmlElement(name = "UserData", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected NotificationUserDataType userData;
    @XmlElement(name = "EventProperty", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<NotificationEventPropertyType> eventProperty;
    @XmlElement(name = "DeliveryURLName", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String deliveryURLName;

    /**
     * Gets the value of the applicationDeliveryPreferences property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationDeliveryPreferencesType }
     *     
     */
    public ApplicationDeliveryPreferencesType getApplicationDeliveryPreferences() {
        return applicationDeliveryPreferences;
    }

    /**
     * Sets the value of the applicationDeliveryPreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationDeliveryPreferencesType }
     *     
     */
    public void setApplicationDeliveryPreferences(ApplicationDeliveryPreferencesType value) {
        this.applicationDeliveryPreferences = value;
    }

    /**
     * Gets the value of the userDeliveryPreferenceArray property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationEnableArrayType }
     *     
     */
    public NotificationEnableArrayType getUserDeliveryPreferenceArray() {
        return userDeliveryPreferenceArray;
    }

    /**
     * Sets the value of the userDeliveryPreferenceArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationEnableArrayType }
     *     
     */
    public void setUserDeliveryPreferenceArray(NotificationEnableArrayType value) {
        this.userDeliveryPreferenceArray = value;
    }

    /**
     * Gets the value of the userData property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationUserDataType }
     *     
     */
    public NotificationUserDataType getUserData() {
        return userData;
    }

    /**
     * Sets the value of the userData property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationUserDataType }
     *     
     */
    public void setUserData(NotificationUserDataType value) {
        this.userData = value;
    }

    /**
     * Gets the value of the eventProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotificationEventPropertyType }
     * 
     * 
     */
    public List<NotificationEventPropertyType> getEventProperty() {
        if (eventProperty == null) {
            eventProperty = new ArrayList<NotificationEventPropertyType>();
        }
        return this.eventProperty;
    }

    /**
     * Gets the value of the deliveryURLName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryURLName() {
        return deliveryURLName;
    }

    /**
     * Sets the value of the deliveryURLName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryURLName(String value) {
        this.deliveryURLName = value;
    }

}
