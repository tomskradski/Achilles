
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This type is used to provide details about a nonprofit organization registered with the PayPal Giving Fund.
 * 			
 * 
 * <p>Java class for CharityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CharityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CharityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CharityNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DonationPercent" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="CharityID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mission" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LogoURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{urn:ebay:apis:eBLBaseComponents}CharityStatusCodeType" minOccurs="0"/>
 *         &lt;element name="CharityListing" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CharityType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "charityName",
    "charityNumber",
    "donationPercent",
    "charityID",
    "mission",
    "logoURL",
    "status",
    "charityListing"
})
public class CharityType {

    @XmlElement(name = "CharityName", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String charityName;
    @XmlElement(name = "CharityNumber", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer charityNumber;
    @XmlElement(name = "DonationPercent", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Float donationPercent;
    @XmlElement(name = "CharityID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String charityID;
    @XmlElement(name = "Mission", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String mission;
    @XmlElement(name = "LogoURL", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String logoURL;
    @XmlElement(name = "Status", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected CharityStatusCodeType status;
    @XmlElement(name = "CharityListing", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean charityListing;

    /**
     * Gets the value of the charityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharityName() {
        return charityName;
    }

    /**
     * Sets the value of the charityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharityName(String value) {
        this.charityName = value;
    }

    /**
     * Gets the value of the charityNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCharityNumber() {
        return charityNumber;
    }

    /**
     * Sets the value of the charityNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCharityNumber(Integer value) {
        this.charityNumber = value;
    }

    /**
     * Gets the value of the donationPercent property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDonationPercent() {
        return donationPercent;
    }

    /**
     * Sets the value of the donationPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDonationPercent(Float value) {
        this.donationPercent = value;
    }

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
     * Gets the value of the mission property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMission() {
        return mission;
    }

    /**
     * Sets the value of the mission property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMission(String value) {
        this.mission = value;
    }

    /**
     * Gets the value of the logoURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogoURL() {
        return logoURL;
    }

    /**
     * Sets the value of the logoURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogoURL(String value) {
        this.logoURL = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link CharityStatusCodeType }
     *     
     */
    public CharityStatusCodeType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharityStatusCodeType }
     *     
     */
    public void setStatus(CharityStatusCodeType value) {
        this.status = value;
    }

    /**
     * Gets the value of the charityListing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCharityListing() {
        return charityListing;
    }

    /**
     * Sets the value of the charityListing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCharityListing(Boolean value) {
        this.charityListing = value;
    }

}
