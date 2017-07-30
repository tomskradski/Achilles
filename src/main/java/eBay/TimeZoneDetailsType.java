
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * 				Time zone details about a region or location to which the seller is willing to
 * 				ship.
 * 			
 * 
 * <p>Java class for TimeZoneDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeZoneDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TimeZoneID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StandardLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StandardOffset" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DaylightSavingsLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DaylightSavingsOffset" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DaylightSavingsInEffect" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DetailVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UpdateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeZoneDetailsType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "timeZoneID",
    "standardLabel",
    "standardOffset",
    "daylightSavingsLabel",
    "daylightSavingsOffset",
    "daylightSavingsInEffect",
    "detailVersion",
    "updateTime"
})
public class TimeZoneDetailsType {

    @XmlElement(name = "TimeZoneID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String timeZoneID;
    @XmlElement(name = "StandardLabel", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String standardLabel;
    @XmlElement(name = "StandardOffset", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String standardOffset;
    @XmlElement(name = "DaylightSavingsLabel", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String daylightSavingsLabel;
    @XmlElement(name = "DaylightSavingsOffset", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String daylightSavingsOffset;
    @XmlElement(name = "DaylightSavingsInEffect", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean daylightSavingsInEffect;
    @XmlElement(name = "DetailVersion", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String detailVersion;
    @XmlElement(name = "UpdateTime", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updateTime;

    /**
     * Gets the value of the timeZoneID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZoneID() {
        return timeZoneID;
    }

    /**
     * Sets the value of the timeZoneID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZoneID(String value) {
        this.timeZoneID = value;
    }

    /**
     * Gets the value of the standardLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandardLabel() {
        return standardLabel;
    }

    /**
     * Sets the value of the standardLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandardLabel(String value) {
        this.standardLabel = value;
    }

    /**
     * Gets the value of the standardOffset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandardOffset() {
        return standardOffset;
    }

    /**
     * Sets the value of the standardOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandardOffset(String value) {
        this.standardOffset = value;
    }

    /**
     * Gets the value of the daylightSavingsLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDaylightSavingsLabel() {
        return daylightSavingsLabel;
    }

    /**
     * Sets the value of the daylightSavingsLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDaylightSavingsLabel(String value) {
        this.daylightSavingsLabel = value;
    }

    /**
     * Gets the value of the daylightSavingsOffset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDaylightSavingsOffset() {
        return daylightSavingsOffset;
    }

    /**
     * Sets the value of the daylightSavingsOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDaylightSavingsOffset(String value) {
        this.daylightSavingsOffset = value;
    }

    /**
     * Gets the value of the daylightSavingsInEffect property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDaylightSavingsInEffect() {
        return daylightSavingsInEffect;
    }

    /**
     * Sets the value of the daylightSavingsInEffect property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDaylightSavingsInEffect(Boolean value) {
        this.daylightSavingsInEffect = value;
    }

    /**
     * Gets the value of the detailVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetailVersion() {
        return detailVersion;
    }

    /**
     * Sets the value of the detailVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetailVersion(String value) {
        this.detailVersion = value;
    }

    /**
     * Gets the value of the updateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdateTime() {
        return updateTime;
    }

    /**
     * Sets the value of the updateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdateTime(XMLGregorianCalendar value) {
        this.updateTime = value;
    }

}
