
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This type is deprecated.
 * 			
 * 
 * <p>Java class for BidGroupItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BidGroupItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Item" type="{urn:ebay:apis:eBLBaseComponents}ItemType" minOccurs="0"/>
 *         &lt;element name="BidGroupItemStatus" type="{urn:ebay:apis:eBLBaseComponents}BidGroupItemStatusCodeType" minOccurs="0"/>
 *         &lt;element name="MaxBidAmount" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BidGroupItemType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "item",
    "bidGroupItemStatus",
    "maxBidAmount"
})
public class BidGroupItemType {

    @XmlElement(name = "Item", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected ItemType item;
    @XmlElement(name = "BidGroupItemStatus", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected BidGroupItemStatusCodeType bidGroupItemStatus;
    @XmlElement(name = "MaxBidAmount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType maxBidAmount;

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

    /**
     * Gets the value of the bidGroupItemStatus property.
     * 
     * @return
     *     possible object is
     *     {@link BidGroupItemStatusCodeType }
     *     
     */
    public BidGroupItemStatusCodeType getBidGroupItemStatus() {
        return bidGroupItemStatus;
    }

    /**
     * Sets the value of the bidGroupItemStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BidGroupItemStatusCodeType }
     *     
     */
    public void setBidGroupItemStatus(BidGroupItemStatusCodeType value) {
        this.bidGroupItemStatus = value;
    }

    /**
     * Gets the value of the maxBidAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getMaxBidAmount() {
        return maxBidAmount;
    }

    /**
     * Sets the value of the maxBidAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setMaxBidAmount(AmountType value) {
        this.maxBidAmount = value;
    }

}
