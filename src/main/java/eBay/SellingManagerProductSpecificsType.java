
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes a Selling Manager Template
 * 			
 * 
 * <p>Java class for SellingManagerProductSpecificsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SellingManagerProductSpecificsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PrimaryCategoryID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Variations" type="{urn:ebay:apis:eBLBaseComponents}VariationsType" minOccurs="0"/>
 *         &lt;element name="ItemSpecifics" type="{urn:ebay:apis:eBLBaseComponents}NameValueListArrayType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SellingManagerProductSpecificsType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "primaryCategoryID",
    "variations",
    "itemSpecifics"
})
public class SellingManagerProductSpecificsType {

    @XmlElement(name = "PrimaryCategoryID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String primaryCategoryID;
    @XmlElement(name = "Variations", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected VariationsType variations;
    @XmlElement(name = "ItemSpecifics", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected NameValueListArrayType itemSpecifics;

    /**
     * Gets the value of the primaryCategoryID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryCategoryID() {
        return primaryCategoryID;
    }

    /**
     * Sets the value of the primaryCategoryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryCategoryID(String value) {
        this.primaryCategoryID = value;
    }

    /**
     * Gets the value of the variations property.
     * 
     * @return
     *     possible object is
     *     {@link VariationsType }
     *     
     */
    public VariationsType getVariations() {
        return variations;
    }

    /**
     * Sets the value of the variations property.
     * 
     * @param value
     *     allowed object is
     *     {@link VariationsType }
     *     
     */
    public void setVariations(VariationsType value) {
        this.variations = value;
    }

    /**
     * Gets the value of the itemSpecifics property.
     * 
     * @return
     *     possible object is
     *     {@link NameValueListArrayType }
     *     
     */
    public NameValueListArrayType getItemSpecifics() {
        return itemSpecifics;
    }

    /**
     * Sets the value of the itemSpecifics property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameValueListArrayType }
     *     
     */
    public void setItemSpecifics(NameValueListArrayType value) {
        this.itemSpecifics = value;
    }

}
