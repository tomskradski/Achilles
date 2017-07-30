
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Sets the authenticated user's preferences to those specified in the request.
 * 			
 * 
 * <p>Java class for SetUserPreferencesRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetUserPreferencesRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="BidderNoticePreferences" type="{urn:ebay:apis:eBLBaseComponents}BidderNoticePreferencesType" minOccurs="0"/>
 *         &lt;element name="CombinedPaymentPreferences" type="{urn:ebay:apis:eBLBaseComponents}CombinedPaymentPreferencesType" minOccurs="0"/>
 *         &lt;element name="CrossPromotionPreferences" type="{urn:ebay:apis:eBLBaseComponents}CrossPromotionPreferencesType" minOccurs="0"/>
 *         &lt;element name="SellerPaymentPreferences" type="{urn:ebay:apis:eBLBaseComponents}SellerPaymentPreferencesType" minOccurs="0"/>
 *         &lt;element name="SellerFavoriteItemPreferences" type="{urn:ebay:apis:eBLBaseComponents}SellerFavoriteItemPreferencesType" minOccurs="0"/>
 *         &lt;element name="EndOfAuctionEmailPreferences" type="{urn:ebay:apis:eBLBaseComponents}EndOfAuctionEmailPreferencesType" minOccurs="0"/>
 *         &lt;element name="EmailShipmentTrackingNumberPreference" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RequiredShipPhoneNumberPreference" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UnpaidItemAssistancePreferences" type="{urn:ebay:apis:eBLBaseComponents}UnpaidItemAssistancePreferencesType" minOccurs="0"/>
 *         &lt;element name="PurchaseReminderEmailPreferences" type="{urn:ebay:apis:eBLBaseComponents}PurchaseReminderEmailPreferencesType" minOccurs="0"/>
 *         &lt;element name="SellerThirdPartyCheckoutDisabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DispatchCutoffTimePreference" type="{urn:ebay:apis:eBLBaseComponents}DispatchCutoffTimePreferencesType" minOccurs="0"/>
 *         &lt;element name="GlobalShippingProgramListingPreference" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OverrideGSPserviceWithIntlService" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OutOfStockControlPreference" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetUserPreferencesRequestType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "bidderNoticePreferences",
    "combinedPaymentPreferences",
    "crossPromotionPreferences",
    "sellerPaymentPreferences",
    "sellerFavoriteItemPreferences",
    "endOfAuctionEmailPreferences",
    "emailShipmentTrackingNumberPreference",
    "requiredShipPhoneNumberPreference",
    "unpaidItemAssistancePreferences",
    "purchaseReminderEmailPreferences",
    "sellerThirdPartyCheckoutDisabled",
    "dispatchCutoffTimePreference",
    "globalShippingProgramListingPreference",
    "overrideGSPserviceWithIntlService",
    "outOfStockControlPreference"
})
public class SetUserPreferencesRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "BidderNoticePreferences", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected BidderNoticePreferencesType bidderNoticePreferences;
    @XmlElement(name = "CombinedPaymentPreferences", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected CombinedPaymentPreferencesType combinedPaymentPreferences;
    @XmlElement(name = "CrossPromotionPreferences", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected CrossPromotionPreferencesType crossPromotionPreferences;
    @XmlElement(name = "SellerPaymentPreferences", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected SellerPaymentPreferencesType sellerPaymentPreferences;
    @XmlElement(name = "SellerFavoriteItemPreferences", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected SellerFavoriteItemPreferencesType sellerFavoriteItemPreferences;
    @XmlElement(name = "EndOfAuctionEmailPreferences", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected EndOfAuctionEmailPreferencesType endOfAuctionEmailPreferences;
    @XmlElement(name = "EmailShipmentTrackingNumberPreference", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean emailShipmentTrackingNumberPreference;
    @XmlElement(name = "RequiredShipPhoneNumberPreference", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean requiredShipPhoneNumberPreference;
    @XmlElement(name = "UnpaidItemAssistancePreferences", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected UnpaidItemAssistancePreferencesType unpaidItemAssistancePreferences;
    @XmlElement(name = "PurchaseReminderEmailPreferences", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected PurchaseReminderEmailPreferencesType purchaseReminderEmailPreferences;
    @XmlElement(name = "SellerThirdPartyCheckoutDisabled", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean sellerThirdPartyCheckoutDisabled;
    @XmlElement(name = "DispatchCutoffTimePreference", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected DispatchCutoffTimePreferencesType dispatchCutoffTimePreference;
    @XmlElement(name = "GlobalShippingProgramListingPreference", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean globalShippingProgramListingPreference;
    @XmlElement(name = "OverrideGSPserviceWithIntlService", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean overrideGSPserviceWithIntlService;
    @XmlElement(name = "OutOfStockControlPreference", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean outOfStockControlPreference;

    /**
     * Gets the value of the bidderNoticePreferences property.
     * 
     * @return
     *     possible object is
     *     {@link BidderNoticePreferencesType }
     *     
     */
    public BidderNoticePreferencesType getBidderNoticePreferences() {
        return bidderNoticePreferences;
    }

    /**
     * Sets the value of the bidderNoticePreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link BidderNoticePreferencesType }
     *     
     */
    public void setBidderNoticePreferences(BidderNoticePreferencesType value) {
        this.bidderNoticePreferences = value;
    }

    /**
     * Gets the value of the combinedPaymentPreferences property.
     * 
     * @return
     *     possible object is
     *     {@link CombinedPaymentPreferencesType }
     *     
     */
    public CombinedPaymentPreferencesType getCombinedPaymentPreferences() {
        return combinedPaymentPreferences;
    }

    /**
     * Sets the value of the combinedPaymentPreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link CombinedPaymentPreferencesType }
     *     
     */
    public void setCombinedPaymentPreferences(CombinedPaymentPreferencesType value) {
        this.combinedPaymentPreferences = value;
    }

    /**
     * Gets the value of the crossPromotionPreferences property.
     * 
     * @return
     *     possible object is
     *     {@link CrossPromotionPreferencesType }
     *     
     */
    public CrossPromotionPreferencesType getCrossPromotionPreferences() {
        return crossPromotionPreferences;
    }

    /**
     * Sets the value of the crossPromotionPreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrossPromotionPreferencesType }
     *     
     */
    public void setCrossPromotionPreferences(CrossPromotionPreferencesType value) {
        this.crossPromotionPreferences = value;
    }

    /**
     * Gets the value of the sellerPaymentPreferences property.
     * 
     * @return
     *     possible object is
     *     {@link SellerPaymentPreferencesType }
     *     
     */
    public SellerPaymentPreferencesType getSellerPaymentPreferences() {
        return sellerPaymentPreferences;
    }

    /**
     * Sets the value of the sellerPaymentPreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellerPaymentPreferencesType }
     *     
     */
    public void setSellerPaymentPreferences(SellerPaymentPreferencesType value) {
        this.sellerPaymentPreferences = value;
    }

    /**
     * Gets the value of the sellerFavoriteItemPreferences property.
     * 
     * @return
     *     possible object is
     *     {@link SellerFavoriteItemPreferencesType }
     *     
     */
    public SellerFavoriteItemPreferencesType getSellerFavoriteItemPreferences() {
        return sellerFavoriteItemPreferences;
    }

    /**
     * Sets the value of the sellerFavoriteItemPreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellerFavoriteItemPreferencesType }
     *     
     */
    public void setSellerFavoriteItemPreferences(SellerFavoriteItemPreferencesType value) {
        this.sellerFavoriteItemPreferences = value;
    }

    /**
     * Gets the value of the endOfAuctionEmailPreferences property.
     * 
     * @return
     *     possible object is
     *     {@link EndOfAuctionEmailPreferencesType }
     *     
     */
    public EndOfAuctionEmailPreferencesType getEndOfAuctionEmailPreferences() {
        return endOfAuctionEmailPreferences;
    }

    /**
     * Sets the value of the endOfAuctionEmailPreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndOfAuctionEmailPreferencesType }
     *     
     */
    public void setEndOfAuctionEmailPreferences(EndOfAuctionEmailPreferencesType value) {
        this.endOfAuctionEmailPreferences = value;
    }

    /**
     * Gets the value of the emailShipmentTrackingNumberPreference property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmailShipmentTrackingNumberPreference() {
        return emailShipmentTrackingNumberPreference;
    }

    /**
     * Sets the value of the emailShipmentTrackingNumberPreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmailShipmentTrackingNumberPreference(Boolean value) {
        this.emailShipmentTrackingNumberPreference = value;
    }

    /**
     * Gets the value of the requiredShipPhoneNumberPreference property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequiredShipPhoneNumberPreference() {
        return requiredShipPhoneNumberPreference;
    }

    /**
     * Sets the value of the requiredShipPhoneNumberPreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequiredShipPhoneNumberPreference(Boolean value) {
        this.requiredShipPhoneNumberPreference = value;
    }

    /**
     * Gets the value of the unpaidItemAssistancePreferences property.
     * 
     * @return
     *     possible object is
     *     {@link UnpaidItemAssistancePreferencesType }
     *     
     */
    public UnpaidItemAssistancePreferencesType getUnpaidItemAssistancePreferences() {
        return unpaidItemAssistancePreferences;
    }

    /**
     * Sets the value of the unpaidItemAssistancePreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnpaidItemAssistancePreferencesType }
     *     
     */
    public void setUnpaidItemAssistancePreferences(UnpaidItemAssistancePreferencesType value) {
        this.unpaidItemAssistancePreferences = value;
    }

    /**
     * Gets the value of the purchaseReminderEmailPreferences property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseReminderEmailPreferencesType }
     *     
     */
    public PurchaseReminderEmailPreferencesType getPurchaseReminderEmailPreferences() {
        return purchaseReminderEmailPreferences;
    }

    /**
     * Sets the value of the purchaseReminderEmailPreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseReminderEmailPreferencesType }
     *     
     */
    public void setPurchaseReminderEmailPreferences(PurchaseReminderEmailPreferencesType value) {
        this.purchaseReminderEmailPreferences = value;
    }

    /**
     * Gets the value of the sellerThirdPartyCheckoutDisabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSellerThirdPartyCheckoutDisabled() {
        return sellerThirdPartyCheckoutDisabled;
    }

    /**
     * Sets the value of the sellerThirdPartyCheckoutDisabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSellerThirdPartyCheckoutDisabled(Boolean value) {
        this.sellerThirdPartyCheckoutDisabled = value;
    }

    /**
     * Gets the value of the dispatchCutoffTimePreference property.
     * 
     * @return
     *     possible object is
     *     {@link DispatchCutoffTimePreferencesType }
     *     
     */
    public DispatchCutoffTimePreferencesType getDispatchCutoffTimePreference() {
        return dispatchCutoffTimePreference;
    }

    /**
     * Sets the value of the dispatchCutoffTimePreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link DispatchCutoffTimePreferencesType }
     *     
     */
    public void setDispatchCutoffTimePreference(DispatchCutoffTimePreferencesType value) {
        this.dispatchCutoffTimePreference = value;
    }

    /**
     * Gets the value of the globalShippingProgramListingPreference property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGlobalShippingProgramListingPreference() {
        return globalShippingProgramListingPreference;
    }

    /**
     * Sets the value of the globalShippingProgramListingPreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGlobalShippingProgramListingPreference(Boolean value) {
        this.globalShippingProgramListingPreference = value;
    }

    /**
     * Gets the value of the overrideGSPserviceWithIntlService property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverrideGSPserviceWithIntlService() {
        return overrideGSPserviceWithIntlService;
    }

    /**
     * Sets the value of the overrideGSPserviceWithIntlService property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverrideGSPserviceWithIntlService(Boolean value) {
        this.overrideGSPserviceWithIntlService = value;
    }

    /**
     * Gets the value of the outOfStockControlPreference property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOutOfStockControlPreference() {
        return outOfStockControlPreference;
    }

    /**
     * Sets the value of the outOfStockControlPreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOutOfStockControlPreference(Boolean value) {
        this.outOfStockControlPreference = value;
    }

}
