
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Set of Store themes.
 * 			
 * 
 * <p>Java class for StoreThemeArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StoreThemeArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Theme" type="{urn:ebay:apis:eBLBaseComponents}StoreThemeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="GenericColorSchemeArray" type="{urn:ebay:apis:eBLBaseComponents}StoreColorSchemeArrayType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StoreThemeArrayType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "theme",
    "genericColorSchemeArray"
})
public class StoreThemeArrayType {

    @XmlElement(name = "Theme", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<StoreThemeType> theme;
    @XmlElement(name = "GenericColorSchemeArray", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected StoreColorSchemeArrayType genericColorSchemeArray;

    /**
     * Gets the value of the theme property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the theme property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTheme().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StoreThemeType }
     * 
     * 
     */
    public List<StoreThemeType> getTheme() {
        if (theme == null) {
            theme = new ArrayList<StoreThemeType>();
        }
        return this.theme;
    }

    /**
     * Gets the value of the genericColorSchemeArray property.
     * 
     * @return
     *     possible object is
     *     {@link StoreColorSchemeArrayType }
     *     
     */
    public StoreColorSchemeArrayType getGenericColorSchemeArray() {
        return genericColorSchemeArray;
    }

    /**
     * Sets the value of the genericColorSchemeArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoreColorSchemeArrayType }
     *     
     */
    public void setGenericColorSchemeArray(StoreColorSchemeArrayType value) {
        this.genericColorSchemeArray = value;
    }

}
