
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
 * 				Type defining the <b>ShippingPackageInfoType</b> container, which is returned in order management calls. The <b>ShippingPackageInfoType</b> container provides information on delivery times and tracking information for a shipping package.
 * 			
 * 
 * <p>Java class for ShippingPackageInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShippingPackageInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StoreID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShippingTrackingEvent" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="ScheduledDeliveryTimeMin" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ScheduledDeliveryTimeMax" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ActualDeliveryTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EstimatedDeliveryTimeMin" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EstimatedDeliveryTimeMax" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="HandleByTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="MinNativeEstimatedDeliveryTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="MaxNativeEstimatedDeliveryTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShippingPackageInfoType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "storeID",
    "shippingTrackingEvent",
    "scheduledDeliveryTimeMin",
    "scheduledDeliveryTimeMax",
    "actualDeliveryTime",
    "estimatedDeliveryTimeMin",
    "estimatedDeliveryTimeMax",
    "handleByTime",
    "minNativeEstimatedDeliveryTime",
    "maxNativeEstimatedDeliveryTime"
})
public class ShippingPackageInfoType {

    @XmlElement(name = "StoreID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String storeID;
    @XmlElement(name = "ShippingTrackingEvent", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String shippingTrackingEvent;
    @XmlElement(name = "ScheduledDeliveryTimeMin", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduledDeliveryTimeMin;
    @XmlElement(name = "ScheduledDeliveryTimeMax", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduledDeliveryTimeMax;
    @XmlElement(name = "ActualDeliveryTime", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actualDeliveryTime;
    @XmlElement(name = "EstimatedDeliveryTimeMin", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar estimatedDeliveryTimeMin;
    @XmlElement(name = "EstimatedDeliveryTimeMax", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar estimatedDeliveryTimeMax;
    @XmlElement(name = "HandleByTime", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar handleByTime;
    @XmlElement(name = "MinNativeEstimatedDeliveryTime", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar minNativeEstimatedDeliveryTime;
    @XmlElement(name = "MaxNativeEstimatedDeliveryTime", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar maxNativeEstimatedDeliveryTime;

    /**
     * Gets the value of the storeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreID() {
        return storeID;
    }

    /**
     * Sets the value of the storeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreID(String value) {
        this.storeID = value;
    }

    /**
     * Gets the value of the shippingTrackingEvent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingTrackingEvent() {
        return shippingTrackingEvent;
    }

    /**
     * Sets the value of the shippingTrackingEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingTrackingEvent(String value) {
        this.shippingTrackingEvent = value;
    }

    /**
     * Gets the value of the scheduledDeliveryTimeMin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduledDeliveryTimeMin() {
        return scheduledDeliveryTimeMin;
    }

    /**
     * Sets the value of the scheduledDeliveryTimeMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduledDeliveryTimeMin(XMLGregorianCalendar value) {
        this.scheduledDeliveryTimeMin = value;
    }

    /**
     * Gets the value of the scheduledDeliveryTimeMax property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduledDeliveryTimeMax() {
        return scheduledDeliveryTimeMax;
    }

    /**
     * Sets the value of the scheduledDeliveryTimeMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduledDeliveryTimeMax(XMLGregorianCalendar value) {
        this.scheduledDeliveryTimeMax = value;
    }

    /**
     * Gets the value of the actualDeliveryTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActualDeliveryTime() {
        return actualDeliveryTime;
    }

    /**
     * Sets the value of the actualDeliveryTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActualDeliveryTime(XMLGregorianCalendar value) {
        this.actualDeliveryTime = value;
    }

    /**
     * Gets the value of the estimatedDeliveryTimeMin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEstimatedDeliveryTimeMin() {
        return estimatedDeliveryTimeMin;
    }

    /**
     * Sets the value of the estimatedDeliveryTimeMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEstimatedDeliveryTimeMin(XMLGregorianCalendar value) {
        this.estimatedDeliveryTimeMin = value;
    }

    /**
     * Gets the value of the estimatedDeliveryTimeMax property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEstimatedDeliveryTimeMax() {
        return estimatedDeliveryTimeMax;
    }

    /**
     * Sets the value of the estimatedDeliveryTimeMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEstimatedDeliveryTimeMax(XMLGregorianCalendar value) {
        this.estimatedDeliveryTimeMax = value;
    }

    /**
     * Gets the value of the handleByTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHandleByTime() {
        return handleByTime;
    }

    /**
     * Sets the value of the handleByTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHandleByTime(XMLGregorianCalendar value) {
        this.handleByTime = value;
    }

    /**
     * Gets the value of the minNativeEstimatedDeliveryTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMinNativeEstimatedDeliveryTime() {
        return minNativeEstimatedDeliveryTime;
    }

    /**
     * Sets the value of the minNativeEstimatedDeliveryTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMinNativeEstimatedDeliveryTime(XMLGregorianCalendar value) {
        this.minNativeEstimatedDeliveryTime = value;
    }

    /**
     * Gets the value of the maxNativeEstimatedDeliveryTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMaxNativeEstimatedDeliveryTime() {
        return maxNativeEstimatedDeliveryTime;
    }

    /**
     * Sets the value of the maxNativeEstimatedDeliveryTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMaxNativeEstimatedDeliveryTime(XMLGregorianCalendar value) {
        this.maxNativeEstimatedDeliveryTime = value;
    }

}
