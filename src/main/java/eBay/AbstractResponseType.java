
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * 				Base type definition of a response payload that can carry any
 * 				type of payload content with following optional elements:
 * 				<ul>
 * 					<li>timestamp of response message</li>
 * 					<li>application-level acknowledgement</li>
 * 					<li>application-level (business-level) errors and warnings</li>
 * 				</ul>
 * 			
 * 
 * <p>Java class for AbstractResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Ack" type="{urn:ebay:apis:eBLBaseComponents}AckCodeType" minOccurs="0"/>
 *         &lt;element name="CorrelationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Errors" type="{urn:ebay:apis:eBLBaseComponents}ErrorType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Build" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NotificationEventName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DuplicateInvocationDetails" type="{urn:ebay:apis:eBLBaseComponents}DuplicateInvocationDetailsType" minOccurs="0"/>
 *         &lt;element name="RecipientUserID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EIASToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NotificationSignature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HardExpirationWarning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BotBlock" type="{urn:ebay:apis:eBLBaseComponents}BotBlockResponseType" minOccurs="0"/>
 *         &lt;element name="ExternalUserData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractResponseType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "timestamp",
    "ack",
    "correlationID",
    "errors",
    "message",
    "version",
    "build",
    "notificationEventName",
    "duplicateInvocationDetails",
    "recipientUserID",
    "eiasToken",
    "notificationSignature",
    "hardExpirationWarning",
    "botBlock",
    "externalUserData"
})
@XmlSeeAlso({
    EndFixedPriceItemResponseType.class,
    GetPromotionalSaleDetailsResponseType.class,
    AddToItemDescriptionResponseType.class,
    GetMyeBayBuyingResponseType.class,
    VerifyAddFixedPriceItemResponseType.class,
    DisableUnpaidItemAssistanceResponseType.class,
    GetSellingManagerAlertsResponseType.class,
    DeleteSellingManagerTemplateResponseType.class,
    GetUserPreferencesResponseType.class,
    SendInvoiceResponseType.class,
    AddSellingManagerProductResponseType.class,
    AddItemFromSellingManagerTemplateResponseType.class,
    SetUserNotesResponseType.class,
    RevokeTokenResponseType.class,
    GetCharitiesResponseType.class,
    PlaceOfferResponseType.class,
    SaveItemToSellingManagerTemplateResponseType.class,
    GetSellerListResponseType.class,
    ConfirmIdentityResponseType.class,
    ValidateChallengeInputResponseType.class,
    ValidateTestUserRegistrationResponseType.class,
    GetSessionIDResponseType.class,
    AddFixedPriceItemResponseType.class,
    GetStoreResponseType.class,
    ReviseSellingManagerInventoryFolderResponseType.class,
    AddSecondChanceItemResponseType.class,
    GetTokenStatusResponseType.class,
    DeleteSellingManagerInventoryFolderResponseType.class,
    DeleteSellingManagerTemplateAutomationRuleResponseType.class,
    MoveSellingManagerInventoryFolderResponseType.class,
    GetVeROReasonCodeDetailsResponseType.class,
    SetStorePreferencesResponseType.class,
    GetItemTransactionsResponseType.class,
    GetMyeBayRemindersResponseType.class,
    GetStoreCategoryUpdateStatusResponseType.class,
    AddToWatchListResponseType.class,
    GetApiAccessRulesResponseType.class,
    AddMemberMessagesAAQToBidderResponseType.class,
    GetItemResponseType.class,
    IssueRefundResponseType.class,
    GetSellingManagerTemplateAutomationRuleResponseType.class,
    ReviseCheckoutStatusResponseType.class,
    AddMemberMessageAAQToPartnerResponseType.class,
    GetOrdersResponseType.class,
    SetNotificationPreferencesResponseType.class,
    ReviseMyMessagesResponseType.class,
    DeleteMyMessagesResponseType.class,
    GetItemsAwaitingFeedbackResponseType.class,
    GetOrderTransactionsResponseType.class,
    GetTaxTableResponseType.class,
    GeteBayOfficialTimeResponseType.class,
    VerifyAddItemResponseType.class,
    GetSellingManagerInventoryFolderResponseType.class,
    GetSellerPaymentsResponseType.class,
    GetCategoryMappingsResponseType.class,
    SetStoreResponseType.class,
    AddOrderResponseType.class,
    GetMessagePreferencesResponseType.class,
    ReviseItemResponseType.class,
    SellerReverseDisputeResponseType.class,
    AddItemResponseType.class,
    GetSellingManagerEmailLogResponseType.class,
    GetSellerTransactionsResponseType.class,
    GetDescriptionTemplatesResponseType.class,
    ReviseSellingManagerSaleRecordResponseType.class,
    GetUserResponseType.class,
    SetPromotionalSaleResponseType.class,
    GeteBayDetailsResponseType.class,
    SetSellingManagerFeedbackOptionsResponseType.class,
    GetAdFormatLeadsResponseType.class,
    GetShippingDiscountProfilesResponseType.class,
    GetAccountResponseType.class,
    ReviseMyMessagesFoldersResponseType.class,
    ReviseInventoryStatusResponseType.class,
    GetFeedbackResponseType.class,
    AddMemberMessageRTQResponseType.class,
    DeleteSellingManagerProductResponseType.class,
    GetSellingManagerSoldListingsResponseType.class,
    AddItemsResponseType.class,
    ItemsCanceledEventType.class,
    GetMyeBaySellingResponseType.class,
    GetSellerEventsResponseType.class,
    GetSellingManagerItemAutomationRuleResponseType.class,
    GetAllBiddersResponseType.class,
    GetSellingManagerTemplatesResponseType.class,
    SetMessagePreferencesResponseType.class,
    ExtendSiteHostedPicturesResponseType.class,
    GetSellingManagerInventoryResponseType.class,
    DeleteSellingManagerItemAutomationRuleResponseType.class,
    EndItemResponseType.class,
    RemoveFromWatchListResponseType.class,
    GetCategorySpecificsResponseType.class,
    GetMyMessagesResponseType.class,
    GetSellingManagerSaleRecordResponseType.class,
    CompleteSaleResponseType.class,
    FetchTokenResponseType.class,
    AddTransactionConfirmationItemResponseType.class,
    SetStoreCategoriesResponseType.class,
    GetBestOffersResponseType.class,
    RelistFixedPriceItemResponseType.class,
    GetItemShippingResponseType.class,
    GetNotificationsUsageResponseType.class,
    SetSellingManagerTemplateAutomationRuleResponseType.class,
    GetSuggestedCategoriesResponseType.class,
    GetVeROReportStatusResponseType.class,
    SetUserPreferencesResponseType.class,
    GetStorePreferencesResponseType.class,
    VerifyRelistItemResponseType.class,
    GetUserContactDetailsResponseType.class,
    GetContextualKeywordsResponseType.class,
    SetTaxTableResponseType.class,
    ReviseFixedPriceItemResponseType.class,
    AddDisputeResponseResponseType.class,
    VeROReportItemsResponseType.class,
    GetBidderListResponseType.class,
    GetNotificationPreferencesResponseType.class,
    VerifyAddSecondChanceItemResponseType.class,
    ReviseSellingManagerProductResponseType.class,
    RespondToBestOfferResponseType.class,
    ReviseSellingManagerTemplateResponseType.class,
    SetStoreCustomPageResponseType.class,
    UploadSiteHostedPicturesResponseType.class,
    RelistItemResponseType.class,
    GetCategoryFeaturesResponseType.class,
    GetCategoriesResponseType.class,
    EndItemsResponseType.class,
    GetStoreOptionsResponseType.class,
    GetUserDisputesResponseType.class,
    SetSellingManagerItemAutomationRuleResponseType.class,
    GetDisputeResponseType.class,
    SetPromotionalSaleListingsResponseType.class,
    GetMemberMessagesResponseType.class,
    GetClientAlertsAuthTokenResponseType.class,
    AddSellingManagerInventoryFolderResponseType.class,
    SetShippingDiscountProfilesResponseType.class,
    NotificationMessageType.class,
    AddSellingManagerTemplateResponseType.class,
    GetSellerDashboardResponseType.class,
    GetChallengeTokenResponseType.class,
    LeaveFeedbackResponseType.class,
    AddDisputeResponseType.class,
    RespondToFeedbackResponseType.class,
    GetStoreCustomPageResponseType.class
})
public abstract class AbstractResponseType {

