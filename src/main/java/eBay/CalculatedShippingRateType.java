
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Details pertinent to one or more items for which
 * 				calculated shipping (or flat rate shipping using shipping rate tables with
 * 				weight surcharges) has been offered by the seller, such as package
 * 				dimension and weight and packaging/handling costs. Also returned
 * 				with the data for an item's transaction.
 * 				<br><br>
 * 				<span class="tablenote"><strong>Note:</strong>
 * 					The <strong>CalculatedShippingRate</strong> container should only be used to specify values for the <strong>InternationalPackagingHandlingCosts</strong>, <strong>OriginatingPostalCode</strong>, and/or <strong>PackagingHandlingCosts</strong> fields. The rest of the fields in the <strong>CalculatedShippingRate</strong> container should now be specified in the <strong>ShipPackageDetails</strong> container instead.
 * 				</span>
 * 			
 * 
 * <p>Java class for CalculatedShippingRateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CalculatedShippingRateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OriginatingPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MeasurementUnit" type="{urn:ebay:apis:eBLBaseComponents}MeasurementSystemCodeType" minOccurs="0"/>
 *         &lt;element name="PackagingHandlingCosts" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="ShippingIrregular" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="InternationalPackagingHandlingCosts" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalculatedShippingRateType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "originatingPostalCode",
    "measurementUnit",
    "packagingHandlingCosts",
    "shippingIrregular",
    "internationalPackagingHandlingCosts"
})
public class CalculatedShippingRateType {

    @XmlElement(name = "OriginatingPostalCode", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String originatingPostalCode;
    @XmlElement(name = "MeasurementUnit", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected MeasurementSystemCodeType measurementUnit;
    @XmlElement(name = "PackagingHandlingCosts", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType packagingHandlingCosts;
    @XmlElement(name = "ShippingIrregular", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean shippingIrregular;
    @XmlElement(name = "InternationalPackagingHandlingCosts", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType internationalPackagingHandlingCosts;

    /**
     * Gets the value of the originatingPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginatingPostalCode() {
        return originatingPostalCode;
    }

    /**
     * Sets the value of the originatingPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginatingPostalCode(String value) {
        this.originatingPostalCode = value;
    }

    /**
     * Gets the value of the measurementUnit property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementSystemCodeType }
     *     
     */
    public MeasurementSystemCodeType getMeasurementUnit() {
        return measurementUnit;
    }

    /**
     * Sets the value of the measurementUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementSystemCodeType }
     *     
     */
    public void setMeasurementUnit(MeasurementSystemCodeType value) {
        this.measurementUnit = value;
    }

    /**
     * Gets the value of the packagingHandlingCosts property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPackagingHandlingCosts() {
        return packagingHandlingCosts;
    }

    /**
     * Sets the value of the packagingHandlingCosts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPackagingHandlingCosts(AmountType value) {
        this.packagingHandlingCosts = value;
    }

    /**
     * Gets the value of the shippingIrregular property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShippingIrregular() {
        return shippingIrregular;
    }

    /**
     * Sets the value of the shippingIrregular property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShippingIrregular(Boolean value) {
        this.shippingIrregular = value;
    }

    /**
     * Gets the value of the internationalPackagingHandlingCosts property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getInternationalPackagingHandlingCosts() {
        return internationalPackagingHandlingCosts;
    }

    /**
     * Sets the value of the internationalPackagingHandlingCosts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setInternationalPackagingHandlingCosts(AmountType value) {
        this.internationalPackagingHandlingCosts = value;
    }

}
