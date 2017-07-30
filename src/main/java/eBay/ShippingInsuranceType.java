
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
 * 				Details about insurance for <a href="http://developer.ebay.com/DevZone/guides/ebayfeatures/Development/Listing-AnItem.html#CombinedInvoice">Combined Invoice</a> 
 *       orders.
 * 			
 * 
 * <p>Java class for ShippingInsuranceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShippingInsuranceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InsuranceOption" type="{urn:ebay:apis:eBLBaseComponents}InsuranceOptionCodeType" minOccurs="0"/>
 *         &lt;element name="FlatRateInsuranceRangeCost" type="{urn:ebay:apis:eBLBaseComponents}FlatRateInsuranceRangeCostType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShippingInsuranceType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "insuranceOption",
    "flatRateInsuranceRangeCost"
})
public class ShippingInsuranceType {

    @XmlElement(name = "InsuranceOption", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected InsuranceOptionCodeType insuranceOption;
    @XmlElement(name = "FlatRateInsuranceRangeCost", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<FlatRateInsuranceRangeCostType> flatRateInsuranceRangeCost;

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

}
