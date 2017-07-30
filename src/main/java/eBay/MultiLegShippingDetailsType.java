
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This type provides information about the domestic leg of a Global Shipping Program shipment.
 * 				<br/><br/>
 * 				<span class="tablenote">
 * 				<strong>Note:</strong> The <strong>LogisticsProviderShipmentToBuyer</strong> field is reserved for the exclusive use of the international shipping provider.
 * 				</span>
 * 			
 * 
 * <p>Java class for MultiLegShippingDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultiLegShippingDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SellerShipmentToLogisticsProvider" type="{urn:ebay:apis:eBLBaseComponents}MultiLegShipmentType" minOccurs="0"/>
 *         &lt;element name="LogisticsProviderShipmentToBuyer" type="{urn:ebay:apis:eBLBaseComponents}MultiLegShipmentType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiLegShippingDetailsType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "sellerShipmentToLogisticsProvider",
    "logisticsProviderShipmentToBuyer"
})
public class MultiLegShippingDetailsType {

    @XmlElement(name = "SellerShipmentToLogisticsProvider", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected MultiLegShipmentType sellerShipmentToLogisticsProvider;
    @XmlElement(name = "LogisticsProviderShipmentToBuyer", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected MultiLegShipmentType logisticsProviderShipmentToBuyer;

    /**
     * Gets the value of the sellerShipmentToLogisticsProvider property.
     * 
     * @return
     *     possible object is
     *     {@link MultiLegShipmentType }
     *     
     */
    public MultiLegShipmentType getSellerShipmentToLogisticsProvider() {
        return sellerShipmentToLogisticsProvider;
    }

    /**
     * Sets the value of the sellerShipmentToLogisticsProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiLegShipmentType }
     *     
     */
    public void setSellerShipmentToLogisticsProvider(MultiLegShipmentType value) {
        this.sellerShipmentToLogisticsProvider = value;
    }

    /**
     * Gets the value of the logisticsProviderShipmentToBuyer property.
     * 
     * @return
     *     possible object is
     *     {@link MultiLegShipmentType }
     *     
     */
    public MultiLegShipmentType getLogisticsProviderShipmentToBuyer() {
        return logisticsProviderShipmentToBuyer;
    }

    /**
     * Sets the value of the logisticsProviderShipmentToBuyer property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiLegShipmentType }
     *     
     */
    public void setLogisticsProviderShipmentToBuyer(MultiLegShipmentType value) {
        this.logisticsProviderShipmentToBuyer = value;
    }

}
