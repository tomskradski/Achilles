
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 			  Type defining the <b>SupportedSellerProfiles</b> container for all payment,
 * 				return, and shipping policy profiles that a seller has defined for a site.
 * 			
 * 
 * <p>Java class for SupportedSellerProfilesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupportedSellerProfilesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SupportedSellerProfile" type="{urn:ebay:apis:eBLBaseComponents}SupportedSellerProfileType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupportedSellerProfilesType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "supportedSellerProfile"
})
public class SupportedSellerProfilesType {

    @XmlElement(name = "SupportedSellerProfile", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<SupportedSellerProfileType> supportedSellerProfile;

    /**
     * Gets the value of the supportedSellerProfile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportedSellerProfile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportedSellerProfile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupportedSellerProfileType }
     * 
     * 
     */
    public List<SupportedSellerProfileType> getSupportedSellerProfile() {
        if (supportedSellerProfile == null) {
            supportedSellerProfile = new ArrayList<SupportedSellerProfileType>();
        }
        return this.supportedSellerProfile;
    }

}
