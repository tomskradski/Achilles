
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * 				Information about a single notification. Notification information includes
 * 				the reference ID, notification type, current status, time delivered, error code,
 * 				and error message for the notification. If notification details are included in
 * 				the response, all of the detail fields are returned.
 * 			
 * 
 * <p>Java class for NotificationDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotificationDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DeliveryURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="ReferenceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExpirationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Type" type="{urn:ebay:apis:eBLBaseComponents}NotificationEventTypeCodeType" minOccurs="0"/>
 *         &lt;element name="Retries" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DeliveryStatus" type="{urn:ebay:apis:eBLBaseComponents}NotificationEventStateCodeType" minOccurs="0"/>
 *         &lt;element name="NextRetryTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DeliveryTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeliveryURLName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationDetailsType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "deliveryURL",
    "referenceID",
    "expirationTime",
    "type",
    "retries",
    "deliveryStatus",
    "nextRetryTime",
    "deliveryTime",
    "errorMessage",
    "deliveryURLName"
})
public class NotificationDetailsType {

    @XmlElement(name = "DeliveryURL", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "anyURI")
    protected String deliveryURL;
    @XmlElement(name = "ReferenceID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String referenceID;
    @XmlElement(name = "ExpirationTime", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirationTime;
    @XmlElement(name = "Type", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected NotificationEventTypeCodeType type;
    @XmlElement(name = "Retries", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer retries;
    @XmlElement(name = "DeliveryStatus", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected NotificationEventStateCodeType deliveryStatus;
    @XmlElement(name = "NextRetryTime", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar nextRetryTime;
    @XmlElement(name = "DeliveryTime", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deliveryTime;
    @XmlElement(name = "ErrorMessage", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String errorMessage;
    @XmlElement(name = "DeliveryURLName", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String deliveryURLName;

    /**
     * Gets the value of the deliveryURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryURL() {
        return deliveryURL;
    }

    /**
     * Sets the value of the deliveryURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryURL(String value) {
        this.deliveryURL = value;
    }

    /**
     * Gets the value of the referenceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceID() {
        return referenceID;
    }

    /**
     * Sets the value of the referenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceID(String value) {
        this.referenceID = value;
    }

    /**
     * Gets the value of the expirationTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationTime() {
        return expirationTime;
    }

    /**
     * Sets the value of the expirationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationTime(XMLGregorianCalendar value) {
        this.expirationTime = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationEventTypeCodeType }
     *     
     */
    public NotificationEventTypeCodeType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationEventTypeCodeType }
     *     
     */
    public void setType(NotificationEventTypeCodeType value) {
        this.type = value;
    }

    /**
     * Gets the value of the retries property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRetries() {
        return retries;
    }

    /**
     * Sets the value of the retries property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRetries(Integer value) {
        this.retries = value;
    }

    /**
     * Gets the value of the deliveryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationEventStateCodeType }
     *     
     */
    public NotificationEventStateCodeType getDeliveryStatus() {
        return deliveryStatus;
    }

    /**
     * Sets the value of the deliveryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationEventStateCodeType }
     *     
     */
    public void setDeliveryStatus(NotificationEventStateCodeType value) {
        this.deliveryStatus = value;
    }

    /**
     * Gets the value of the nextRetryTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNextRetryTime() {
        return nextRetryTime;
    }

    /**
     * Sets the value of the nextRetryTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNextRetryTime(XMLGregorianCalendar value) {
        this.nextRetryTime = value;
    }

    /**
     * Gets the value of the deliveryTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeliveryTime() {
        return deliveryTime;
    }

    /**
     * Sets the value of the deliveryTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeliveryTime(XMLGregorianCalendar value) {
        this.deliveryTime = value;
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
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
