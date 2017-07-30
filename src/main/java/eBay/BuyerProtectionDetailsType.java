
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 					
 * 				Type defining the <strong>ApplyBuyerProtection</strong> container, which
 * 				consists of details related to whether or not the item is eligible for buyer protection
 * 				and which of the buyer protection programs will cover the item.
 * 			
 * 
 * <p>Java class for BuyerProtectionDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BuyerProtectionDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BuyerProtectionSource" type="{urn:ebay:apis:eBLBaseComponents}BuyerProtectionSourceCodeType" minOccurs="0"/>
 *         &lt;element name="BuyerProtectionStatus" type="{urn:ebay:apis:eBLBaseComponents}BuyerProtectionCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuyerProtectionDetailsType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "buyerProtectionSource",
    "buyerProtectionStatus"
})
public class BuyerProtectionDetailsType {

    @XmlElement(name = "BuyerProtectionSource", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected BuyerProtectionSourceCodeType buyerProtectionSource;
    @XmlElement(name = "BuyerProtectionStatus", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected BuyerProtectionCodeType buyerProtectionStatus;

    /**
     * Gets the value of the buyerProtectionSource property.
     * 
     * @return
     *     possible object is
     *     {@link BuyerProtectionSourceCodeType }
     *     
     */
    public BuyerProtectionSourceCodeType getBuyerProtectionSource() {
        return buyerProtectionSource;
    }

    /**
     * Sets the value of the buyerProtectionSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuyerProtectionSourceCodeType }
     *     
     */
    public void setBuyerProtectionSource(BuyerProtectionSourceCodeType value) {
        this.buyerProtectionSource = value;
    }

    /**
     * Gets the value of the buyerProtectionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link BuyerProtectionCodeType }
     *     
     */
    public BuyerProtectionCodeType getBuyerProtectionStatus() {
        return buyerProtectionStatus;
    }

    /**
     * Sets the value of the buyerProtectionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuyerProtectionCodeType }
     *     
     */
    public void setBuyerProtectionStatus(BuyerProtectionCodeType value) {
        this.buyerProtectionStatus = value;
    }

}
