
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Store color scheme.
 * 			
 * 
 * <p>Java class for StoreColorSchemeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StoreColorSchemeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ColorSchemeID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Color" type="{urn:ebay:apis:eBLBaseComponents}StoreColorType" minOccurs="0"/>
 *         &lt;element name="Font" type="{urn:ebay:apis:eBLBaseComponents}StoreFontType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StoreColorSchemeType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "colorSchemeID",
    "name",
    "color",
    "font"
})
public class StoreColorSchemeType {

    @XmlElement(name = "ColorSchemeID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer colorSchemeID;
    @XmlElement(name = "Name", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String name;
    @XmlElement(name = "Color", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected StoreColorType color;
    @XmlElement(name = "Font", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected StoreFontType font;

    /**
     * Gets the value of the colorSchemeID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getColorSchemeID() {
        return colorSchemeID;
    }

    /**
     * Sets the value of the colorSchemeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setColorSchemeID(Integer value) {
        this.colorSchemeID = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the color property.
     * 
     * @return
     *     possible object is
     *     {@link StoreColorType }
     *     
     */
    public StoreColorType getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoreColorType }
     *     
     */
    public void setColor(StoreColorType value) {
        this.color = value;
    }

    /**
     * Gets the value of the font property.
     * 
     * @return
     *     possible object is
     *     {@link StoreFontType }
     *     
     */
    public StoreFontType getFont() {
        return font;
    }

    /**
     * Sets the value of the font property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoreFontType }
     *     
     */
    public void setFont(StoreFontType value) {
        this.font = value;
    }

}
