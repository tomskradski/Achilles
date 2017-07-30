
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * 				Type defining the <b>CharityAffiliationDetail</b> container that is returned in the <b>GetUser</b> response. The <b>CharityAffiliationDetail</b> container consists of information on a nonprofit charity organization associated with the seller's account. A separate <b>CharityAffiliationDetail</b> container is returned for each nonprofit charity organization associated with the seller's account.
 * 			
 * 
 * <p>Java class for CharityAffiliationDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CharityAffiliationDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CharityID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AffiliationType" type="{urn:ebay:apis:eBLBaseComponents}CharityAffiliationTypeCodeType" minOccurs="0"/>
 *         &lt;element name="LastUsedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CharityAffiliationDetailType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "charityID",
    "affiliationType",
    "lastUsedTime"
})
public class CharityAffiliationDetailType {

    @XmlElement(name = "CharityID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String charityID;
    @XmlElement(name = "AffiliationType", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected CharityAffiliationTypeCodeType affiliationType;
    @XmlElement(name = "LastUsedTime", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUsedTime;

    /**
     * Gets the value of the charityID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharityID() {
        return charityID;
    }

    /**
     * Sets the value of the charityID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharityID(String value) {
        this.charityID = value;
    }

    /**
     * Gets the value of the affiliationType property.
     * 
     * @return
     *     possible object is
     *     {@link CharityAffiliationTypeCodeType }
     *     
     */
    public CharityAffiliationTypeCodeType getAffiliationType() {
        return affiliationType;
    }

    /**
     * Sets the value of the affiliationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharityAffiliationTypeCodeType }
     *     
     */
    public void setAffiliationType(CharityAffiliationTypeCodeType value) {
        this.affiliationType = value;
    }

    /**
     * Gets the value of the lastUsedTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUsedTime() {
        return lastUsedTime;
    }

    /**
     * Sets the value of the lastUsedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUsedTime(XMLGregorianCalendar value) {
        this.lastUsedTime = value;
    }

}
