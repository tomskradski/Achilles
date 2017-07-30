
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 	  		Set of custom categories for the Store.
 * 	  	
 * 
 * <p>Java class for StoreCustomCategoryArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StoreCustomCategoryArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomCategory" type="{urn:ebay:apis:eBLBaseComponents}StoreCustomCategoryType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StoreCustomCategoryArrayType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "customCategory"
})
public class StoreCustomCategoryArrayType {

    @XmlElement(name = "CustomCategory", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<StoreCustomCategoryType> customCategory;

    /**
     * Gets the value of the customCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StoreCustomCategoryType }
     * 
     * 
     */
    public List<StoreCustomCategoryType> getCustomCategory() {
        if (customCategory == null) {
            customCategory = new ArrayList<StoreCustomCategoryType>();
        }
        return this.customCategory;
    }

}
