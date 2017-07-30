
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Type defining the <b>ShippingServiceCostOverrideList</b> container, which is used when the seller wants to override the flat shipping costs for all domestic and/or all international shipping services defined in the Business Policies shipping profile referenced in the <b>SellerProfiles.SellerShippingProfile.ShippingProfileID</b> field of an Add/Revise/Relist call. 
 * 				<br/><br/> 
 * 				Shipping service cost overrides are a listing-level concept, and the shipping costs specified through each <b>ShippingServiceCostOverrideList.ShippingServiceCostOverride</b> container will not change the shipping costs defined for the same shipping services in the Business Policies shipping profile.
 * 			
 * 
 * <p>Java class for ShippingServiceCostOverrideListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShippingServiceCostOverrideListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ShippingServiceCostOverride" type="{urn:ebay:apis:eBLBaseComponents}ShippingServiceCostOverrideType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShippingServiceCostOverrideListType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "shippingServiceCostOverride"
})
public class ShippingServiceCostOverrideListType {

    @XmlElement(name = "ShippingServiceCostOverride", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<ShippingServiceCostOverrideType> shippingServiceCostOverride;

    /**
     * Gets the value of the shippingServiceCostOverride property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shippingServiceCostOverride property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShippingServiceCostOverride().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShippingServiceCostOverrideType }
     * 
     * 
     */
    public List<ShippingServiceCostOverrideType> getShippingServiceCostOverride() {
        if (shippingServiceCostOverride == null) {
            shippingServiceCostOverride = new ArrayList<ShippingServiceCostOverrideType>();
        }
        return this.shippingServiceCostOverride;
    }

}
