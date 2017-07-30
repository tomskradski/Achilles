
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * 				Type to contain the data for one eBay user. Depending on the context, the user
 * 				might be the seller or the buyer on either side of an order, or the bidder or winning bidder
 * 				in a listing. An object of this type is returned by a number of calls, including
 * 				the <b>GetUser</b> call.
 * 			
 * 
 * <p>Java class for UserType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AboutMePage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EIASToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FeedbackScore" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UniqueNegativeFeedbackCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UniquePositiveFeedbackCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PositiveFeedbackPercent" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="FeedbackPrivate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FeedbackRatingStar" type="{urn:ebay:apis:eBLBaseComponents}FeedbackRatingStarCodeType" minOccurs="0"/>
 *         &lt;element name="IDVerified" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="eBayGoodStanding" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NewUser" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RegistrationAddress" type="{urn:ebay:apis:eBLBaseComponents}AddressType" minOccurs="0"/>
 *         &lt;element name="RegistrationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Site" type="{urn:ebay:apis:eBLBaseComponents}SiteCodeType" minOccurs="0"/>
 *         &lt;element name="Status" type="{urn:ebay:apis:eBLBaseComponents}UserStatusCodeType" minOccurs="0"/>
 *         &lt;element name="UserID" type="{urn:ebay:apis:eBLBaseComponents}UserIDType" minOccurs="0"/>
 *         &lt;element name="UserIDChanged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserIDLastChanged" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="VATStatus" type="{urn:ebay:apis:eBLBaseComponents}VATStatusCodeType" minOccurs="0"/>
 *         &lt;element name="BuyerInfo" type="{urn:ebay:apis:eBLBaseComponents}BuyerType" minOccurs="0"/>
 *         &lt;element name="SellerInfo" type="{urn:ebay:apis:eBLBaseComponents}SellerType" minOccurs="0"/>
 *         &lt;element name="BusinessRole" type="{urn:ebay:apis:eBLBaseComponents}BusinessRoleType" minOccurs="0"/>
 *         &lt;element name="CharityAffiliations" type="{urn:ebay:apis:eBLBaseComponents}CharityAffiliationsType" minOccurs="0"/>
 *         &lt;element name="PayPalAccountLevel" type="{urn:ebay:apis:eBLBaseComponents}PayPalAccountLevelCodeType" minOccurs="0"/>
 *         &lt;element name="PayPalAccountType" type="{urn:ebay:apis:eBLBaseComponents}PayPalAccountTypeCodeType" minOccurs="0"/>
 *         &lt;element name="PayPalAccountStatus" type="{urn:ebay:apis:eBLBaseComponents}PayPalAccountStatusCodeType" minOccurs="0"/>
 *         &lt;element name="UserSubscription" type="{urn:ebay:apis:eBLBaseComponents}EBaySubscriptionTypeCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SiteVerified" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SkypeID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="eBayWikiReadOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TUVLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="VATID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MotorsDealer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SellerPaymentMethod" type="{urn:ebay:apis:eBLBaseComponents}SellerPaymentMethodCodeType" minOccurs="0"/>
 *         &lt;element name="BiddingSummary" type="{urn:ebay:apis:eBLBaseComponents}BiddingSummaryType" minOccurs="0"/>
 *         &lt;element name="UserAnonymized" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UniqueNeutralFeedbackCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="EnterpriseSeller" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BillingEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QualifiesForSelling" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="StaticAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShippingAddress" type="{urn:ebay:apis:eBLBaseComponents}AddressType" minOccurs="0"/>
 *         &lt;element name="UserFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "aboutMePage",
    "eiasToken",
    "email",
    "feedbackScore",
    "uniqueNegativeFeedbackCount",
    "uniquePositiveFeedbackCount",
    "positiveFeedbackPercent",
    "feedbackPrivate",
    "feedbackRatingStar",
    "idVerified",
    "eBayGoodStanding",
    "newUser",
    "registrationAddress",
    "registrationDate",
    "site",
    "status",
    "userID",
    "userIDChanged",
    "userIDLastChanged",
    "vatStatus",
    "buyerInfo",
    "sellerInfo",
    "businessRole",
    "charityAffiliations",
    "payPalAccountLevel",
    "payPalAccountType",
    "payPalAccountStatus",
    "userSubscription",
    "siteVerified",
    "skypeID",
    "eBayWikiReadOnly",
    "tuvLevel",
    "vatid",
    "motorsDealer",
    "sellerPaymentMethod",
    "biddingSummary",
    "userAnonymized",
    "uniqueNeutralFeedbackCount",
    "enterpriseSeller",
    "billingEmail",
    "qualifiesForSelling",
    "staticAlias",
    "shippingAddress",
    "userFirstName",
    "userLastName"
})
public class UserType {

