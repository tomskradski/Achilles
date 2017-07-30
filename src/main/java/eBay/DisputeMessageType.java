
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * 				Contains a message posted to a dispute. The message can be posted
 * 				by the buyer, the seller, or an eBay representative.
 * 				<br/><br/>
 * 				<span class="tablenote"><strong>Note:</strong>
 * 					These are not eBay money back guarantee disputes.
 * 				</span>
 * 			
 * 
 * <p>Java class for DisputeMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DisputeMessageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MessageID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MessageSource" type="{urn:ebay:apis:eBLBaseComponents}DisputeMessageSourceCodeType" minOccurs="0"/>
 *         &lt;element name="MessageCreationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="MessageText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisputeMessageType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "messageID",
    "messageSource",
    "messageCreationTime",
    "messageText"
})
public class DisputeMessageType {

    @XmlElement(name = "MessageID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer messageID;
    @XmlElement(name = "MessageSource", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected DisputeMessageSourceCodeType messageSource;
    @XmlElement(name = "MessageCreationTime", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar messageCreationTime;
    @XmlElement(name = "MessageText", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String messageText;

    /**
     * Gets the value of the messageID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMessageID() {
        return messageID;
    }

    /**
     * Sets the value of the messageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMessageID(Integer value) {
        this.messageID = value;
    }

    /**
     * Gets the value of the messageSource property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeMessageSourceCodeType }
     *     
     */
    public DisputeMessageSourceCodeType getMessageSource() {
        return messageSource;
    }

    /**
     * Sets the value of the messageSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeMessageSourceCodeType }
     *     
     */
    public void setMessageSource(DisputeMessageSourceCodeType value) {
        this.messageSource = value;
    }

    /**
     * Gets the value of the messageCreationTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMessageCreationTime() {
        return messageCreationTime;
    }

    /**
     * Sets the value of the messageCreationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMessageCreationTime(XMLGregorianCalendar value) {
        this.messageCreationTime = value;
    }

    /**
     * Gets the value of the messageText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageText() {
        return messageText;
    }

    /**
     * Sets the value of the messageText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageText(String value) {
        this.messageText = value;
    }

}
