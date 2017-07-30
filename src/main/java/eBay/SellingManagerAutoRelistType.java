
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * 				Provides information about an automated relisting rule.   
 * 				Automated relisting rules cannot be combined with automated listing rules.
 * 				A template can have one set of information per automated relisting rule specified.
 * 			
 * 
 * <p>Java class for SellingManagerAutoRelistType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SellingManagerAutoRelistType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{urn:ebay:apis:eBLBaseComponents}SellingManagerAutoRelistTypeCodeType" minOccurs="0"/>
 *         &lt;element name="RelistCondition" type="{urn:ebay:apis:eBLBaseComponents}SellingManagerAutoRelistOptionCodeType" minOccurs="0"/>
 *         &lt;element name="RelistAfterDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RelistAfterHours" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RelistAtSpecificTimeOfDay" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="BestOfferDetails" type="{urn:ebay:apis:eBLBaseComponents}BestOfferDetailsType" minOccurs="0"/>
 *         &lt;element name="ListingHoldInventoryLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SellingManagerAutoRelistType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "type",
    "relistCondition",
    "relistAfterDays",
    "relistAfterHours",
    "relistAtSpecificTimeOfDay",
    "bestOfferDetails",
    "listingHoldInventoryLevel"
})
public class SellingManagerAutoRelistType {

    @XmlElement(name = "Type", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected SellingManagerAutoRelistTypeCodeType type;
    @XmlElement(name = "RelistCondition", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected SellingManagerAutoRelistOptionCodeType relistCondition;
    @XmlElement(name = "RelistAfterDays", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer relistAfterDays;
    @XmlElement(name = "RelistAfterHours", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer relistAfterHours;
    @XmlElement(name = "RelistAtSpecificTimeOfDay", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar relistAtSpecificTimeOfDay;
    @XmlElement(name = "BestOfferDetails", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected BestOfferDetailsType bestOfferDetails;
    @XmlElement(name = "ListingHoldInventoryLevel", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer listingHoldInventoryLevel;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link SellingManagerAutoRelistTypeCodeType }
     *     
     */
    public SellingManagerAutoRelistTypeCodeType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellingManagerAutoRelistTypeCodeType }
     *     
     */
    public void setType(SellingManagerAutoRelistTypeCodeType value) {
        this.type = value;
    }

    /**
     * Gets the value of the relistCondition property.
     * 
     * @return
     *     possible object is
     *     {@link SellingManagerAutoRelistOptionCodeType }
     *     
     */
    public SellingManagerAutoRelistOptionCodeType getRelistCondition() {
        return relistCondition;
    }

    /**
     * Sets the value of the relistCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellingManagerAutoRelistOptionCodeType }
     *     
     */
    public void setRelistCondition(SellingManagerAutoRelistOptionCodeType value) {
        this.relistCondition = value;
    }

    /**
     * Gets the value of the relistAfterDays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRelistAfterDays() {
        return relistAfterDays;
    }

    /**
     * Sets the value of the relistAfterDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRelistAfterDays(Integer value) {
        this.relistAfterDays = value;
    }

    /**
     * Gets the value of the relistAfterHours property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRelistAfterHours() {
        return relistAfterHours;
    }

    /**
     * Sets the value of the relistAfterHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRelistAfterHours(Integer value) {
        this.relistAfterHours = value;
    }

    /**
     * Gets the value of the relistAtSpecificTimeOfDay property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRelistAtSpecificTimeOfDay() {
        return relistAtSpecificTimeOfDay;
    }

    /**
     * Sets the value of the relistAtSpecificTimeOfDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRelistAtSpecificTimeOfDay(XMLGregorianCalendar value) {
        this.relistAtSpecificTimeOfDay = value;
    }

    /**
     * Gets the value of the bestOfferDetails property.
     * 
     * @return
     *     possible object is
     *     {@link BestOfferDetailsType }
     *     
     */
    public BestOfferDetailsType getBestOfferDetails() {
        return bestOfferDetails;
    }

    /**
     * Sets the value of the bestOfferDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link BestOfferDetailsType }
     *     
     */
    public void setBestOfferDetails(BestOfferDetailsType value) {
        this.bestOfferDetails = value;
    }

    /**
     * Gets the value of the listingHoldInventoryLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getListingHoldInventoryLevel() {
        return listingHoldInventoryLevel;
    }

    /**
     * Sets the value of the listingHoldInventoryLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setListingHoldInventoryLevel(Integer value) {
        this.listingHoldInventoryLevel = value;
    }

}
