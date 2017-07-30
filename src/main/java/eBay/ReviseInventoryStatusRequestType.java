
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Enables a seller to change the price and quantity of a currently-
 * 				active, fixed-price listing. Using ReviseInventoryStatus to modify
 * 				data qualifies as revising the listing.
 * 				<br>
 * 				<br>
 * 				Inputs are the item IDs or SKUs of the listings being revised,
 * 				and the price and quantity that are
 * 				being changed for each revision. Only applicable to fixed-price listings.<br>
 * 				<br>
 * 				Changing the price or quantity of a currently-
 * 				active, fixed-price listing does not reset the Best Match performance score.
 * 				For Best Match information related to multi-variation listings, see the Best
 * 				Match information at the following topic:
 * 				<a href="http://pages.ebay.com/sell/variation/">Multi-quantity Fixed Price
 * 				listings with variations</a>.<br>
 * 				<br>
 * 				As with all listing calls, the site you specify in the request URL
 * 				(for SOAP) or the X-EBAY-API-SITEID HTTP header (for XML)
 * 				should match the original listing's <b>Item.Site</b> value.
 * 				In particular, this is a best practice when you submit new and
 * 				revised listings.<br>
 * 				<br>
 * 				<b>For Large Merchant Services users:</b> When you use ReviseInventoryStatus within a Merchant Data file,
 * 				it must be enclosed within two BulkDataExchangeRequest tags.
 * 				After release 637, a namespace is returned in the BulkDataExchangeResponseType
 * 				(top level) of the response. The BulkDataExchange tags are not shown in the call input/output descriptions.
 * 			
 * 
 * <p>Java class for ReviseInventoryStatusRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReviseInventoryStatusRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="InventoryStatus" type="{urn:ebay:apis:eBLBaseComponents}InventoryStatusType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReviseInventoryStatusRequestType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "inventoryStatus"
})
public class ReviseInventoryStatusRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "InventoryStatus", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<InventoryStatusType> inventoryStatus;

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

}
