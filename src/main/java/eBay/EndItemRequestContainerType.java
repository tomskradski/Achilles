
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 			A container to specify a single eBay item to end.
 * 			
 * 
 * <p>Java class for EndItemRequestContainerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EndItemRequestContainerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ItemID" type="{urn:ebay:apis:eBLBaseComponents}ItemIDType" minOccurs="0"/>
 *         &lt;element name="EndingReason" type="{urn:ebay:apis:eBLBaseComponents}EndReasonCodeType" minOccurs="0"/>
 *         &lt;element name="MessageID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SellerInventoryID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EndItemRequestContainerType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "itemID",
    "endingReason",
    "messageID",
    "sellerInventoryID"
})
public class EndItemRequestContainerType {

    @XmlElement(name = "ItemID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String itemID;
    @XmlElement(name = "EndingReason", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected EndReasonCodeType endingReason;
    @XmlElement(name = "MessageID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String messageID;
    @XmlElement(name = "SellerInventoryID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String sellerInventoryID;

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
     * Gets the value of the endingReason property.
     * 
     * @return
     *     possible object is
     *     {@link EndReasonCodeType }
     *     
     */
    public EndReasonCodeType getEndingReason() {
        return endingReason;
    }

    /**
     * Sets the value of the endingReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndReasonCodeType }
     *     
     */
    public void setEndingReason(EndReasonCodeType value) {
        this.endingReason = value;
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
     * Gets the value of the sellerInventoryID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerInventoryID() {
        return sellerInventoryID;
    }

    /**
     * Sets the value of the sellerInventoryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerInventoryID(String value) {
        this.sellerInventoryID = value;
    }

}
