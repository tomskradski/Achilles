
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Defines the options available for an Automated Listing Rule that 
 * 			keeps a fixed number of items on the site
 * 
 * <p>Java class for SellingManagerAutoListAccordingToScheduleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SellingManagerAutoListAccordingToScheduleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DayOfWeek" type="{urn:ebay:apis:eBLBaseComponents}DayOfWeekCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ListingPeriodInWeeks" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ListAtSpecificTimeOfDay" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="MaxActiveItemCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ListingHoldInventoryLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SellingManagerAutoListAccordingToScheduleType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "dayOfWeek",
    "listingPeriodInWeeks",
    "listAtSpecificTimeOfDay",
    "startTime",
    "endTime",
    "maxActiveItemCount",
    "listingHoldInventoryLevel"
})
public class SellingManagerAutoListAccordingToScheduleType {

    @XmlElement(name = "DayOfWeek", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected List<DayOfWeekCodeType> dayOfWeek;
    @XmlElement(name = "ListingPeriodInWeeks", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer listingPeriodInWeeks;
    @XmlElement(name = "ListAtSpecificTimeOfDay", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar listAtSpecificTimeOfDay;
    @XmlElement(name = "StartTime", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTime;
    @XmlElement(name = "EndTime", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endTime;
    @XmlElement(name = "MaxActiveItemCount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer maxActiveItemCount;
    @XmlElement(name = "ListingHoldInventoryLevel", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer listingHoldInventoryLevel;

    /**
     * Gets the value of the dayOfWeek property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dayOfWeek property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDayOfWeek().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DayOfWeekCodeType }
     * 
     * 
     */
    public List<DayOfWeekCodeType> getDayOfWeek() {
        if (dayOfWeek == null) {
            dayOfWeek = new ArrayList<DayOfWeekCodeType>();
        }
        return this.dayOfWeek;
    }

    /**
     * Gets the value of the listingPeriodInWeeks property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getListingPeriodInWeeks() {
        return listingPeriodInWeeks;
    }

    /**
     * Sets the value of the listingPeriodInWeeks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setListingPeriodInWeeks(Integer value) {
        this.listingPeriodInWeeks = value;
    }

    /**
     * Gets the value of the listAtSpecificTimeOfDay property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getListAtSpecificTimeOfDay() {
        return listAtSpecificTimeOfDay;
    }

    /**
     * Sets the value of the listAtSpecificTimeOfDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setListAtSpecificTimeOfDay(XMLGregorianCalendar value) {
        this.listAtSpecificTimeOfDay = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTime(XMLGregorianCalendar value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndTime(XMLGregorianCalendar value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the maxActiveItemCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxActiveItemCount() {
        return maxActiveItemCount;
    }

    /**
     * Sets the value of the maxActiveItemCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxActiveItemCount(Integer value) {
        this.maxActiveItemCount = value;
    }

    /**
     * Gets the value of the listingHoldInventoryLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getListingHoldInventoryLevel() {
        return listingHoldInventoryLevel;
    }

    /**
     * Sets the value of the listingHoldInventoryLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setListingHoldInventoryLevel(Integer value) {
        this.listingHoldInventoryLevel = value;
    }

}
