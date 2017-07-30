
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				The base request of the <b>AddMemberMessagesAAQToBidder</b> call, which allows a seller to send up to 10 messages to bidders/potential buyers regarding an active listing. These potential buyers may include those who have made a Best Offer on a listing.
 * 			
 * 
 * <p>Java class for AddMemberMessagesAAQToBidderRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddMemberMessagesAAQToBidderRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="AddMemberMessagesAAQToBidderRequestContainer" type="{urn:ebay:apis:eBLBaseComponents}AddMemberMessagesAAQToBidderRequestContainerType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddMemberMessagesAAQToBidderRequestType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "addMemberMessagesAAQToBidderRequestContainer"
})
public class AddMemberMessagesAAQToBidderRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "AddMemberMessagesAAQToBidderRequestContainer", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<AddMemberMessagesAAQToBidderRequestContainerType> addMemberMessagesAAQToBidderRequestContainer;

    /**
     * Gets the value of the addMemberMessagesAAQToBidderRequestContainer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addMemberMessagesAAQToBidderRequestContainer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddMemberMessagesAAQToBidderRequestContainer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddMemberMessagesAAQToBidderRequestContainerType }
     * 
     * 
     */
    public List<AddMemberMessagesAAQToBidderRequestContainerType> getAddMemberMessagesAAQToBidderRequestContainer() {
        if (addMemberMessagesAAQToBidderRequestContainer == null) {
            addMemberMessagesAAQToBidderRequestContainer = new ArrayList<AddMemberMessagesAAQToBidderRequestContainerType>();
        }
        return this.addMemberMessagesAAQToBidderRequestContainer;
    }

}
