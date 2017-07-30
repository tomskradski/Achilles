
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Container of ItemTransactionIDs.
 * 			
 * 
 * <p>Java class for ItemTransactionIDArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemTransactionIDArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ItemTransactionID" type="{urn:ebay:apis:eBLBaseComponents}ItemTransactionIDType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemTransactionIDArrayType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "itemTransactionID"
})
public class ItemTransactionIDArrayType {

    @XmlElement(name = "ItemTransactionID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<ItemTransactionIDType> itemTransactionID;

    /**
     * Gets the value of the itemTransactionID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemTransactionID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemTransactionID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemTransactionIDType }
     * 
     * 
     */
    public List<ItemTransactionIDType> getItemTransactionID() {
        if (itemTransactionID == null) {
            itemTransactionID = new ArrayList<ItemTransactionIDType>();
        }
        return this.itemTransactionID;
    }

}
