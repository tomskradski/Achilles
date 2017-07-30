
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Type defining the <b>BuyerRequirementDetails</b> container, which allows the seller to set buyer requirements at the listing level. For the corresponding listing, all buyer requirement values/settings will overwrite values/settings in Buyer Requirements preferences in My eBay.
 * 			
 * 
 * <p>Java class for BuyerRequirementDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BuyerRequirementDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ShipToRegistrationCountry" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ZeroFeedbackScore" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MinimumFeedbackScore" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MaximumItemRequirements" type="{urn:ebay:apis:eBLBaseComponents}MaximumItemRequirementsType" minOccurs="0"/>
 *         &lt;element name="LinkedPayPalAccount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="VerifiedUserRequirements" type="{urn:ebay:apis:eBLBaseComponents}VerifiedUserRequirementsType" minOccurs="0"/>
 *         &lt;element name="MaximumUnpaidItemStrikesInfo" type="{urn:ebay:apis:eBLBaseComponents}MaximumUnpaidItemStrikesInfoType" minOccurs="0"/>
 *         &lt;element name="MaximumBuyerPolicyViolations" type="{urn:ebay:apis:eBLBaseComponents}MaximumBuyerPolicyViolationsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuyerRequirementDetailsType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "shipToRegistrationCountry",
    "zeroFeedbackScore",
    "minimumFeedbackScore",
    "maximumItemRequirements",
    "linkedPayPalAccount",
    "verifiedUserRequirements",
    "maximumUnpaidItemStrikesInfo",
    "maximumBuyerPolicyViolations"
})
public class BuyerRequirementDetailsType {

    @XmlElement(name = "ShipToRegistrationCountry", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean shipToRegistrationCountry;
    @XmlElement(name = "ZeroFeedbackScore", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean zeroFeedbackScore;
    @XmlElement(name = "MinimumFeedbackScore", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer minimumFeedbackScore;
    @XmlElement(name = "MaximumItemRequirements", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected MaximumItemRequirementsType maximumItemRequirements;
    @XmlElement(name = "LinkedPayPalAccount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean linkedPayPalAccount;
    @XmlElement(name = "VerifiedUserRequirements", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected VerifiedUserRequirementsType verifiedUserRequirements;
    @XmlElement(name = "MaximumUnpaidItemStrikesInfo", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected MaximumUnpaidItemStrikesInfoType maximumUnpaidItemStrikesInfo;
    @XmlElement(name = "MaximumBuyerPolicyViolations", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected MaximumBuyerPolicyViolationsType maximumBuyerPolicyViolations;

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
     * Gets the value of the zeroFeedbackScore property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isZeroFeedbackScore() {
        return zeroFeedbackScore;
    }

    /**
     * Sets the value of the zeroFeedbackScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setZeroFeedbackScore(Boolean value) {
        this.zeroFeedbackScore = value;
    }

    /**
     * Gets the value of the minimumFeedbackScore property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinimumFeedbackScore() {
        return minimumFeedbackScore;
    }

    /**
     * Sets the value of the minimumFeedbackScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinimumFeedbackScore(Integer value) {
        this.minimumFeedbackScore = value;
    }

    /**
     * Gets the value of the maximumItemRequirements property.
     * 
     * @return
     *     possible object is
     *     {@link MaximumItemRequirementsType }
     *     
     */
    public MaximumItemRequirementsType getMaximumItemRequirements() {
        return maximumItemRequirements;
    }

    /**
     * Sets the value of the maximumItemRequirements property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumItemRequirementsType }
     *     
     */
    public void setMaximumItemRequirements(MaximumItemRequirementsType value) {
        this.maximumItemRequirements = value;
    }

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
     * Gets the value of the verifiedUserRequirements property.
     * 
     * @return
     *     possible object is
     *     {@link VerifiedUserRequirementsType }
     *     
     */
    public VerifiedUserRequirementsType getVerifiedUserRequirements() {
        return verifiedUserRequirements;
    }

    /**
     * Sets the value of the verifiedUserRequirements property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerifiedUserRequirementsType }
     *     
     */
    public void setVerifiedUserRequirements(VerifiedUserRequirementsType value) {
        this.verifiedUserRequirements = value;
    }

    /**
     * Gets the value of the maximumUnpaidItemStrikesInfo property.
     * 
     * @return
     *     possible object is
     *     {@link MaximumUnpaidItemStrikesInfoType }
     *     
     */
    public MaximumUnpaidItemStrikesInfoType getMaximumUnpaidItemStrikesInfo() {
        return maximumUnpaidItemStrikesInfo;
    }

    /**
     * Sets the value of the maximumUnpaidItemStrikesInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumUnpaidItemStrikesInfoType }
     *     
     */
    public void setMaximumUnpaidItemStrikesInfo(MaximumUnpaidItemStrikesInfoType value) {
        this.maximumUnpaidItemStrikesInfo = value;
    }

    /**
     * Gets the value of the maximumBuyerPolicyViolations property.
     * 
     * @return
     *     possible object is
     *     {@link MaximumBuyerPolicyViolationsType }
     *     
     */
    public MaximumBuyerPolicyViolationsType getMaximumBuyerPolicyViolations() {
        return maximumBuyerPolicyViolations;
    }

    /**
     * Sets the value of the maximumBuyerPolicyViolations property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumBuyerPolicyViolationsType }
     *     
     */
    public void setMaximumBuyerPolicyViolations(MaximumBuyerPolicyViolationsType value) {
        this.maximumBuyerPolicyViolations = value;
    }

}
