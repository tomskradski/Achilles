
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Type defining the <b>SellerProfiles</b> container, which consists of references
 * 				to a seller's payment, shipping, and/or return policy profiles.					
 * 			
 * 
 * <p>Java class for SellerProfilesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SellerProfilesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SellerShippingProfile" type="{urn:ebay:apis:eBLBaseComponents}SellerShippingProfileType" minOccurs="0"/>
 *         &lt;element name="SellerReturnProfile" type="{urn:ebay:apis:eBLBaseComponents}SellerReturnProfileType" minOccurs="0"/>
 *         &lt;element name="SellerPaymentProfile" type="{urn:ebay:apis:eBLBaseComponents}SellerPaymentProfileType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SellerProfilesType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "sellerShippingProfile",
    "sellerReturnProfile",
    "sellerPaymentProfile"
})
public class SellerProfilesType {

    @XmlElement(name = "SellerShippingProfile", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected SellerShippingProfileType sellerShippingProfile;
    @XmlElement(name = "SellerReturnProfile", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected SellerReturnProfileType sellerReturnProfile;
    @XmlElement(name = "SellerPaymentProfile", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected SellerPaymentProfileType sellerPaymentProfile;

    /**
     * Gets the value of the sellerShippingProfile property.
     * 
     * @return
     *     possible object is
     *     {@link SellerShippingProfileType }
     *     
     */
    public SellerShippingProfileType getSellerShippingProfile() {
        return sellerShippingProfile;
    }

    /**
     * Sets the value of the sellerShippingProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellerShippingProfileType }
     *     
     */
    public void setSellerShippingProfile(SellerShippingProfileType value) {
        this.sellerShippingProfile = value;
    }

    /**
     * Gets the value of the sellerReturnProfile property.
     * 
     * @return
     *     possible object is
     *     {@link SellerReturnProfileType }
     *     
     */
    public SellerReturnProfileType getSellerReturnProfile() {
        return sellerReturnProfile;
    }

    /**
     * Sets the value of the sellerReturnProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellerReturnProfileType }
     *     
     */
    public void setSellerReturnProfile(SellerReturnProfileType value) {
        this.sellerReturnProfile = value;
    }

    /**
     * Gets the value of the sellerPaymentProfile property.
     * 
     * @return
     *     possible object is
     *     {@link SellerPaymentProfileType }
     *     
     */
    public SellerPaymentProfileType getSellerPaymentProfile() {
        return sellerPaymentProfile;
    }

    /**
     * Sets the value of the sellerPaymentProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellerPaymentProfileType }
     *     
     */
    public void setSellerPaymentProfile(SellerPaymentProfileType value) {
        this.sellerPaymentProfile = value;
    }

}
