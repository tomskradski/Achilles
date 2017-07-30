
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				An array of promotional sales.
 * 			
 * 
 * <p>Java class for PromotionalSaleArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PromotionalSaleArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PromotionalSale" type="{urn:ebay:apis:eBLBaseComponents}PromotionalSaleType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromotionalSaleArrayType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "promotionalSale"
})
public class PromotionalSaleArrayType {

    @XmlElement(name = "PromotionalSale", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<PromotionalSaleType> promotionalSale;

    /**
     * Gets the value of the promotionalSale property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the promotionalSale property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPromotionalSale().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PromotionalSaleType }
     * 
     * 
     */
    public List<PromotionalSaleType> getPromotionalSale() {
        if (promotionalSale == null) {
            promotionalSale = new ArrayList<PromotionalSaleType>();
        }
        return this.promotionalSale;
    }

}
