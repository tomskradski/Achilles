
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The maximum number of policy violations and the durations that can be designated by sellers at this site. This is applicable only to sellers.
 * 
 * <p>Java class for MaximumBuyerPolicyViolationsDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaximumBuyerPolicyViolationsDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumberOfPolicyViolations" type="{urn:ebay:apis:eBLBaseComponents}NumberOfPolicyViolationsDetailsType" minOccurs="0"/>
 *         &lt;element name="PolicyViolationDuration" type="{urn:ebay:apis:eBLBaseComponents}PolicyViolationDurationDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaximumBuyerPolicyViolationsDetailsType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "numberOfPolicyViolations",
    "policyViolationDuration"
})
public class MaximumBuyerPolicyViolationsDetailsType {

    @XmlElement(name = "NumberOfPolicyViolations", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected NumberOfPolicyViolationsDetailsType numberOfPolicyViolations;
    @XmlElement(name = "PolicyViolationDuration", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<PolicyViolationDurationDetailsType> policyViolationDuration;

    /**
     * Gets the value of the numberOfPolicyViolations property.
     * 
     * @return
     *     possible object is
     *     {@link NumberOfPolicyViolationsDetailsType }
     *     
     */
    public NumberOfPolicyViolationsDetailsType getNumberOfPolicyViolations() {
        return numberOfPolicyViolations;
    }

    /**
     * Sets the value of the numberOfPolicyViolations property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberOfPolicyViolationsDetailsType }
     *     
     */
    public void setNumberOfPolicyViolations(NumberOfPolicyViolationsDetailsType value) {
        this.numberOfPolicyViolations = value;
    }

    /**
     * Gets the value of the policyViolationDuration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the policyViolationDuration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolicyViolationDuration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PolicyViolationDurationDetailsType }
     * 
     * 
     */
    public List<PolicyViolationDurationDetailsType> getPolicyViolationDuration() {
        if (policyViolationDuration == null) {
            policyViolationDuration = new ArrayList<PolicyViolationDurationDetailsType>();
        }
        return this.policyViolationDuration;
    }

}
