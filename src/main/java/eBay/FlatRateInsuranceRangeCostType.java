
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This type is used by the <b>FlatRateInsuranceRangeCost</b> container to specify the shipping insurance cost and price range for domestic and international flat-rate shipping.
 * 			
 * 
 * <p>Java class for FlatRateInsuranceRangeCostType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlatRateInsuranceRangeCostType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FlatRateInsuranceRange" type="{urn:ebay:apis:eBLBaseComponents}FlatRateInsuranceRangeCodeType" minOccurs="0"/>
 *         &lt;element name="InsuranceCost" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlatRateInsuranceRangeCostType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "flatRateInsuranceRange",
    "insuranceCost"
})
public class FlatRateInsuranceRangeCostType {

    @XmlElement(name = "FlatRateInsuranceRange", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected FlatRateInsuranceRangeCodeType flatRateInsuranceRange;
    @XmlElement(name = "InsuranceCost", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType insuranceCost;

    /**
     * Gets the value of the flatRateInsuranceRange property.
     * 
     * @return
     *     possible object is
     *     {@link FlatRateInsuranceRangeCodeType }
     *     
     */
    public FlatRateInsuranceRangeCodeType getFlatRateInsuranceRange() {
        return flatRateInsuranceRange;
    }

    /**
     * Sets the value of the flatRateInsuranceRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlatRateInsuranceRangeCodeType }
     *     
     */
    public void setFlatRateInsuranceRange(FlatRateInsuranceRangeCodeType value) {
        this.flatRateInsuranceRange = value;
    }

    /**
     * Gets the value of the insuranceCost property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getInsuranceCost() {
        return insuranceCost;
    }

    /**
     * Sets the value of the insuranceCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setInsuranceCost(AmountType value) {
        this.insuranceCost = value;
    }

}
