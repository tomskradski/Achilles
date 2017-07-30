
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Set of eBay Store color schemes.
 * 			
 * 
 * <p>Java class for StoreColorSchemeArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StoreColorSchemeArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ColorScheme" type="{urn:ebay:apis:eBLBaseComponents}StoreColorSchemeType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StoreColorSchemeArrayType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "colorScheme"
})
public class StoreColorSchemeArrayType {

    @XmlElement(name = "ColorScheme", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<StoreColorSchemeType> colorScheme;

    /**
     * Gets the value of the colorScheme property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the colorScheme property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColorScheme().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StoreColorSchemeType }
     * 
     * 
     */
    public List<StoreColorSchemeType> getColorScheme() {
        if (colorScheme == null) {
            colorScheme = new ArrayList<StoreColorSchemeType>();
        }
        return this.colorScheme;
    }

}
