
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Enables a user to remove one or more items from their My eBay watch list.
 * 			
 * 
 * <p>Java class for RemoveFromWatchListRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RemoveFromWatchListRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="ItemID" type="{urn:ebay:apis:eBLBaseComponents}ItemIDType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RemoveAllItems" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="VariationKey" type="{urn:ebay:apis:eBLBaseComponents}VariationKeyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemoveFromWatchListRequestType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "itemID",
    "removeAllItems",
    "variationKey"
})
public class RemoveFromWatchListRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "ItemID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<String> itemID;
    @XmlElement(name = "RemoveAllItems", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean removeAllItems;
    @XmlElement(name = "VariationKey", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<VariationKeyType> variationKey;

    /**
     * Gets the value of the itemID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getItemID() {
        if (itemID == null) {
            itemID = new ArrayList<String>();
        }
        return this.itemID;
    }

    /**
     * Gets the value of the removeAllItems property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRemoveAllItems() {
        return removeAllItems;
    }

    /**
     * Sets the value of the removeAllItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRemoveAllItems(Boolean value) {
        this.removeAllItems = value;
    }

    /**
     * Gets the value of the variationKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the variationKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVariationKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VariationKeyType }
     * 
     * 
     */
    public List<VariationKeyType> getVariationKey() {
        if (variationKey == null) {
            variationKey = new ArrayList<VariationKeyType>();
        }
        return this.variationKey;
    }

}
