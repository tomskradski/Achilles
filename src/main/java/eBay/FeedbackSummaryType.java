
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Specifies all feedback summary information (except Score). Contains
 * 				FeedbackPeriodArrayType objects that each convey feedback counts for positive,
 * 				negative, neutral, and total feedback counts - for various time periods each. Also
 * 				conveys counts of bid retractions for the predefined time periods.
 * 			
 * 
 * <p>Java class for FeedbackSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeedbackSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BidRetractionFeedbackPeriodArray" type="{urn:ebay:apis:eBLBaseComponents}FeedbackPeriodArrayType" minOccurs="0"/>
 *         &lt;element name="NegativeFeedbackPeriodArray" type="{urn:ebay:apis:eBLBaseComponents}FeedbackPeriodArrayType" minOccurs="0"/>
 *         &lt;element name="NeutralFeedbackPeriodArray" type="{urn:ebay:apis:eBLBaseComponents}FeedbackPeriodArrayType" minOccurs="0"/>
 *         &lt;element name="PositiveFeedbackPeriodArray" type="{urn:ebay:apis:eBLBaseComponents}FeedbackPeriodArrayType" minOccurs="0"/>
 *         &lt;element name="TotalFeedbackPeriodArray" type="{urn:ebay:apis:eBLBaseComponents}FeedbackPeriodArrayType" minOccurs="0"/>
 *         &lt;element name="NeutralCommentCountFromSuspendedUsers" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UniqueNegativeFeedbackCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UniquePositiveFeedbackCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UniqueNeutralFeedbackCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SellerRatingSummaryArray" type="{urn:ebay:apis:eBLBaseComponents}SellerRatingSummaryArrayType" minOccurs="0"/>
 *         &lt;element name="SellerRoleMetrics" type="{urn:ebay:apis:eBLBaseComponents}SellerRoleMetricsType" minOccurs="0"/>
 *         &lt;element name="BuyerRoleMetrics" type="{urn:ebay:apis:eBLBaseComponents}BuyerRoleMetricsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeedbackSummaryType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "bidRetractionFeedbackPeriodArray",
    "negativeFeedbackPeriodArray",
    "neutralFeedbackPeriodArray",
    "positiveFeedbackPeriodArray",
    "totalFeedbackPeriodArray",
    "neutralCommentCountFromSuspendedUsers",
    "uniqueNegativeFeedbackCount",
    "uniquePositiveFeedbackCount",
    "uniqueNeutralFeedbackCount",
    "sellerRatingSummaryArray",
    "sellerRoleMetrics",
    "buyerRoleMetrics"
})
public class FeedbackSummaryType {

