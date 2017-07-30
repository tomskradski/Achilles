
package eBay;

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
 * <p>Java class for CalculatedShippingPreferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CalculatedShippingPreferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CalculatedShippingAmountForEntireOrder" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="CalculatedShippingChargeOption" type="{urn:ebay:apis:eBLBaseComponents}CalculatedShippingChargeOptionCodeType" minOccurs="0"/>
 *         &lt;element name="CalculatedShippingRateOption" type="{urn:ebay:apis:eBLBaseComponents}CalculatedShippingRateOptionCodeType" minOccurs="0"/>
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
@XmlType(name = "CalculatedShippingPreferencesType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "calculatedShippingAmountForEntireOrder",
    "calculatedShippingChargeOption",
    "calculatedShippingRateOption",
    "insuranceOption"
})
public class CalculatedShippingPreferencesType {

    @XmlElement(name = "CalculatedShippingAmountForEntireOrder", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType calculatedShippingAmountForEntireOrder;
    @XmlElement(name = "CalculatedShippingChargeOption", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected CalculatedShippingChargeOptionCodeType calculatedShippingChargeOption;
    @XmlElement(name = "CalculatedShippingRateOption", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected CalculatedShippingRateOptionCodeType calculatedShippingRateOption;
    @XmlElement(name = "InsuranceOption", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected InsuranceOptionCodeType insuranceOption;

    /**
     * Gets the value of the calculatedShippingAmountForEntireOrder property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCalculatedShippingAmountForEntireOrder() {
        return calculatedShippingAmountForEntireOrder;
    }

    /**
     * Sets the value of the calculatedShippingAmountForEntireOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCalculatedShippingAmountForEntireOrder(AmountType value) {
        this.calculatedShippingAmountForEntireOrder = value;
    }

    /**
     * Gets the value of the calculatedShippingChargeOption property.
     * 
     * @return
     *     possible object is
     *     {@link CalculatedShippingChargeOptionCodeType }
     *     
     */
    public CalculatedShippingChargeOptionCodeType getCalculatedShippingChargeOption() {
        return calculatedShippingChargeOption;
    }

    /**
     * Sets the value of the calculatedShippingChargeOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculatedShippingChargeOptionCodeType }
     *     
     */
    public void setCalculatedShippingChargeOption(CalculatedShippingChargeOptionCodeType value) {
        this.calculatedShippingChargeOption = value;
    }

    /**
     * Gets the value of the calculatedShippingRateOption property.
     * 
     * @return
     *     possible object is
     *     {@link CalculatedShippingRateOptionCodeType }
     *     
     */
    public CalculatedShippingRateOptionCodeType getCalculatedShippingRateOption() {
        return calculatedShippingRateOption;
    }

    /**
     * Sets the value of the calculatedShippingRateOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculatedShippingRateOptionCodeType }
     *     
     */
    public void setCalculatedShippingRateOption(CalculatedShippingRateOptionCodeType value) {
        this.calculatedShippingRateOption = value;
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
