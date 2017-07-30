
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				A collection of details about the best offers received for a specific item. Empty if there are no best offers. Includes the buyer and seller messages only if
 * 				the ReturnAll detail level is used.
 * 			
 * 
 * <p>Java class for ItemBestOffersArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemBestOffersArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ItemBestOffers" type="{urn:ebay:apis:eBLBaseComponents}ItemBestOffersType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemBestOffersArrayType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "itemBestOffers"
})
public class ItemBestOffersArrayType {

    @XmlElement(name = "ItemBestOffers", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<ItemBestOffersType> itemBestOffers;

    /**
     * Gets the value of the itemBestOffers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemBestOffers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemBestOffers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemBestOffersType }
     * 
     * 
     */
    public List<ItemBestOffersType> getItemBestOffers() {
        if (itemBestOffers == null) {
            itemBestOffers = new ArrayList<ItemBestOffersType>();
        }
        return this.itemBestOffers;
    }

}
