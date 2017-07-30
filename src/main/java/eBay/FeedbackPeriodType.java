
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This type is used by the <b>FeedbackPeriod</b> containers that are returned in the <b>GetFeedback</b> call to indicate how many Negative, Neutral, Positive, Retracted, and Total Feedback entries a user has received within different periods of time, typically 30 days, 180 days, and 365 days.
 * 			
 * 
 * <p>Java class for FeedbackPeriodType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeedbackPeriodType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PeriodInDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeedbackPeriodType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "periodInDays",
    "count"
})
public class FeedbackPeriodType {

    @XmlElement(name = "PeriodInDays", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer periodInDays;
    @XmlElement(name = "Count", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer count;

    /**
     * Gets the value of the periodInDays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPeriodInDays() {
        return periodInDays;
    }

    /**
     * Sets the value of the periodInDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPeriodInDays(Integer value) {
        this.periodInDays = value;
    }

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCount(Integer value) {
        this.count = value;
    }

}
