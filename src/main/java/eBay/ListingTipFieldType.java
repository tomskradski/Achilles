
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This type is deprecated.
 * 			
 * 
 * <p>Java class for ListingTipFieldType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListingTipFieldType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListingTipFieldID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FieldTip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrentFieldText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrentFieldValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListingTipFieldType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "listingTipFieldID",
    "fieldTip",
    "currentFieldText",
    "currentFieldValue"
})
public class ListingTipFieldType {

    @XmlElement(name = "ListingTipFieldID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String listingTipFieldID;
    @XmlElement(name = "FieldTip", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String fieldTip;
    @XmlElement(name = "CurrentFieldText", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String currentFieldText;
    @XmlElement(name = "CurrentFieldValue", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String currentFieldValue;

    /**
     * Gets the value of the listingTipFieldID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListingTipFieldID() {
        return listingTipFieldID;
    }

    /**
     * Sets the value of the listingTipFieldID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListingTipFieldID(String value) {
        this.listingTipFieldID = value;
    }

    /**
     * Gets the value of the fieldTip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldTip() {
        return fieldTip;
    }

    /**
     * Sets the value of the fieldTip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldTip(String value) {
        this.fieldTip = value;
    }

    /**
     * Gets the value of the currentFieldText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentFieldText() {
        return currentFieldText;
    }

    /**
     * Sets the value of the currentFieldText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentFieldText(String value) {
        this.currentFieldText = value;
    }

    /**
     * Gets the value of the currentFieldValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentFieldValue() {
        return currentFieldValue;
    }

    /**
     * Sets the value of the currentFieldValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentFieldValue(String value) {
        this.currentFieldValue = value;
    }

}
