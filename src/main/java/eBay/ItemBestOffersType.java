
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				All Best Offers for the item according to the filter or Best Offer
 * 				ID (or both) used in the input.
 * 				For the notification client usage, this response includes a
 * 				single Best Offer.
 * 			
 * 
 * <p>Java class for ItemBestOffersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemBestOffersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Role" type="{urn:ebay:apis:eBLBaseComponents}TradingRoleCodeType" minOccurs="0"/>
 *         &lt;element name="BestOfferArray" type="{urn:ebay:apis:eBLBaseComponents}BestOfferArrayType" minOccurs="0"/>
 *         &lt;element name="Item" type="{urn:ebay:apis:eBLBaseComponents}ItemType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemBestOffersType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "role",
    "bestOfferArray",
    "item"
})
public class ItemBestOffersType {

    @XmlElement(name = "Role", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected TradingRoleCodeType role;
    @XmlElement(name = "BestOfferArray", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected BestOfferArrayType bestOfferArray;
    @XmlElement(name = "Item", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected ItemType item;

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link TradingRoleCodeType }
     *     
     */
    public TradingRoleCodeType getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradingRoleCodeType }
     *     
     */
    public void setRole(TradingRoleCodeType value) {
        this.role = value;
    }

    /**
     * Gets the value of the bestOfferArray property.
     * 
     * @return
     *     possible object is
     *     {@link BestOfferArrayType }
     *     
     */
    public BestOfferArrayType getBestOfferArray() {
        return bestOfferArray;
    }

    /**
     * Sets the value of the bestOfferArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link BestOfferArrayType }
     *     
     */
    public void setBestOfferArray(BestOfferArrayType value) {
        this.bestOfferArray = value;
    }

    /**
     * Gets the value of the item property.
     * 
     * @return
     *     possible object is
     *     {@link ItemType }
     *     
     */
    public ItemType getItem() {
        return item;
    }

    /**
     * Sets the value of the item property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemType }
     *     
     */
    public void setItem(ItemType value) {
        this.item = value;
    }

}
