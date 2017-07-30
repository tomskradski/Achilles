
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Base type definition of the request payload, which can carry any type of payload
 * 				content plus optional versioning information and detail level requirements. All
 * 				concrete request types (e.g., AddItemRequestType) are derived from the abstract
 * 				request type. The naming convention we use for the concrete type names is the name
 * 				of the service (the verb or call name) followed by "RequestType":
 * 				VerbNameRequestType
 * 			
 * 
 * <p>Java class for AbstractRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DetailLevel" type="{urn:ebay:apis:eBLBaseComponents}DetailLevelCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ErrorLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MessageID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EndUserIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequesterCredentials" type="{urn:ebay:apis:eBLBaseComponents}XMLRequesterCredentialsType" minOccurs="0"/>
 *         &lt;element name="ErrorHandling" type="{urn:ebay:apis:eBLBaseComponents}ErrorHandlingCodeType" minOccurs="0"/>
 *         &lt;element name="InvocationID" type="{urn:ebay:apis:eBLBaseComponents}UUIDType" minOccurs="0"/>
 *         &lt;element name="OutputSelector" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="WarningLevel" type="{urn:ebay:apis:eBLBaseComponents}WarningLevelCodeType" minOccurs="0"/>
 *         &lt;element name="BotBlock" type="{urn:ebay:apis:eBLBaseComponents}BotBlockRequestType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractRequestType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "detailLevel",
    "errorLanguage",
    "messageID",
    "version",
    "endUserIP",
    "requesterCredentials",
    "errorHandling",
    "invocationID",
    "outputSelector",
    "warningLevel",
    "botBlock"
})
@XmlSeeAlso({
    GetVeROReasonCodeDetailsRequestType.class,
    AddSellingManagerProductRequestType.class,
    SellerReverseDisputeRequestType.class,
    SetStoreCustomPageRequestType.class,
    GetNotificationPreferencesRequestType.class,
    SetNotificationPreferencesRequestType.class,
    SetPromotionalSaleListingsRequestType.class,
    ReviseMyMessagesFoldersRequestType.class,
    GetStoreCategoryUpdateStatusRequestType.class,
    DeleteSellingManagerItemAutomationRuleRequestType.class,
    GetOrderTransactionsRequestType.class,
    GetItemTransactionsRequestType.class,
    PlaceOfferRequestType.class,
    GetSellerEventsRequestType.class,
    RespondToFeedbackRequestType.class,
    AddOrderRequestType.class,
    GetSellingManagerSaleRecordRequestType.class,
    SetSellingManagerFeedbackOptionsRequestType.class,
    VerifyAddFixedPriceItemRequestType.class,
    GetSellerTransactionsRequestType.class,
    GetSellingManagerItemAutomationRuleRequestType.class,
    SetMessagePreferencesRequestType.class,
    AddSellingManagerTemplateRequestType.class,
    GetSuggestedCategoriesRequestType.class,
    GetUserRequestType.class,
    AddMemberMessagesAAQToBidderRequestType.class,
    GetTaxTableRequestType.class,
    GeteBayDetailsRequestType.class,
    AddDisputeRequestType.class,
    EndFixedPriceItemRequestType.class,
    GetStoreCustomPageRequestType.class,
    GetCategoryFeaturesRequestType.class,
    ReviseInventoryStatusRequestType.class,
    AddFixedPriceItemRequestType.class,
    GetPromotionalSaleDetailsRequestType.class,
    GetStoreRequestType.class,
    IssueRefundRequestType.class,
    GetContextualKeywordsRequestType.class,
    GetSellerListRequestType.class,
    AddItemRequestType.class,
    GetCategorySpecificsRequestType.class,
    GetStoreOptionsRequestType.class,
    RelistItemRequestType.class,
    AddSecondChanceItemRequestType.class,
    SetUserNotesRequestType.class,
    SetSellingManagerTemplateAutomationRuleRequestType.class,
    SetUserPreferencesRequestType.class,
    CompleteSaleRequestType.class,
    SetStorePreferencesRequestType.class,
    GetChallengeTokenRequestType.class,
    DeleteSellingManagerInventoryFolderRequestType.class,
    SetTaxTableRequestType.class,
    ReviseCheckoutStatusRequestType.class,
    GetSellingManagerTemplatesRequestType.class,
    GetVeROReportStatusRequestType.class,
    DeleteSellingManagerProductRequestType.class,
    ReviseSellingManagerTemplateRequestType.class,
    DeleteSellingManagerTemplateRequestType.class,
    GeteBayOfficialTimeRequestType.class,
    GetAllBiddersRequestType.class,
    LeaveFeedbackRequestType.class,
    ReviseSellingManagerProductRequestType.class,
    FetchTokenRequestType.class,
    AddTransactionConfirmationItemRequestType.class,
    GetOrdersRequestType.class,
    SaveItemToSellingManagerTemplateRequestType.class,
    GetUserDisputesRequestType.class,
    GetMyeBayBuyingRequestType.class,
    GetDescriptionTemplatesRequestType.class,
    ValidateTestUserRegistrationRequestType.class,
    GetUserContactDetailsRequestType.class,
    GetSessionIDRequestType.class,
    SetShippingDiscountProfilesRequestType.class,
    RelistFixedPriceItemRequestType.class,
    RevokeTokenRequestType.class,
    GetStorePreferencesRequestType.class,
    VeROReportItemsRequestType.class,
    GetMessagePreferencesRequestType.class,
    GetCharitiesRequestType.class,
    GetAccountRequestType.class,
    GetNotificationsUsageRequestType.class,
    GetSellingManagerAlertsRequestType.class,
    DisableUnpaidItemAssistanceRequestType.class,
    EndItemRequestType.class,
    GetSellingManagerInventoryFolderRequestType.class,
    AddToItemDescriptionRequestType.class,
    GetApiAccessRulesRequestType.class,
    GetTokenStatusRequestType.class,
    ReviseItemRequestType.class,
    VerifyRelistItemRequestType.class,
    SetStoreRequestType.class,
    ExtendSiteHostedPicturesRequestType.class,
    VerifyAddItemRequestType.class,
    AddSellingManagerInventoryFolderRequestType.class,
    GetItemsAwaitingFeedbackRequestType.class,
    AddItemsRequestType.class,
    ReviseSellingManagerInventoryFolderRequestType.class,
    DeleteSellingManagerTemplateAutomationRuleRequestType.class,
    SendInvoiceRequestType.class,
    AddItemFromSellingManagerTemplateRequestType.class,
    GetAdFormatLeadsRequestType.class,
    SetSellingManagerItemAutomationRuleRequestType.class,
    ConfirmIdentityRequestType.class,
    RespondToBestOfferRequestType.class,
    GetCategoriesRequestType.class,
    GetItemRequestType.class,
    GetDisputeRequestType.class,
    AddMemberMessageAAQToPartnerRequestType.class,
    GetMyMessagesRequestType.class,
    VerifyAddSecondChanceItemRequestType.class,
    GetSellingManagerEmailLogRequestType.class,
    GetFeedbackRequestType.class,
    GetCategoryMappingsRequestType.class,
    SetPromotionalSaleRequestType.class,
    ValidateChallengeInputRequestType.class,
    MoveSellingManagerInventoryFolderRequestType.class,
    GetSellerPaymentsRequestType.class,
    GetItemShippingRequestType.class,
    GetUserPreferencesRequestType.class,
    AddDisputeResponseRequestType.class,
    GetSellingManagerSoldListingsRequestType.class,
    ReviseMyMessagesRequestType.class,
    GetBidderListRequestType.class,
    RemoveFromWatchListRequestType.class,
    EndItemsRequestType.class,
    GetSellingManagerTemplateAutomationRuleRequestType.class,
    GetMyeBayRemindersRequestType.class,
    AddToWatchListRequestType.class,
    ReviseFixedPriceItemRequestType.class,
    AddMemberMessageRTQRequestType.class,
    GetBestOffersRequestType.class,
    GetMemberMessagesRequestType.class,
    GetShippingDiscountProfilesRequestType.class,
    ReviseSellingManagerSaleRecordRequestType.class,
    SetStoreCategoriesRequestType.class,
    DeleteMyMessagesRequestType.class,
    UploadSiteHostedPicturesRequestType.class,
    GetSellingManagerInventoryRequestType.class,
    GetClientAlertsAuthTokenRequestType.class,
    GetSellerDashboardRequestType.class,
    GetMyeBaySellingRequestType.class
})
public abstract class AbstractRequestType {

