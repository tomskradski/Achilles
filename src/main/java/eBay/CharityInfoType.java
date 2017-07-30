
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Type defining the <b>Charity</b> container, which consists of all details
 * 				related to a nonprofit charity organization.
 * 			
 * 
 * <p>Java class for CharityInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CharityInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ListingNPEmailNotifPref" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ListingNPEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ListingNPContactName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mission" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LogoURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="Status" type="{urn:ebay:apis:eBLBaseComponents}CharityStatusCodeType" minOccurs="0"/>
 *         &lt;element name="SearchableString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CharityRegion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CharityDomain" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="CharityID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LogoURLSelling" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="DisplayLogoSelling" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DisplayNameInCheckout" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShowMultipleDonationAmountInCheckout" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ExternalID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PopularityIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="EIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NonProfitSecondName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NonProfitAddress" type="{urn:ebay:apis:eBLBaseComponents}NonProfitAddressType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NonProfitSocialAddress" type="{urn:ebay:apis:eBLBaseComponents}NonProfitSocialAddressType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CharityInfoType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "name",
    "listingNPEmailNotifPref",
    "listingNPEmail",
    "listingNPContactName",
    "mission",
    "logoURL",
    "status",
    "searchableString",
    "charityRegion",
    "charityDomain",
    "charityID",
    "logoURLSelling",
    "displayLogoSelling",
    "displayNameInCheckout",
    "description",
    "showMultipleDonationAmountInCheckout",
    "externalID",
    "popularityIndex",
    "ein",
    "nonProfitSecondName",
    "nonProfitAddress",
    "nonProfitSocialAddress"
})
public class CharityInfoType {

