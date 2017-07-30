
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Type defining the <b>MaximumUnpaidItemStrikesInfo</b> container, which is
 * 				used by the seller as a mechanism to block prospective buyers who have unpaid item
 * 				strikes on their account exceeding the value set in the <b>Count</b> 
 * 				field during a specified time period (set in the <b>Period</b> field).
 * 			
 * 
 * <p>Java class for MaximumUnpaidItemStrikesInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaximumUnpaidItemStrikesInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Period" type="{urn:ebay:apis:eBLBaseComponents}PeriodCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaximumUnpaidItemStrikesInfoType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "count",
    "period"
})
public class MaximumUnpaidItemStrikesInfoType {

    @XmlElement(name = "Count", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer count;
    @XmlElement(name = "Period", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected PeriodCodeType period;

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

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodCodeType }
     *     
     */
    public PeriodCodeType getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodCodeType }
     *     
     */
    public void setPeriod(PeriodCodeType value) {
        this.period = value;
    }

}