    @XmlElement(name = "BidRetractionFeedbackPeriodArray", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected FeedbackPeriodArrayType bidRetractionFeedbackPeriodArray;
    @XmlElement(name = "NegativeFeedbackPeriodArray", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected FeedbackPeriodArrayType negativeFeedbackPeriodArray;
    @XmlElement(name = "NeutralFeedbackPeriodArray", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected FeedbackPeriodArrayType neutralFeedbackPeriodArray;
    @XmlElement(name = "PositiveFeedbackPeriodArray", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected FeedbackPeriodArrayType positiveFeedbackPeriodArray;
    @XmlElement(name = "TotalFeedbackPeriodArray", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected FeedbackPeriodArrayType totalFeedbackPeriodArray;
    @XmlElement(name = "NeutralCommentCountFromSuspendedUsers", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer neutralCommentCountFromSuspendedUsers;
    @XmlElement(name = "UniqueNegativeFeedbackCount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer uniqueNegativeFeedbackCount;
    @XmlElement(name = "UniquePositiveFeedbackCount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer uniquePositiveFeedbackCount;
    @XmlElement(name = "UniqueNeutralFeedbackCount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer uniqueNeutralFeedbackCount;
    @XmlElement(name = "SellerRatingSummaryArray", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected SellerRatingSummaryArrayType sellerRatingSummaryArray;
    @XmlElement(name = "SellerRoleMetrics", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected SellerRoleMetricsType sellerRoleMetrics;
    @XmlElement(name = "BuyerRoleMetrics", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected BuyerRoleMetricsType buyerRoleMetrics;

    /**
     * Gets the value of the bidRetractionFeedbackPeriodArray property.
     * 
     * @return
     *     possible object is
     *     {@link FeedbackPeriodArrayType }
     *     
     */
    public FeedbackPeriodArrayType getBidRetractionFeedbackPeriodArray() {
        return bidRetractionFeedbackPeriodArray;
    }

    /**
     * Sets the value of the bidRetractionFeedbackPeriodArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeedbackPeriodArrayType }
     *     
     */
    public void setBidRetractionFeedbackPeriodArray(FeedbackPeriodArrayType value) {
        this.bidRetractionFeedbackPeriodArray = value;
    }

    /**
     * Gets the value of the negativeFeedbackPeriodArray property.
     * 
     * @return
     *     possible object is
     *     {@link FeedbackPeriodArrayType }
     *     
     */
    public FeedbackPeriodArrayType getNegativeFeedbackPeriodArray() {
        return negativeFeedbackPeriodArray;
    }

    /**
     * Sets the value of the negativeFeedbackPeriodArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeedbackPeriodArrayType }
     *     
     */
    public void setNegativeFeedbackPeriodArray(FeedbackPeriodArrayType value) {
        this.negativeFeedbackPeriodArray = value;
    }

    /**
     * Gets the value of the neutralFeedbackPeriodArray property.
     * 
     * @return
     *     possible object is
     *     {@link FeedbackPeriodArrayType }
     *     
     */
    public FeedbackPeriodArrayType getNeutralFeedbackPeriodArray() {
        return neutralFeedbackPeriodArray;
    }

    /**
     * Sets the value of the neutralFeedbackPeriodArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeedbackPeriodArrayType }
     *     
     */
    public void setNeutralFeedbackPeriodArray(FeedbackPeriodArrayType value) {
        this.neutralFeedbackPeriodArray = value;
    }

    /**
     * Gets the value of the positiveFeedbackPeriodArray property.
     * 
     * @return
     *     possible object is
     *     {@link FeedbackPeriodArrayType }
     *     
     */
    public FeedbackPeriodArrayType getPositiveFeedbackPeriodArray() {
        return positiveFeedbackPeriodArray;
    }

    /**
     * Sets the value of the positiveFeedbackPeriodArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeedbackPeriodArrayType }
     *     
     */
    public void setPositiveFeedbackPeriodArray(FeedbackPeriodArrayType value) {
        this.positiveFeedbackPeriodArray = value;
    }

    /**
     * Gets the value of the totalFeedbackPeriodArray property.
     * 
     * @return
     *     possible object is
     *     {@link FeedbackPeriodArrayType }
     *     
     */
    public FeedbackPeriodArrayType getTotalFeedbackPeriodArray() {
        return totalFeedbackPeriodArray;
    }

    /**
     * Sets the value of the totalFeedbackPeriodArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeedbackPeriodArrayType }
     *     
     */
    public void setTotalFeedbackPeriodArray(FeedbackPeriodArrayType value) {
        this.totalFeedbackPeriodArray = value;
    }

    /**
     * Gets the value of the neutralCommentCountFromSuspendedUsers property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNeutralCommentCountFromSuspendedUsers() {
        return neutralCommentCountFromSuspendedUsers;
    }

    /**
     * Sets the value of the neutralCommentCountFromSuspendedUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNeutralCommentCountFromSuspendedUsers(Integer value) {
        this.neutralCommentCountFromSuspendedUsers = value;
    }

    /**
     * Gets the value of the uniqueNegativeFeedbackCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUniqueNegativeFeedbackCount() {
        return uniqueNegativeFeedbackCount;
    }

    /**
     * Sets the value of the uniqueNegativeFeedbackCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUniqueNegativeFeedbackCount(Integer value) {
        this.uniqueNegativeFeedbackCount = value;
    }

    /**
     * Gets the value of the uniquePositiveFeedbackCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUniquePositiveFeedbackCount() {
        return uniquePositiveFeedbackCount;
    }

    /**
     * Sets the value of the uniquePositiveFeedbackCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUniquePositiveFeedbackCount(Integer value) {
        this.uniquePositiveFeedbackCount = value;
    }

    /**
     * Gets the value of the uniqueNeutralFeedbackCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUniqueNeutralFeedbackCount() {
        return uniqueNeutralFeedbackCount;
    }

    /**
     * Sets the value of the uniqueNeutralFeedbackCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUniqueNeutralFeedbackCount(Integer value) {
        this.uniqueNeutralFeedbackCount = value;
    }

    /**
     * Gets the value of the sellerRatingSummaryArray property.
     * 
     * @return
     *     possible object is
     *     {@link SellerRatingSummaryArrayType }
     *     
     */
    public SellerRatingSummaryArrayType getSellerRatingSummaryArray() {
        return sellerRatingSummaryArray;
    }

    /**
     * Sets the value of the sellerRatingSummaryArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellerRatingSummaryArrayType }
     *     
     */
    public void setSellerRatingSummaryArray(SellerRatingSummaryArrayType value) {
        this.sellerRatingSummaryArray = value;
    }

    /**
     * Gets the value of the sellerRoleMetrics property.
     * 
     * @return
     *     possible object is
     *     {@link SellerRoleMetricsType }
     *     
     */
    public SellerRoleMetricsType getSellerRoleMetrics() {
        return sellerRoleMetrics;
    }

    /**
     * Sets the value of the sellerRoleMetrics property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellerRoleMetricsType }
     *     
     */
    public void setSellerRoleMetrics(SellerRoleMetricsType value) {
        this.sellerRoleMetrics = value;
    }

    /**
     * Gets the value of the buyerRoleMetrics property.
     * 
     * @return
     *     possible object is
     *     {@link BuyerRoleMetricsType }
     *     
     */
    public BuyerRoleMetricsType getBuyerRoleMetrics() {
        return buyerRoleMetrics;
    }

    /**
     * Sets the value of the buyerRoleMetrics property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuyerRoleMetricsType }
     *     
     */
    public void setBuyerRoleMetrics(BuyerRoleMetricsType value) {
        this.buyerRoleMetrics = value;
    }

}
