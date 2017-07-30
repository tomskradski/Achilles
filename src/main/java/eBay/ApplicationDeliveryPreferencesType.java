
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Type used by the <b>ApplicationDeliveryPreferences</b> container to control/indicate where and how Platform Notifications and/or Client Alerts are delivered to a user application, server, and/or email address.
 * 			
 * 
 * <p>Java class for ApplicationDeliveryPreferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApplicationDeliveryPreferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ApplicationURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="ApplicationEnable" type="{urn:ebay:apis:eBLBaseComponents}EnableCodeType" minOccurs="0"/>
 *         &lt;element name="AlertEmail" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="AlertEnable" type="{urn:ebay:apis:eBLBaseComponents}EnableCodeType" minOccurs="0"/>
 *         &lt;element name="NotificationPayloadType" type="{urn:ebay:apis:eBLBaseComponents}NotificationPayloadTypeCodeType" minOccurs="0"/>
 *         &lt;element name="DeviceType" type="{urn:ebay:apis:eBLBaseComponents}DeviceTypeCodeType" minOccurs="0"/>
 *         &lt;element name="PayloadVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeliveryURLDetails" type="{urn:ebay:apis:eBLBaseComponents}DeliveryURLDetailType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplicationDeliveryPreferencesType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "applicationURL",
    "applicationEnable",
    "alertEmail",
    "alertEnable",
    "notificationPayloadType",
    "deviceType",
    "payloadVersion",
    "deliveryURLDetails"
})
public class ApplicationDeliveryPreferencesType {

    @XmlElement(name = "ApplicationURL", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "anyURI")
    protected String applicationURL;
    @XmlElement(name = "ApplicationEnable", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected EnableCodeType applicationEnable;
    @XmlElement(name = "AlertEmail", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "anyURI")
    protected String alertEmail;
    @XmlElement(name = "AlertEnable", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected EnableCodeType alertEnable;
    @XmlElement(name = "NotificationPayloadType", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected NotificationPayloadTypeCodeType notificationPayloadType;
    @XmlElement(name = "DeviceType", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected DeviceTypeCodeType deviceType;
    @XmlElement(name = "PayloadVersion", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String payloadVersion;
    @XmlElement(name = "DeliveryURLDetails", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<DeliveryURLDetailType> deliveryURLDetails;

    /**
     * Gets the value of the applicationURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationURL() {
        return applicationURL;
    }

    /**
     * Sets the value of the applicationURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationURL(String value) {
        this.applicationURL = value;
    }

    /**
     * Gets the value of the applicationEnable property.
     * 
     * @return
     *     possible object is
     *     {@link EnableCodeType }
     *     
     */
    public EnableCodeType getApplicationEnable() {
        return applicationEnable;
    }

    /**
     * Sets the value of the applicationEnable property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnableCodeType }
     *     
     */
    public void setApplicationEnable(EnableCodeType value) {
        this.applicationEnable = value;
    }

    /**
     * Gets the value of the alertEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertEmail() {
        return alertEmail;
    }

    /**
     * Sets the value of the alertEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertEmail(String value) {
        this.alertEmail = value;
    }

    /**
     * Gets the value of the alertEnable property.
     * 
     * @return
     *     possible object is
     *     {@link EnableCodeType }
     *     
     */
    public EnableCodeType getAlertEnable() {
        return alertEnable;
    }

    /**
     * Sets the value of the alertEnable property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnableCodeType }
     *     
     */
    public void setAlertEnable(EnableCodeType value) {
        this.alertEnable = value;
    }

    /**
     * Gets the value of the notificationPayloadType property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationPayloadTypeCodeType }
     *     
     */
    public NotificationPayloadTypeCodeType getNotificationPayloadType() {
        return notificationPayloadType;
    }

    /**
     * Sets the value of the notificationPayloadType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationPayloadTypeCodeType }
     *     
     */
    public void setNotificationPayloadType(NotificationPayloadTypeCodeType value) {
        this.notificationPayloadType = value;
    }

    /**
     * Gets the value of the deviceType property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceTypeCodeType }
     *     
     */
    public DeviceTypeCodeType getDeviceType() {
        return deviceType;
    }

    /**
     * Sets the value of the deviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceTypeCodeType }
     *     
     */
    public void setDeviceType(DeviceTypeCodeType value) {
        this.deviceType = value;
    }

    /**
     * Gets the value of the payloadVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayloadVersion() {
        return payloadVersion;
    }

    /**
     * Sets the value of the payloadVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayloadVersion(String value) {
        this.payloadVersion = value;
    }

    /**
     * Gets the value of the deliveryURLDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deliveryURLDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeliveryURLDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeliveryURLDetailType }
     * 
     * 
     */
    public List<DeliveryURLDetailType> getDeliveryURLDetails() {
        if (deliveryURLDetails == null) {
            deliveryURLDetails = new ArrayList<DeliveryURLDetailType>();
        }
        return this.deliveryURLDetails;
    }

}
