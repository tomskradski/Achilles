
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Returns summary and detail information about items the user is selling,
 * 				items scheduled to sell, currently listed, sold, and closed but not sold.
 * 			
 * 
 * <p>Java class for GetMyeBaySellingResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetMyeBaySellingResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="SellingSummary" type="{urn:ebay:apis:eBLBaseComponents}SellingSummaryType" minOccurs="0"/>
 *         &lt;element name="ScheduledList" type="{urn:ebay:apis:eBLBaseComponents}PaginatedItemArrayType" minOccurs="0"/>
 *         &lt;element name="ActiveList" type="{urn:ebay:apis:eBLBaseComponents}PaginatedItemArrayType" minOccurs="0"/>
 *         &lt;element name="SoldList" type="{urn:ebay:apis:eBLBaseComponents}PaginatedOrderTransactionArrayType" minOccurs="0"/>
 *         &lt;element name="UnsoldList" type="{urn:ebay:apis:eBLBaseComponents}PaginatedItemArrayType" minOccurs="0"/>
 *         &lt;element name="Summary" type="{urn:ebay:apis:eBLBaseComponents}MyeBaySellingSummaryType" minOccurs="0"/>
 *         &lt;element name="BidList" type="{urn:ebay:apis:eBLBaseComponents}PaginatedItemArrayType" minOccurs="0"/>
 *         &lt;element name="DeletedFromSoldList" type="{urn:ebay:apis:eBLBaseComponents}PaginatedOrderTransactionArrayType" minOccurs="0"/>
 *         &lt;element name="DeletedFromUnsoldList" type="{urn:ebay:apis:eBLBaseComponents}PaginatedItemArrayType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetMyeBaySellingResponseType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "sellingSummary",
    "scheduledList",
    "activeList",
    "soldList",
    "unsoldList",
    "summary",
    "bidList",
    "deletedFromSoldList",
    "deletedFromUnsoldList"
})
public class GetMyeBaySellingResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "SellingSummary", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected SellingSummaryType sellingSummary;
    @XmlElement(name = "ScheduledList", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected PaginatedItemArrayType scheduledList;
    @XmlElement(name = "ActiveList", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected PaginatedItemArrayType activeList;
    @XmlElement(name = "SoldList", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected PaginatedOrderTransactionArrayType soldList;
    @XmlElement(name = "UnsoldList", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected PaginatedItemArrayType unsoldList;
    @XmlElement(name = "Summary", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected MyeBaySellingSummaryType summary;
    @XmlElement(name = "BidList", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected PaginatedItemArrayType bidList;
    @XmlElement(name = "DeletedFromSoldList", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected PaginatedOrderTransactionArrayType deletedFromSoldList;
    @XmlElement(name = "DeletedFromUnsoldList", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected PaginatedItemArrayType deletedFromUnsoldList;

    /**
     * Gets the value of the sellingSummary property.
     * 
     * @return
     *     possible object is
     *     {@link SellingSummaryType }
     *     
     */
    public SellingSummaryType getSellingSummary() {
        return sellingSummary;
    }

    /**
     * Sets the value of the sellingSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellingSummaryType }
     *     
     */
    public void setSellingSummary(SellingSummaryType value) {
        this.sellingSummary = value;
    }

    /**
     * Gets the value of the scheduledList property.
     * 
     * @return
     *     possible object is
     *     {@link PaginatedItemArrayType }
     *     
     */
    public PaginatedItemArrayType getScheduledList() {
        return scheduledList;
    }

    /**
     * Sets the value of the scheduledList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaginatedItemArrayType }
     *     
     */
    public void setScheduledList(PaginatedItemArrayType value) {
        this.scheduledList = value;
    }

    /**
     * Gets the value of the activeList property.
     * 
     * @return
     *     possible object is
     *     {@link PaginatedItemArrayType }
     *     
     */
    public PaginatedItemArrayType getActiveList() {
        return activeList;
    }

    /**
     * Sets the value of the activeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaginatedItemArrayType }
     *     
     */
    public void setActiveList(PaginatedItemArrayType value) {
        this.activeList = value;
    }

    /**
     * Gets the value of the soldList property.
     * 
     * @return
     *     possible object is
     *     {@link PaginatedOrderTransactionArrayType }
     *     
     */
    public PaginatedOrderTransactionArrayType getSoldList() {
        return soldList;
    }

    /**
     * Sets the value of the soldList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaginatedOrderTransactionArrayType }
     *     
     */
    public void setSoldList(PaginatedOrderTransactionArrayType value) {
        this.soldList = value;
    }

    /**
     * Gets the value of the unsoldList property.
     * 
     * @return
     *     possible object is
     *     {@link PaginatedItemArrayType }
     *     
     */
    public PaginatedItemArrayType getUnsoldList() {
        return unsoldList;
    }

    /**
     * Sets the value of the unsoldList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaginatedItemArrayType }
     *     
     */
    public void setUnsoldList(PaginatedItemArrayType value) {
        this.unsoldList = value;
    }

    /**
     * Gets the value of the summary property.
     * 
     * @return
     *     possible object is
     *     {@link MyeBaySellingSummaryType }
     *     
     */
    public MyeBaySellingSummaryType getSummary() {
        return summary;
    }

    /**
     * Sets the value of the summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link MyeBaySellingSummaryType }
     *     
     */
    public void setSummary(MyeBaySellingSummaryType value) {
        this.summary = value;
    }

    /**
     * Gets the value of the bidList property.
     * 
     * @return
     *     possible object is
     *     {@link PaginatedItemArrayType }
     *     
     */
    public PaginatedItemArrayType getBidList() {
        return bidList;
    }

    /**
     * Sets the value of the bidList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaginatedItemArrayType }
     *     
     */
    public void setBidList(PaginatedItemArrayType value) {
        this.bidList = value;
    }

    /**
     * Gets the value of the deletedFromSoldList property.
     * 
     * @return
     *     possible object is
     *     {@link PaginatedOrderTransactionArrayType }
     *     
     */
    public PaginatedOrderTransactionArrayType getDeletedFromSoldList() {
        return deletedFromSoldList;
    }

    /**
     * Sets the value of the deletedFromSoldList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaginatedOrderTransactionArrayType }
     *     
     */
    public void setDeletedFromSoldList(PaginatedOrderTransactionArrayType value) {
        this.deletedFromSoldList = value;
    }

    /**
     * Gets the value of the deletedFromUnsoldList property.
     * 
     * @return
     *     possible object is
     *     {@link PaginatedItemArrayType }
     *     
     */
    public PaginatedItemArrayType getDeletedFromUnsoldList() {
        return deletedFromUnsoldList;
    }

    /**
     * Sets the value of the deletedFromUnsoldList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaginatedItemArrayType }
     *     
     */
    public void setDeletedFromUnsoldList(PaginatedItemArrayType value) {
        this.deletedFromUnsoldList = value;
    }

}
