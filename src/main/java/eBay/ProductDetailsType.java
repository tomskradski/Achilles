
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This type defines the <b>ProductDetails</b> container that is returned in the <b>GeteBayDetails</b> response if product identifiers (EANs, ISBNs, UPCs, MPN/Brand) are not supported for a category.
 * 			
 * 
 * <p>Java class for ProductDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductIdentifierUnavailableText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductDetailsType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "productIdentifierUnavailableText"
})
public class ProductDetailsType {

    @XmlElement(name = "ProductIdentifierUnavailableText", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String productIdentifierUnavailableText;

    /**
     * Gets the value of the productIdentifierUnavailableText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductIdentifierUnavailableText() {
        return productIdentifierUnavailableText;
    }

    /**
     * Sets the value of the productIdentifierUnavailableText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductIdentifierUnavailableText(String value) {
        this.productIdentifierUnavailableText = value;
    }

}