    @XmlElement(name = "Timestamp", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;
    @XmlElement(name = "Ack", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected AckCodeType ack;
    @XmlElement(name = "CorrelationID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String correlationID;
    @XmlElement(name = "Errors", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<ErrorType> errors;
    @XmlElement(name = "Message", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String message;
    @XmlElement(name = "Version", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String version;
    @XmlElement(name = "Build", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String build;
    @XmlElement(name = "NotificationEventName", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String notificationEventName;
    @XmlElement(name = "DuplicateInvocationDetails", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected DuplicateInvocationDetailsType duplicateInvocationDetails;
    @XmlElement(name = "RecipientUserID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String recipientUserID;
    @XmlElement(name = "EIASToken", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String eiasToken;
    @XmlElement(name = "NotificationSignature", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String notificationSignature;
    @XmlElement(name = "HardExpirationWarning", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String hardExpirationWarning;
    @XmlElement(name = "BotBlock", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected BotBlockResponseType botBlock;
    @XmlElement(name = "ExternalUserData", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String externalUserData;

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the ack property.
     * 
     * @return
     *     possible object is
     *     {@link AckCodeType }
     *     
     */
    public AckCodeType getAck() {
        return ack;
    }

    /**
     * Sets the value of the ack property.
     * 
     * @param value
     *     allowed object is
     *     {@link AckCodeType }
     *     
     */
    public void setAck(AckCodeType value) {
        this.ack = value;
    }

    /**
     * Gets the value of the correlationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrelationID() {
        return correlationID;
    }

    /**
     * Sets the value of the correlationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrelationID(String value) {
        this.correlationID = value;
    }

    /**
     * Gets the value of the errors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorType }
     * 
     * 
     */
    public List<ErrorType> getErrors() {
        if (errors == null) {
            errors = new ArrayList<ErrorType>();
        }
        return this.errors;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the build property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuild() {
        return build;
    }

    /**
     * Sets the value of the build property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuild(String value) {
        this.build = value;
    }

    /**
     * Gets the value of the notificationEventName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationEventName() {
        return notificationEventName;
    }

    /**
     * Sets the value of the notificationEventName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationEventName(String value) {
        this.notificationEventName = value;
    }

    /**
     * Gets the value of the duplicateInvocationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DuplicateInvocationDetailsType }
     *     
     */
    public DuplicateInvocationDetailsType getDuplicateInvocationDetails() {
        return duplicateInvocationDetails;
    }

    /**
     * Sets the value of the duplicateInvocationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DuplicateInvocationDetailsType }
     *     
     */
    public void setDuplicateInvocationDetails(DuplicateInvocationDetailsType value) {
        this.duplicateInvocationDetails = value;
    }

    /**
     * Gets the value of the recipientUserID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientUserID() {
        return recipientUserID;
    }

    /**
     * Sets the value of the recipientUserID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientUserID(String value) {
        this.recipientUserID = value;
    }

    /**
     * Gets the value of the eiasToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEIASToken() {
        return eiasToken;
    }

    /**
     * Sets the value of the eiasToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEIASToken(String value) {
        this.eiasToken = value;
    }

    /**
     * Gets the value of the notificationSignature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationSignature() {
        return notificationSignature;
    }

    /**
     * Sets the value of the notificationSignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationSignature(String value) {
        this.notificationSignature = value;
    }

    /**
     * Gets the value of the hardExpirationWarning property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHardExpirationWarning() {
        return hardExpirationWarning;
    }

    /**
     * Sets the value of the hardExpirationWarning property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHardExpirationWarning(String value) {
        this.hardExpirationWarning = value;
    }

    /**
     * Gets the value of the botBlock property.
     * 
     * @return
     *     possible object is
     *     {@link BotBlockResponseType }
     *     
     */
    public BotBlockResponseType getBotBlock() {
        return botBlock;
    }

    /**
     * Sets the value of the botBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link BotBlockResponseType }
     *     
     */
    public void setBotBlock(BotBlockResponseType value) {
        this.botBlock = value;
    }

    /**
     * Gets the value of the externalUserData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalUserData() {
        return externalUserData;
    }

    /**
     * Sets the value of the externalUserData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalUserData(String value) {
        this.externalUserData = value;
    }

}
