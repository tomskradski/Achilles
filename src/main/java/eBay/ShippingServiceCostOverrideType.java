
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Type defining the <strong>ShippingServiceCostOverride</strong> container, which is used to override the flat shipping costs for each domestic and/or international shipping service that is defined in the <strong>domesticShippingPolicyInfoService</strong> and <strong>intlShippingPolicyInfoService</strong> containers of the Business Policies shipping profile. Shipping costs include the cost to ship one item, the cost to ship each additional identical item, and any shipping surcharges applicable to domestic shipping services. A <strong>ShippingServiceCostOverride</strong> container is required for every domestic and/or international shipping service that is defined in the Business Policies shipping profile. For example, you cannot override the shipping costs for one domestic shipping service but not the other domestic shipping services defined in the Business Policies shipping profile. The same rule applies to international shipping services. 
 * 			
 * 
 * <p>Java class for ShippingServiceCostOverrideType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShippingServiceCostOverrideType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ShippingServicePriority" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ShippingServiceType" type="{urn:ebay:apis:eBLBaseComponents}ShippingServiceType" minOccurs="0"/>
 *         &lt;element name="ShippingServiceCost" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="ShippingServiceAdditionalCost" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="ShippingSurcharge" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShippingServiceCostOverrideType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "shippingServicePriority",
    "shippingServiceType",
    "shippingServiceCost",
    "shippingServiceAdditionalCost",
    "shippingSurcharge"
})
public class ShippingServiceCostOverrideType {

    @XmlElement(name = "ShippingServicePriority", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer shippingServicePriority;
    @XmlElement(name = "ShippingServiceType", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected ShippingServiceType shippingServiceType;
    @XmlElement(name = "ShippingServiceCost", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType shippingServiceCost;
    @XmlElement(name = "ShippingServiceAdditionalCost", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType shippingServiceAdditionalCost;
    @XmlElement(name = "ShippingSurcharge", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType shippingSurcharge;

    /**
     * Gets the value of the shippingServicePriority property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getShippingServicePriority() {
        return shippingServicePriority;
    }

    /**
     * Sets the value of the shippingServicePriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setShippingServicePriority(Integer value) {
        this.shippingServicePriority = value;
    }

    /**
     * Gets the value of the shippingServiceType property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingServiceType }
     *     
     */
    public ShippingServiceType getShippingServiceType() {
        return shippingServiceType;
    }

    /**
     * Sets the value of the shippingServiceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingServiceType }
     *     
     */
    public void setShippingServiceType(ShippingServiceType value) {
        this.shippingServiceType = value;
    }

    /**
     * Gets the value of the shippingServiceCost property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getShippingServiceCost() {
        return shippingServiceCost;
    }

    /**
     * Sets the value of the shippingServiceCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setShippingServiceCost(AmountType value) {
        this.shippingServiceCost = value;
    }

    /**
     * Gets the value of the shippingServiceAdditionalCost property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getShippingServiceAdditionalCost() {
        return shippingServiceAdditionalCost;
    }

    /**
     * Sets the value of the shippingServiceAdditionalCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setShippingServiceAdditionalCost(AmountType value) {
        this.shippingServiceAdditionalCost = value;
    }

    /**
     * Gets the value of the shippingSurcharge property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getShippingSurcharge() {
        return shippingSurcharge;
    }

    /**
     * Sets the value of the shippingSurcharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setShippingSurcharge(AmountType value) {
        this.shippingSurcharge = value;
    }

}
