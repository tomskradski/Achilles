
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This type is deprecated.
 * 			
 * 
 * <p>Java class for CheckoutOrderDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckoutOrderDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TotalCartMerchandiseCost" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalCartShippingCost" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalTaxAmount" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalAmount" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckoutOrderDetailType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "totalCartMerchandiseCost",
    "totalCartShippingCost",
    "totalTaxAmount",
    "totalAmount"
})
public class CheckoutOrderDetailType {

    @XmlElement(name = "TotalCartMerchandiseCost", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType totalCartMerchandiseCost;
    @XmlElement(name = "TotalCartShippingCost", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType totalCartShippingCost;
    @XmlElement(name = "TotalTaxAmount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType totalTaxAmount;
    @XmlElement(name = "TotalAmount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType totalAmount;

    /**
     * Gets the value of the totalCartMerchandiseCost property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalCartMerchandiseCost() {
        return totalCartMerchandiseCost;
    }

    /**
     * Sets the value of the totalCartMerchandiseCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalCartMerchandiseCost(AmountType value) {
        this.totalCartMerchandiseCost = value;
    }

    /**
     * Gets the value of the totalCartShippingCost property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalCartShippingCost() {
        return totalCartShippingCost;
    }

    /**
     * Sets the value of the totalCartShippingCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalCartShippingCost(AmountType value) {
        this.totalCartShippingCost = value;
    }

    /**
     * Gets the value of the totalTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalTaxAmount() {
        return totalTaxAmount;
    }

    /**
     * Sets the value of the totalTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalTaxAmount(AmountType value) {
        this.totalTaxAmount = value;
    }

    /**
     * Gets the value of the totalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalAmount(AmountType value) {
        this.totalAmount = value;
    }

}
