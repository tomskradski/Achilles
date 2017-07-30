
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 			   This type provides information about the shipping service, cost, address, and delivery estimates for the domestic leg of a Global Shipping Program shipment.
 * 			
 * 
 * <p>Java class for MultiLegShipmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultiLegShipmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ShippingServiceDetails" type="{urn:ebay:apis:eBLBaseComponents}MultiLegShippingServiceType" minOccurs="0"/>
 *         &lt;element name="ShipToAddress" type="{urn:ebay:apis:eBLBaseComponents}AddressType" minOccurs="0"/>
 *         &lt;element name="ShippingTimeMin" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ShippingTimeMax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiLegShipmentType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "shippingServiceDetails",
    "shipToAddress",
    "shippingTimeMin",
    "shippingTimeMax"
})
public class MultiLegShipmentType {

    @XmlElement(name = "ShippingServiceDetails", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected MultiLegShippingServiceType shippingServiceDetails;
    @XmlElement(name = "ShipToAddress", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AddressType shipToAddress;
    @XmlElement(name = "ShippingTimeMin", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer shippingTimeMin;
    @XmlElement(name = "ShippingTimeMax", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer shippingTimeMax;

    /**
     * Gets the value of the shippingServiceDetails property.
     * 
     * @return
     *     possible object is
     *     {@link MultiLegShippingServiceType }
     *     
     */
    public MultiLegShippingServiceType getShippingServiceDetails() {
        return shippingServiceDetails;
    }

    /**
     * Sets the value of the shippingServiceDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiLegShippingServiceType }
     *     
     */
    public void setShippingServiceDetails(MultiLegShippingServiceType value) {
        this.shippingServiceDetails = value;
    }

    /**
     * Gets the value of the shipToAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getShipToAddress() {
        return shipToAddress;
    }

    /**
     * Sets the value of the shipToAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setShipToAddress(AddressType value) {
        this.shipToAddress = value;
    }

    /**
     * Gets the value of the shippingTimeMin property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getShippingTimeMin() {
        return shippingTimeMin;
    }

    /**
     * Sets the value of the shippingTimeMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setShippingTimeMin(Integer value) {
        this.shippingTimeMin = value;
    }

    /**
     * Gets the value of the shippingTimeMax property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getShippingTimeMax() {
        return shippingTimeMax;
    }

    /**
     * Sets the value of the shippingTimeMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setShippingTimeMax(Integer value) {
        this.shippingTimeMax = value;
    }

}
