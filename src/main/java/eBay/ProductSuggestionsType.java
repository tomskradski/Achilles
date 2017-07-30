
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Provides a list of products recommended by eBay, which match the item information
 * 				provided by the seller.
 * 			
 * 
 * <p>Java class for ProductSuggestionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductSuggestionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductSuggestion" type="{urn:ebay:apis:eBLBaseComponents}ProductSuggestionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductSuggestionsType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "productSuggestion"
})
public class ProductSuggestionsType {

    @XmlElement(name = "ProductSuggestion", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<ProductSuggestionType> productSuggestion;

    /**
     * Gets the value of the productSuggestion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productSuggestion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductSuggestion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductSuggestionType }
     * 
     * 
     */
    public List<ProductSuggestionType> getProductSuggestion() {
        if (productSuggestion == null) {
            productSuggestion = new ArrayList<ProductSuggestionType>();
        }
        return this.productSuggestion;
    }

}
