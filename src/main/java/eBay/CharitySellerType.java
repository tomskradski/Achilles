
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Contains information about one seller associated with a registered eBay for Charity nonprofit organization.
 * 			
 * 
 * <p>Java class for CharitySellerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CharitySellerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CharitySellerStatus" type="{urn:ebay:apis:eBLBaseComponents}CharitySellerStatusCodeType" minOccurs="0"/>
 *         &lt;element name="CharityAffiliation" type="{urn:ebay:apis:eBLBaseComponents}CharityAffiliationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TermsAndConditionsAccepted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CharitySellerType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "charitySellerStatus",
    "charityAffiliation",
    "termsAndConditionsAccepted"
})
public class CharitySellerType {

    @XmlElement(name = "CharitySellerStatus", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected CharitySellerStatusCodeType charitySellerStatus;
    @XmlElement(name = "CharityAffiliation", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<CharityAffiliationType> charityAffiliation;
    @XmlElement(name = "TermsAndConditionsAccepted", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean termsAndConditionsAccepted;

    /**
     * Gets the value of the charitySellerStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CharitySellerStatusCodeType }
     *     
     */
    public CharitySellerStatusCodeType getCharitySellerStatus() {
        return charitySellerStatus;
    }

    /**
     * Sets the value of the charitySellerStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharitySellerStatusCodeType }
     *     
     */
    public void setCharitySellerStatus(CharitySellerStatusCodeType value) {
        this.charitySellerStatus = value;
    }

    /**
     * Gets the value of the charityAffiliation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the charityAffiliation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCharityAffiliation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CharityAffiliationType }
     * 
     * 
     */
    public List<CharityAffiliationType> getCharityAffiliation() {
        if (charityAffiliation == null) {
            charityAffiliation = new ArrayList<CharityAffiliationType>();
        }
        return this.charityAffiliation;
    }

    /**
     * Gets the value of the termsAndConditionsAccepted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTermsAndConditionsAccepted() {
        return termsAndConditionsAccepted;
    }

    /**
     * Sets the value of the termsAndConditionsAccepted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTermsAndConditionsAccepted(Boolean value) {
        this.termsAndConditionsAccepted = value;
    }

}
