
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				The response of the <b>AddItems</b> call. The response includes the Item IDs of the newly created listings, the eBay category each item is listed under, the seller-defined SKUs of the items (if any), the listing recommendations for each item (if applicable), the start and end time of each listing, and the estimated fees that each listing will incur.
 * 			
 * 
 * <p>Java class for AddItemsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddItemsResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="AddItemResponseContainer" type="{urn:ebay:apis:eBLBaseComponents}AddItemResponseContainerType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddItemsResponseType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "addItemResponseContainer"
})
public class AddItemsResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "AddItemResponseContainer", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<AddItemResponseContainerType> addItemResponseContainer;

    /**
     * Gets the value of the addItemResponseContainer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addItemResponseContainer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddItemResponseContainer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddItemResponseContainerType }
     * 
     * 
     */
    public List<AddItemResponseContainerType> getAddItemResponseContainer() {
        if (addItemResponseContainer == null) {
            addItemResponseContainer = new ArrayList<AddItemResponseContainerType>();
        }
        return this.addItemResponseContainer;
    }

}
