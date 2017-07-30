
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Details about a summary event schedule.
 * 			
 * 
 * <p>Java class for SummaryEventScheduleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SummaryEventScheduleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EventType" type="{urn:ebay:apis:eBLBaseComponents}NotificationEventTypeCodeType" minOccurs="0"/>
 *         &lt;element name="SummaryPeriod" type="{urn:ebay:apis:eBLBaseComponents}SummaryWindowPeriodCodeType" minOccurs="0"/>
 *         &lt;element name="Frequency" type="{urn:ebay:apis:eBLBaseComponents}SummaryFrequencyCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SummaryEventScheduleType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "eventType",
    "summaryPeriod",
    "frequency"
})
public class SummaryEventScheduleType {

    @XmlElement(name = "EventType", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected NotificationEventTypeCodeType eventType;
    @XmlElement(name = "SummaryPeriod", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected SummaryWindowPeriodCodeType summaryPeriod;
    @XmlElement(name = "Frequency", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected SummaryFrequencyCodeType frequency;

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
     * Gets the value of the summaryPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link SummaryWindowPeriodCodeType }
     *     
     */
    public SummaryWindowPeriodCodeType getSummaryPeriod() {
        return summaryPeriod;
    }

    /**
     * Sets the value of the summaryPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link SummaryWindowPeriodCodeType }
     *     
     */
    public void setSummaryPeriod(SummaryWindowPeriodCodeType value) {
        this.summaryPeriod = value;
    }

    /**
     * Gets the value of the frequency property.
     * 
     * @return
     *     possible object is
     *     {@link SummaryFrequencyCodeType }
     *     
     */
    public SummaryFrequencyCodeType getFrequency() {
        return frequency;
    }

    /**
     * Sets the value of the frequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link SummaryFrequencyCodeType }
     *     
     */
    public void setFrequency(SummaryFrequencyCodeType value) {
        this.frequency = value;
    }

}
