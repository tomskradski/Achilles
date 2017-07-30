
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Contains the reason codes for all sites. 
 * 			
 * 
 * <p>Java class for GetVeROReasonCodeDetailsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetVeROReasonCodeDetailsResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="VeROReasonCodeDetails" type="{urn:ebay:apis:eBLBaseComponents}VeROReasonCodeDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetVeROReasonCodeDetailsResponseType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "veROReasonCodeDetails"
})
public class GetVeROReasonCodeDetailsResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "VeROReasonCodeDetails", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected VeROReasonCodeDetailsType veROReasonCodeDetails;

    /**
     * Gets the value of the veROReasonCodeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link VeROReasonCodeDetailsType }
     *     
     */
    public VeROReasonCodeDetailsType getVeROReasonCodeDetails() {
        return veROReasonCodeDetails;
    }

    /**
     * Sets the value of the veROReasonCodeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link VeROReasonCodeDetailsType }
     *     
     */
    public void setVeROReasonCodeDetails(VeROReasonCodeDetailsType value) {
        this.veROReasonCodeDetails = value;
    }

}
