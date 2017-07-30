
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This type is deprecated.
 * 			
 * 
 * <p>Java class for CharityAffiliationsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CharityAffiliationsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CharityID" type="{urn:ebay:apis:eBLBaseComponents}CharityIDType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CharityAffiliationsType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "charityID"
})
public class CharityAffiliationsType {

    @XmlElement(name = "CharityID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<CharityIDType> charityID;

    /**
     * Gets the value of the charityID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the charityID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCharityID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CharityIDType }
     * 
     * 
     */
    public List<CharityIDType> getCharityID() {
        if (charityID == null) {
            charityID = new ArrayList<CharityIDType>();
        }
        return this.charityID;
    }

}
