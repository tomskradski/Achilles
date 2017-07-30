
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * 				Contains list of Email log.
 * 			
 * 
 * <p>Java class for SellingManagerEmailLogType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SellingManagerEmailLogType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EmailType" type="{urn:ebay:apis:eBLBaseComponents}SellingManagerEmailTypeCodeType" minOccurs="0"/>
 *         &lt;element name="CustomEmailName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmailState" type="{urn:ebay:apis:eBLBaseComponents}SellingManagerEmailSentStatusCodeType" minOccurs="0"/>
 *         &lt;element name="EventTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SellingManagerEmailLogType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "emailType",
    "customEmailName",
    "emailState",
    "eventTime"
})
public class SellingManagerEmailLogType {

    @XmlElement(name = "EmailType", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected SellingManagerEmailTypeCodeType emailType;
    @XmlElement(name = "CustomEmailName", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String customEmailName;
    @XmlElement(name = "EmailState", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected SellingManagerEmailSentStatusCodeType emailState;
    @XmlElement(name = "EventTime", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eventTime;

    /**
     * Gets the value of the emailType property.
     * 
     * @return
     *     possible object is
     *     {@link SellingManagerEmailTypeCodeType }
     *     
     */
    public SellingManagerEmailTypeCodeType getEmailType() {
        return emailType;
    }

    /**
     * Sets the value of the emailType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellingManagerEmailTypeCodeType }
     *     
     */
    public void setEmailType(SellingManagerEmailTypeCodeType value) {
        this.emailType = value;
    }

    /**
     * Gets the value of the customEmailName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomEmailName() {
        return customEmailName;
    }

    /**
     * Sets the value of the customEmailName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomEmailName(String value) {
        this.customEmailName = value;
    }

    /**
     * Gets the value of the emailState property.
     * 
     * @return
     *     possible object is
     *     {@link SellingManagerEmailSentStatusCodeType }
     *     
     */
    public SellingManagerEmailSentStatusCodeType getEmailState() {
        return emailState;
    }

    /**
     * Sets the value of the emailState property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellingManagerEmailSentStatusCodeType }
     *     
     */
    public void setEmailState(SellingManagerEmailSentStatusCodeType value) {
        this.emailState = value;
    }

    /**
     * Gets the value of the eventTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEventTime() {
        return eventTime;
    }

    /**
     * Sets the value of the eventTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEventTime(XMLGregorianCalendar value) {
        this.eventTime = value;
    }

}
