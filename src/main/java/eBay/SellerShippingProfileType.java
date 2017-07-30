
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Type defining the <b>SellerShippingProfile</b> container, which is used in an 
 * 				Add/Revise/Relist Trading API call to reference a Business Policies shipping policy profile.
 * 				Business Policies shipping profiles contain detailed information on domestic and
 * 				international shipping, including shipping service options, handling time, package
 * 				handling costs, excluded ship-to locations, and shipping insurance information.
 * 				<br/><br/>
 * 				Business Policies shipping profiles are also returned in 
 * 				<b>GetItem</b>, <b>GetMyeBaySelling</b>, and other 
 * 				Trading calls that retrieve Item data.
 * 			
 * 
 * <p>Java class for SellerShippingProfileType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SellerShippingProfileType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ShippingProfileID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ShippingProfileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SellerShippingProfileType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "shippingProfileID",
    "shippingProfileName"
})
public class SellerShippingProfileType {

    @XmlElement(name = "ShippingProfileID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Long shippingProfileID;
    @XmlElement(name = "ShippingProfileName", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String shippingProfileName;

    /**
     * Gets the value of the shippingProfileID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getShippingProfileID() {
        return shippingProfileID;
    }

    /**
     * Sets the value of the shippingProfileID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setShippingProfileID(Long value) {
        this.shippingProfileID = value;
    }

    /**
     * Gets the value of the shippingProfileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingProfileName() {
        return shippingProfileName;
    }

    /**
     * Sets the value of the shippingProfileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingProfileName(String value) {
        this.shippingProfileName = value;
    }

}
