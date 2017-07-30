
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
 * <p>Java class for PricingRecommendationsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PricingRecommendationsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductInfo" type="{urn:ebay:apis:eBLBaseComponents}ProductInfoType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PricingRecommendationsType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "productInfo"
})
public class PricingRecommendationsType {

    @XmlElement(name = "ProductInfo", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected ProductInfoType productInfo;

    /**
     * Gets the value of the productInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ProductInfoType }
     *     
     */
    public ProductInfoType getProductInfo() {
        return productInfo;
    }

    /**
     * Sets the value of the productInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductInfoType }
     *     
     */
    public void setProductInfo(ProductInfoType value) {
        this.productInfo = value;
    }

}
