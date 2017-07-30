
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Contains information for scheduling limits for the user.
 * 			
 * 
 * <p>Java class for SchedulingInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SchedulingInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MaxScheduledMinutes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MinScheduledMinutes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MaxScheduledItems" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SchedulingInfoType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "maxScheduledMinutes",
    "minScheduledMinutes",
    "maxScheduledItems"
})
public class SchedulingInfoType {

    @XmlElement(name = "MaxScheduledMinutes", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer maxScheduledMinutes;
    @XmlElement(name = "MinScheduledMinutes", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer minScheduledMinutes;
    @XmlElement(name = "MaxScheduledItems", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer maxScheduledItems;

    /**
     * Gets the value of the maxScheduledMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxScheduledMinutes() {
        return maxScheduledMinutes;
    }

    /**
     * Sets the value of the maxScheduledMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxScheduledMinutes(Integer value) {
        this.maxScheduledMinutes = value;
    }

    /**
     * Gets the value of the minScheduledMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinScheduledMinutes() {
        return minScheduledMinutes;
    }

    /**
     * Sets the value of the minScheduledMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinScheduledMinutes(Integer value) {
        this.minScheduledMinutes = value;
    }

    /**
     * Gets the value of the maxScheduledItems property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxScheduledItems() {
        return maxScheduledItems;
    }

    /**
     * Sets the value of the maxScheduledItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxScheduledItems(Integer value) {
        this.maxScheduledItems = value;
    }

}
