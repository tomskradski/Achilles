
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes a Selling Manager Product
 * 
 * <p>Java class for SellingManagerProductType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SellingManagerProductType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SellingManagerProductDetails" type="{urn:ebay:apis:eBLBaseComponents}SellingManagerProductDetailsType" minOccurs="0"/>
 *         &lt;element name="SellingManagerTemplateDetailsArray" type="{urn:ebay:apis:eBLBaseComponents}SellingManagerTemplateDetailsArrayType" minOccurs="0"/>
 *         &lt;element name="SellingManagerProductInventoryStatus" type="{urn:ebay:apis:eBLBaseComponents}SellingManagerProductInventoryStatusType" minOccurs="0"/>
 *         &lt;element name="SellingManagerProductSpecifics" type="{urn:ebay:apis:eBLBaseComponents}SellingManagerProductSpecificsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SellingManagerProductType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "sellingManagerProductDetails",
    "sellingManagerTemplateDetailsArray",
    "sellingManagerProductInventoryStatus",
    "sellingManagerProductSpecifics"
})
public class SellingManagerProductType {

    @XmlElement(name = "SellingManagerProductDetails", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected SellingManagerProductDetailsType sellingManagerProductDetails;
    @XmlElement(name = "SellingManagerTemplateDetailsArray", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected SellingManagerTemplateDetailsArrayType sellingManagerTemplateDetailsArray;
    @XmlElement(name = "SellingManagerProductInventoryStatus", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected SellingManagerProductInventoryStatusType sellingManagerProductInventoryStatus;
    @XmlElement(name = "SellingManagerProductSpecifics", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected SellingManagerProductSpecificsType sellingManagerProductSpecifics;

    /**
     * Gets the value of the sellingManagerProductDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SellingManagerProductDetailsType }
     *     
     */
    public SellingManagerProductDetailsType getSellingManagerProductDetails() {
        return sellingManagerProductDetails;
    }

    /**
     * Sets the value of the sellingManagerProductDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellingManagerProductDetailsType }
     *     
     */
    public void setSellingManagerProductDetails(SellingManagerProductDetailsType value) {
        this.sellingManagerProductDetails = value;
    }

    /**
     * Gets the value of the sellingManagerTemplateDetailsArray property.
     * 
     * @return
     *     possible object is
     *     {@link SellingManagerTemplateDetailsArrayType }
     *     
     */
    public SellingManagerTemplateDetailsArrayType getSellingManagerTemplateDetailsArray() {
        return sellingManagerTemplateDetailsArray;
    }

    /**
     * Sets the value of the sellingManagerTemplateDetailsArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellingManagerTemplateDetailsArrayType }
     *     
     */
    public void setSellingManagerTemplateDetailsArray(SellingManagerTemplateDetailsArrayType value) {
        this.sellingManagerTemplateDetailsArray = value;
    }

    /**
     * Gets the value of the sellingManagerProductInventoryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SellingManagerProductInventoryStatusType }
     *     
     */
    public SellingManagerProductInventoryStatusType getSellingManagerProductInventoryStatus() {
        return sellingManagerProductInventoryStatus;
    }

    /**
     * Sets the value of the sellingManagerProductInventoryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellingManagerProductInventoryStatusType }
     *     
     */
    public void setSellingManagerProductInventoryStatus(SellingManagerProductInventoryStatusType value) {
        this.sellingManagerProductInventoryStatus = value;
    }

    /**
     * Gets the value of the sellingManagerProductSpecifics property.
     * 
     * @return
     *     possible object is
     *     {@link SellingManagerProductSpecificsType }
     *     
     */
    public SellingManagerProductSpecificsType getSellingManagerProductSpecifics() {
        return sellingManagerProductSpecifics;
    }

    /**
     * Sets the value of the sellingManagerProductSpecifics property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellingManagerProductSpecificsType }
     *     
     */
    public void setSellingManagerProductSpecifics(SellingManagerProductSpecificsType value) {
        this.sellingManagerProductSpecifics = value;
    }

}
