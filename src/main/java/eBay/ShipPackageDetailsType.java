
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
 * 				dimension and weight and packaging/handling costs.
 * 				<br/><br/>
 * 				Also returned with the data for an item's transaction.
 * 				<br/><br/>
 * 				<span class="tablenote"><strong>Note:</strong>
 * 				The <strong>ShippingPackageDetails</strong> container should now be used instead of the <strong>CalculatedShippingRate</strong> container to specify values for the <strong>MeasurementUnit</strong>, <strong>PackageDepth</strong>,  <strong>PackageWidth</strong>, <strong>PackageLength</strong>, <strong>ShippingIrregular</strong>, <strong>ShippingPackage</strong>, <strong>WeightMajor</strong>, and/or <strong>WeightMinor</strong> fields. The <strong>CalculatedShippingRate</strong> container should only be used to specify values for the <strong>InternationalPackagingHandlingCosts</strong>, <strong>OriginatingPostalCode</strong>, and/or <strong>PackagingHandlingCosts</strong> fields.
 * 				</span>
 * 			
 * 
 * <p>Java class for ShipPackageDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipPackageDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MeasurementUnit" type="{urn:ebay:apis:eBLBaseComponents}MeasurementSystemCodeType" minOccurs="0"/>
 *         &lt;element name="PackageDepth" type="{urn:ebay:apis:eBLBaseComponents}MeasureType" minOccurs="0"/>
 *         &lt;element name="PackageLength" type="{urn:ebay:apis:eBLBaseComponents}MeasureType" minOccurs="0"/>
 *         &lt;element name="PackageWidth" type="{urn:ebay:apis:eBLBaseComponents}MeasureType" minOccurs="0"/>
 *         &lt;element name="ShippingIrregular" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ShippingPackage" type="{urn:ebay:apis:eBLBaseComponents}ShippingPackageCodeType" minOccurs="0"/>
 *         &lt;element name="WeightMajor" type="{urn:ebay:apis:eBLBaseComponents}MeasureType" minOccurs="0"/>
 *         &lt;element name="WeightMinor" type="{urn:ebay:apis:eBLBaseComponents}MeasureType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipPackageDetailsType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "measurementUnit",
    "packageDepth",
    "packageLength",
    "packageWidth",
    "shippingIrregular",
    "shippingPackage",
    "weightMajor",
    "weightMinor"
})
public class ShipPackageDetailsType {

    @XmlElement(name = "MeasurementUnit", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected MeasurementSystemCodeType measurementUnit;
    @XmlElement(name = "PackageDepth", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected MeasureType packageDepth;
    @XmlElement(name = "PackageLength", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected MeasureType packageLength;
    @XmlElement(name = "PackageWidth", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected MeasureType packageWidth;
    @XmlElement(name = "ShippingIrregular", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean shippingIrregular;
    @XmlElement(name = "ShippingPackage", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected ShippingPackageCodeType shippingPackage;
    @XmlElement(name = "WeightMajor", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected MeasureType weightMajor;
    @XmlElement(name = "WeightMinor", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected MeasureType weightMinor;

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
     * Gets the value of the packageDepth property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getPackageDepth() {
        return packageDepth;
    }

    /**
     * Sets the value of the packageDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setPackageDepth(MeasureType value) {
        this.packageDepth = value;
    }

    /**
     * Gets the value of the packageLength property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getPackageLength() {
        return packageLength;
    }

    /**
     * Sets the value of the packageLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setPackageLength(MeasureType value) {
        this.packageLength = value;
    }

    /**
     * Gets the value of the packageWidth property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getPackageWidth() {
        return packageWidth;
    }

    /**
     * Sets the value of the packageWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setPackageWidth(MeasureType value) {
        this.packageWidth = value;
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
     * Gets the value of the shippingPackage property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingPackageCodeType }
     *     
     */
    public ShippingPackageCodeType getShippingPackage() {
        return shippingPackage;
    }

    /**
     * Sets the value of the shippingPackage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingPackageCodeType }
     *     
     */
    public void setShippingPackage(ShippingPackageCodeType value) {
        this.shippingPackage = value;
    }

    /**
     * Gets the value of the weightMajor property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getWeightMajor() {
        return weightMajor;
    }

    /**
     * Sets the value of the weightMajor property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setWeightMajor(MeasureType value) {
        this.weightMajor = value;
    }

    /**
     * Gets the value of the weightMinor property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getWeightMinor() {
        return weightMinor;
    }

    /**
     * Sets the value of the weightMinor property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setWeightMinor(MeasureType value) {
        this.weightMinor = value;
    }

}
