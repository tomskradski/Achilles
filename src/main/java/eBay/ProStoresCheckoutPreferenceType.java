
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 			This type is deprecated.
 * 		
 * 
 * <p>Java class for ProStoresCheckoutPreferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProStoresCheckoutPreferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CheckoutRedirectProStores" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ProStoresDetails" type="{urn:ebay:apis:eBLBaseComponents}ProStoresDetailsType" maxOccurs="0" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProStoresCheckoutPreferenceType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "checkoutRedirectProStores"
})
public class ProStoresCheckoutPreferenceType {

    @XmlElement(name = "CheckoutRedirectProStores", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean checkoutRedirectProStores;

    /**
     * Gets the value of the checkoutRedirectProStores property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckoutRedirectProStores() {
        return checkoutRedirectProStores;
    }

    /**
     * Sets the value of the checkoutRedirectProStores property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckoutRedirectProStores(Boolean value) {
        this.checkoutRedirectProStores = value;
    }

}
