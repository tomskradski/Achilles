
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * 				Type used by the <b>CancelDetail</b> container, which consists of details related to an eBay order that has been cancelled or is in the process of possibly being cancelled.
 * 			
 * 
 * <p>Java class for CancelDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CancelDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CancelReason" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="CancelReasonDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CancelIntiator" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="CancelIntiationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CancelCompleteDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelDetailType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "cancelReason",
    "cancelReasonDetails",
    "cancelIntiator",
    "cancelIntiationDate",
    "cancelCompleteDate"
})
public class CancelDetailType {

    @XmlElement(name = "CancelReason", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String cancelReason;
    @XmlElement(name = "CancelReasonDetails", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String cancelReasonDetails;
    @XmlElement(name = "CancelIntiator", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String cancelIntiator;
    @XmlElement(name = "CancelIntiationDate", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cancelIntiationDate;
    @XmlElement(name = "CancelCompleteDate", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cancelCompleteDate;

    /**
     * Gets the value of the cancelReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelReason() {
        return cancelReason;
    }

    /**
     * Sets the value of the cancelReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelReason(String value) {
        this.cancelReason = value;
    }

    /**
     * Gets the value of the cancelReasonDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelReasonDetails() {
        return cancelReasonDetails;
    }

    /**
     * Sets the value of the cancelReasonDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelReasonDetails(String value) {
        this.cancelReasonDetails = value;
    }

    /**
     * Gets the value of the cancelIntiator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelIntiator() {
        return cancelIntiator;
    }

    /**
     * Sets the value of the cancelIntiator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelIntiator(String value) {
        this.cancelIntiator = value;
    }

    /**
     * Gets the value of the cancelIntiationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCancelIntiationDate() {
        return cancelIntiationDate;
    }

    /**
     * Sets the value of the cancelIntiationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCancelIntiationDate(XMLGregorianCalendar value) {
        this.cancelIntiationDate = value;
    }

    /**
     * Gets the value of the cancelCompleteDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCancelCompleteDate() {
        return cancelCompleteDate;
    }

    /**
     * Sets the value of the cancelCompleteDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCancelCompleteDate(XMLGregorianCalendar value) {
        this.cancelCompleteDate = value;
    }

}
