
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Complex type defining the <b>PickupInStoreDetails</b> container, that is used in Add/Revise/Relist calls to enable the listing for In-Store Pickup or Click and Collect.
 * 				<br/><br/>
 * 				<span class="tablenote">
 * 				<strong>Note:</strong> At this time, the In-Store Pickup feature is generally only available to large retail merchants, and can only be applied to multi-quantity, fixed-price listings. The Click and Collect feature is only available to large merchants on the eBay UK (site ID - 3) and eBay Australia (Site ID - 15) sites.
 * 				</span>
 * 			
 * 
 * <p>Java class for PickupInStoreDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PickupInStoreDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EligibleForPickupInStore" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EligibleForPickupDropOff" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PickupInStoreDetailsType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "eligibleForPickupInStore",
    "eligibleForPickupDropOff"
})
public class PickupInStoreDetailsType {

    @XmlElement(name = "EligibleForPickupInStore", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean eligibleForPickupInStore;
    @XmlElement(name = "EligibleForPickupDropOff", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean eligibleForPickupDropOff;

    /**
     * Gets the value of the eligibleForPickupInStore property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEligibleForPickupInStore() {
        return eligibleForPickupInStore;
    }

    /**
     * Sets the value of the eligibleForPickupInStore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEligibleForPickupInStore(Boolean value) {
        this.eligibleForPickupInStore = value;
    }

    /**
     * Gets the value of the eligibleForPickupDropOff property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEligibleForPickupDropOff() {
        return eligibleForPickupDropOff;
    }

    /**
     * Sets the value of the eligibleForPickupDropOff property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEligibleForPickupDropOff(Boolean value) {
        this.eligibleForPickupDropOff = value;
    }

}
