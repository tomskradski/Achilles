
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Using this container, a seller can supply original retail price and
 * 				discount price for an item to clarify the discount treatment (also known 
 * 				as strike-through pricing). This only applies to fixed-price listings and auction listings with the Buy It Now 
 * 				option. This feature is available for large enterprise sellers via 
 * 				white list. A seller can provide discount treatment regardless of 
 * 				whether the listing includes a SKU.
 * 			
 * 
 * <p>Java class for DiscountPriceInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiscountPriceInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OriginalRetailPrice" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="MinimumAdvertisedPrice" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="MinimumAdvertisedPriceExposure" type="{urn:ebay:apis:eBLBaseComponents}MinimumAdvertisedPriceExposureCodeType" minOccurs="0"/>
 *         &lt;element name="PricingTreatment" type="{urn:ebay:apis:eBLBaseComponents}PricingTreatmentCodeType" minOccurs="0"/>
 *         &lt;element name="SoldOneBay" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SoldOffeBay" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MadeForOutletComparisonPrice" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscountPriceInfoType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "originalRetailPrice",
    "minimumAdvertisedPrice",
    "minimumAdvertisedPriceExposure",
    "pricingTreatment",
    "soldOneBay",
    "soldOffeBay",
    "madeForOutletComparisonPrice"
})
public class DiscountPriceInfoType {

    @XmlElement(name = "OriginalRetailPrice", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType originalRetailPrice;
    @XmlElement(name = "MinimumAdvertisedPrice", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType minimumAdvertisedPrice;
    @XmlElement(name = "MinimumAdvertisedPriceExposure", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected MinimumAdvertisedPriceExposureCodeType minimumAdvertisedPriceExposure;
    @XmlElement(name = "PricingTreatment", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected PricingTreatmentCodeType pricingTreatment;
    @XmlElement(name = "SoldOneBay", namespace = "urn:ebay:apis:eBLBaseComponents", defaultValue = "false")
    protected Boolean soldOneBay;
    @XmlElement(name = "SoldOffeBay", namespace = "urn:ebay:apis:eBLBaseComponents", defaultValue = "false")
    protected Boolean soldOffeBay;
    @XmlElement(name = "MadeForOutletComparisonPrice", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType madeForOutletComparisonPrice;

    /**
     * Gets the value of the originalRetailPrice property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOriginalRetailPrice() {
        return originalRetailPrice;
    }

    /**
     * Sets the value of the originalRetailPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOriginalRetailPrice(AmountType value) {
        this.originalRetailPrice = value;
    }

    /**
     * Gets the value of the minimumAdvertisedPrice property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getMinimumAdvertisedPrice() {
        return minimumAdvertisedPrice;
    }

    /**
     * Sets the value of the minimumAdvertisedPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setMinimumAdvertisedPrice(AmountType value) {
        this.minimumAdvertisedPrice = value;
    }

    /**
     * Gets the value of the minimumAdvertisedPriceExposure property.
     * 
     * @return
     *     possible object is
     *     {@link MinimumAdvertisedPriceExposureCodeType }
     *     
     */
    public MinimumAdvertisedPriceExposureCodeType getMinimumAdvertisedPriceExposure() {
        return minimumAdvertisedPriceExposure;
    }

    /**
     * Sets the value of the minimumAdvertisedPriceExposure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinimumAdvertisedPriceExposureCodeType }
     *     
     */
    public void setMinimumAdvertisedPriceExposure(MinimumAdvertisedPriceExposureCodeType value) {
        this.minimumAdvertisedPriceExposure = value;
    }

    /**
     * Gets the value of the pricingTreatment property.
     * 
     * @return
     *     possible object is
     *     {@link PricingTreatmentCodeType }
     *     
     */
    public PricingTreatmentCodeType getPricingTreatment() {
        return pricingTreatment;
    }

    /**
     * Sets the value of the pricingTreatment property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingTreatmentCodeType }
     *     
     */
    public void setPricingTreatment(PricingTreatmentCodeType value) {
        this.pricingTreatment = value;
    }

    /**
     * Gets the value of the soldOneBay property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSoldOneBay() {
        return soldOneBay;
    }

    /**
     * Sets the value of the soldOneBay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSoldOneBay(Boolean value) {
        this.soldOneBay = value;
    }

    /**
     * Gets the value of the soldOffeBay property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSoldOffeBay() {
        return soldOffeBay;
    }

    /**
     * Sets the value of the soldOffeBay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSoldOffeBay(Boolean value) {
        this.soldOffeBay = value;
    }

    /**
     * Gets the value of the madeForOutletComparisonPrice property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getMadeForOutletComparisonPrice() {
        return madeForOutletComparisonPrice;
    }

    /**
     * Sets the value of the madeForOutletComparisonPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setMadeForOutletComparisonPrice(AmountType value) {
        this.madeForOutletComparisonPrice = value;
    }

}
