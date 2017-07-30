
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         This type details the shipping carrier and shipment tracking number associated with a
 *         package shipment. It also contains information about the line items shipped through the Global Shipping program.
 *       
 * 
 * <p>Java class for ShipmentTrackingDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentTrackingDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ShippingCarrierUsed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipmentTrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipmentLineItem" type="{urn:ebay:apis:eBLBaseComponents}ShipmentLineItemType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentTrackingDetailsType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "shippingCarrierUsed",
    "shipmentTrackingNumber",
    "shipmentLineItem"
})
public class ShipmentTrackingDetailsType {

    @XmlElement(name = "ShippingCarrierUsed", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String shippingCarrierUsed;
    @XmlElement(name = "ShipmentTrackingNumber", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String shipmentTrackingNumber;
    @XmlElement(name = "ShipmentLineItem", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected ShipmentLineItemType shipmentLineItem;

    /**
     * Gets the value of the shippingCarrierUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingCarrierUsed() {
        return shippingCarrierUsed;
    }

    /**
     * Sets the value of the shippingCarrierUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingCarrierUsed(String value) {
        this.shippingCarrierUsed = value;
    }

    /**
     * Gets the value of the shipmentTrackingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentTrackingNumber() {
        return shipmentTrackingNumber;
    }

    /**
     * Sets the value of the shipmentTrackingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentTrackingNumber(String value) {
        this.shipmentTrackingNumber = value;
    }

    /**
     * Gets the value of the shipmentLineItem property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentLineItemType }
     *     
     */
    public ShipmentLineItemType getShipmentLineItem() {
        return shipmentLineItem;
    }

    /**
     * Sets the value of the shipmentLineItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentLineItemType }
     *     
     */
    public void setShipmentLineItem(ShipmentLineItemType value) {
        this.shipmentLineItem = value;
    }

}
