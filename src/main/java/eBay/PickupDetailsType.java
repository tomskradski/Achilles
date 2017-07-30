
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *               This type defines the <strong>PickupDetails</strong> container, which contains an array of <strong>PickupOptions</strong> containers. Each <strong>PickupOptions</strong> container consists of the pickup method and its priority.
 *               <br/><br/>
 * 							<span class="tablenote">
 * 							<strong>Note:</strong> At this time, the In-Store Pickup and Click and Collect features are generally only available to large retail merchants, and can only be applied to multi-quantity, fixed-price listings.
 * 							</span>
 *             
 * 
 * <p>Java class for PickupDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PickupDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PickupOptions" type="{urn:ebay:apis:eBLBaseComponents}PickupOptionsType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PickupDetailsType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "pickupOptions"
})
public class PickupDetailsType {

    @XmlElement(name = "PickupOptions", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<PickupOptionsType> pickupOptions;

    /**
     * Gets the value of the pickupOptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pickupOptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPickupOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PickupOptionsType }
     * 
     * 
     */
    public List<PickupOptionsType> getPickupOptions() {
        if (pickupOptions == null) {
            pickupOptions = new ArrayList<PickupOptionsType>();
        }
        return this.pickupOptions;
    }

}
