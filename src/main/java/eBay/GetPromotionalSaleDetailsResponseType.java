
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				The base response type for the <b>GetPromotionalSaleDetails</b> call. This call retrieves information about promotional sales set up by an eBay store owner.
 * 			
 * 
 * <p>Java class for GetPromotionalSaleDetailsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetPromotionalSaleDetailsResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="PromotionalSaleDetails" type="{urn:ebay:apis:eBLBaseComponents}PromotionalSaleArrayType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetPromotionalSaleDetailsResponseType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "promotionalSaleDetails"
})
public class GetPromotionalSaleDetailsResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "PromotionalSaleDetails", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected PromotionalSaleArrayType promotionalSaleDetails;

    /**
     * Gets the value of the promotionalSaleDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PromotionalSaleArrayType }
     *     
     */
    public PromotionalSaleArrayType getPromotionalSaleDetails() {
        return promotionalSaleDetails;
    }

    /**
     * Sets the value of the promotionalSaleDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionalSaleArrayType }
     *     
     */
    public void setPromotionalSaleDetails(PromotionalSaleArrayType value) {
        this.promotionalSaleDetails = value;
    }

}
