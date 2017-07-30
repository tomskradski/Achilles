
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This type has been deprecated, as Pro Stores and other third-party checkouts have been deprecated.
 * 			
 * 
 * <p>Java class for ListingCheckoutRedirectPreferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListingCheckoutRedirectPreferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProStoresStoreName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SellerThirdPartyUsername" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListingCheckoutRedirectPreferenceType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "proStoresStoreName",
    "sellerThirdPartyUsername"
})
public class ListingCheckoutRedirectPreferenceType {

    @XmlElement(name = "ProStoresStoreName", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String proStoresStoreName;
    @XmlElement(name = "SellerThirdPartyUsername", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String sellerThirdPartyUsername;

    /**
     * Gets the value of the proStoresStoreName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProStoresStoreName() {
        return proStoresStoreName;
    }

    /**
     * Sets the value of the proStoresStoreName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProStoresStoreName(String value) {
        this.proStoresStoreName = value;
    }

    /**
     * Gets the value of the sellerThirdPartyUsername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerThirdPartyUsername() {
        return sellerThirdPartyUsername;
    }

    /**
     * Sets the value of the sellerThirdPartyUsername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerThirdPartyUsername(String value) {
        this.sellerThirdPartyUsername = value;
    }

}
