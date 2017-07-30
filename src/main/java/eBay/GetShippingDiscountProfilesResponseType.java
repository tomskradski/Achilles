
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Response to call of GetShippingDiscountProfiles.
 * 			
 * 
 * <p>Java class for GetShippingDiscountProfilesResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetShippingDiscountProfilesResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="CurrencyID" type="{urn:ebay:apis:eBLBaseComponents}CurrencyCodeType" minOccurs="0"/>
 *         &lt;element name="FlatShippingDiscount" type="{urn:ebay:apis:eBLBaseComponents}FlatShippingDiscountType" minOccurs="0"/>
 *         &lt;element name="CalculatedShippingDiscount" type="{urn:ebay:apis:eBLBaseComponents}CalculatedShippingDiscountType" minOccurs="0"/>
 *         &lt;element name="PromotionalShippingDiscount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CalculatedHandlingDiscount" type="{urn:ebay:apis:eBLBaseComponents}CalculatedHandlingDiscountType" minOccurs="0"/>
 *         &lt;element name="PromotionalShippingDiscountDetails" type="{urn:ebay:apis:eBLBaseComponents}PromotionalShippingDiscountDetailsType" minOccurs="0"/>
 *         &lt;element name="ShippingInsurance" type="{urn:ebay:apis:eBLBaseComponents}ShippingInsuranceType" minOccurs="0"/>
 *         &lt;element name="InternationalShippingInsurance" type="{urn:ebay:apis:eBLBaseComponents}ShippingInsuranceType" minOccurs="0"/>
 *         &lt;element name="CombinedDuration" type="{urn:ebay:apis:eBLBaseComponents}CombinedPaymentPeriodCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetShippingDiscountProfilesResponseType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "currencyID",
    "flatShippingDiscount",
    "calculatedShippingDiscount",
    "promotionalShippingDiscount",
    "calculatedHandlingDiscount",
    "promotionalShippingDiscountDetails",
    "shippingInsurance",
    "internationalShippingInsurance",
    "combinedDuration"
})
public class GetShippingDiscountProfilesResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "CurrencyID", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected CurrencyCodeType currencyID;
    @XmlElement(name = "FlatShippingDiscount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected FlatShippingDiscountType flatShippingDiscount;
    @XmlElement(name = "CalculatedShippingDiscount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected CalculatedShippingDiscountType calculatedShippingDiscount;
    @XmlElement(name = "PromotionalShippingDiscount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean promotionalShippingDiscount;
    @XmlElement(name = "CalculatedHandlingDiscount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected CalculatedHandlingDiscountType calculatedHandlingDiscount;
    @XmlElement(name = "PromotionalShippingDiscountDetails", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected PromotionalShippingDiscountDetailsType promotionalShippingDiscountDetails;
    @XmlElement(name = "ShippingInsurance", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected ShippingInsuranceType shippingInsurance;
    @XmlElement(name = "InternationalShippingInsurance", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected ShippingInsuranceType internationalShippingInsurance;
    @XmlElement(name = "CombinedDuration", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected CombinedPaymentPeriodCodeType combinedDuration;

    /**
     * Gets the value of the currencyID property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCodeType }
     *     
     */
    public CurrencyCodeType getCurrencyID() {
        return currencyID;
    }

    /**
     * Sets the value of the currencyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCodeType }
     *     
     */
    public void setCurrencyID(CurrencyCodeType value) {
        this.currencyID = value;
    }

    /**
     * Gets the value of the flatShippingDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link FlatShippingDiscountType }
     *     
     */
    public FlatShippingDiscountType getFlatShippingDiscount() {
        return flatShippingDiscount;
    }

    /**
     * Sets the value of the flatShippingDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlatShippingDiscountType }
     *     
     */
    public void setFlatShippingDiscount(FlatShippingDiscountType value) {
        this.flatShippingDiscount = value;
    }

    /**
     * Gets the value of the calculatedShippingDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link CalculatedShippingDiscountType }
     *     
     */
    public CalculatedShippingDiscountType getCalculatedShippingDiscount() {
        return calculatedShippingDiscount;
    }

    /**
     * Sets the value of the calculatedShippingDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculatedShippingDiscountType }
     *     
     */
    public void setCalculatedShippingDiscount(CalculatedShippingDiscountType value) {
        this.calculatedShippingDiscount = value;
    }

    /**
     * Gets the value of the promotionalShippingDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPromotionalShippingDiscount() {
        return promotionalShippingDiscount;
    }

    /**
     * Sets the value of the promotionalShippingDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPromotionalShippingDiscount(Boolean value) {
        this.promotionalShippingDiscount = value;
    }

    /**
     * Gets the value of the calculatedHandlingDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link CalculatedHandlingDiscountType }
     *     
     */
    public CalculatedHandlingDiscountType getCalculatedHandlingDiscount() {
        return calculatedHandlingDiscount;
    }

    /**
     * Sets the value of the calculatedHandlingDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculatedHandlingDiscountType }
     *     
     */
    public void setCalculatedHandlingDiscount(CalculatedHandlingDiscountType value) {
        this.calculatedHandlingDiscount = value;
    }

    /**
     * Gets the value of the promotionalShippingDiscountDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PromotionalShippingDiscountDetailsType }
     *     
     */
    public PromotionalShippingDiscountDetailsType getPromotionalShippingDiscountDetails() {
        return promotionalShippingDiscountDetails;
    }

    /**
     * Sets the value of the promotionalShippingDiscountDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionalShippingDiscountDetailsType }
     *     
     */
    public void setPromotionalShippingDiscountDetails(PromotionalShippingDiscountDetailsType value) {
        this.promotionalShippingDiscountDetails = value;
    }

    /**
     * Gets the value of the shippingInsurance property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingInsuranceType }
     *     
     */
    public ShippingInsuranceType getShippingInsurance() {
        return shippingInsurance;
    }

    /**
     * Sets the value of the shippingInsurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingInsuranceType }
     *     
     */
    public void setShippingInsurance(ShippingInsuranceType value) {
        this.shippingInsurance = value;
    }

    /**
     * Gets the value of the internationalShippingInsurance property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingInsuranceType }
     *     
     */
    public ShippingInsuranceType getInternationalShippingInsurance() {
        return internationalShippingInsurance;
    }

    /**
     * Sets the value of the internationalShippingInsurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingInsuranceType }
     *     
     */
    public void setInternationalShippingInsurance(ShippingInsuranceType value) {
        this.internationalShippingInsurance = value;
    }

    /**
     * Gets the value of the combinedDuration property.
     * 
     * @return
     *     possible object is
     *     {@link CombinedPaymentPeriodCodeType }
     *     
     */
    public CombinedPaymentPeriodCodeType getCombinedDuration() {
        return combinedDuration;
    }

    /**
     * Sets the value of the combinedDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link CombinedPaymentPeriodCodeType }
     *     
     */
    public void setCombinedDuration(CombinedPaymentPeriodCodeType value) {
        this.combinedDuration = value;
    }

}
