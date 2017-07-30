
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This type is deprecated.
 * 			
 * 
 * <p>Java class for ListingTipType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListingTipType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListingTipID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Message" type="{urn:ebay:apis:eBLBaseComponents}ListingTipMessageType" minOccurs="0"/>
 *         &lt;element name="Field" type="{urn:ebay:apis:eBLBaseComponents}ListingTipFieldType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListingTipType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "listingTipID",
    "priority",
    "message",
    "field"
})
public class ListingTipType {

    @XmlElement(name = "ListingTipID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String listingTipID;
    @XmlElement(name = "Priority", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer priority;
    @XmlElement(name = "Message", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected ListingTipMessageType message;
    @XmlElement(name = "Field", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected ListingTipFieldType field;

    /**
     * Gets the value of the listingTipID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListingTipID() {
        return listingTipID;
    }

    /**
     * Sets the value of the listingTipID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListingTipID(String value) {
        this.listingTipID = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPriority(Integer value) {
        this.priority = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link ListingTipMessageType }
     *     
     */
    public ListingTipMessageType getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListingTipMessageType }
     *     
     */
    public void setMessage(ListingTipMessageType value) {
        this.message = value;
    }

    /**
     * Gets the value of the field property.
     * 
     * @return
     *     possible object is
     *     {@link ListingTipFieldType }
     *     
     */
    public ListingTipFieldType getField() {
        return field;
    }

    /**
     * Sets the value of the field property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListingTipFieldType }
     *     
     */
    public void setField(ListingTipFieldType value) {
        this.field = value;
    }

}
