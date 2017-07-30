
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Type used by the <b>PolicyViolationDuration</b> container. A <b>PolicyViolationDuration</b> container is returned for each supported period that a seller may specify through the <b>BuyerRequirementDetails.MaximumBuyerPolicyViolations</b> container in an add/revise/relist call. The <b>BuyerRequirementDetails.MaximumBuyerPolicyViolations</b> container can be used by the seller to limit the number of buyer policy violations a buyer may have during a set period before being restricted from buying an item.
 * 			
 * 
 * <p>Java class for PolicyViolationDurationDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PolicyViolationDurationDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Period" type="{urn:ebay:apis:eBLBaseComponents}PeriodCodeType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolicyViolationDurationDetailsType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "period",
    "description"
})
public class PolicyViolationDurationDetailsType {

    @XmlElement(name = "Period", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected PeriodCodeType period;
    @XmlElement(name = "Description", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String description;

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

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
