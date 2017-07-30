
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Indicates whether the seller making the request can list with certain features.
 * 				A seller's eligibility is determined by their Feedback score.
 * 			
 * 
 * <p>Java class for FeatureEligibilityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeatureEligibilityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="QualifiesForBuyItNow" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="QualifiesForBuyItNowMultiple" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="QualifiedForFixedPriceOneDayDuration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="QualifiesForVariations" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="QualifiedForAuctionOneDayDuration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeatureEligibilityType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "qualifiesForBuyItNow",
    "qualifiesForBuyItNowMultiple",
    "qualifiedForFixedPriceOneDayDuration",
    "qualifiesForVariations",
    "qualifiedForAuctionOneDayDuration"
})
public class FeatureEligibilityType {

    @XmlElement(name = "QualifiesForBuyItNow", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean qualifiesForBuyItNow;
    @XmlElement(name = "QualifiesForBuyItNowMultiple", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean qualifiesForBuyItNowMultiple;
    @XmlElement(name = "QualifiedForFixedPriceOneDayDuration", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean qualifiedForFixedPriceOneDayDuration;
    @XmlElement(name = "QualifiesForVariations", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean qualifiesForVariations;
    @XmlElement(name = "QualifiedForAuctionOneDayDuration", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean qualifiedForAuctionOneDayDuration;

    /**
     * Gets the value of the qualifiesForBuyItNow property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isQualifiesForBuyItNow() {
        return qualifiesForBuyItNow;
    }

    /**
     * Sets the value of the qualifiesForBuyItNow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQualifiesForBuyItNow(Boolean value) {
        this.qualifiesForBuyItNow = value;
    }

    /**
     * Gets the value of the qualifiesForBuyItNowMultiple property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isQualifiesForBuyItNowMultiple() {
        return qualifiesForBuyItNowMultiple;
    }

    /**
     * Sets the value of the qualifiesForBuyItNowMultiple property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQualifiesForBuyItNowMultiple(Boolean value) {
        this.qualifiesForBuyItNowMultiple = value;
    }

    /**
     * Gets the value of the qualifiedForFixedPriceOneDayDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isQualifiedForFixedPriceOneDayDuration() {
        return qualifiedForFixedPriceOneDayDuration;
    }

    /**
     * Sets the value of the qualifiedForFixedPriceOneDayDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQualifiedForFixedPriceOneDayDuration(Boolean value) {
        this.qualifiedForFixedPriceOneDayDuration = value;
    }

    /**
     * Gets the value of the qualifiesForVariations property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isQualifiesForVariations() {
        return qualifiesForVariations;
    }

    /**
     * Sets the value of the qualifiesForVariations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQualifiesForVariations(Boolean value) {
        this.qualifiesForVariations = value;
    }

    /**
     * Gets the value of the qualifiedForAuctionOneDayDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isQualifiedForAuctionOneDayDuration() {
        return qualifiedForAuctionOneDayDuration;
    }

    /**
     * Sets the value of the qualifiedForAuctionOneDayDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQualifiedForAuctionOneDayDuration(Boolean value) {
        this.qualifiedForAuctionOneDayDuration = value;
    }

}
