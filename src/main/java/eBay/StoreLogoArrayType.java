
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Set of Store logos.
 * 			
 * 
 * <p>Java class for StoreLogoArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StoreLogoArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Logo" type="{urn:ebay:apis:eBLBaseComponents}StoreLogoType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StoreLogoArrayType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "logo"
})
public class StoreLogoArrayType {

    @XmlElement(name = "Logo", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<StoreLogoType> logo;

    /**
     * Gets the value of the logo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the logo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLogo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StoreLogoType }
     * 
     * 
     */
    public List<StoreLogoType> getLogo() {
        if (logo == null) {
            logo = new ArrayList<StoreLogoType>();
        }
        return this.logo;
    }

}