    @XmlElement(name = "AboutMePage", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean aboutMePage;
    @XmlElement(name = "EIASToken", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String eiasToken;
    @XmlElement(name = "Email", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String email;
    @XmlElement(name = "FeedbackScore", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer feedbackScore;
    @XmlElement(name = "UniqueNegativeFeedbackCount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer uniqueNegativeFeedbackCount;
    @XmlElement(name = "UniquePositiveFeedbackCount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer uniquePositiveFeedbackCount;
    @XmlElement(name = "PositiveFeedbackPercent", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Float positiveFeedbackPercent;
    @XmlElement(name = "FeedbackPrivate", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean feedbackPrivate;
    @XmlElement(name = "FeedbackRatingStar", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected FeedbackRatingStarCodeType feedbackRatingStar;
    @XmlElement(name = "IDVerified", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean idVerified;
    @XmlElement(namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean eBayGoodStanding;
    @XmlElement(name = "NewUser", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean newUser;
    @XmlElement(name = "RegistrationAddress", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AddressType registrationAddress;
    @XmlElement(name = "RegistrationDate", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar registrationDate;
    @XmlElement(name = "Site", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected SiteCodeType site;
    @XmlElement(name = "Status", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected UserStatusCodeType status;
    @XmlElement(name = "UserID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String userID;
    @XmlElement(name = "UserIDChanged", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean userIDChanged;
    @XmlElement(name = "UserIDLastChanged", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar userIDLastChanged;
    @XmlElement(name = "VATStatus", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected VATStatusCodeType vatStatus;
    @XmlElement(name = "BuyerInfo", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected BuyerType buyerInfo;
    @XmlElement(name = "SellerInfo", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected SellerType sellerInfo;
    @XmlElement(name = "BusinessRole", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected BusinessRoleType businessRole;
    @XmlElement(name = "CharityAffiliations", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected CharityAffiliationsType charityAffiliations;
    @XmlElement(name = "PayPalAccountLevel", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected PayPalAccountLevelCodeType payPalAccountLevel;
    @XmlElement(name = "PayPalAccountType", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected PayPalAccountTypeCodeType payPalAccountType;
    @XmlElement(name = "PayPalAccountStatus", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected PayPalAccountStatusCodeType payPalAccountStatus;
    @XmlElement(name = "UserSubscription", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected List<EBaySubscriptionTypeCodeType> userSubscription;
    @XmlElement(name = "SiteVerified", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean siteVerified;
    @XmlElement(name = "SkypeID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<String> skypeID;
    @XmlElement(namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean eBayWikiReadOnly;
    @XmlElement(name = "TUVLevel", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer tuvLevel;
    @XmlElement(name = "VATID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String vatid;
    @XmlElement(name = "MotorsDealer", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean motorsDealer;
    @XmlElement(name = "SellerPaymentMethod", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected SellerPaymentMethodCodeType sellerPaymentMethod;
    @XmlElement(name = "BiddingSummary", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected BiddingSummaryType biddingSummary;
    @XmlElement(name = "UserAnonymized", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean userAnonymized;
    @XmlElement(name = "UniqueNeutralFeedbackCount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer uniqueNeutralFeedbackCount;
    @XmlElement(name = "EnterpriseSeller", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean enterpriseSeller;
    @XmlElement(name = "BillingEmail", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String billingEmail;
    @XmlElement(name = "QualifiesForSelling", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean qualifiesForSelling;
    @XmlElement(name = "StaticAlias", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String staticAlias;
    @XmlElement(name = "ShippingAddress", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AddressType shippingAddress;
    @XmlElement(name = "UserFirstName", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String userFirstName;
    @XmlElement(name = "UserLastName", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String userLastName;

    /**
     * Gets the value of the aboutMePage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAboutMePage() {
        return aboutMePage;
    }

    /**
     * Sets the value of the aboutMePage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAboutMePage(Boolean value) {
        this.aboutMePage = value;
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
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the feedbackScore property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFeedbackScore() {
        return feedbackScore;
    }

    /**
     * Sets the value of the feedbackScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFeedbackScore(Integer value) {
        this.feedbackScore = value;
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
     * Gets the value of the positiveFeedbackPercent property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPositiveFeedbackPercent() {
        return positiveFeedbackPercent;
    }

    /**
     * Sets the value of the positiveFeedbackPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPositiveFeedbackPercent(Float value) {
        this.positiveFeedbackPercent = value;
    }

    /**
     * Gets the value of the feedbackPrivate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFeedbackPrivate() {
        return feedbackPrivate;
    }

    /**
     * Sets the value of the feedbackPrivate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFeedbackPrivate(Boolean value) {
        this.feedbackPrivate = value;
    }

    /**
     * Gets the value of the feedbackRatingStar property.
     * 
     * @return
     *     possible object is
     *     {@link FeedbackRatingStarCodeType }
     *     
     */
    public FeedbackRatingStarCodeType getFeedbackRatingStar() {
        return feedbackRatingStar;
    }

    /**
     * Sets the value of the feedbackRatingStar property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeedbackRatingStarCodeType }
     *     
     */
    public void setFeedbackRatingStar(FeedbackRatingStarCodeType value) {
        this.feedbackRatingStar = value;
    }

    /**
     * Gets the value of the idVerified property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIDVerified() {
        return idVerified;
    }

    /**
     * Sets the value of the idVerified property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIDVerified(Boolean value) {
        this.idVerified = value;
    }

    /**
     * Gets the value of the eBayGoodStanding property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEBayGoodStanding() {
        return eBayGoodStanding;
    }

    /**
     * Sets the value of the eBayGoodStanding property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEBayGoodStanding(Boolean value) {
        this.eBayGoodStanding = value;
    }

    /**
     * Gets the value of the newUser property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNewUser() {
        return newUser;
    }

    /**
     * Sets the value of the newUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNewUser(Boolean value) {
        this.newUser = value;
    }

    /**
     * Gets the value of the registrationAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getRegistrationAddress() {
        return registrationAddress;
    }

    /**
     * Sets the value of the registrationAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setRegistrationAddress(AddressType value) {
        this.registrationAddress = value;
    }

    /**
     * Gets the value of the registrationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegistrationDate() {
        return registrationDate;
    }

    /**
     * Sets the value of the registrationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegistrationDate(XMLGregorianCalendar value) {
        this.registrationDate = value;
    }

    /**
     * Gets the value of the site property.
     * 
     * @return
     *     possible object is
     *     {@link SiteCodeType }
     *     
     */
    public SiteCodeType getSite() {
        return site;
    }

    /**
     * Sets the value of the site property.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteCodeType }
     *     
     */
    public void setSite(SiteCodeType value) {
        this.site = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link UserStatusCodeType }
     *     
     */
    public UserStatusCodeType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserStatusCodeType }
     *     
     */
    public void setStatus(UserStatusCodeType value) {
        this.status = value;
    }

    /**
     * Gets the value of the userID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserID(String value) {
        this.userID = value;
    }

    /**
     * Gets the value of the userIDChanged property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserIDChanged() {
        return userIDChanged;
    }

    /**
     * Sets the value of the userIDChanged property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserIDChanged(Boolean value) {
        this.userIDChanged = value;
    }

    /**
     * Gets the value of the userIDLastChanged property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUserIDLastChanged() {
        return userIDLastChanged;
    }

    /**
     * Sets the value of the userIDLastChanged property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUserIDLastChanged(XMLGregorianCalendar value) {
        this.userIDLastChanged = value;
    }

    /**
     * Gets the value of the vatStatus property.
     * 
     * @return
     *     possible object is
     *     {@link VATStatusCodeType }
     *     
     */
    public VATStatusCodeType getVATStatus() {
        return vatStatus;
    }

    /**
     * Sets the value of the vatStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link VATStatusCodeType }
     *     
     */
    public void setVATStatus(VATStatusCodeType value) {
        this.vatStatus = value;
    }

    /**
     * Gets the value of the buyerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BuyerType }
     *     
     */
    public BuyerType getBuyerInfo() {
        return buyerInfo;
    }

    /**
     * Sets the value of the buyerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuyerType }
     *     
     */
    public void setBuyerInfo(BuyerType value) {
        this.buyerInfo = value;
    }

    /**
     * Gets the value of the sellerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SellerType }
     *     
     */
    public SellerType getSellerInfo() {
        return sellerInfo;
    }

    /**
     * Sets the value of the sellerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellerType }
     *     
     */
    public void setSellerInfo(SellerType value) {
        this.sellerInfo = value;
    }

    /**
     * Gets the value of the businessRole property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessRoleType }
     *     
     */
    public BusinessRoleType getBusinessRole() {
        return businessRole;
    }

    /**
     * Sets the value of the businessRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessRoleType }
     *     
     */
    public void setBusinessRole(BusinessRoleType value) {
        this.businessRole = value;
    }

    /**
     * Gets the value of the charityAffiliations property.
     * 
     * @return
     *     possible object is
     *     {@link CharityAffiliationsType }
     *     
     */
    public CharityAffiliationsType getCharityAffiliations() {
        return charityAffiliations;
    }

    /**
     * Sets the value of the charityAffiliations property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharityAffiliationsType }
     *     
     */
    public void setCharityAffiliations(CharityAffiliationsType value) {
        this.charityAffiliations = value;
    }

    /**
     * Gets the value of the payPalAccountLevel property.
     * 
     * @return
     *     possible object is
     *     {@link PayPalAccountLevelCodeType }
     *     
     */
    public PayPalAccountLevelCodeType getPayPalAccountLevel() {
        return payPalAccountLevel;
    }

    /**
     * Sets the value of the payPalAccountLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalAccountLevelCodeType }
     *     
     */
    public void setPayPalAccountLevel(PayPalAccountLevelCodeType value) {
        this.payPalAccountLevel = value;
    }

    /**
     * Gets the value of the payPalAccountType property.
     * 
     * @return
     *     possible object is
     *     {@link PayPalAccountTypeCodeType }
     *     
     */
    public PayPalAccountTypeCodeType getPayPalAccountType() {
        return payPalAccountType;
    }

    /**
     * Sets the value of the payPalAccountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalAccountTypeCodeType }
     *     
     */
    public void setPayPalAccountType(PayPalAccountTypeCodeType value) {
        this.payPalAccountType = value;
    }

    /**
     * Gets the value of the payPalAccountStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PayPalAccountStatusCodeType }
     *     
     */
    public PayPalAccountStatusCodeType getPayPalAccountStatus() {
        return payPalAccountStatus;
    }

    /**
     * Sets the value of the payPalAccountStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalAccountStatusCodeType }
     *     
     */
    public void setPayPalAccountStatus(PayPalAccountStatusCodeType value) {
        this.payPalAccountStatus = value;
    }

    /**
     * Gets the value of the userSubscription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userSubscription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserSubscription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EBaySubscriptionTypeCodeType }
     * 
     * 
     */
    public List<EBaySubscriptionTypeCodeType> getUserSubscription() {
        if (userSubscription == null) {
            userSubscription = new ArrayList<EBaySubscriptionTypeCodeType>();
        }
        return this.userSubscription;
    }

    /**
     * Gets the value of the siteVerified property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSiteVerified() {
        return siteVerified;
    }

    /**
     * Sets the value of the siteVerified property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSiteVerified(Boolean value) {
        this.siteVerified = value;
    }

    /**
     * Gets the value of the skypeID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the skypeID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSkypeID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSkypeID() {
        if (skypeID == null) {
            skypeID = new ArrayList<String>();
        }
        return this.skypeID;
    }

    /**
     * Gets the value of the eBayWikiReadOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEBayWikiReadOnly() {
        return eBayWikiReadOnly;
    }

    /**
     * Sets the value of the eBayWikiReadOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEBayWikiReadOnly(Boolean value) {
        this.eBayWikiReadOnly = value;
    }

    /**
     * Gets the value of the tuvLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTUVLevel() {
        return tuvLevel;
    }

    /**
     * Sets the value of the tuvLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTUVLevel(Integer value) {
        this.tuvLevel = value;
    }

    /**
     * Gets the value of the vatid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVATID() {
        return vatid;
    }

    /**
     * Sets the value of the vatid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVATID(String value) {
        this.vatid = value;
    }

    /**
     * Gets the value of the motorsDealer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMotorsDealer() {
        return motorsDealer;
    }

    /**
     * Sets the value of the motorsDealer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMotorsDealer(Boolean value) {
        this.motorsDealer = value;
    }

    /**
     * Gets the value of the sellerPaymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link SellerPaymentMethodCodeType }
     *     
     */
    public SellerPaymentMethodCodeType getSellerPaymentMethod() {
        return sellerPaymentMethod;
    }

    /**
     * Sets the value of the sellerPaymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellerPaymentMethodCodeType }
     *     
     */
    public void setSellerPaymentMethod(SellerPaymentMethodCodeType value) {
        this.sellerPaymentMethod = value;
    }

    /**
     * Gets the value of the biddingSummary property.
     * 
     * @return
     *     possible object is
     *     {@link BiddingSummaryType }
     *     
     */
    public BiddingSummaryType getBiddingSummary() {
        return biddingSummary;
    }

    /**
     * Sets the value of the biddingSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link BiddingSummaryType }
     *     
     */
    public void setBiddingSummary(BiddingSummaryType value) {
        this.biddingSummary = value;
    }

    /**
     * Gets the value of the userAnonymized property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserAnonymized() {
        return userAnonymized;
    }

    /**
     * Sets the value of the userAnonymized property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserAnonymized(Boolean value) {
        this.userAnonymized = value;
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
     * Gets the value of the enterpriseSeller property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnterpriseSeller() {
        return enterpriseSeller;
    }

    /**
     * Sets the value of the enterpriseSeller property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnterpriseSeller(Boolean value) {
        this.enterpriseSeller = value;
    }

    /**
     * Gets the value of the billingEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingEmail() {
        return billingEmail;
    }

    /**
     * Sets the value of the billingEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingEmail(String value) {
        this.billingEmail = value;
    }

    /**
     * Gets the value of the qualifiesForSelling property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isQualifiesForSelling() {
        return qualifiesForSelling;
    }

    /**
     * Sets the value of the qualifiesForSelling property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQualifiesForSelling(Boolean value) {
        this.qualifiesForSelling = value;
    }

    /**
     * Gets the value of the staticAlias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStaticAlias() {
        return staticAlias;
    }

    /**
     * Sets the value of the staticAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStaticAlias(String value) {
        this.staticAlias = value;
    }

    /**
     * Gets the value of the shippingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getShippingAddress() {
        return shippingAddress;
    }

    /**
     * Sets the value of the shippingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setShippingAddress(AddressType value) {
        this.shippingAddress = value;
    }

    /**
     * Gets the value of the userFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserFirstName() {
        return userFirstName;
    }

    /**
     * Sets the value of the userFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserFirstName(String value) {
        this.userFirstName = value;
    }

    /**
     * Gets the value of the userLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserLastName() {
        return userLastName;
    }

    /**
     * Sets the value of the userLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserLastName(String value) {
        this.userLastName = value;
    }

}
