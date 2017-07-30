
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				User data related to notifications. Note that SMS is currently reserved for future use.
 * 			
 * 
 * <p>Java class for SMSSubscriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SMSSubscriptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SMSPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserStatus" type="{urn:ebay:apis:eBLBaseComponents}SMSSubscriptionUserStatusCodeType" minOccurs="0"/>
 *         &lt;element name="CarrierID" type="{urn:ebay:apis:eBLBaseComponents}WirelessCarrierIDCodeType" minOccurs="0"/>
 *         &lt;element name="ErrorCode" type="{urn:ebay:apis:eBLBaseComponents}SMSSubscriptionErrorCodeCodeType" minOccurs="0"/>
 *         &lt;element name="ItemToUnsubscribe" type="{urn:ebay:apis:eBLBaseComponents}ItemIDType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SMSSubscriptionType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "smsPhone",
    "userStatus",
    "carrierID",
    "errorCode",
    "itemToUnsubscribe"
})
public class SMSSubscriptionType {

    @XmlElement(name = "SMSPhone", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String smsPhone;
    @XmlElement(name = "UserStatus", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected SMSSubscriptionUserStatusCodeType userStatus;
    @XmlElement(name = "CarrierID", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected WirelessCarrierIDCodeType carrierID;
    @XmlElement(name = "ErrorCode", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected SMSSubscriptionErrorCodeCodeType errorCode;
    @XmlElement(name = "ItemToUnsubscribe", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String itemToUnsubscribe;

    /**
     * Gets the value of the smsPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSMSPhone() {
        return smsPhone;
    }

    /**
     * Sets the value of the smsPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSMSPhone(String value) {
        this.smsPhone = value;
    }

    /**
     * Gets the value of the userStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SMSSubscriptionUserStatusCodeType }
     *     
     */
    public SMSSubscriptionUserStatusCodeType getUserStatus() {
        return userStatus;
    }

    /**
     * Sets the value of the userStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SMSSubscriptionUserStatusCodeType }
     *     
     */
    public void setUserStatus(SMSSubscriptionUserStatusCodeType value) {
        this.userStatus = value;
    }

    /**
     * Gets the value of the carrierID property.
     * 
     * @return
     *     possible object is
     *     {@link WirelessCarrierIDCodeType }
     *     
     */
    public WirelessCarrierIDCodeType getCarrierID() {
        return carrierID;
    }

    /**
     * Sets the value of the carrierID property.
     * 
     * @param value
     *     allowed object is
     *     {@link WirelessCarrierIDCodeType }
     *     
     */
    public void setCarrierID(WirelessCarrierIDCodeType value) {
        this.carrierID = value;
    }

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link SMSSubscriptionErrorCodeCodeType }
     *     
     */
    public SMSSubscriptionErrorCodeCodeType getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SMSSubscriptionErrorCodeCodeType }
     *     
     */
    public void setErrorCode(SMSSubscriptionErrorCodeCodeType value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the itemToUnsubscribe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemToUnsubscribe() {
        return itemToUnsubscribe;
    }

    /**
     * Sets the value of the itemToUnsubscribe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemToUnsubscribe(String value) {
        this.itemToUnsubscribe = value;
    }

}