    @XmlElement(name = "DetailLevel", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected List<DetailLevelCodeType> detailLevel;
    @XmlElement(name = "ErrorLanguage", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String errorLanguage;
    @XmlElement(name = "MessageID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String messageID;
    @XmlElement(name = "Version", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String version;
    @XmlElement(name = "EndUserIP", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String endUserIP;
    @XmlElement(name = "RequesterCredentials", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected XMLRequesterCredentialsType requesterCredentials;
    @XmlElement(name = "ErrorHandling", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected ErrorHandlingCodeType errorHandling;
    @XmlElement(name = "InvocationID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String invocationID;
    @XmlElement(name = "OutputSelector", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<String> outputSelector;
    @XmlElement(name = "WarningLevel", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected WarningLevelCodeType warningLevel;
    @XmlElement(name = "BotBlock", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected BotBlockRequestType botBlock;

    /**
     * Gets the value of the detailLevel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detailLevel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetailLevel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailLevelCodeType }
     * 
     * 
     */
    public List<DetailLevelCodeType> getDetailLevel() {
        if (detailLevel == null) {
            detailLevel = new ArrayList<DetailLevelCodeType>();
        }
        return this.detailLevel;
    }

    /**
     * Gets the value of the errorLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorLanguage() {
        return errorLanguage;
    }

    /**
     * Sets the value of the errorLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorLanguage(String value) {
        this.errorLanguage = value;
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
     * Gets the value of the endUserIP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndUserIP() {
        return endUserIP;
    }

    /**
     * Sets the value of the endUserIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndUserIP(String value) {
        this.endUserIP = value;
    }

    /**
     * Gets the value of the requesterCredentials property.
     * 
     * @return
     *     possible object is
     *     {@link XMLRequesterCredentialsType }
     *     
     */
    public XMLRequesterCredentialsType getRequesterCredentials() {
        return requesterCredentials;
    }

    /**
     * Sets the value of the requesterCredentials property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLRequesterCredentialsType }
     *     
     */
    public void setRequesterCredentials(XMLRequesterCredentialsType value) {
        this.requesterCredentials = value;
    }

    /**
     * Gets the value of the errorHandling property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorHandlingCodeType }
     *     
     */
    public ErrorHandlingCodeType getErrorHandling() {
        return errorHandling;
    }

    /**
     * Sets the value of the errorHandling property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorHandlingCodeType }
     *     
     */
    public void setErrorHandling(ErrorHandlingCodeType value) {
        this.errorHandling = value;
    }

    /**
     * Gets the value of the invocationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvocationID() {
        return invocationID;
    }

    /**
     * Sets the value of the invocationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvocationID(String value) {
        this.invocationID = value;
    }

    /**
     * Gets the value of the outputSelector property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outputSelector property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutputSelector().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOutputSelector() {
        if (outputSelector == null) {
            outputSelector = new ArrayList<String>();
        }
        return this.outputSelector;
    }

    /**
     * Gets the value of the warningLevel property.
     * 
     * @return
     *     possible object is
     *     {@link WarningLevelCodeType }
     *     
     */
    public WarningLevelCodeType getWarningLevel() {
        return warningLevel;
    }

    /**
     * Sets the value of the warningLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link WarningLevelCodeType }
     *     
     */
    public void setWarningLevel(WarningLevelCodeType value) {
        this.warningLevel = value;
    }

    /**
     * Gets the value of the botBlock property.
     * 
     * @return
     *     possible object is
     *     {@link BotBlockRequestType }
     *     
     */
    public BotBlockRequestType getBotBlock() {
        return botBlock;
    }

    /**
     * Sets the value of the botBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link BotBlockRequestType }
     *     
     */
    public void setBotBlock(BotBlockRequestType value) {
        this.botBlock = value;
    }

}
