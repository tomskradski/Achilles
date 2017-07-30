
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * 
 * 				This type is deprecated.
 * 			
 * 
 * <p>Java class for PromotedItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PromotedItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ItemID" type="{urn:ebay:apis:eBLBaseComponents}ItemIDType" minOccurs="0"/>
 *         &lt;element name="PictureURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Position" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SelectionType" type="{urn:ebay:apis:eBLBaseComponents}PromotionItemSelectionCodeType" minOccurs="0"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ListingType" type="{urn:ebay:apis:eBLBaseComponents}ListingTypeCodeType" minOccurs="0"/>
 *         &lt;element name="PromotionDetails" type="{urn:ebay:apis:eBLBaseComponents}PromotionDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TimeLeft" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromotedItemType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "itemID",
    "pictureURL",
    "position",
    "selectionType",
    "title",
    "listingType",
    "promotionDetails",
    "timeLeft"
})
public class PromotedItemType {

    @XmlElement(name = "ItemID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String itemID;
    @XmlElement(name = "PictureURL", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String pictureURL;
    @XmlElement(name = "Position", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer position;
    @XmlElement(name = "SelectionType", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected PromotionItemSelectionCodeType selectionType;
    @XmlElement(name = "Title", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String title;
    @XmlElement(name = "ListingType", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected ListingTypeCodeType listingType;
    @XmlElement(name = "PromotionDetails", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<PromotionDetailsType> promotionDetails;
    @XmlElement(name = "TimeLeft", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Duration timeLeft;

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
     * Gets the value of the pictureURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPictureURL() {
        return pictureURL;
    }

    /**
     * Sets the value of the pictureURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPictureURL(String value) {
        this.pictureURL = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPosition(Integer value) {
        this.position = value;
    }

    /**
     * Gets the value of the selectionType property.
     * 
     * @return
     *     possible object is
     *     {@link PromotionItemSelectionCodeType }
     *     
     */
    public PromotionItemSelectionCodeType getSelectionType() {
        return selectionType;
    }

    /**
     * Sets the value of the selectionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionItemSelectionCodeType }
     *     
     */
    public void setSelectionType(PromotionItemSelectionCodeType value) {
        this.selectionType = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the listingType property.
     * 
     * @return
     *     possible object is
     *     {@link ListingTypeCodeType }
     *     
     */
    public ListingTypeCodeType getListingType() {
        return listingType;
    }

    /**
     * Sets the value of the listingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListingTypeCodeType }
     *     
     */
    public void setListingType(ListingTypeCodeType value) {
        this.listingType = value;
    }

    /**
     * Gets the value of the promotionDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the promotionDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPromotionDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PromotionDetailsType }
     * 
     * 
     */
    public List<PromotionDetailsType> getPromotionDetails() {
        if (promotionDetails == null) {
            promotionDetails = new ArrayList<PromotionDetailsType>();
        }
        return this.promotionDetails;
    }

    /**
     * Gets the value of the timeLeft property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTimeLeft() {
        return timeLeft;
    }

    /**
     * Sets the value of the timeLeft property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTimeLeft(Duration value) {
        this.timeLeft = value;
    }

}
