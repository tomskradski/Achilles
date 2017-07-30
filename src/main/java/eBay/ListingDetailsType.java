
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * 				Various details about a listing. Some of the details are calculated or derived after
 * 				an item is listed. The details in this type include the start and end time and
 * 				the converted (localized) prices. The details in this type also include
 * 				input values applicable to the Best Offer feature.
 * 				Additional details in this type include flags indicating if a seller
 * 				specified fields whose values are not visible to the requesting user.
 * 			
 * 
 * <p>Java class for ListingDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListingDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Adult" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BindingAuction" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CheckoutEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ConvertedBuyItNowPrice" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="ConvertedStartPrice" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="ConvertedReservePrice" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="HasReservePrice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RelistedItemID" type="{urn:ebay:apis:eBLBaseComponents}ItemIDType" minOccurs="0"/>
 *         &lt;element name="SecondChanceOriginalItemID" type="{urn:ebay:apis:eBLBaseComponents}ItemIDType" minOccurs="0"/>
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ViewItemURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="HasUnansweredQuestions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HasPublicMessages" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BuyItNowAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SellerBusinessType" type="{urn:ebay:apis:eBLBaseComponents}SellerBusinessCodeType" minOccurs="0"/>
 *         &lt;element name="MinimumBestOfferPrice" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="MinimumBestOfferMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocalListingDistance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TCROriginalItemID" type="{urn:ebay:apis:eBLBaseComponents}ItemIDType" minOccurs="0"/>
 *         &lt;element name="ViewItemURLForNaturalSearch" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="PayPerLeadEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BestOfferAutoAcceptPrice" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="EndingReason" type="{urn:ebay:apis:eBLBaseComponents}EndReasonCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListingDetailsType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "adult",
    "bindingAuction",
    "checkoutEnabled",
    "convertedBuyItNowPrice",
    "convertedStartPrice",
    "convertedReservePrice",
    "hasReservePrice",
    "relistedItemID",
    "secondChanceOriginalItemID",
    "startTime",
    "endTime",
    "viewItemURL",
    "hasUnansweredQuestions",
    "hasPublicMessages",
    "buyItNowAvailable",
    "sellerBusinessType",
    "minimumBestOfferPrice",
    "minimumBestOfferMessage",
    "localListingDistance",
    "tcrOriginalItemID",
    "viewItemURLForNaturalSearch",
    "payPerLeadEnabled",
    "bestOfferAutoAcceptPrice",
    "endingReason"
})
public class ListingDetailsType {

