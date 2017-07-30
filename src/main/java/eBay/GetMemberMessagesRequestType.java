
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * 				Retrieves a list of the messages buyers have posted about your
 * 				active item listings.
 * 			
 * 
 * <p>Java class for GetMemberMessagesRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetMemberMessagesRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="ItemID" type="{urn:ebay:apis:eBLBaseComponents}ItemIDType" minOccurs="0"/>
 *         &lt;element name="MailMessageType" type="{urn:ebay:apis:eBLBaseComponents}MessageTypeCodeType" minOccurs="0"/>
 *         &lt;element name="MessageStatus" type="{urn:ebay:apis:eBLBaseComponents}MessageStatusTypeCodeType" minOccurs="0"/>
 *         &lt;element name="DisplayToPublic" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="StartCreationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EndCreationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Pagination" type="{urn:ebay:apis:eBLBaseComponents}PaginationType" minOccurs="0"/>
 *         &lt;element name="MemberMessageID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SenderID" type="{urn:ebay:apis:eBLBaseComponents}UserIDType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetMemberMessagesRequestType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "itemID",
    "mailMessageType",
    "messageStatus",
    "displayToPublic",
    "startCreationTime",
    "endCreationTime",
    "pagination",
    "memberMessageID",
    "senderID"
})
public class GetMemberMessagesRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "ItemID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String itemID;
    @XmlElement(name = "MailMessageType", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected MessageTypeCodeType mailMessageType;
    @XmlElement(name = "MessageStatus", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected MessageStatusTypeCodeType messageStatus;
    @XmlElement(name = "DisplayToPublic", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean displayToPublic;
    @XmlElement(name = "StartCreationTime", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startCreationTime;
    @XmlElement(name = "EndCreationTime", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endCreationTime;
    @XmlElement(name = "Pagination", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected PaginationType pagination;
    @XmlElement(name = "MemberMessageID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String memberMessageID;
    @XmlElement(name = "SenderID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String senderID;

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
     * Gets the value of the mailMessageType property.
     * 
     * @return
     *     possible object is
     *     {@link MessageTypeCodeType }
     *     
     */
    public MessageTypeCodeType getMailMessageType() {
        return mailMessageType;
    }

    /**
     * Sets the value of the mailMessageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageTypeCodeType }
     *     
     */
    public void setMailMessageType(MessageTypeCodeType value) {
        this.mailMessageType = value;
    }

    /**
     * Gets the value of the messageStatus property.
     * 
     * @return
     *     possible object is
     *     {@link MessageStatusTypeCodeType }
     *     
     */
    public MessageStatusTypeCodeType getMessageStatus() {
        return messageStatus;
    }

    /**
     * Sets the value of the messageStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageStatusTypeCodeType }
     *     
     */
    public void setMessageStatus(MessageStatusTypeCodeType value) {
        this.messageStatus = value;
    }

    /**
     * Gets the value of the displayToPublic property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisplayToPublic() {
        return displayToPublic;
    }

    /**
     * Sets the value of the displayToPublic property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisplayToPublic(Boolean value) {
        this.displayToPublic = value;
    }

    /**
     * Gets the value of the startCreationTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartCreationTime() {
        return startCreationTime;
    }

    /**
     * Sets the value of the startCreationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartCreationTime(XMLGregorianCalendar value) {
        this.startCreationTime = value;
    }

    /**
     * Gets the value of the endCreationTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndCreationTime() {
        return endCreationTime;
    }

    /**
     * Sets the value of the endCreationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndCreationTime(XMLGregorianCalendar value) {
        this.endCreationTime = value;
    }

    /**
     * Gets the value of the pagination property.
     * 
     * @return
     *     possible object is
     *     {@link PaginationType }
     *     
     */
    public PaginationType getPagination() {
        return pagination;
    }

    /**
     * Sets the value of the pagination property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaginationType }
     *     
     */
    public void setPagination(PaginationType value) {
        this.pagination = value;
    }

    /**
     * Gets the value of the memberMessageID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberMessageID() {
        return memberMessageID;
    }

    /**
     * Sets the value of the memberMessageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberMessageID(String value) {
        this.memberMessageID = value;
    }

    /**
     * Gets the value of the senderID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderID() {
        return senderID;
    }

    /**
     * Sets the value of the senderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderID(String value) {
        this.senderID = value;
    }

}
