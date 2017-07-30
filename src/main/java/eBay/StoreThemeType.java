
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Store theme.
 * 			
 * 
 * <p>Java class for StoreThemeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StoreThemeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ThemeID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ColorScheme" type="{urn:ebay:apis:eBLBaseComponents}StoreColorSchemeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StoreThemeType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "themeID",
    "name",
    "colorScheme"
})
public class StoreThemeType {

    @XmlElement(name = "ThemeID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer themeID;
    @XmlElement(name = "Name", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String name;
    @XmlElement(name = "ColorScheme", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected StoreColorSchemeType colorScheme;

    /**
     * Gets the value of the themeID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getThemeID() {
        return themeID;
    }

    /**
     * Sets the value of the themeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setThemeID(Integer value) {
        this.themeID = value;
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
     * Gets the value of the colorScheme property.
     * 
     * @return
     *     possible object is
     *     {@link StoreColorSchemeType }
     *     
     */
    public StoreColorSchemeType getColorScheme() {
        return colorScheme;
    }

    /**
     * Sets the value of the colorScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoreColorSchemeType }
     *     
     */
    public void setColorScheme(StoreColorSchemeType value) {
        this.colorScheme = value;
    }

}
