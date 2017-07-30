
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * 				Type defining the <strong>PickupMethodSelected</strong> container, which consists of details related to the selected local pickup method (In-Store Pickup or "Click and Collect"), including the pickup method, the merchant's store ID, the status of the pickup, and the pickup reference code (if provided by merchant).
 * 				<br/><br/>
 * 				<span class="tablenote">
 * 				<strong>Note:</strong> At this time, the In-Store Pickup feature is generally only available to large retail merchants, and can only be applied to multi-quantity, fixed-price listings. The "Click and Collect" feature is only available to large merchants on the eBay UK (site ID - 3) and eBay Australia (Site ID - 15) sites.
 * 				</span>
 * 			
 * 
 * <p>Java class for PickupMethodSelectedType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PickupMethodSelectedType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PickupMethod" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="PickupStoreID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PickupStatus" type="{urn:ebay:apis:eBLBaseComponents}PickupStatusCodeType" minOccurs="0"/>
 *         &lt;element name="MerchantPickupCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PickupFulfillmentTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PickupLocationUUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PickupMethodSelectedType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "pickupMethod",
    "pickupStoreID",
    "pickupStatus",
    "merchantPickupCode",
    "pickupFulfillmentTime",
    "pickupLocationUUID"
})
public class PickupMethodSelectedType {

    @XmlElement(name = "PickupMethod", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String pickupMethod;
    @XmlElement(name = "PickupStoreID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String pickupStoreID;
    @XmlElement(name = "PickupStatus", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected PickupStatusCodeType pickupStatus;
    @XmlElement(name = "MerchantPickupCode", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String merchantPickupCode;
    @XmlElement(name = "PickupFulfillmentTime", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar pickupFulfillmentTime;
    @XmlElement(name = "PickupLocationUUID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String pickupLocationUUID;

    /**
     * Gets the value of the pickupMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickupMethod() {
        return pickupMethod;
    }

    /**
     * Sets the value of the pickupMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickupMethod(String value) {
        this.pickupMethod = value;
    }

    /**
     * Gets the value of the pickupStoreID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickupStoreID() {
        return pickupStoreID;
    }

    /**
     * Sets the value of the pickupStoreID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickupStoreID(String value) {
        this.pickupStoreID = value;
    }

    /**
     * Gets the value of the pickupStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PickupStatusCodeType }
     *     
     */
    public PickupStatusCodeType getPickupStatus() {
        return pickupStatus;
    }

    /**
     * Sets the value of the pickupStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PickupStatusCodeType }
     *     
     */
    public void setPickupStatus(PickupStatusCodeType value) {
        this.pickupStatus = value;
    }

    /**
     * Gets the value of the merchantPickupCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantPickupCode() {
        return merchantPickupCode;
    }

    /**
     * Sets the value of the merchantPickupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantPickupCode(String value) {
        this.merchantPickupCode = value;
    }

    /**
     * Gets the value of the pickupFulfillmentTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPickupFulfillmentTime() {
        return pickupFulfillmentTime;
    }

    /**
     * Sets the value of the pickupFulfillmentTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPickupFulfillmentTime(XMLGregorianCalendar value) {
        this.pickupFulfillmentTime = value;
    }

    /**
     * Gets the value of the pickupLocationUUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickupLocationUUID() {
        return pickupLocationUUID;
    }

    /**
     * Sets the value of the pickupLocationUUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickupLocationUUID(String value) {
        this.pickupLocationUUID = value;
    }

}
