
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 			Packages supported by the enclosing shipping service.
 * 			
 * 
 * <p>Java class for ShippingServicePackageDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShippingServicePackageDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{urn:ebay:apis:eBLBaseComponents}ShippingPackageCodeType" minOccurs="0"/>
 *         &lt;element name="DimensionsRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShippingServicePackageDetailsType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "name",
    "dimensionsRequired"
})
public class ShippingServicePackageDetailsType {

    @XmlElement(name = "Name", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected ShippingPackageCodeType name;
    @XmlElement(name = "DimensionsRequired", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean dimensionsRequired;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingPackageCodeType }
     *     
     */
    public ShippingPackageCodeType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingPackageCodeType }
     *     
     */
    public void setName(ShippingPackageCodeType value) {
        this.name = value;
    }

    /**
     * Gets the value of the dimensionsRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDimensionsRequired() {
        return dimensionsRequired;
    }

    /**
     * Sets the value of the dimensionsRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDimensionsRequired(Boolean value) {
        this.dimensionsRequired = value;
    }

}
