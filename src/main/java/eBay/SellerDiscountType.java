
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Type that defines the <b>SellerDiscount</b> container, which contains the ID,
 * 				name, and amount of the seller discount.
 * 			
 * 
 * <p>Java class for SellerDiscountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SellerDiscountType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CampaignID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CampaignDisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ItemDiscountAmount" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="ShippingDiscountAmount" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SellerDiscountType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "campaignID",
    "campaignDisplayName",
    "itemDiscountAmount",
    "shippingDiscountAmount"
})
public class SellerDiscountType {

    @XmlElement(name = "CampaignID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Long campaignID;
    @XmlElement(name = "CampaignDisplayName", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String campaignDisplayName;
    @XmlElement(name = "ItemDiscountAmount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType itemDiscountAmount;
    @XmlElement(name = "ShippingDiscountAmount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType shippingDiscountAmount;

    /**
     * Gets the value of the campaignID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCampaignID() {
        return campaignID;
    }

    /**
     * Sets the value of the campaignID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCampaignID(Long value) {
        this.campaignID = value;
    }

    /**
     * Gets the value of the campaignDisplayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampaignDisplayName() {
        return campaignDisplayName;
    }

    /**
     * Sets the value of the campaignDisplayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampaignDisplayName(String value) {
        this.campaignDisplayName = value;
    }

    /**
     * Gets the value of the itemDiscountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getItemDiscountAmount() {
        return itemDiscountAmount;
    }

    /**
     * Sets the value of the itemDiscountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setItemDiscountAmount(AmountType value) {
        this.itemDiscountAmount = value;
    }

    /**
     * Gets the value of the shippingDiscountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getShippingDiscountAmount() {
        return shippingDiscountAmount;
    }

    /**
     * Sets the value of the shippingDiscountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setShippingDiscountAmount(AmountType value) {
        this.shippingDiscountAmount = value;
    }

}
