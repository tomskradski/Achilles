
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Contains an array of categories that contain listings with
 * 				specified keywords in their titles or descriptions. The array
 * 				can contain up to 10 categories.
 * 			
 * 
 * <p>Java class for SuggestedCategoryArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SuggestedCategoryArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SuggestedCategory" type="{urn:ebay:apis:eBLBaseComponents}SuggestedCategoryType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SuggestedCategoryArrayType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "suggestedCategory"
})
public class SuggestedCategoryArrayType {

    @XmlElement(name = "SuggestedCategory", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<SuggestedCategoryType> suggestedCategory;

    /**
     * Gets the value of the suggestedCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the suggestedCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSuggestedCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SuggestedCategoryType }
     * 
     * 
     */
    public List<SuggestedCategoryType> getSuggestedCategory() {
        if (suggestedCategory == null) {
            suggestedCategory = new ArrayList<SuggestedCategoryType>();
        }
        return this.suggestedCategory;
    }

}
