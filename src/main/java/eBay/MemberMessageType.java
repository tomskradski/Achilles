
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 			Container for individual message information.
 * 		
 * 
 * <p>Java class for MemberMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MemberMessageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MessageType" type="{urn:ebay:apis:eBLBaseComponents}MessageTypeCodeType" minOccurs="0"/>
 *         &lt;element name="QuestionType" type="{urn:ebay:apis:eBLBaseComponents}QuestionTypeCodeType" minOccurs="0"/>
 *         &lt;element name="EmailCopyToSender" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HideSendersEmailAddress" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DisplayToPublic" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SenderID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SenderEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecipientID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Body" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MessageID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParentMessageID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MessageMedia" type="{urn:ebay:apis:eBLBaseComponents}MessageMediaType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MemberMessageType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "messageType",
    "questionType",
    "emailCopyToSender",
    "hideSendersEmailAddress",
    "displayToPublic",
    "senderID",
    "senderEmail",
    "recipientID",
    "subject",
    "body",
    "messageID",
    "parentMessageID",
    "messageMedia"
})
public class MemberMessageType {

    @XmlElement(name = "MessageType", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected MessageTypeCodeType messageType;
    @XmlElement(name = "QuestionType", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected QuestionTypeCodeType questionType;
    @XmlElement(name = "EmailCopyToSender", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean emailCopyToSender;
    @XmlElement(name = "HideSendersEmailAddress", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean hideSendersEmailAddress;
    @XmlElement(name = "DisplayToPublic", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean displayToPublic;
    @XmlElement(name = "SenderID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String senderID;
    @XmlElement(name = "SenderEmail", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String senderEmail;
    @XmlElement(name = "RecipientID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<String> recipientID;
    @XmlElement(name = "Subject", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String subject;
    @XmlElement(name = "Body", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String body;
    @XmlElement(name = "MessageID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String messageID;
    @XmlElement(name = "ParentMessageID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String parentMessageID;
    @XmlElement(name = "MessageMedia", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<MessageMediaType> messageMedia;

    /**
     * Gets the value of the messageType property.
     * 
     * @return
     *     possible object is
     *     {@link MessageTypeCodeType }
     *     
     */
    public MessageTypeCodeType getMessageType() {
        return messageType;
    }

    /**
     * Sets the value of the messageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageTypeCodeType }
     *     
     */
    public void setMessageType(MessageTypeCodeType value) {
        this.messageType = value;
    }

    /**
     * Gets the value of the questionType property.
     * 
     * @return
     *     possible object is
     *     {@link QuestionTypeCodeType }
     *     
     */
    public QuestionTypeCodeType getQuestionType() {
        return questionType;
    }

    /**
     * Sets the value of the questionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuestionTypeCodeType }
     *     
     */
    public void setQuestionType(QuestionTypeCodeType value) {
        this.questionType = value;
    }

    /**
     * Gets the value of the emailCopyToSender property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmailCopyToSender() {
        return emailCopyToSender;
    }

    /**
     * Sets the value of the emailCopyToSender property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmailCopyToSender(Boolean value) {
        this.emailCopyToSender = value;
    }

    /**
     * Gets the value of the hideSendersEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHideSendersEmailAddress() {
        return hideSendersEmailAddress;
    }

    /**
     * Sets the value of the hideSendersEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHideSendersEmailAddress(Boolean value) {
        this.hideSendersEmailAddress = value;
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

    /**
     * Gets the value of the senderEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderEmail() {
        return senderEmail;
    }

    /**
     * Sets the value of the senderEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderEmail(String value) {
        this.senderEmail = value;
    }

    /**
     * Gets the value of the recipientID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recipientID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecipientID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRecipientID() {
        if (recipientID == null) {
            recipientID = new ArrayList<String>();
        }
        return this.recipientID;
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
     * Gets the value of the body property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBody() {
        return body;
    }

    /**
     * Sets the value of the body property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBody(String value) {
        this.body = value;
    }

    /**
     * Gets the value of the messageID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageID() {
        return messageID;
    }

    /**
     * Sets the value of the messageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageID(String value) {
        this.messageID = value;
    }

    /**
     * Gets the value of the parentMessageID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentMessageID() {
        return parentMessageID;
    }

    /**
     * Sets the value of the parentMessageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentMessageID(String value) {
        this.parentMessageID = value;
    }

    /**
     * Gets the value of the messageMedia property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messageMedia property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessageMedia().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessageMediaType }
     * 
     * 
     */
    public List<MessageMediaType> getMessageMedia() {
        if (messageMedia == null) {
            messageMedia = new ArrayList<MessageMediaType>();
        }
        return this.messageMedia;
    }

}
