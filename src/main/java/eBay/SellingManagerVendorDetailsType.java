
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes vendor information.
 * 
 * <p>Java class for SellingManagerVendorDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SellingManagerVendorDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VendorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VendorContactInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SellingManagerVendorDetailsType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "vendorName",
    "vendorContactInfo"
})
public class SellingManagerVendorDetailsType {

    @XmlElement(name = "VendorName", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String vendorName;
    @XmlElement(name = "VendorContactInfo", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String vendorContactInfo;

    /**
     * Gets the value of the vendorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorName() {
        return vendorName;
    }

    /**
     * Sets the value of the vendorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorName(String value) {
        this.vendorName = value;
    }

    /**
     * Gets the value of the vendorContactInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorContactInfo() {
        return vendorContactInfo;
    }

    /**
     * Sets the value of the vendorContactInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorContactInfo(String value) {
        this.vendorContactInfo = value;
    }

}
