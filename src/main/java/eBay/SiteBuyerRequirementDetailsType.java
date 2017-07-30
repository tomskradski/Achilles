
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * 				Type defining the <b>BuyerRequirementDetails</b> container, which is returned in
 * 				<b>GeteBayDetails</b>, and provides the seller with the buyer requirement features (and applicable
 * 				values) that are supported by the listing site.
 * 				<br/><br/>
 * 				<span class="tablenote"><b>Note: </b>
 * 				This container is only returned if <b>BuyerRequirementDetails</b> is included as a <b>DetailName</b>
 * 				filter in the call request, or if no <b>DetailName</b> filters are used in the request.
 * 				</span>
 * 			
 * 
 * <p>Java class for SiteBuyerRequirementDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SiteBuyerRequirementDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LinkedPayPalAccount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumBuyerPolicyViolations" type="{urn:ebay:apis:eBLBaseComponents}MaximumBuyerPolicyViolationsDetailsType" minOccurs="0"/>
 *         &lt;element name="MaximumItemRequirements" type="{urn:ebay:apis:eBLBaseComponents}MaximumItemRequirementsDetailsType" minOccurs="0"/>
 *         &lt;element name="MaximumUnpaidItemStrikesInfo" type="{urn:ebay:apis:eBLBaseComponents}MaximumUnpaidItemStrikesInfoDetailsType" minOccurs="0"/>
 *         &lt;element name="MinimumFeedbackScore" type="{urn:ebay:apis:eBLBaseComponents}MinimumFeedbackScoreDetailsType" minOccurs="0"/>
 *         &lt;element name="ShipToRegistrationCountry" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="VerifiedUserRequirements" type="{urn:ebay:apis:eBLBaseComponents}VerifiedUserRequirementsDetailsType" minOccurs="0"/>
 *         &lt;element name="DetailVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UpdateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SiteBuyerRequirementDetailsType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "linkedPayPalAccount",
    "maximumBuyerPolicyViolations",
    "maximumItemRequirements",
    "maximumUnpaidItemStrikesInfo",
    "minimumFeedbackScore",
    "shipToRegistrationCountry",
    "verifiedUserRequirements",
    "detailVersion",
    "updateTime"
})
public class SiteBuyerRequirementDetailsType {

    @XmlElement(name = "LinkedPayPalAccount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean linkedPayPalAccount;
    @XmlElement(name = "MaximumBuyerPolicyViolations", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected MaximumBuyerPolicyViolationsDetailsType maximumBuyerPolicyViolations;
    @XmlElement(name = "MaximumItemRequirements", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected MaximumItemRequirementsDetailsType maximumItemRequirements;
    @XmlElement(name = "MaximumUnpaidItemStrikesInfo", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected MaximumUnpaidItemStrikesInfoDetailsType maximumUnpaidItemStrikesInfo;
    @XmlElement(name = "MinimumFeedbackScore", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected MinimumFeedbackScoreDetailsType minimumFeedbackScore;
    @XmlElement(name = "ShipToRegistrationCountry", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean shipToRegistrationCountry;
    @XmlElement(name = "VerifiedUserRequirements", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected VerifiedUserRequirementsDetailsType verifiedUserRequirements;
    @XmlElement(name = "DetailVersion", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String detailVersion;
    @XmlElement(name = "UpdateTime", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updateTime;

    /**
     * Gets the value of the linkedPayPalAccount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLinkedPayPalAccount() {
        return linkedPayPalAccount;
    }

    /**
     * Sets the value of the linkedPayPalAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLinkedPayPalAccount(Boolean value) {
        this.linkedPayPalAccount = value;
    }

    /**
     * Gets the value of the maximumBuyerPolicyViolations property.
     * 
     * @return
     *     possible object is
     *     {@link MaximumBuyerPolicyViolationsDetailsType }
     *     
     */
    public MaximumBuyerPolicyViolationsDetailsType getMaximumBuyerPolicyViolations() {
        return maximumBuyerPolicyViolations;
    }

    /**
     * Sets the value of the maximumBuyerPolicyViolations property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumBuyerPolicyViolationsDetailsType }
     *     
     */
    public void setMaximumBuyerPolicyViolations(MaximumBuyerPolicyViolationsDetailsType value) {
        this.maximumBuyerPolicyViolations = value;
    }

    /**
     * Gets the value of the maximumItemRequirements property.
     * 
     * @return
     *     possible object is
     *     {@link MaximumItemRequirementsDetailsType }
     *     
     */
    public MaximumItemRequirementsDetailsType getMaximumItemRequirements() {
        return maximumItemRequirements;
    }

    /**
     * Sets the value of the maximumItemRequirements property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumItemRequirementsDetailsType }
     *     
     */
    public void setMaximumItemRequirements(MaximumItemRequirementsDetailsType value) {
        this.maximumItemRequirements = value;
    }

    /**
     * Gets the value of the maximumUnpaidItemStrikesInfo property.
     * 
     * @return
     *     possible object is
     *     {@link MaximumUnpaidItemStrikesInfoDetailsType }
     *     
     */
    public MaximumUnpaidItemStrikesInfoDetailsType getMaximumUnpaidItemStrikesInfo() {
        return maximumUnpaidItemStrikesInfo;
    }

    /**
     * Sets the value of the maximumUnpaidItemStrikesInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumUnpaidItemStrikesInfoDetailsType }
     *     
     */
    public void setMaximumUnpaidItemStrikesInfo(MaximumUnpaidItemStrikesInfoDetailsType value) {
        this.maximumUnpaidItemStrikesInfo = value;
    }

    /**
     * Gets the value of the minimumFeedbackScore property.
     * 
     * @return
     *     possible object is
     *     {@link MinimumFeedbackScoreDetailsType }
     *     
     */
    public MinimumFeedbackScoreDetailsType getMinimumFeedbackScore() {
        return minimumFeedbackScore;
    }

    /**
     * Sets the value of the minimumFeedbackScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinimumFeedbackScoreDetailsType }
     *     
     */
    public void setMinimumFeedbackScore(MinimumFeedbackScoreDetailsType value) {
        this.minimumFeedbackScore = value;
    }

    /**
     * Gets the value of the shipToRegistrationCountry property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShipToRegistrationCountry() {
        return shipToRegistrationCountry;
    }

    /**
     * Sets the value of the shipToRegistrationCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShipToRegistrationCountry(Boolean value) {
        this.shipToRegistrationCountry = value;
    }

    /**
     * Gets the value of the verifiedUserRequirements property.
     * 
     * @return
     *     possible object is
     *     {@link VerifiedUserRequirementsDetailsType }
     *     
     */
    public VerifiedUserRequirementsDetailsType getVerifiedUserRequirements() {
        return verifiedUserRequirements;
    }

    /**
     * Sets the value of the verifiedUserRequirements property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerifiedUserRequirementsDetailsType }
     *     
     */
    public void setVerifiedUserRequirements(VerifiedUserRequirementsDetailsType value) {
        this.verifiedUserRequirements = value;
    }

    /**
     * Gets the value of the detailVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetailVersion() {
        return detailVersion;
    }

    /**
     * Sets the value of the detailVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetailVersion(String value) {
        this.detailVersion = value;
    }

    /**
     * Gets the value of the updateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdateTime() {
        return updateTime;
    }

    /**
     * Sets the value of the updateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdateTime(XMLGregorianCalendar value) {
        this.updateTime = value;
    }

}
