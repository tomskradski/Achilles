
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 			  This type is used by the <b>BidderNoticePreferences</b> container, which consists of the seller's preference for receiving contact information for unsuccessful bidders in auction listings.
 * 			
 * 
 * <p>Java class for BidderNoticePreferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BidderNoticePreferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UnsuccessfulBidderNoticeIncludeMyItems" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BidderNoticePreferencesType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "unsuccessfulBidderNoticeIncludeMyItems"
})
public class BidderNoticePreferencesType {

    @XmlElement(name = "UnsuccessfulBidderNoticeIncludeMyItems", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean unsuccessfulBidderNoticeIncludeMyItems;

    /**
     * Gets the value of the unsuccessfulBidderNoticeIncludeMyItems property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnsuccessfulBidderNoticeIncludeMyItems() {
        return unsuccessfulBidderNoticeIncludeMyItems;
    }

    /**
     * Sets the value of the unsuccessfulBidderNoticeIncludeMyItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnsuccessfulBidderNoticeIncludeMyItems(Boolean value) {
        this.unsuccessfulBidderNoticeIncludeMyItems = value;
    }

}
