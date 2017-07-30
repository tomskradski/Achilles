
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Contains the IDs for the Listing Designer theme and template (if either are
 * 				used) associated with an item, which can optionally be used to enhance the
 * 				appearance of the item's description. Cannot be used with Photo Display.
 * 			
 * 
 * <p>Java class for ListingDesignerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListingDesignerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LayoutID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OptimalPictureSize" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ThemeID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListingDesignerType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "layoutID",
    "optimalPictureSize",
    "themeID"
})
public class ListingDesignerType {

    @XmlElement(name = "LayoutID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer layoutID;
    @XmlElement(name = "OptimalPictureSize", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean optimalPictureSize;
    @XmlElement(name = "ThemeID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer themeID;

    /**
     * Gets the value of the layoutID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLayoutID() {
        return layoutID;
    }

    /**
     * Sets the value of the layoutID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLayoutID(Integer value) {
        this.layoutID = value;
    }

    /**
     * Gets the value of the optimalPictureSize property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOptimalPictureSize() {
        return optimalPictureSize;
    }

    /**
     * Sets the value of the optimalPictureSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOptimalPictureSize(Boolean value) {
        this.optimalPictureSize = value;
    }

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

}
