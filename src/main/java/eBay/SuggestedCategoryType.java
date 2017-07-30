
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 	      Defines a suggested category, returned
 * 	      in response to a search for categories that contain
 * 	      listings with certain keywords in their titles and descriptions.
 * 	    
 * 
 * <p>Java class for SuggestedCategoryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SuggestedCategoryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Category" type="{urn:ebay:apis:eBLBaseComponents}CategoryType" minOccurs="0"/>
 *         &lt;element name="PercentItemFound" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SuggestedCategoryType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "category",
    "percentItemFound"
})
public class SuggestedCategoryType {

    @XmlElement(name = "Category", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected CategoryType category;
    @XmlElement(name = "PercentItemFound", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected int percentItemFound;

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link CategoryType }
     *     
     */
    public CategoryType getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryType }
     *     
     */
    public void setCategory(CategoryType value) {
        this.category = value;
    }

    /**
     * Gets the value of the percentItemFound property.
     * 
     */
    public int getPercentItemFound() {
        return percentItemFound;
    }

    /**
     * Sets the value of the percentItemFound property.
     * 
     */
    public void setPercentItemFound(int value) {
        this.percentItemFound = value;
    }

}