    @XmlElement(name = "Adult", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean adult;
    @XmlElement(name = "BindingAuction", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean bindingAuction;
    @XmlElement(name = "CheckoutEnabled", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean checkoutEnabled;
    @XmlElement(name = "ConvertedBuyItNowPrice", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType convertedBuyItNowPrice;
    @XmlElement(name = "ConvertedStartPrice", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType convertedStartPrice;
    @XmlElement(name = "ConvertedReservePrice", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType convertedReservePrice;
    @XmlElement(name = "HasReservePrice", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean hasReservePrice;
    @XmlElement(name = "RelistedItemID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String relistedItemID;
    @XmlElement(name = "SecondChanceOriginalItemID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String secondChanceOriginalItemID;
    @XmlElement(name = "StartTime", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTime;
    @XmlElement(name = "EndTime", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endTime;
    @XmlElement(name = "ViewItemURL", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "anyURI")
    protected String viewItemURL;
    @XmlElement(name = "HasUnansweredQuestions", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean hasUnansweredQuestions;
    @XmlElement(name = "HasPublicMessages", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean hasPublicMessages;
    @XmlElement(name = "BuyItNowAvailable", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean buyItNowAvailable;
    @XmlElement(name = "SellerBusinessType", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected SellerBusinessCodeType sellerBusinessType;
    @XmlElement(name = "MinimumBestOfferPrice", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType minimumBestOfferPrice;
    @XmlElement(name = "MinimumBestOfferMessage", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String minimumBestOfferMessage;
    @XmlElement(name = "LocalListingDistance", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String localListingDistance;
    @XmlElement(name = "TCROriginalItemID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String tcrOriginalItemID;
    @XmlElement(name = "ViewItemURLForNaturalSearch", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "anyURI")
    protected String viewItemURLForNaturalSearch;
    @XmlElement(name = "PayPerLeadEnabled", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean payPerLeadEnabled;
    @XmlElement(name = "BestOfferAutoAcceptPrice", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType bestOfferAutoAcceptPrice;
    @XmlElement(name = "EndingReason", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected EndReasonCodeType endingReason;

    /**
     * Gets the value of the adult property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdult() {
        return adult;
    }

    /**
     * Sets the value of the adult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdult(Boolean value) {
        this.adult = value;
    }

    /**
     * Gets the value of the bindingAuction property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBindingAuction() {
        return bindingAuction;
    }

    /**
     * Sets the value of the bindingAuction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBindingAuction(Boolean value) {
        this.bindingAuction = value;
    }

    /**
     * Gets the value of the checkoutEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckoutEnabled() {
        return checkoutEnabled;
    }

    /**
     * Sets the value of the checkoutEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckoutEnabled(Boolean value) {
        this.checkoutEnabled = value;
    }

    /**
     * Gets the value of the convertedBuyItNowPrice property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getConvertedBuyItNowPrice() {
        return convertedBuyItNowPrice;
    }

    /**
     * Sets the value of the convertedBuyItNowPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setConvertedBuyItNowPrice(AmountType value) {
        this.convertedBuyItNowPrice = value;
    }

    /**
     * Gets the value of the convertedStartPrice property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getConvertedStartPrice() {
        return convertedStartPrice;
    }

    /**
     * Sets the value of the convertedStartPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setConvertedStartPrice(AmountType value) {
        this.convertedStartPrice = value;
    }

    /**
     * Gets the value of the convertedReservePrice property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getConvertedReservePrice() {
        return convertedReservePrice;
    }

    /**
     * Sets the value of the convertedReservePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setConvertedReservePrice(AmountType value) {
        this.convertedReservePrice = value;
    }

    /**
     * Gets the value of the hasReservePrice property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasReservePrice() {
        return hasReservePrice;
    }

    /**
     * Sets the value of the hasReservePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasReservePrice(Boolean value) {
        this.hasReservePrice = value;
    }

    /**
     * Gets the value of the relistedItemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelistedItemID() {
        return relistedItemID;
    }

    /**
     * Sets the value of the relistedItemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelistedItemID(String value) {
        this.relistedItemID = value;
    }

    /**
     * Gets the value of the secondChanceOriginalItemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondChanceOriginalItemID() {
        return secondChanceOriginalItemID;
    }

    /**
     * Sets the value of the secondChanceOriginalItemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondChanceOriginalItemID(String value) {
        this.secondChanceOriginalItemID = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTime(XMLGregorianCalendar value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndTime(XMLGregorianCalendar value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the viewItemURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViewItemURL() {
        return viewItemURL;
    }

    /**
     * Sets the value of the viewItemURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViewItemURL(String value) {
        this.viewItemURL = value;
    }

    /**
     * Gets the value of the hasUnansweredQuestions property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasUnansweredQuestions() {
        return hasUnansweredQuestions;
    }

    /**
     * Sets the value of the hasUnansweredQuestions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasUnansweredQuestions(Boolean value) {
        this.hasUnansweredQuestions = value;
    }

    /**
     * Gets the value of the hasPublicMessages property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasPublicMessages() {
        return hasPublicMessages;
    }

    /**
     * Sets the value of the hasPublicMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasPublicMessages(Boolean value) {
        this.hasPublicMessages = value;
    }

    /**
     * Gets the value of the buyItNowAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBuyItNowAvailable() {
        return buyItNowAvailable;
    }

    /**
     * Sets the value of the buyItNowAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBuyItNowAvailable(Boolean value) {
        this.buyItNowAvailable = value;
    }

    /**
     * Gets the value of the sellerBusinessType property.
     * 
     * @return
     *     possible object is
     *     {@link SellerBusinessCodeType }
     *     
     */
    public SellerBusinessCodeType getSellerBusinessType() {
        return sellerBusinessType;
    }

    /**
     * Sets the value of the sellerBusinessType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellerBusinessCodeType }
     *     
     */
    public void setSellerBusinessType(SellerBusinessCodeType value) {
        this.sellerBusinessType = value;
    }

    /**
     * Gets the value of the minimumBestOfferPrice property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getMinimumBestOfferPrice() {
        return minimumBestOfferPrice;
    }

    /**
     * Sets the value of the minimumBestOfferPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setMinimumBestOfferPrice(AmountType value) {
        this.minimumBestOfferPrice = value;
    }

    /**
     * Gets the value of the minimumBestOfferMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinimumBestOfferMessage() {
        return minimumBestOfferMessage;
    }

    /**
     * Sets the value of the minimumBestOfferMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinimumBestOfferMessage(String value) {
        this.minimumBestOfferMessage = value;
    }

    /**
     * Gets the value of the localListingDistance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalListingDistance() {
        return localListingDistance;
    }

    /**
     * Sets the value of the localListingDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalListingDistance(String value) {
        this.localListingDistance = value;
    }

    /**
     * Gets the value of the tcrOriginalItemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTCROriginalItemID() {
        return tcrOriginalItemID;
    }

    /**
     * Sets the value of the tcrOriginalItemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTCROriginalItemID(String value) {
        this.tcrOriginalItemID = value;
    }

    /**
     * Gets the value of the viewItemURLForNaturalSearch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViewItemURLForNaturalSearch() {
        return viewItemURLForNaturalSearch;
    }

    /**
     * Sets the value of the viewItemURLForNaturalSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViewItemURLForNaturalSearch(String value) {
        this.viewItemURLForNaturalSearch = value;
    }

    /**
     * Gets the value of the payPerLeadEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPayPerLeadEnabled() {
        return payPerLeadEnabled;
    }

    /**
     * Sets the value of the payPerLeadEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPayPerLeadEnabled(Boolean value) {
        this.payPerLeadEnabled = value;
    }

    /**
     * Gets the value of the bestOfferAutoAcceptPrice property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getBestOfferAutoAcceptPrice() {
        return bestOfferAutoAcceptPrice;
    }

    /**
     * Sets the value of the bestOfferAutoAcceptPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setBestOfferAutoAcceptPrice(AmountType value) {
        this.bestOfferAutoAcceptPrice = value;
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

}