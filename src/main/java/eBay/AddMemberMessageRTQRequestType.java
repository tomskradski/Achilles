
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				The base request of the <b>AddMemberMessageRTQ</b> call that enables a seller to reply to a question about an active item listing.
 * 			
 * 
 * <p>Java class for AddMemberMessageRTQRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddMemberMessageRTQRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="ItemID" type="{urn:ebay:apis:eBLBaseComponents}ItemIDType" minOccurs="0"/>
 *         &lt;element name="MemberMessage" type="{urn:ebay:apis:eBLBaseComponents}MemberMessageType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddMemberMessageRTQRequestType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "itemID",
    "memberMessage"
})
public class AddMemberMessageRTQRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "ItemID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String itemID;
    @XmlElement(name = "MemberMessage", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected MemberMessageType memberMessage;

    /**
     * Gets the value of the itemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemID() {
        return itemID;
    }

    /**
     * Sets the value of the itemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemID(String value) {
        this.itemID = value;
    }

    /**
     * Gets the value of the memberMessage property.
     * 
     * @return
     *     possible object is
     *     {@link MemberMessageType }
     *     
     */
    public MemberMessageType getMemberMessage() {
        return memberMessage;
    }

    /**
     * Sets the value of the memberMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemberMessageType }
     *     
     */
    public void setMemberMessage(MemberMessageType value) {
        this.memberMessage = value;
    }

}
