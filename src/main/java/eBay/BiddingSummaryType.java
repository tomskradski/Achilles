
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Type used by the <b>BiddingSummary</b> container, which is returned in the <b>GetAllBidders</b> response if the <b>IncludeBiddingSummary</b> boolean field is included and set to <code>true</code> in the call request. The <b>BiddingSummary</b> container consists of bidding history information for a specific bidder (specified in the <b>User.UserID</b> field).
 * 			
 * 
 * <p>Java class for BiddingSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BiddingSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SummaryDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TotalBids" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BidActivityWithSeller" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BidsToUniqueSellers" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BidsToUniqueCategories" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BidRetractions" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ItemBidDetails" type="{urn:ebay:apis:eBLBaseComponents}ItemBidDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BiddingSummaryType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "summaryDays",
    "totalBids",
    "bidActivityWithSeller",
    "bidsToUniqueSellers",
    "bidsToUniqueCategories",
    "bidRetractions",
    "itemBidDetails"
})
public class BiddingSummaryType {

    @XmlElement(name = "SummaryDays", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer summaryDays;
    @XmlElement(name = "TotalBids", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer totalBids;
    @XmlElement(name = "BidActivityWithSeller", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer bidActivityWithSeller;
    @XmlElement(name = "BidsToUniqueSellers", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer bidsToUniqueSellers;
    @XmlElement(name = "BidsToUniqueCategories", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer bidsToUniqueCategories;
    @XmlElement(name = "BidRetractions", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer bidRetractions;
    @XmlElement(name = "ItemBidDetails", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<ItemBidDetailsType> itemBidDetails;

    /**
     * Gets the value of the summaryDays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSummaryDays() {
        return summaryDays;
    }

    /**
     * Sets the value of the summaryDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSummaryDays(Integer value) {
        this.summaryDays = value;
    }

    /**
     * Gets the value of the totalBids property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalBids() {
        return totalBids;
    }

    /**
     * Sets the value of the totalBids property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalBids(Integer value) {
        this.totalBids = value;
    }

    /**
     * Gets the value of the bidActivityWithSeller property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBidActivityWithSeller() {
        return bidActivityWithSeller;
    }

    /**
     * Sets the value of the bidActivityWithSeller property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBidActivityWithSeller(Integer value) {
        this.bidActivityWithSeller = value;
    }

    /**
     * Gets the value of the bidsToUniqueSellers property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBidsToUniqueSellers() {
        return bidsToUniqueSellers;
    }

    /**
     * Sets the value of the bidsToUniqueSellers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBidsToUniqueSellers(Integer value) {
        this.bidsToUniqueSellers = value;
    }

    /**
     * Gets the value of the bidsToUniqueCategories property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBidsToUniqueCategories() {
        return bidsToUniqueCategories;
    }

    /**
     * Sets the value of the bidsToUniqueCategories property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBidsToUniqueCategories(Integer value) {
        this.bidsToUniqueCategories = value;
    }

    /**
     * Gets the value of the bidRetractions property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBidRetractions() {
        return bidRetractions;
    }

    /**
     * Sets the value of the bidRetractions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBidRetractions(Integer value) {
        this.bidRetractions = value;
    }

    /**
     * Gets the value of the itemBidDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemBidDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemBidDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemBidDetailsType }
     * 
     * 
     */
    public List<ItemBidDetailsType> getItemBidDetails() {
        if (itemBidDetails == null) {
            itemBidDetails = new ArrayList<ItemBidDetailsType>();
        }
        return this.itemBidDetails;
    }

}
