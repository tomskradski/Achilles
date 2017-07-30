
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This type is used to hold an array of one or more eBay for Charity organizations that are affiliated with the seller's account.
 * 			
 * 
 * <p>Java class for CharityAffiliationDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CharityAffiliationDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CharityAffiliationDetail" type="{urn:ebay:apis:eBLBaseComponents}CharityAffiliationDetailType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CharityAffiliationDetailsType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "charityAffiliationDetail"
})
public class CharityAffiliationDetailsType {

    @XmlElement(name = "CharityAffiliationDetail", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<CharityAffiliationDetailType> charityAffiliationDetail;

    /**
     * Gets the value of the charityAffiliationDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the charityAffiliationDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCharityAffiliationDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CharityAffiliationDetailType }
     * 
     * 
     */
    public List<CharityAffiliationDetailType> getCharityAffiliationDetail() {
        if (charityAffiliationDetail == null) {
            charityAffiliationDetail = new ArrayList<CharityAffiliationDetailType>();
        }
        return this.charityAffiliationDetail;
    }

}
