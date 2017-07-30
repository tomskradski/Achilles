
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Defines from one to five items and lists them on a specified eBay site.
 * 			
 * 
 * <p>Java class for AddItemsRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddItemsRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="AddItemRequestContainer" type="{urn:ebay:apis:eBLBaseComponents}AddItemRequestContainerType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddItemsRequestType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "addItemRequestContainer"
})
public class AddItemsRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "AddItemRequestContainer", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<AddItemRequestContainerType> addItemRequestContainer;

    /**
     * Gets the value of the addItemRequestContainer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addItemRequestContainer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddItemRequestContainer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddItemRequestContainerType }
     * 
     * 
     */
    public List<AddItemRequestContainerType> getAddItemRequestContainer() {
        if (addItemRequestContainer == null) {
            addItemRequestContainer = new ArrayList<AddItemRequestContainerType>();
        }
        return this.addItemRequestContainer;
    }

}
