
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This is the base response type of the <b>GetItemShipping</b> call. This call takes an <b>ItemID</b> value for an item that has yet to be shipped, and then returns estimated shipping costs for every shipping service that the seller has offered with the listing. This call will also return <b>PickUpInStoreDetails.EligibleForPickupDropOff</b> and <b>PickUpInStoreDetails.EligibleForPickupInStore</b> flags if the item is available for buyer pick-up through the In-Store Pickup or Click and Collect features.
 * 			
 * 
 * <p>Java class for GetItemShippingResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetItemShippingResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="ShippingDetails" type="{urn:ebay:apis:eBLBaseComponents}ShippingDetailsType" minOccurs="0"/>
 *         &lt;element name="PickUpInStoreDetails" type="{urn:ebay:apis:eBLBaseComponents}PickupInStoreDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetItemShippingResponseType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "shippingDetails",
    "pickUpInStoreDetails"
})
public class GetItemShippingResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "ShippingDetails", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected ShippingDetailsType shippingDetails;
    @XmlElement(name = "PickUpInStoreDetails", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected PickupInStoreDetailsType pickUpInStoreDetails;

    /**
     * Gets the value of the shippingDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingDetailsType }
     *     
     */
    public ShippingDetailsType getShippingDetails() {
        return shippingDetails;
    }

    /**
     * Sets the value of the shippingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingDetailsType }
     *     
     */
    public void setShippingDetails(ShippingDetailsType value) {
        this.shippingDetails = value;
    }

    /**
     * Gets the value of the pickUpInStoreDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PickupInStoreDetailsType }
     *     
     */
    public PickupInStoreDetailsType getPickUpInStoreDetails() {
        return pickUpInStoreDetails;
    }

    /**
     * Sets the value of the pickUpInStoreDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PickupInStoreDetailsType }
     *     
     */
    public void setPickUpInStoreDetails(PickupInStoreDetailsType value) {
        this.pickUpInStoreDetails = value;
    }

}
