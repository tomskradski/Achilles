
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Returns the Item ID or SKU with changed Price and Quantity for the revised listing.
 * 			
 * 
 * <p>Java class for ReviseInventoryStatusResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReviseInventoryStatusResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="InventoryStatus" type="{urn:ebay:apis:eBLBaseComponents}InventoryStatusType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Fees" type="{urn:ebay:apis:eBLBaseComponents}InventoryFeesType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReviseInventoryStatusResponseType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "inventoryStatus",
    "fees"
})
public class ReviseInventoryStatusResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "InventoryStatus", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<InventoryStatusType> inventoryStatus;
    @XmlElement(name = "Fees", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<InventoryFeesType> fees;

    /**
     * Gets the value of the inventoryStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inventoryStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInventoryStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InventoryStatusType }
     * 
     * 
     */
    public List<InventoryStatusType> getInventoryStatus() {
        if (inventoryStatus == null) {
            inventoryStatus = new ArrayList<InventoryStatusType>();
        }
        return this.inventoryStatus;
    }

    /**
     * Gets the value of the fees property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fees property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFees().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InventoryFeesType }
     * 
     * 
     */
    public List<InventoryFeesType> getFees() {
        if (fees == null) {
            fees = new ArrayList<InventoryFeesType>();
        }
        return this.fees;
    }

}