    @XmlElement(name = "Name", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String name;
    @XmlElement(name = "ListingNPEmailNotifPref", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean listingNPEmailNotifPref;
    @XmlElement(name = "ListingNPEmail", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String listingNPEmail;
    @XmlElement(name = "ListingNPContactName", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String listingNPContactName;
    @XmlElement(name = "Mission", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String mission;
    @XmlElement(name = "LogoURL", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "anyURI")
    protected String logoURL;
    @XmlElement(name = "Status", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected CharityStatusCodeType status;
    @XmlElement(name = "SearchableString", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String searchableString;
    @XmlElement(name = "CharityRegion", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer charityRegion;
    @XmlElement(name = "CharityDomain", namespace = "urn:ebay:apis:eBLBaseComponents", type = Integer.class)
    protected List<Integer> charityDomain;
    @XmlElement(name = "CharityID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String charityID;
    @XmlElement(name = "LogoURLSelling", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "anyURI")
    protected String logoURLSelling;
    @XmlElement(name = "DisplayLogoSelling", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean displayLogoSelling;
    @XmlElement(name = "DisplayNameInCheckout", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean displayNameInCheckout;
    @XmlElement(name = "Description", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String description;
    @XmlElement(name = "ShowMultipleDonationAmountInCheckout", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean showMultipleDonationAmountInCheckout;
    @XmlElement(name = "ExternalID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String externalID;
    @XmlElement(name = "PopularityIndex", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer popularityIndex;
    @XmlElement(name = "EIN", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String ein;
    @XmlElement(name = "NonProfitSecondName", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String nonProfitSecondName;
    @XmlElement(name = "NonProfitAddress", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<NonProfitAddressType> nonProfitAddress;
    @XmlElement(name = "NonProfitSocialAddress", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<NonProfitSocialAddressType> nonProfitSocialAddress;
    @XmlAttribute(name = "id")
    protected String id;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the listingNPEmailNotifPref property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isListingNPEmailNotifPref() {
        return listingNPEmailNotifPref;
    }

    /**
     * Sets the value of the listingNPEmailNotifPref property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setListingNPEmailNotifPref(Boolean value) {
        this.listingNPEmailNotifPref = value;
    }

    /**
     * Gets the value of the listingNPEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListingNPEmail() {
        return listingNPEmail;
    }

    /**
     * Sets the value of the listingNPEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListingNPEmail(String value) {
        this.listingNPEmail = value;
    }

    /**
     * Gets the value of the listingNPContactName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListingNPContactName() {
        return listingNPContactName;
    }

    /**
     * Sets the value of the listingNPContactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListingNPContactName(String value) {
        this.listingNPContactName = value;
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
     * Gets the value of the searchableString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchableString() {
        return searchableString;
    }

    /**
     * Sets the value of the searchableString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchableString(String value) {
        this.searchableString = value;
    }

    /**
     * Gets the value of the charityRegion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCharityRegion() {
        return charityRegion;
    }

    /**
     * Sets the value of the charityRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCharityRegion(Integer value) {
        this.charityRegion = value;
    }

    /**
     * Gets the value of the charityDomain property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the charityDomain property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCharityDomain().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getCharityDomain() {
        if (charityDomain == null) {
            charityDomain = new ArrayList<Integer>();
        }
        return this.charityDomain;
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
     * Gets the value of the logoURLSelling property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogoURLSelling() {
        return logoURLSelling;
    }

    /**
     * Sets the value of the logoURLSelling property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogoURLSelling(String value) {
        this.logoURLSelling = value;
    }

    /**
     * Gets the value of the displayLogoSelling property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisplayLogoSelling() {
        return displayLogoSelling;
    }

    /**
     * Sets the value of the displayLogoSelling property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisplayLogoSelling(Boolean value) {
        this.displayLogoSelling = value;
    }

    /**
     * Gets the value of the displayNameInCheckout property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisplayNameInCheckout() {
        return displayNameInCheckout;
    }

    /**
     * Sets the value of the displayNameInCheckout property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisplayNameInCheckout(Boolean value) {
        this.displayNameInCheckout = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the showMultipleDonationAmountInCheckout property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowMultipleDonationAmountInCheckout() {
        return showMultipleDonationAmountInCheckout;
    }

    /**
     * Sets the value of the showMultipleDonationAmountInCheckout property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowMultipleDonationAmountInCheckout(Boolean value) {
        this.showMultipleDonationAmountInCheckout = value;
    }

    /**
     * Gets the value of the externalID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalID() {
        return externalID;
    }

    /**
     * Sets the value of the externalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalID(String value) {
        this.externalID = value;
    }

    /**
     * Gets the value of the popularityIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPopularityIndex() {
        return popularityIndex;
    }

    /**
     * Sets the value of the popularityIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPopularityIndex(Integer value) {
        this.popularityIndex = value;
    }

    /**
     * Gets the value of the ein property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEIN() {
        return ein;
    }

    /**
     * Sets the value of the ein property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEIN(String value) {
        this.ein = value;
    }

    /**
     * Gets the value of the nonProfitSecondName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonProfitSecondName() {
        return nonProfitSecondName;
    }

    /**
     * Sets the value of the nonProfitSecondName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonProfitSecondName(String value) {
        this.nonProfitSecondName = value;
    }

    /**
     * Gets the value of the nonProfitAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nonProfitAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNonProfitAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NonProfitAddressType }
     * 
     * 
     */
    public List<NonProfitAddressType> getNonProfitAddress() {
        if (nonProfitAddress == null) {
            nonProfitAddress = new ArrayList<NonProfitAddressType>();
        }
        return this.nonProfitAddress;
    }

    /**
     * Gets the value of the nonProfitSocialAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nonProfitSocialAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNonProfitSocialAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NonProfitSocialAddressType }
     * 
     * 
     */
    public List<NonProfitSocialAddressType> getNonProfitSocialAddress() {
        if (nonProfitSocialAddress == null) {
            nonProfitSocialAddress = new ArrayList<NonProfitSocialAddressType>();
        }
        return this.nonProfitSocialAddress;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
