
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This type is deprecated.
 * 			
 * 
 * <p>Java class for FlatShippingPreferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlatShippingPreferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AmountPerAdditionalItem" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="DeductionAmountPerAdditionalItem" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="FlatRateInsuranceRangeCost" type="{urn:ebay:apis:eBLBaseComponents}FlatRateInsuranceRangeCostType" maxOccurs="6" minOccurs="0"/>
 *         &lt;element name="FlatShippingRateOption" type="{urn:ebay:apis:eBLBaseComponents}FlatShippingRateOptionCodeType" minOccurs="0"/>
 *         &lt;element name="InsuranceOption" type="{urn:ebay:apis:eBLBaseComponents}InsuranceOptionCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlatShippingPreferencesType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "amountPerAdditionalItem",
    "deductionAmountPerAdditionalItem",
    "flatRateInsuranceRangeCost",
    "flatShippingRateOption",
    "insuranceOption"
})
public class FlatShippingPreferencesType {

    @XmlElement(name = "AmountPerAdditionalItem", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType amountPerAdditionalItem;
    @XmlElement(name = "DeductionAmountPerAdditionalItem", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType deductionAmountPerAdditionalItem;
    @XmlElement(name = "FlatRateInsuranceRangeCost", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<FlatRateInsuranceRangeCostType> flatRateInsuranceRangeCost;
    @XmlElement(name = "FlatShippingRateOption", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected FlatShippingRateOptionCodeType flatShippingRateOption;
    @XmlElement(name = "InsuranceOption", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected InsuranceOptionCodeType insuranceOption;

    /**
     * Gets the value of the amountPerAdditionalItem property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmountPerAdditionalItem() {
        return amountPerAdditionalItem;
    }

    /**
     * Sets the value of the amountPerAdditionalItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmountPerAdditionalItem(AmountType value) {
        this.amountPerAdditionalItem = value;
    }

    /**
     * Gets the value of the deductionAmountPerAdditionalItem property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDeductionAmountPerAdditionalItem() {
        return deductionAmountPerAdditionalItem;
    }

    /**
     * Sets the value of the deductionAmountPerAdditionalItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDeductionAmountPerAdditionalItem(AmountType value) {
        this.deductionAmountPerAdditionalItem = value;
    }

    /**
     * Gets the value of the flatRateInsuranceRangeCost property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flatRateInsuranceRangeCost property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlatRateInsuranceRangeCost().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlatRateInsuranceRangeCostType }
     * 
     * 
     */
    public List<FlatRateInsuranceRangeCostType> getFlatRateInsuranceRangeCost() {
        if (flatRateInsuranceRangeCost == null) {
            flatRateInsuranceRangeCost = new ArrayList<FlatRateInsuranceRangeCostType>();
        }
        return this.flatRateInsuranceRangeCost;
    }

    /**
     * Gets the value of the flatShippingRateOption property.
     * 
     * @return
     *     possible object is
     *     {@link FlatShippingRateOptionCodeType }
     *     
     */
    public FlatShippingRateOptionCodeType getFlatShippingRateOption() {
        return flatShippingRateOption;
    }

    /**
     * Sets the value of the flatShippingRateOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlatShippingRateOptionCodeType }
     *     
     */
    public void setFlatShippingRateOption(FlatShippingRateOptionCodeType value) {
        this.flatShippingRateOption = value;
    }

    /**
     * Gets the value of the insuranceOption property.
     * 
     * @return
     *     possible object is
     *     {@link InsuranceOptionCodeType }
     *     
     */
    public InsuranceOptionCodeType getInsuranceOption() {
        return insuranceOption;
    }

    /**
     * Sets the value of the insuranceOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceOptionCodeType }
     *     
     */
    public void setInsuranceOption(InsuranceOptionCodeType value) {
        this.insuranceOption = value;
    }

}
