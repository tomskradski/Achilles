
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Details of a promotional shipping discount.
 * 			
 * 
 * <p>Java class for PromotionalShippingDiscountDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PromotionalShippingDiscountDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DiscountName" type="{urn:ebay:apis:eBLBaseComponents}DiscountNameCodeType" minOccurs="0"/>
 *         &lt;element name="ShippingCost" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="OrderAmount" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="ItemCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromotionalShippingDiscountDetailsType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "discountName",
    "shippingCost",
    "orderAmount",
    "itemCount"
})
public class PromotionalShippingDiscountDetailsType {

    @XmlElement(name = "DiscountName", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected DiscountNameCodeType discountName;
    @XmlElement(name = "ShippingCost", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType shippingCost;
    @XmlElement(name = "OrderAmount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType orderAmount;
    @XmlElement(name = "ItemCount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer itemCount;

    /**
     * Gets the value of the discountName property.
     * 
     * @return
     *     possible object is
     *     {@link DiscountNameCodeType }
     *     
     */
    public DiscountNameCodeType getDiscountName() {
        return discountName;
    }

    /**
     * Sets the value of the discountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountNameCodeType }
     *     
     */
    public void setDiscountName(DiscountNameCodeType value) {
        this.discountName = value;
    }

    /**
     * Gets the value of the shippingCost property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getShippingCost() {
        return shippingCost;
    }

    /**
     * Sets the value of the shippingCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setShippingCost(AmountType value) {
        this.shippingCost = value;
    }

    /**
     * Gets the value of the orderAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOrderAmount() {
        return orderAmount;
    }

    /**
     * Sets the value of the orderAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOrderAmount(AmountType value) {
        this.orderAmount = value;
    }

    /**
     * Gets the value of the itemCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getItemCount() {
        return itemCount;
    }

    /**
     * Sets the value of the itemCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setItemCount(Integer value) {
        this.itemCount = value;
    }

}
