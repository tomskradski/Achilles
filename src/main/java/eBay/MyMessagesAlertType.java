
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * 				This type is deprecated.
 * 			
 * 
 * <p>Java class for MyMessagesAlertType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MyMessagesAlertType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Sender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecipientUserID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AlertID" type="{urn:ebay:apis:eBLBaseComponents}MyMessagesAlertIDType" minOccurs="0"/>
 *         &lt;element name="ExternalAlertID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResolutionStatus" type="{urn:ebay:apis:eBLBaseComponents}MyMessagesAlertResolutionStatusCode" minOccurs="0"/>
 *         &lt;element name="Read" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CreationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ReceiveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ExpirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ResolutionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastReadDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ItemID" type="{urn:ebay:apis:eBLBaseComponents}ItemIDType" minOccurs="0"/>
 *         &lt;element name="IsTimedResolution" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ActionURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResponseDetails" type="{urn:ebay:apis:eBLBaseComponents}MyMessagesResponseDetailsType" minOccurs="0"/>
 *         &lt;element name="ForwardDetails" type="{urn:ebay:apis:eBLBaseComponents}MyMessagesForwardDetailsType" minOccurs="0"/>
 *         &lt;element name="Folder" type="{urn:ebay:apis:eBLBaseComponents}MyMessagesFolderType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MyMessagesAlertType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "sender",
    "recipientUserID",
    "subject",
    "priority",
    "alertID",
    "externalAlertID",
    "contentType",
    "text",
    "resolutionStatus",
    "read",
    "creationDate",
    "receiveDate",
    "expirationDate",
    "resolutionDate",
    "lastReadDate",
    "itemID",
    "isTimedResolution",
    "actionURL",
    "responseDetails",
    "forwardDetails",
    "folder"
})
public class MyMessagesAlertType {

    @XmlElement(name = "Sender", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String sender;
    @XmlElement(name = "RecipientUserID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String recipientUserID;
    @XmlElement(name = "Subject", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String subject;
    @XmlElement(name = "Priority", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String priority;
    @XmlElement(name = "AlertID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String alertID;
    @XmlElement(name = "ExternalAlertID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String externalAlertID;
    @XmlElement(name = "ContentType", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String contentType;
    @XmlElement(name = "Text", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String text;
    @XmlElement(name = "ResolutionStatus", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected MyMessagesAlertResolutionStatusCode resolutionStatus;
    @XmlElement(name = "Read", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean read;
    @XmlElement(name = "CreationDate", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDate;
    @XmlElement(name = "ReceiveDate", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar receiveDate;
    @XmlElement(name = "ExpirationDate", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirationDate;
    @XmlElement(name = "ResolutionDate", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar resolutionDate;
    @XmlElement(name = "LastReadDate", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastReadDate;
    @XmlElement(name = "ItemID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String itemID;
    @XmlElement(name = "IsTimedResolution", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean isTimedResolution;
    @XmlElement(name = "ActionURL", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String actionURL;
    @XmlElement(name = "ResponseDetails", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected MyMessagesResponseDetailsType responseDetails;
    @XmlElement(name = "ForwardDetails", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected MyMessagesForwardDetailsType forwardDetails;
    @XmlElement(name = "Folder", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected MyMessagesFolderType folder;

    /**
     * Gets the value of the sender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSender() {
        return sender;
    }

    /**
     * Sets the value of the sender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSender(String value) {
        this.sender = value;
    }

    /**
     * Gets the value of the recipientUserID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientUserID() {
        return recipientUserID;
    }

    /**
     * Sets the value of the recipientUserID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientUserID(String value) {
        this.recipientUserID = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriority(String value) {
        this.priority = value;
    }

    /**
     * Gets the value of the alertID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertID() {
        return alertID;
    }

    /**
     * Sets the value of the alertID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertID(String value) {
        this.alertID = value;
    }

    /**
     * Gets the value of the externalAlertID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalAlertID() {
        return externalAlertID;
    }

    /**
     * Sets the value of the externalAlertID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalAlertID(String value) {
        this.externalAlertID = value;
    }

    /**
     * Gets the value of the contentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * Sets the value of the contentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentType(String value) {
        this.contentType = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Gets the value of the resolutionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link MyMessagesAlertResolutionStatusCode }
     *     
     */
    public MyMessagesAlertResolutionStatusCode getResolutionStatus() {
        return resolutionStatus;
    }

    /**
     * Sets the value of the resolutionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link MyMessagesAlertResolutionStatusCode }
     *     
     */
    public void setResolutionStatus(MyMessagesAlertResolutionStatusCode value) {
        this.resolutionStatus = value;
    }

    /**
     * Gets the value of the read property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRead() {
        return read;
    }

    /**
     * Sets the value of the read property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRead(Boolean value) {
        this.read = value;
    }

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
    }

    /**
     * Gets the value of the receiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReceiveDate() {
        return receiveDate;
    }

    /**
     * Sets the value of the receiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReceiveDate(XMLGregorianCalendar value) {
        this.receiveDate = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationDate(XMLGregorianCalendar value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the resolutionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getResolutionDate() {
        return resolutionDate;
    }

    /**
     * Sets the value of the resolutionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setResolutionDate(XMLGregorianCalendar value) {
        this.resolutionDate = value;
    }

    /**
     * Gets the value of the lastReadDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastReadDate() {
        return lastReadDate;
    }

    /**
     * Sets the value of the lastReadDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastReadDate(XMLGregorianCalendar value) {
        this.lastReadDate = value;
    }

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
     * Gets the value of the isTimedResolution property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTimedResolution() {
        return isTimedResolution;
    }

    /**
     * Sets the value of the isTimedResolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTimedResolution(Boolean value) {
        this.isTimedResolution = value;
    }

    /**
     * Gets the value of the actionURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionURL() {
        return actionURL;
    }

    /**
     * Sets the value of the actionURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionURL(String value) {
        this.actionURL = value;
    }

    /**
     * Gets the value of the responseDetails property.
     * 
     * @return
     *     possible object is
     *     {@link MyMessagesResponseDetailsType }
     *     
     */
    public MyMessagesResponseDetailsType getResponseDetails() {
        return responseDetails;
    }

    /**
     * Sets the value of the responseDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link MyMessagesResponseDetailsType }
     *     
     */
    public void setResponseDetails(MyMessagesResponseDetailsType value) {
        this.responseDetails = value;
    }

    /**
     * Gets the value of the forwardDetails property.
     * 
     * @return
     *     possible object is
     *     {@link MyMessagesForwardDetailsType }
     *     
     */
    public MyMessagesForwardDetailsType getForwardDetails() {
        return forwardDetails;
    }

    /**
     * Sets the value of the forwardDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link MyMessagesForwardDetailsType }
     *     
     */
    public void setForwardDetails(MyMessagesForwardDetailsType value) {
        this.forwardDetails = value;
    }

    /**
     * Gets the value of the folder property.
     * 
     * @return
     *     possible object is
     *     {@link MyMessagesFolderType }
     *     
     */
    public MyMessagesFolderType getFolder() {
        return folder;
    }

    /**
     * Sets the value of the folder property.
     * 
     * @param value
     *     allowed object is
     *     {@link MyMessagesFolderType }
     *     
     */
    public void setFolder(MyMessagesFolderType value) {
        this.folder = value;
    }

}
