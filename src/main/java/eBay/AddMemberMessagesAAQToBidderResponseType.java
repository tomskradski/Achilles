
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Type defining the <b>AddMemberMessagesAAQToBidderResponseContainer</b> container, which consists of the <b>Ack</b> field (indicating the result of the send message operation) and the <b>CorrelationID</b> field (used to track multiple send message operations performed in one call).
 * 			
 * 
 * <p>Java class for AddMemberMessagesAAQToBidderResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddMemberMessagesAAQToBidderResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="AddMemberMessagesAAQToBidderResponseContainer" type="{urn:ebay:apis:eBLBaseComponents}AddMemberMessagesAAQToBidderResponseContainerType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddMemberMessagesAAQToBidderResponseType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "addMemberMessagesAAQToBidderResponseContainer"
})
public class AddMemberMessagesAAQToBidderResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "AddMemberMessagesAAQToBidderResponseContainer", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<AddMemberMessagesAAQToBidderResponseContainerType> addMemberMessagesAAQToBidderResponseContainer;

    /**
     * Gets the value of the addMemberMessagesAAQToBidderResponseContainer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addMemberMessagesAAQToBidderResponseContainer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddMemberMessagesAAQToBidderResponseContainer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddMemberMessagesAAQToBidderResponseContainerType }
     * 
     * 
     */
    public List<AddMemberMessagesAAQToBidderResponseContainerType> getAddMemberMessagesAAQToBidderResponseContainer() {
        if (addMemberMessagesAAQToBidderResponseContainer == null) {
            addMemberMessagesAAQToBidderResponseContainer = new ArrayList<AddMemberMessagesAAQToBidderResponseContainerType>();
        }
        return this.addMemberMessagesAAQToBidderResponseContainer;
    }

}
