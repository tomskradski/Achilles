
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Store color set.
 * 			
 * 
 * <p>Java class for StoreColorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StoreColorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Primary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Secondary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Accent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StoreColorType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "primary",
    "secondary",
    "accent"
})
public class StoreColorType {

    @XmlElement(name = "Primary", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String primary;
    @XmlElement(name = "Secondary", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String secondary;
    @XmlElement(name = "Accent", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String accent;

    /**
     * Gets the value of the primary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimary() {
        return primary;
    }

    /**
     * Sets the value of the primary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimary(String value) {
        this.primary = value;
    }

    /**
     * Gets the value of the secondary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondary() {
        return secondary;
    }

    /**
     * Sets the value of the secondary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondary(String value) {
        this.secondary = value;
    }

    /**
     * Gets the value of the accent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccent() {
        return accent;
    }

    /**
     * Sets the value of the accent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccent(String value) {
        this.accent = value;
    }

}
