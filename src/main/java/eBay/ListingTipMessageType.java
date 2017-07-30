
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
 * <p>Java class for ListingTipMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListingTipMessageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListingTipMessageID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShortMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LongMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HelpURLPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListingTipMessageType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "listingTipMessageID",
    "shortMessage",
    "longMessage",
    "helpURLPath"
})
public class ListingTipMessageType {

    @XmlElement(name = "ListingTipMessageID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String listingTipMessageID;
    @XmlElement(name = "ShortMessage", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String shortMessage;
    @XmlElement(name = "LongMessage", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String longMessage;
    @XmlElement(name = "HelpURLPath", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String helpURLPath;

    /**
     * Gets the value of the listingTipMessageID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListingTipMessageID() {
        return listingTipMessageID;
    }

    /**
     * Sets the value of the listingTipMessageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListingTipMessageID(String value) {
        this.listingTipMessageID = value;
    }

    /**
     * Gets the value of the shortMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortMessage() {
        return shortMessage;
    }

    /**
     * Sets the value of the shortMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortMessage(String value) {
        this.shortMessage = value;
    }

    /**
     * Gets the value of the longMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongMessage() {
        return longMessage;
    }

    /**
     * Sets the value of the longMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongMessage(String value) {
        this.longMessage = value;
    }

    /**
     * Gets the value of the helpURLPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHelpURLPath() {
        return helpURLPath;
    }

    /**
     * Sets the value of the helpURLPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHelpURLPath(String value) {
        this.helpURLPath = value;
    }

}
