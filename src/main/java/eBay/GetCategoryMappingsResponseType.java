
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Returns a map of old category IDs and corresponding active category IDs defined
 * 				for the site to which the request was sent. Typically used to update an older item
 * 				definition with a new category ID prior to listing the item.
 * 			
 * 
 * <p>Java class for GetCategoryMappingsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCategoryMappingsResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="CategoryMapping" type="{urn:ebay:apis:eBLBaseComponents}CategoryMappingType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CategoryVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCategoryMappingsResponseType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "categoryMapping",
    "categoryVersion"
})
public class GetCategoryMappingsResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "CategoryMapping", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<CategoryMappingType> categoryMapping;
    @XmlElement(name = "CategoryVersion", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String categoryVersion;

    /**
     * Gets the value of the categoryMapping property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the categoryMapping property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategoryMapping().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CategoryMappingType }
     * 
     * 
     */
    public List<CategoryMappingType> getCategoryMapping() {
        if (categoryMapping == null) {
            categoryMapping = new ArrayList<CategoryMappingType>();
        }
        return this.categoryMapping;
    }

    /**
     * Gets the value of the categoryVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryVersion() {
        return categoryVersion;
    }

    /**
     * Sets the value of the categoryVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryVersion(String value) {
        this.categoryVersion = value;
    }

}
