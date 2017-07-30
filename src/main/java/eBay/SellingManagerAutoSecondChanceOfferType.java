
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Defines the options available for an automated 
 * 				second chance offer rule.
 * 			
 * 
 * <p>Java class for SellingManagerAutoSecondChanceOfferType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SellingManagerAutoSecondChanceOfferType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SecondChanceOfferCondition" type="{urn:ebay:apis:eBLBaseComponents}SellingManagerAutoSecondChanceOfferTypeCodeType" minOccurs="0"/>
 *         &lt;element name="Amount" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="ProfitPercent" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="Duration" type="{urn:ebay:apis:eBLBaseComponents}SecondChanceOfferDurationCodeType" minOccurs="0"/>
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
@XmlType(name = "SellingManagerAutoSecondChanceOfferType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "secondChanceOfferCondition",
    "amount",
    "profitPercent",
    "duration",
    "listingHoldInventoryLevel"
})
public class SellingManagerAutoSecondChanceOfferType {

    @XmlElement(name = "SecondChanceOfferCondition", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected SellingManagerAutoSecondChanceOfferTypeCodeType secondChanceOfferCondition;
    @XmlElement(name = "Amount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType amount;
    @XmlElement(name = "ProfitPercent", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Float profitPercent;
    @XmlElement(name = "Duration", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected SecondChanceOfferDurationCodeType duration;
    @XmlElement(name = "ListingHoldInventoryLevel", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer listingHoldInventoryLevel;

    /**
     * Gets the value of the secondChanceOfferCondition property.
     * 
     * @return
     *     possible object is
     *     {@link SellingManagerAutoSecondChanceOfferTypeCodeType }
     *     
     */
    public SellingManagerAutoSecondChanceOfferTypeCodeType getSecondChanceOfferCondition() {
        return secondChanceOfferCondition;
    }

    /**
     * Sets the value of the secondChanceOfferCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellingManagerAutoSecondChanceOfferTypeCodeType }
     *     
     */
    public void setSecondChanceOfferCondition(SellingManagerAutoSecondChanceOfferTypeCodeType value) {
        this.secondChanceOfferCondition = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmount(AmountType value) {
        this.amount = value;
    }

    /**
     * Gets the value of the profitPercent property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getProfitPercent() {
        return profitPercent;
    }

    /**
     * Sets the value of the profitPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setProfitPercent(Float value) {
        this.profitPercent = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link SecondChanceOfferDurationCodeType }
     *     
     */
    public SecondChanceOfferDurationCodeType getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecondChanceOfferDurationCodeType }
     *     
     */
    public void setDuration(SecondChanceOfferDurationCodeType value) {
        this.duration = value;
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
