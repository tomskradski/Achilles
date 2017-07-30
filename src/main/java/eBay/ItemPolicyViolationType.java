
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Specifies the details of policy violations if the item was administratively canceled.
 * 				The details are the policy ID and the policy text.
 * 			
 * 
 * <p>Java class for ItemPolicyViolationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemPolicyViolationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PolicyID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PolicyText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemPolicyViolationType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "policyID",
    "policyText"
})
public class ItemPolicyViolationType {

    @XmlElement(name = "PolicyID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Long policyID;
    @XmlElement(name = "PolicyText", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String policyText;

    /**
     * Gets the value of the policyID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPolicyID() {
        return policyID;
    }

    /**
     * Sets the value of the policyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPolicyID(Long value) {
        this.policyID = value;
    }

    /**
     * Gets the value of the policyText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyText() {
        return policyText;
    }

    /**
     * Sets the value of the policyText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyText(String value) {
        this.policyText = value;
    }

}
