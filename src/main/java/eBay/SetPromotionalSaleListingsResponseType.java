
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *           Contains the status of a promotional sale.
 * 			
 * 
 * <p>Java class for SetPromotionalSaleListingsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetPromotionalSaleListingsResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="Status" type="{urn:ebay:apis:eBLBaseComponents}PromotionalSaleStatusCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetPromotionalSaleListingsResponseType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "status"
})
public class SetPromotionalSaleListingsResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "Status", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected PromotionalSaleStatusCodeType status;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link PromotionalSaleStatusCodeType }
     *     
     */
    public PromotionalSaleStatusCodeType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionalSaleStatusCodeType }
     *     
     */
    public void setStatus(PromotionalSaleStatusCodeType value) {
        this.status = value;
    }

}
