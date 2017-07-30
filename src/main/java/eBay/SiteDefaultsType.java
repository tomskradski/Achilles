
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				A container for feature definitions that apply to the entire site.
 * 			
 * 
 * <p>Java class for SiteDefaultsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SiteDefaultsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListingDuration" type="{urn:ebay:apis:eBLBaseComponents}ListingDurationReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ShippingTermsRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BestOfferEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DutchBINEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserConsentRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HomePageFeaturedEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ProPackEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BasicUpgradePackEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ValuePackEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ProPackPlusEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AdFormatEnabled" type="{urn:ebay:apis:eBLBaseComponents}AdFormatEnabledCodeType" minOccurs="0"/>
 *         &lt;element name="BestOfferCounterEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BestOfferAutoDeclineEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LocalMarketSpecialitySubscription" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LocalMarketRegularSubscription" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LocalMarketPremiumSubscription" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LocalMarketNonSubscription" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ExpressEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ExpressPicturesRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ExpressConditionRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MinimumReservePrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="SellerContactDetailsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TransactionConfirmationRequestEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="StoreInventoryEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SkypeMeTransactionalEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SkypeMeNonTransactionalEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LocalListingDistancesRegular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocalListingDistancesSpecialty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocalListingDistancesNonSubscription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClassifiedAdPaymentMethodEnabled" type="{urn:ebay:apis:eBLBaseComponents}ClassifiedAdPaymentMethodEnabledCodeType" minOccurs="0"/>
 *         &lt;element name="ClassifiedAdShippingMethodEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ClassifiedAdBestOfferEnabled" type="{urn:ebay:apis:eBLBaseComponents}ClassifiedAdBestOfferEnabledCodeType" minOccurs="0"/>
 *         &lt;element name="ClassifiedAdCounterOfferEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ClassifiedAdAutoDeclineEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ClassifiedAdContactByPhoneEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ClassifiedAdContactByEmailEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SafePaymentRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ClassifiedAdPayPerLeadEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ItemSpecificsEnabled" type="{urn:ebay:apis:eBLBaseComponents}ItemSpecificsEnabledCodeType" minOccurs="0"/>
 *         &lt;element name="PaisaPayFullEscrowEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ISBNIdentifierEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UPCIdentifierEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EANIdentifierEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BrandMPNIdentifierEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ClassifiedAdAutoAcceptEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BestOfferAutoAcceptEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CrossBorderTradeNorthAmericaEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CrossBorderTradeGBEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CrossBorderTradeAustraliaEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PayPalBuyerProtectionEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BuyerGuaranteeEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="INEscrowWorkflowTimeline" type="{urn:ebay:apis:eBLBaseComponents}INEscrowWorkflowTimelineCodeType" minOccurs="0"/>
 *         &lt;element name="CombinedFixedPriceTreatmentEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="GalleryFeaturedDurations" type="{urn:ebay:apis:eBLBaseComponents}ListingEnhancementDurationReferenceType" minOccurs="0"/>
 *         &lt;element name="PayPalRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="eBayMotorsProAdFormatEnabled" type="{urn:ebay:apis:eBLBaseComponents}AdFormatEnabledCodeType" minOccurs="0"/>
 *         &lt;element name="eBayMotorsProContactByPhoneEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="eBayMotorsProPhoneCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="eBayMotorsProContactByAddressEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="eBayMotorsProStreetCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="eBayMotorsProCompanyNameEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="eBayMotorsProContactByEmailEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="eBayMotorsProBestOfferEnabled" type="{urn:ebay:apis:eBLBaseComponents}ClassifiedAdBestOfferEnabledCodeType" minOccurs="0"/>
 *         &lt;element name="eBayMotorsProAutoAcceptEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="eBayMotorsProAutoDeclineEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="eBayMotorsProPaymentMethodCheckOutEnabled" type="{urn:ebay:apis:eBLBaseComponents}ClassifiedAdPaymentMethodEnabledCodeType" minOccurs="0"/>
 *         &lt;element name="eBayMotorsProShippingMethodEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="eBayMotorsProCounterOfferEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="eBayMotorsProSellerContactDetailsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LocalMarketAdFormatEnabled" type="{urn:ebay:apis:eBLBaseComponents}AdFormatEnabledCodeType" minOccurs="0"/>
 *         &lt;element name="LocalMarketContactByPhoneEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LocalMarketPhoneCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LocalMarketContactByAddressEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LocalMarketStreetCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LocalMarketCompanyNameEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LocalMarketContactByEmailEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LocalMarketBestOfferEnabled" type="{urn:ebay:apis:eBLBaseComponents}ClassifiedAdBestOfferEnabledCodeType" minOccurs="0"/>
 *         &lt;element name="LocalMarketAutoAcceptEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LocalMarketAutoDeclineEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LocalMarketPaymentMethodCheckOutEnabled" type="{urn:ebay:apis:eBLBaseComponents}ClassifiedAdPaymentMethodEnabledCodeType" minOccurs="0"/>
 *         &lt;element name="LocalMarketShippingMethodEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LocalMarketCounterOfferEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LocalMarketSellerContactDetailsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ClassifiedAdPhoneCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ClassifiedAdContactByAddressEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ClassifiedAdStreetCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ClassifiedAdCompanyNameEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SpecialitySubscription" type="{urn:ebay:apis:eBLBaseComponents}GeographicExposureCodeType" minOccurs="0"/>
 *         &lt;element name="RegularSubscription" type="{urn:ebay:apis:eBLBaseComponents}GeographicExposureCodeType" minOccurs="0"/>
 *         &lt;element name="PremiumSubscription" type="{urn:ebay:apis:eBLBaseComponents}GeographicExposureCodeType" minOccurs="0"/>
 *         &lt;element name="NonSubscription" type="{urn:ebay:apis:eBLBaseComponents}GeographicExposureCodeType" minOccurs="0"/>
 *         &lt;element name="PayPalRequiredForStoreOwner" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ReviseQuantityAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RevisePriceAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="StoreOwnerExtendedListingDurationsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="StoreOwnerExtendedListingDurations" type="{urn:ebay:apis:eBLBaseComponents}StoreOwnerExtendedListingDurationsType" minOccurs="0"/>
 *         &lt;element name="ReturnPolicyEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HandlingTimeEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaxFlatShippingCost" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="MaxFlatShippingCostCBTExempt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Group1MaxFlatShippingCost" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="Group2MaxFlatShippingCost" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="Group3MaxFlatShippingCost" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="PaymentMethod" type="{urn:ebay:apis:eBLBaseComponents}BuyerPaymentMethodCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="VariationsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AttributeConversionEnabled" type="{urn:ebay:apis:eBLBaseComponents}AttributeConversionEnabledCodeType" minOccurs="0"/>
 *         &lt;element name="FreeGalleryPlusEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FreePicturePackEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ItemCompatibilityEnabled" type="{urn:ebay:apis:eBLBaseComponents}ItemCompatibilityEnabledCodeType" minOccurs="0"/>
 *         &lt;element name="MinItemCompatibility" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MaxItemCompatibility" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ConditionEnabled" type="{urn:ebay:apis:eBLBaseComponents}ConditionEnabledCodeType" minOccurs="0"/>
 *         &lt;element name="ConditionValues" type="{urn:ebay:apis:eBLBaseComponents}ConditionValuesType" minOccurs="0"/>
 *         &lt;element name="ValueCategory" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ProductCreationEnabled" type="{urn:ebay:apis:eBLBaseComponents}ProductCreationEnabledCodeType" minOccurs="0"/>
 *         &lt;element name="EANEnabled" type="{urn:ebay:apis:eBLBaseComponents}ProductIdentiferEnabledCodeType" minOccurs="0"/>
 *         &lt;element name="ISBNEnabled" type="{urn:ebay:apis:eBLBaseComponents}ProductIdentiferEnabledCodeType" minOccurs="0"/>
 *         &lt;element name="UPCEnabled" type="{urn:ebay:apis:eBLBaseComponents}ProductIdentiferEnabledCodeType" minOccurs="0"/>
 *         &lt;element name="MaxGranularFitmentCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CompatibleVehicleType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentOptionsGroup" type="{urn:ebay:apis:eBLBaseComponents}PaymentOptionsGroupEnabledCodeType" minOccurs="0"/>
 *         &lt;element name="ShippingProfileCategoryGroup" type="{urn:ebay:apis:eBLBaseComponents}ProfileCategoryGroupCodeType" minOccurs="0"/>
 *         &lt;element name="PaymentProfileCategoryGroup" type="{urn:ebay:apis:eBLBaseComponents}ProfileCategoryGroupCodeType" minOccurs="0"/>
 *         &lt;element name="ReturnPolicyProfileCategoryGroup" type="{urn:ebay:apis:eBLBaseComponents}ProfileCategoryGroupCodeType" minOccurs="0"/>
 *         &lt;element name="VINSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="VRMSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SellerProvidedTitleSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DepositSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="GlobalShippingEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AdditionalCompatibilityEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PickupDropOffEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DigitalGoodDeliveryEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EpidSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="KTypeSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SiteDefaultsType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "listingDuration",
    "shippingTermsRequired",
    "bestOfferEnabled",
    "dutchBINEnabled",
    "userConsentRequired",
    "homePageFeaturedEnabled",
    "proPackEnabled",
    "basicUpgradePackEnabled",
    "valuePackEnabled",
    "proPackPlusEnabled",
    "adFormatEnabled",
    "bestOfferCounterEnabled",
    "bestOfferAutoDeclineEnabled",
    "localMarketSpecialitySubscription",
    "localMarketRegularSubscription",
    "localMarketPremiumSubscription",
    "localMarketNonSubscription",
    "expressEnabled",
    "expressPicturesRequired",
    "expressConditionRequired",
    "minimumReservePrice",
    "sellerContactDetailsEnabled",
    "transactionConfirmationRequestEnabled",
    "storeInventoryEnabled",
    "skypeMeTransactionalEnabled",
    "skypeMeNonTransactionalEnabled",
    "localListingDistancesRegular",
    "localListingDistancesSpecialty",
    "localListingDistancesNonSubscription",
    "classifiedAdPaymentMethodEnabled",
    "classifiedAdShippingMethodEnabled",
    "classifiedAdBestOfferEnabled",
    "classifiedAdCounterOfferEnabled",
    "classifiedAdAutoDeclineEnabled",
    "classifiedAdContactByPhoneEnabled",
    "classifiedAdContactByEmailEnabled",
    "safePaymentRequired",
    "classifiedAdPayPerLeadEnabled",
    "itemSpecificsEnabled",
    "paisaPayFullEscrowEnabled",
    "isbnIdentifierEnabled",
    "upcIdentifierEnabled",
    "eanIdentifierEnabled",
    "brandMPNIdentifierEnabled",
    "classifiedAdAutoAcceptEnabled",
    "bestOfferAutoAcceptEnabled",
    "crossBorderTradeNorthAmericaEnabled",
    "crossBorderTradeGBEnabled",
    "crossBorderTradeAustraliaEnabled",
    "payPalBuyerProtectionEnabled",
    "buyerGuaranteeEnabled",
    "inEscrowWorkflowTimeline",
    "combinedFixedPriceTreatmentEnabled",
    "galleryFeaturedDurations",
    "payPalRequired",
    "eBayMotorsProAdFormatEnabled",
    "eBayMotorsProContactByPhoneEnabled",
    "eBayMotorsProPhoneCount",
    "eBayMotorsProContactByAddressEnabled",
    "eBayMotorsProStreetCount",
    "eBayMotorsProCompanyNameEnabled",
    "eBayMotorsProContactByEmailEnabled",
    "eBayMotorsProBestOfferEnabled",
    "eBayMotorsProAutoAcceptEnabled",
    "eBayMotorsProAutoDeclineEnabled",
    "eBayMotorsProPaymentMethodCheckOutEnabled",
    "eBayMotorsProShippingMethodEnabled",
    "eBayMotorsProCounterOfferEnabled",
    "eBayMotorsProSellerContactDetailsEnabled",
    "localMarketAdFormatEnabled",
    "localMarketContactByPhoneEnabled",
    "localMarketPhoneCount",
    "localMarketContactByAddressEnabled",
    "localMarketStreetCount",
    "localMarketCompanyNameEnabled",
    "localMarketContactByEmailEnabled",
    "localMarketBestOfferEnabled",
    "localMarketAutoAcceptEnabled",
    "localMarketAutoDeclineEnabled",
    "localMarketPaymentMethodCheckOutEnabled",
    "localMarketShippingMethodEnabled",
    "localMarketCounterOfferEnabled",
    "localMarketSellerContactDetailsEnabled",
    "classifiedAdPhoneCount",
    "classifiedAdContactByAddressEnabled",
    "classifiedAdStreetCount",
    "classifiedAdCompanyNameEnabled",
    "specialitySubscription",
    "regularSubscription",
    "premiumSubscription",
    "nonSubscription",
    "payPalRequiredForStoreOwner",
    "reviseQuantityAllowed",
    "revisePriceAllowed",
    "storeOwnerExtendedListingDurationsEnabled",
    "storeOwnerExtendedListingDurations",
    "returnPolicyEnabled",
    "handlingTimeEnabled",
    "maxFlatShippingCost",
    "maxFlatShippingCostCBTExempt",
    "group1MaxFlatShippingCost",
    "group2MaxFlatShippingCost",
    "group3MaxFlatShippingCost",
    "paymentMethod",
    "variationsEnabled",
    "attributeConversionEnabled",
    "freeGalleryPlusEnabled",
    "freePicturePackEnabled",
    "itemCompatibilityEnabled",
    "minItemCompatibility",
    "maxItemCompatibility",
    "conditionEnabled",
    "conditionValues",
    "valueCategory",
    "productCreationEnabled",
    "eanEnabled",
    "isbnEnabled",
    "upcEnabled",
    "maxGranularFitmentCount",
    "compatibleVehicleType",
    "paymentOptionsGroup",
    "shippingProfileCategoryGroup",
    "paymentProfileCategoryGroup",
    "returnPolicyProfileCategoryGroup",
    "vinSupported",
    "vrmSupported",
    "sellerProvidedTitleSupported",
    "depositSupported",
    "globalShippingEnabled",
    "additionalCompatibilityEnabled",
    "pickupDropOffEnabled",
    "digitalGoodDeliveryEnabled",
    "epidSupported",
    "kTypeSupported"
})
public class SiteDefaultsType {

    @XmlElement(name = "ListingDuration", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<ListingDurationReferenceType> listingDuration;
    @XmlElement(name = "ShippingTermsRequired", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean shippingTermsRequired;
    @XmlElement(name = "BestOfferEnabled", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean bestOfferEnabled;
    @XmlElement(name = "DutchBINEnabled", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean dutchBINEnabled;
    @XmlElement(name = "UserConsentRequired", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean userConsentRequired;
    @XmlElement(name = "HomePageFeaturedEnabled", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean homePageFeaturedEnabled;
    @XmlElement(name = "ProPackEnabled", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean proPackEnabled;
    @XmlElement(name = "BasicUpgradePackEnabled", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean basicUpgradePackEnabled;
    @XmlElement(name = "ValuePackEnabled", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean valuePackEnabled;
    @XmlElement(name = "ProPackPlusEnabled", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean proPackPlusEnabled;
    @XmlElement(name = "AdFormatEnabled", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected AdFormatEnabledCodeType adFormatEnabled;
    @XmlElement(name = "BestOfferCounterEnabled", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean bestOfferCounterEnabled;
    @XmlElement(name = "BestOfferAutoDeclineEnabled", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean bestOfferAutoDeclineEnabled;
    @XmlElement(name = "LocalMarketSpecialitySubscription", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean localMarketSpecialitySubscription;
    @XmlElement(name = "LocalMarketRegularSubscription", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean localMarketRegularSubscription;
    @XmlElement(name = "LocalMarketPremiumSubscription", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean localMarketPremiumSubscription;
    @XmlElement(name = "LocalMarketNonSubscription", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean localMarketNonSubscription;
    @XmlElement(name = "ExpressEnabled", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean expressEnabled;
    @XmlElement(name = "ExpressPicturesRequired", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean expressPicturesRequired;
    @XmlElement(name = "ExpressConditionRequired", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean expressConditionRequired;
    @XmlElement(name = "MinimumReservePrice", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Double minimumReservePrice;
    @XmlElement(name = "SellerContactDetailsEnabled", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean sellerContactDetailsEnabled;
    @XmlElement(name = "TransactionConfirmationRequestEnabled", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean transactionConfirmationRequestEnabled;
    @XmlElement(name = "StoreInventoryEnabled", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean storeInventoryEnabled;
    @XmlElement(name = "SkypeMeTransactionalEnabled", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean skypeMeTransactionalEnabled;
    @XmlElement(name = "SkypeMeNonTransactionalEnabled", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean skypeMeNonTransactionalEnabled;
    @XmlElement(name = "LocalListingDistancesRegular", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String localListingDistancesRegular;
    @XmlElement(name = "LocalListingDistancesSpecialty", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String localListingDistancesSpecialty;
    @XmlElement(name = "LocalListingDistancesNonSubscription", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String localListingDistancesNonSubscription;
    @XmlElement(name = "ClassifiedAdPaymentMethodEnabled", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected ClassifiedAdPaymentMethodEnabledCodeType classifiedAdPaymentMethodEnabled;
    @XmlElement(name = "ClassifiedAdShippingMethodEnabled", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean classifiedAdShippingMethodEnabled;
    @XmlElement(name = "ClassifiedAdBestOfferEnabled", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected ClassifiedAdBestOfferEnabledCodeType classifiedAdBestOfferEnabled;
    @XmlElement(name = "ClassifiedAdCounterOfferEnabled", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean classifiedAdCounterOfferEnabled;
    @XmlElement(name = "ClassifiedAdAutoDeclineEnabled", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean classifiedAdAutoDeclineEnabled;
    @XmlElement(name = "ClassifiedAdContactByPhoneEnabled", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean classifiedAdContactByPhoneEnabled;
    @XmlElement(name = "ClassifiedAdContactByEmailEnabled", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean classifiedAdContactByEmailEnabled;
    @XmlElement(name = "SafePaymentRequired", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean safePaymentRequired;
    @XmlElement(name = "ClassifiedAdPayPerLeadEnabled", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean classifiedAdPayPerLeadEnabled;
    @XmlElement(name = "ItemSpecificsEnabled", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected ItemSpecificsEnabledCodeType itemSpecificsEnabled;
    @XmlElement(name = "PaisaPayFullEscrowEnabled", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean paisaPayFullEscrowEnabled;
    @XmlElement(name = "ISBNIdentifierEnabled", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean isbnIdentifierEnabled;
    @XmlElement(name = "UPCIdentifierEnabled", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean upcIdentifierEnabled;
    @XmlElement(name = "EANIdentifierEnabled", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean eanIdentifierEnabled;
    @XmlElement(name = "BrandMPNIdentifierEnabled", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean brandMPNIdentifierEnabled;
    @XmlElement(name = "ClassifiedAdAutoAcceptEnabled", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean classifiedAdAutoAcceptEnabled;
    @XmlElement(name = "BestOfferAutoAcceptEnabled", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean bestOfferAutoAcceptEnabled;
    @XmlElement(name = "CrossBorderTradeNorthAmericaEnabled", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean crossBorderTradeNorthAmericaEnabled;
    @XmlElement(name = "CrossBorderTradeGBEnabled", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean crossBorderTradeGBEnabled;
    @XmlElement(name = "CrossBorderTradeAustraliaEnabled", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean crossBorderTradeAustraliaEnabled;
    @XmlElement(name = "PayPalBuyerProtectionEnabled", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean payPalBuyerProtectionEnabled;
    @XmlElement(name = "BuyerGuaranteeEnabled", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean buyerGuaranteeEnabled;
    @XmlElement(name = "INEscrowWorkflowTimeline", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected INEscrowWorkflowTimelineCodeType inEscrowWorkflowTimeline;
    @XmlElement(name = "CombinedFixedPriceTreatmentEnabled", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean combinedFixedPriceTreatmentEnabled;
    @XmlElement(name = "GalleryFeaturedDurations", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected ListingEnhancementDurationReferenceType galleryFeaturedDurations;
    @XmlElement(name = "PayPalRequired", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean payPalRequired;
    @XmlElement(namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected AdFormatEnabledCodeType eBayMotorsProAdFormatEnabled;
    @XmlElement(namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean eBayMotorsProContactByPhoneEnabled;
    @XmlElement(namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer eBayMotorsProPhoneCount;
    @XmlElement(namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean eBayMotorsProContactByAddressEnabled;
    @XmlElement(namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer eBayMotorsProStreetCount;
    @XmlElement(namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean eBayMotorsProCompanyNameEnabled;
    @XmlElement(namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean eBayMotorsProContactByEmailEnabled;
    @XmlElement(namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected ClassifiedAdBestOfferEnabledCodeType eBayMotorsProBestOfferEnabled;
    @XmlElement(namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean eBayMotorsProAutoAcceptEnabled;
    @XmlElement(namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean eBayMotorsProAutoDeclineEnabled;
    @XmlElement(namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected ClassifiedAdPaymentMethodEnabledCodeType eBayMotorsProPaymentMethodCheckOutEnabled;
    @XmlElement(namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean eBayMotorsProShippingMethodEnabled;
    @XmlElement(namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean eBayMotorsProCounterOfferEnabled;
    @XmlElement(namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean eBayMotorsProSellerContactDetailsEnabled;
    @XmlElement(name = "LocalMarketAdFormatEnabled", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected AdFormatEnabledCodeType localMarketAdFormatEnabled;
    @XmlElement(name = "LocalMarketContactByPhoneEnabled", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean localMarketContactByPhoneEnabled;
    @XmlElement(name = "LocalMarketPhoneCount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer localMarketPhoneCount;
    @XmlElement(name = "LocalMarketContactByAddressEnabled", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean localMarketContactByAddressEnabled;
    @XmlElement(name = "LocalMarketStreetCount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer localMarketStreetCount;
    @XmlElement(name = "LocalMarketCompanyNameEnabled", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean localMarketCompanyNameEnabled;
    @XmlElement(name = "LocalMarketContactByEmailEnabled", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean localMarketContactByEmailEnabled;
    @XmlElement(name = "LocalMarketBestOfferEnabled", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected ClassifiedAdBestOfferEnabledCodeType localMarketBestOfferEnabled;
    @XmlElement(name = "LocalMarketAutoAcceptEnabled", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean localMarketAutoAcceptEnabled;
    @XmlElement(name = "LocalMarketAutoDeclineEnabled", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean localMarketAutoDeclineEnabled;
    @XmlElement(name = "LocalMarketPaymentMethodCheckOutEnabled", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected ClassifiedAdPaymentMethodEnabledCodeType localMarketPaymentMethodCheckOutEnabled;
    @XmlElement(name = "LocalMarketShippingMethodEnabled", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean localMarketShippingMethodEnabled;
    @XmlElement(name = "LocalMarketCounterOfferEnabled", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean localMarketCounterOfferEnabled;
    @XmlElement(name = "LocalMarketSellerContactDetailsEnabled", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean localMarketSellerContactDetailsEnabled;
    @XmlElement(name = "ClassifiedAdPhoneCount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer classifiedAdPhoneCount;
    @XmlElement(name = "ClassifiedAdContactByAddressEnabled", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean classifiedAdContactByAddressEnabled;
    @XmlElement(name = "ClassifiedAdStreetCount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer classifiedAdStreetCount;
    @XmlElement(name = "ClassifiedAdCompanyNameEnabled", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean classifiedAdCompanyNameEnabled;
    @XmlElement(name = "SpecialitySubscription", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected GeographicExposureCodeType specialitySubscription;
    @XmlElement(name = "RegularSubscription", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected GeographicExposureCodeType regularSubscription;
    @XmlElement(name = "PremiumSubscription", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected GeographicExposureCodeType premiumSubscription;
    @XmlElement(name = "NonSubscription", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected GeographicExposureCodeType nonSubscription;
    @XmlElement(name = "PayPalRequiredForStoreOwner", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean payPalRequiredForStoreOwner;
    @XmlElement(name = "ReviseQuantityAllowed", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean reviseQuantityAllowed;
    @XmlElement(name = "RevisePriceAllowed", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean revisePriceAllowed;
    @XmlElement(name = "StoreOwnerExtendedListingDurationsEnabled", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean storeOwnerExtendedListingDurationsEnabled;
    @XmlElement(name = "StoreOwnerExtendedListingDurations", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected StoreOwnerExtendedListingDurationsType storeOwnerExtendedListingDurations;
    @XmlElement(name = "ReturnPolicyEnabled", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean returnPolicyEnabled;
    @XmlElement(name = "HandlingTimeEnabled", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean handlingTimeEnabled;
    @XmlElement(name = "MaxFlatShippingCost", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType maxFlatShippingCost;
    @XmlElement(name = "MaxFlatShippingCostCBTExempt", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean maxFlatShippingCostCBTExempt;
    @XmlElement(name = "Group1MaxFlatShippingCost", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType group1MaxFlatShippingCost;
    @XmlElement(name = "Group2MaxFlatShippingCost", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType group2MaxFlatShippingCost;
    @XmlElement(name = "Group3MaxFlatShippingCost", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType group3MaxFlatShippingCost;
    @XmlElement(name = "PaymentMethod", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected List<BuyerPaymentMethodCodeType> paymentMethod;
    @XmlElement(name = "VariationsEnabled", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean variationsEnabled;
    @XmlElement(name = "AttributeConversionEnabled", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected AttributeConversionEnabledCodeType attributeConversionEnabled;
    @XmlElement(name = "FreeGalleryPlusEnabled", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean freeGalleryPlusEnabled;
    @XmlElement(name = "FreePicturePackEnabled", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean freePicturePackEnabled;
    @XmlElement(name = "ItemCompatibilityEnabled", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected ItemCompatibilityEnabledCodeType itemCompatibilityEnabled;
    @XmlElement(name = "MinItemCompatibility", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer minItemCompatibility;
    @XmlElement(name = "MaxItemCompatibility", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer maxItemCompatibility;
    @XmlElement(name = "ConditionEnabled", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected ConditionEnabledCodeType conditionEnabled;
    @XmlElement(name = "ConditionValues", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected ConditionValuesType conditionValues;
    @XmlElement(name = "ValueCategory", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean valueCategory;
    @XmlElement(name = "ProductCreationEnabled", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected ProductCreationEnabledCodeType productCreationEnabled;
    @XmlElement(name = "EANEnabled", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected ProductIdentiferEnabledCodeType eanEnabled;
    @XmlElement(name = "ISBNEnabled", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected ProductIdentiferEnabledCodeType isbnEnabled;
    @XmlElement(name = "UPCEnabled", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected ProductIdentiferEnabledCodeType upcEnabled;
    @XmlElement(name = "MaxGranularFitmentCount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer maxGranularFitmentCount;
    @XmlElement(name = "CompatibleVehicleType", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String compatibleVehicleType;
    @XmlElement(name = "PaymentOptionsGroup", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected PaymentOptionsGroupEnabledCodeType paymentOptionsGroup;
    @XmlElement(name = "ShippingProfileCategoryGroup", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected ProfileCategoryGroupCodeType shippingProfileCategoryGroup;
    @XmlElement(name = "PaymentProfileCategoryGroup", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected ProfileCategoryGroupCodeType paymentProfileCategoryGroup;
    @XmlElement(name = "ReturnPolicyProfileCategoryGroup", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected ProfileCategoryGroupCodeType returnPolicyProfileCategoryGroup;
    @XmlElement(name = "VINSupported", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean vinSupported;
    @XmlElement(name = "VRMSupported", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean vrmSupported;
    @XmlElement(name = "SellerProvidedTitleSupported", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean sellerProvidedTitleSupported;
    @XmlElement(name = "DepositSupported", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean depositSupported;
    @XmlElement(name = "GlobalShippingEnabled", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean globalShippingEnabled;
    @XmlElement(name = "AdditionalCompatibilityEnabled", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean additionalCompatibilityEnabled;
    @XmlElement(name = "PickupDropOffEnabled", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean pickupDropOffEnabled;
    @XmlElement(name = "DigitalGoodDeliveryEnabled", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean digitalGoodDeliveryEnabled;
    @XmlElement(name = "EpidSupported", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean epidSupported;
    @XmlElement(name = "KTypeSupported", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean kTypeSupported;

    /**
     * Gets the value of the listingDuration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listingDuration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListingDuration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListingDurationReferenceType }
     * 
     * 
     */
    public List<ListingDurationReferenceType> getListingDuration() {
        if (listingDuration == null) {
            listingDuration = new ArrayList<ListingDurationReferenceType>();
        }
        return this.listingDuration;
    }

    /**
     * Gets the value of the shippingTermsRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShippingTermsRequired() {
        return shippingTermsRequired;
    }

    /**
     * Sets the value of the shippingTermsRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShippingTermsRequired(Boolean value) {
        this.shippingTermsRequired = value;
    }

    /**
     * Gets the value of the bestOfferEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBestOfferEnabled() {
        return bestOfferEnabled;
    }

    /**
     * Sets the value of the bestOfferEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBestOfferEnabled(Boolean value) {
        this.bestOfferEnabled = value;
    }

    /**
     * Gets the value of the dutchBINEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDutchBINEnabled() {
        return dutchBINEnabled;
    }

    /**
     * Sets the value of the dutchBINEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDutchBINEnabled(Boolean value) {
        this.dutchBINEnabled = value;
    }

    /**
     * Gets the value of the userConsentRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserConsentRequired() {
        return userConsentRequired;
    }

    /**
     * Sets the value of the userConsentRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserConsentRequired(Boolean value) {
        this.userConsentRequired = value;
    }

    /**
     * Gets the value of the homePageFeaturedEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHomePageFeaturedEnabled() {
        return homePageFeaturedEnabled;
    }

    /**
     * Sets the value of the homePageFeaturedEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHomePageFeaturedEnabled(Boolean value) {
        this.homePageFeaturedEnabled = value;
    }

    /**
     * Gets the value of the proPackEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProPackEnabled() {
        return proPackEnabled;
    }

    /**
     * Sets the value of the proPackEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProPackEnabled(Boolean value) {
        this.proPackEnabled = value;
    }

    /**
     * Gets the value of the basicUpgradePackEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBasicUpgradePackEnabled() {
        return basicUpgradePackEnabled;
    }

    /**
     * Sets the value of the basicUpgradePackEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBasicUpgradePackEnabled(Boolean value) {
        this.basicUpgradePackEnabled = value;
    }

    /**
     * Gets the value of the valuePackEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isValuePackEnabled() {
        return valuePackEnabled;
    }

    /**
     * Sets the value of the valuePackEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setValuePackEnabled(Boolean value) {
        this.valuePackEnabled = value;
    }

    /**
     * Gets the value of the proPackPlusEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProPackPlusEnabled() {
        return proPackPlusEnabled;
    }

    /**
     * Sets the value of the proPackPlusEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProPackPlusEnabled(Boolean value) {
        this.proPackPlusEnabled = value;
    }

    /**
     * Gets the value of the adFormatEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link AdFormatEnabledCodeType }
     *     
     */
    public AdFormatEnabledCodeType getAdFormatEnabled() {
        return adFormatEnabled;
    }

    /**
     * Sets the value of the adFormatEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdFormatEnabledCodeType }
     *     
     */
    public void setAdFormatEnabled(AdFormatEnabledCodeType value) {
        this.adFormatEnabled = value;
    }

    /**
     * Gets the value of the bestOfferCounterEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBestOfferCounterEnabled() {
        return bestOfferCounterEnabled;
    }

    /**
     * Sets the value of the bestOfferCounterEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBestOfferCounterEnabled(Boolean value) {
        this.bestOfferCounterEnabled = value;
    }

    /**
     * Gets the value of the bestOfferAutoDeclineEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBestOfferAutoDeclineEnabled() {
        return bestOfferAutoDeclineEnabled;
    }

    /**
     * Sets the value of the bestOfferAutoDeclineEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBestOfferAutoDeclineEnabled(Boolean value) {
        this.bestOfferAutoDeclineEnabled = value;
    }

    /**
     * Gets the value of the localMarketSpecialitySubscription property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocalMarketSpecialitySubscription() {
        return localMarketSpecialitySubscription;
    }

    /**
     * Sets the value of the localMarketSpecialitySubscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocalMarketSpecialitySubscription(Boolean value) {
        this.localMarketSpecialitySubscription = value;
    }

    /**
     * Gets the value of the localMarketRegularSubscription property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocalMarketRegularSubscription() {
        return localMarketRegularSubscription;
    }

    /**
     * Sets the value of the localMarketRegularSubscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocalMarketRegularSubscription(Boolean value) {
        this.localMarketRegularSubscription = value;
    }

    /**
     * Gets the value of the localMarketPremiumSubscription property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocalMarketPremiumSubscription() {
        return localMarketPremiumSubscription;
    }

    /**
     * Sets the value of the localMarketPremiumSubscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocalMarketPremiumSubscription(Boolean value) {
        this.localMarketPremiumSubscription = value;
    }

    /**
     * Gets the value of the localMarketNonSubscription property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocalMarketNonSubscription() {
        return localMarketNonSubscription;
    }

    /**
     * Sets the value of the localMarketNonSubscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocalMarketNonSubscription(Boolean value) {
        this.localMarketNonSubscription = value;
    }

    /**
     * Gets the value of the expressEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExpressEnabled() {
        return expressEnabled;
    }

    /**
     * Sets the value of the expressEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExpressEnabled(Boolean value) {
        this.expressEnabled = value;
    }

    /**
     * Gets the value of the expressPicturesRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExpressPicturesRequired() {
        return expressPicturesRequired;
    }

    /**
     * Sets the value of the expressPicturesRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExpressPicturesRequired(Boolean value) {
        this.expressPicturesRequired = value;
    }

    /**
     * Gets the value of the expressConditionRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExpressConditionRequired() {
        return expressConditionRequired;
    }

    /**
     * Sets the value of the expressConditionRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExpressConditionRequired(Boolean value) {
        this.expressConditionRequired = value;
    }

    /**
     * Gets the value of the minimumReservePrice property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinimumReservePrice() {
        return minimumReservePrice;
    }

    /**
     * Sets the value of the minimumReservePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinimumReservePrice(Double value) {
        this.minimumReservePrice = value;
    }

    /**
     * Gets the value of the sellerContactDetailsEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSellerContactDetailsEnabled() {
        return sellerContactDetailsEnabled;
    }

    /**
     * Sets the value of the sellerContactDetailsEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSellerContactDetailsEnabled(Boolean value) {
        this.sellerContactDetailsEnabled = value;
    }

    /**
     * Gets the value of the transactionConfirmationRequestEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTransactionConfirmationRequestEnabled() {
        return transactionConfirmationRequestEnabled;
    }

    /**
     * Sets the value of the transactionConfirmationRequestEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTransactionConfirmationRequestEnabled(Boolean value) {
        this.transactionConfirmationRequestEnabled = value;
    }

    /**
     * Gets the value of the storeInventoryEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStoreInventoryEnabled() {
        return storeInventoryEnabled;
    }

    /**
     * Sets the value of the storeInventoryEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStoreInventoryEnabled(Boolean value) {
        this.storeInventoryEnabled = value;
    }

    /**
     * Gets the value of the skypeMeTransactionalEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSkypeMeTransactionalEnabled() {
        return skypeMeTransactionalEnabled;
    }

    /**
     * Sets the value of the skypeMeTransactionalEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSkypeMeTransactionalEnabled(Boolean value) {
        this.skypeMeTransactionalEnabled = value;
    }

    /**
     * Gets the value of the skypeMeNonTransactionalEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSkypeMeNonTransactionalEnabled() {
        return skypeMeNonTransactionalEnabled;
    }

    /**
     * Sets the value of the skypeMeNonTransactionalEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSkypeMeNonTransactionalEnabled(Boolean value) {
        this.skypeMeNonTransactionalEnabled = value;
    }

    /**
     * Gets the value of the localListingDistancesRegular property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalListingDistancesRegular() {
        return localListingDistancesRegular;
    }

    /**
     * Sets the value of the localListingDistancesRegular property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalListingDistancesRegular(String value) {
        this.localListingDistancesRegular = value;
    }

    /**
     * Gets the value of the localListingDistancesSpecialty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalListingDistancesSpecialty() {
        return localListingDistancesSpecialty;
    }

    /**
     * Sets the value of the localListingDistancesSpecialty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalListingDistancesSpecialty(String value) {
        this.localListingDistancesSpecialty = value;
    }

    /**
     * Gets the value of the localListingDistancesNonSubscription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalListingDistancesNonSubscription() {
        return localListingDistancesNonSubscription;
    }

    /**
     * Sets the value of the localListingDistancesNonSubscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalListingDistancesNonSubscription(String value) {
        this.localListingDistancesNonSubscription = value;
    }

    /**
     * Gets the value of the classifiedAdPaymentMethodEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link ClassifiedAdPaymentMethodEnabledCodeType }
     *     
     */
    public ClassifiedAdPaymentMethodEnabledCodeType getClassifiedAdPaymentMethodEnabled() {
        return classifiedAdPaymentMethodEnabled;
    }

    /**
     * Sets the value of the classifiedAdPaymentMethodEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassifiedAdPaymentMethodEnabledCodeType }
     *     
     */
    public void setClassifiedAdPaymentMethodEnabled(ClassifiedAdPaymentMethodEnabledCodeType value) {
        this.classifiedAdPaymentMethodEnabled = value;
    }

    /**
     * Gets the value of the classifiedAdShippingMethodEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClassifiedAdShippingMethodEnabled() {
        return classifiedAdShippingMethodEnabled;
    }

    /**
     * Sets the value of the classifiedAdShippingMethodEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClassifiedAdShippingMethodEnabled(Boolean value) {
        this.classifiedAdShippingMethodEnabled = value;
    }

    /**
     * Gets the value of the classifiedAdBestOfferEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link ClassifiedAdBestOfferEnabledCodeType }
     *     
     */
    public ClassifiedAdBestOfferEnabledCodeType getClassifiedAdBestOfferEnabled() {
        return classifiedAdBestOfferEnabled;
    }

    /**
     * Sets the value of the classifiedAdBestOfferEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassifiedAdBestOfferEnabledCodeType }
     *     
     */
    public void setClassifiedAdBestOfferEnabled(ClassifiedAdBestOfferEnabledCodeType value) {
        this.classifiedAdBestOfferEnabled = value;
    }

    /**
     * Gets the value of the classifiedAdCounterOfferEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClassifiedAdCounterOfferEnabled() {
        return classifiedAdCounterOfferEnabled;
    }

    /**
     * Sets the value of the classifiedAdCounterOfferEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClassifiedAdCounterOfferEnabled(Boolean value) {
        this.classifiedAdCounterOfferEnabled = value;
    }

    /**
     * Gets the value of the classifiedAdAutoDeclineEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClassifiedAdAutoDeclineEnabled() {
        return classifiedAdAutoDeclineEnabled;
    }

    /**
     * Sets the value of the classifiedAdAutoDeclineEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClassifiedAdAutoDeclineEnabled(Boolean value) {
        this.classifiedAdAutoDeclineEnabled = value;
    }

    /**
     * Gets the value of the classifiedAdContactByPhoneEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClassifiedAdContactByPhoneEnabled() {
        return classifiedAdContactByPhoneEnabled;
    }

    /**
     * Sets the value of the classifiedAdContactByPhoneEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClassifiedAdContactByPhoneEnabled(Boolean value) {
        this.classifiedAdContactByPhoneEnabled = value;
    }

    /**
     * Gets the value of the classifiedAdContactByEmailEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClassifiedAdContactByEmailEnabled() {
        return classifiedAdContactByEmailEnabled;
    }

    /**
     * Sets the value of the classifiedAdContactByEmailEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClassifiedAdContactByEmailEnabled(Boolean value) {
        this.classifiedAdContactByEmailEnabled = value;
    }

    /**
     * Gets the value of the safePaymentRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSafePaymentRequired() {
        return safePaymentRequired;
    }

    /**
     * Sets the value of the safePaymentRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSafePaymentRequired(Boolean value) {
        this.safePaymentRequired = value;
    }

    /**
     * Gets the value of the classifiedAdPayPerLeadEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClassifiedAdPayPerLeadEnabled() {
        return classifiedAdPayPerLeadEnabled;
    }

    /**
     * Sets the value of the classifiedAdPayPerLeadEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClassifiedAdPayPerLeadEnabled(Boolean value) {
        this.classifiedAdPayPerLeadEnabled = value;
    }

    /**
     * Gets the value of the itemSpecificsEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link ItemSpecificsEnabledCodeType }
     *     
     */
    public ItemSpecificsEnabledCodeType getItemSpecificsEnabled() {
        return itemSpecificsEnabled;
    }

    /**
     * Sets the value of the itemSpecificsEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSpecificsEnabledCodeType }
     *     
     */
    public void setItemSpecificsEnabled(ItemSpecificsEnabledCodeType value) {
        this.itemSpecificsEnabled = value;
    }

    /**
     * Gets the value of the paisaPayFullEscrowEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPaisaPayFullEscrowEnabled() {
        return paisaPayFullEscrowEnabled;
    }

    /**
     * Sets the value of the paisaPayFullEscrowEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPaisaPayFullEscrowEnabled(Boolean value) {
        this.paisaPayFullEscrowEnabled = value;
    }

    /**
     * Gets the value of the isbnIdentifierEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISBNIdentifierEnabled() {
        return isbnIdentifierEnabled;
    }

    /**
     * Sets the value of the isbnIdentifierEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISBNIdentifierEnabled(Boolean value) {
        this.isbnIdentifierEnabled = value;
    }

    /**
     * Gets the value of the upcIdentifierEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUPCIdentifierEnabled() {
        return upcIdentifierEnabled;
    }

    /**
     * Sets the value of the upcIdentifierEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUPCIdentifierEnabled(Boolean value) {
        this.upcIdentifierEnabled = value;
    }

    /**
     * Gets the value of the eanIdentifierEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEANIdentifierEnabled() {
        return eanIdentifierEnabled;
    }

    /**
     * Sets the value of the eanIdentifierEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEANIdentifierEnabled(Boolean value) {
        this.eanIdentifierEnabled = value;
    }

    /**
     * Gets the value of the brandMPNIdentifierEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBrandMPNIdentifierEnabled() {
        return brandMPNIdentifierEnabled;
    }

    /**
     * Sets the value of the brandMPNIdentifierEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBrandMPNIdentifierEnabled(Boolean value) {
        this.brandMPNIdentifierEnabled = value;
    }

    /**
     * Gets the value of the classifiedAdAutoAcceptEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClassifiedAdAutoAcceptEnabled() {
        return classifiedAdAutoAcceptEnabled;
    }

    /**
     * Sets the value of the classifiedAdAutoAcceptEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClassifiedAdAutoAcceptEnabled(Boolean value) {
        this.classifiedAdAutoAcceptEnabled = value;
    }

    /**
     * Gets the value of the bestOfferAutoAcceptEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBestOfferAutoAcceptEnabled() {
        return bestOfferAutoAcceptEnabled;
    }

    /**
     * Sets the value of the bestOfferAutoAcceptEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBestOfferAutoAcceptEnabled(Boolean value) {
        this.bestOfferAutoAcceptEnabled = value;
    }

    /**
     * Gets the value of the crossBorderTradeNorthAmericaEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCrossBorderTradeNorthAmericaEnabled() {
        return crossBorderTradeNorthAmericaEnabled;
    }

    /**
     * Sets the value of the crossBorderTradeNorthAmericaEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCrossBorderTradeNorthAmericaEnabled(Boolean value) {
        this.crossBorderTradeNorthAmericaEnabled = value;
    }

    /**
     * Gets the value of the crossBorderTradeGBEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCrossBorderTradeGBEnabled() {
        return crossBorderTradeGBEnabled;
    }

    /**
     * Sets the value of the crossBorderTradeGBEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCrossBorderTradeGBEnabled(Boolean value) {
        this.crossBorderTradeGBEnabled = value;
    }

    /**
     * Gets the value of the crossBorderTradeAustraliaEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCrossBorderTradeAustraliaEnabled() {
        return crossBorderTradeAustraliaEnabled;
    }

    /**
     * Sets the value of the crossBorderTradeAustraliaEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCrossBorderTradeAustraliaEnabled(Boolean value) {
        this.crossBorderTradeAustraliaEnabled = value;
    }

    /**
     * Gets the value of the payPalBuyerProtectionEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPayPalBuyerProtectionEnabled() {
        return payPalBuyerProtectionEnabled;
    }

    /**
     * Sets the value of the payPalBuyerProtectionEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPayPalBuyerProtectionEnabled(Boolean value) {
        this.payPalBuyerProtectionEnabled = value;
    }

    /**
     * Gets the value of the buyerGuaranteeEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBuyerGuaranteeEnabled() {
        return buyerGuaranteeEnabled;
    }

    /**
     * Sets the value of the buyerGuaranteeEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBuyerGuaranteeEnabled(Boolean value) {
        this.buyerGuaranteeEnabled = value;
    }

    /**
     * Gets the value of the inEscrowWorkflowTimeline property.
     * 
     * @return
     *     possible object is
     *     {@link INEscrowWorkflowTimelineCodeType }
     *     
     */
    public INEscrowWorkflowTimelineCodeType getINEscrowWorkflowTimeline() {
        return inEscrowWorkflowTimeline;
    }

    /**
     * Sets the value of the inEscrowWorkflowTimeline property.
     * 
     * @param value
     *     allowed object is
     *     {@link INEscrowWorkflowTimelineCodeType }
     *     
     */
    public void setINEscrowWorkflowTimeline(INEscrowWorkflowTimelineCodeType value) {
        this.inEscrowWorkflowTimeline = value;
    }

    /**
     * Gets the value of the combinedFixedPriceTreatmentEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCombinedFixedPriceTreatmentEnabled() {
        return combinedFixedPriceTreatmentEnabled;
    }

    /**
     * Sets the value of the combinedFixedPriceTreatmentEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCombinedFixedPriceTreatmentEnabled(Boolean value) {
        this.combinedFixedPriceTreatmentEnabled = value;
    }

    /**
     * Gets the value of the galleryFeaturedDurations property.
     * 
     * @return
     *     possible object is
     *     {@link ListingEnhancementDurationReferenceType }
     *     
     */
    public ListingEnhancementDurationReferenceType getGalleryFeaturedDurations() {
        return galleryFeaturedDurations;
    }

    /**
     * Sets the value of the galleryFeaturedDurations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListingEnhancementDurationReferenceType }
     *     
     */
    public void setGalleryFeaturedDurations(ListingEnhancementDurationReferenceType value) {
        this.galleryFeaturedDurations = value;
    }

    /**
     * Gets the value of the payPalRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPayPalRequired() {
        return payPalRequired;
    }

    /**
     * Sets the value of the payPalRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPayPalRequired(Boolean value) {
        this.payPalRequired = value;
    }

    /**
     * Gets the value of the eBayMotorsProAdFormatEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link AdFormatEnabledCodeType }
     *     
     */
    public AdFormatEnabledCodeType getEBayMotorsProAdFormatEnabled() {
        return eBayMotorsProAdFormatEnabled;
    }

    /**
     * Sets the value of the eBayMotorsProAdFormatEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdFormatEnabledCodeType }
     *     
     */
    public void setEBayMotorsProAdFormatEnabled(AdFormatEnabledCodeType value) {
        this.eBayMotorsProAdFormatEnabled = value;
    }

    /**
     * Gets the value of the eBayMotorsProContactByPhoneEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEBayMotorsProContactByPhoneEnabled() {
        return eBayMotorsProContactByPhoneEnabled;
    }

    /**
     * Sets the value of the eBayMotorsProContactByPhoneEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEBayMotorsProContactByPhoneEnabled(Boolean value) {
        this.eBayMotorsProContactByPhoneEnabled = value;
    }

    /**
     * Gets the value of the eBayMotorsProPhoneCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEBayMotorsProPhoneCount() {
        return eBayMotorsProPhoneCount;
    }

    /**
     * Sets the value of the eBayMotorsProPhoneCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEBayMotorsProPhoneCount(Integer value) {
        this.eBayMotorsProPhoneCount = value;
    }

    /**
     * Gets the value of the eBayMotorsProContactByAddressEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEBayMotorsProContactByAddressEnabled() {
        return eBayMotorsProContactByAddressEnabled;
    }

    /**
     * Sets the value of the eBayMotorsProContactByAddressEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEBayMotorsProContactByAddressEnabled(Boolean value) {
        this.eBayMotorsProContactByAddressEnabled = value;
    }

    /**
     * Gets the value of the eBayMotorsProStreetCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEBayMotorsProStreetCount() {
        return eBayMotorsProStreetCount;
    }

    /**
     * Sets the value of the eBayMotorsProStreetCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEBayMotorsProStreetCount(Integer value) {
        this.eBayMotorsProStreetCount = value;
    }

    /**
     * Gets the value of the eBayMotorsProCompanyNameEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEBayMotorsProCompanyNameEnabled() {
        return eBayMotorsProCompanyNameEnabled;
    }

    /**
     * Sets the value of the eBayMotorsProCompanyNameEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEBayMotorsProCompanyNameEnabled(Boolean value) {
        this.eBayMotorsProCompanyNameEnabled = value;
    }

    /**
     * Gets the value of the eBayMotorsProContactByEmailEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEBayMotorsProContactByEmailEnabled() {
        return eBayMotorsProContactByEmailEnabled;
    }

    /**
     * Sets the value of the eBayMotorsProContactByEmailEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEBayMotorsProContactByEmailEnabled(Boolean value) {
        this.eBayMotorsProContactByEmailEnabled = value;
    }

    /**
     * Gets the value of the eBayMotorsProBestOfferEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link ClassifiedAdBestOfferEnabledCodeType }
     *     
     */
    public ClassifiedAdBestOfferEnabledCodeType getEBayMotorsProBestOfferEnabled() {
        return eBayMotorsProBestOfferEnabled;
    }

    /**
     * Sets the value of the eBayMotorsProBestOfferEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassifiedAdBestOfferEnabledCodeType }
     *     
     */
    public void setEBayMotorsProBestOfferEnabled(ClassifiedAdBestOfferEnabledCodeType value) {
        this.eBayMotorsProBestOfferEnabled = value;
    }

    /**
     * Gets the value of the eBayMotorsProAutoAcceptEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEBayMotorsProAutoAcceptEnabled() {
        return eBayMotorsProAutoAcceptEnabled;
    }

    /**
     * Sets the value of the eBayMotorsProAutoAcceptEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEBayMotorsProAutoAcceptEnabled(Boolean value) {
        this.eBayMotorsProAutoAcceptEnabled = value;
    }

    /**
     * Gets the value of the eBayMotorsProAutoDeclineEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEBayMotorsProAutoDeclineEnabled() {
        return eBayMotorsProAutoDeclineEnabled;
    }

    /**
     * Sets the value of the eBayMotorsProAutoDeclineEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEBayMotorsProAutoDeclineEnabled(Boolean value) {
        this.eBayMotorsProAutoDeclineEnabled = value;
    }

    /**
     * Gets the value of the eBayMotorsProPaymentMethodCheckOutEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link ClassifiedAdPaymentMethodEnabledCodeType }
     *     
     */
    public ClassifiedAdPaymentMethodEnabledCodeType getEBayMotorsProPaymentMethodCheckOutEnabled() {
        return eBayMotorsProPaymentMethodCheckOutEnabled;
    }

    /**
     * Sets the value of the eBayMotorsProPaymentMethodCheckOutEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassifiedAdPaymentMethodEnabledCodeType }
     *     
     */
    public void setEBayMotorsProPaymentMethodCheckOutEnabled(ClassifiedAdPaymentMethodEnabledCodeType value) {
        this.eBayMotorsProPaymentMethodCheckOutEnabled = value;
    }

    /**
     * Gets the value of the eBayMotorsProShippingMethodEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEBayMotorsProShippingMethodEnabled() {
        return eBayMotorsProShippingMethodEnabled;
    }

    /**
     * Sets the value of the eBayMotorsProShippingMethodEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEBayMotorsProShippingMethodEnabled(Boolean value) {
        this.eBayMotorsProShippingMethodEnabled = value;
    }

    /**
     * Gets the value of the eBayMotorsProCounterOfferEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEBayMotorsProCounterOfferEnabled() {
        return eBayMotorsProCounterOfferEnabled;
    }

    /**
     * Sets the value of the eBayMotorsProCounterOfferEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEBayMotorsProCounterOfferEnabled(Boolean value) {
        this.eBayMotorsProCounterOfferEnabled = value;
    }

    /**
     * Gets the value of the eBayMotorsProSellerContactDetailsEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEBayMotorsProSellerContactDetailsEnabled() {
        return eBayMotorsProSellerContactDetailsEnabled;
    }

    /**
     * Sets the value of the eBayMotorsProSellerContactDetailsEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEBayMotorsProSellerContactDetailsEnabled(Boolean value) {
        this.eBayMotorsProSellerContactDetailsEnabled = value;
    }

    /**
     * Gets the value of the localMarketAdFormatEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link AdFormatEnabledCodeType }
     *     
     */
    public AdFormatEnabledCodeType getLocalMarketAdFormatEnabled() {
        return localMarketAdFormatEnabled;
    }

    /**
     * Sets the value of the localMarketAdFormatEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdFormatEnabledCodeType }
     *     
     */
    public void setLocalMarketAdFormatEnabled(AdFormatEnabledCodeType value) {
        this.localMarketAdFormatEnabled = value;
    }

    /**
     * Gets the value of the localMarketContactByPhoneEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocalMarketContactByPhoneEnabled() {
        return localMarketContactByPhoneEnabled;
    }

    /**
     * Sets the value of the localMarketContactByPhoneEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocalMarketContactByPhoneEnabled(Boolean value) {
        this.localMarketContactByPhoneEnabled = value;
    }

    /**
     * Gets the value of the localMarketPhoneCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLocalMarketPhoneCount() {
        return localMarketPhoneCount;
    }

    /**
     * Sets the value of the localMarketPhoneCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLocalMarketPhoneCount(Integer value) {
        this.localMarketPhoneCount = value;
    }

    /**
     * Gets the value of the localMarketContactByAddressEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocalMarketContactByAddressEnabled() {
        return localMarketContactByAddressEnabled;
    }

    /**
     * Sets the value of the localMarketContactByAddressEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocalMarketContactByAddressEnabled(Boolean value) {
        this.localMarketContactByAddressEnabled = value;
    }

    /**
     * Gets the value of the localMarketStreetCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLocalMarketStreetCount() {
        return localMarketStreetCount;
    }

    /**
     * Sets the value of the localMarketStreetCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLocalMarketStreetCount(Integer value) {
        this.localMarketStreetCount = value;
    }

    /**
     * Gets the value of the localMarketCompanyNameEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocalMarketCompanyNameEnabled() {
        return localMarketCompanyNameEnabled;
    }

    /**
     * Sets the value of the localMarketCompanyNameEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocalMarketCompanyNameEnabled(Boolean value) {
        this.localMarketCompanyNameEnabled = value;
    }

    /**
     * Gets the value of the localMarketContactByEmailEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocalMarketContactByEmailEnabled() {
        return localMarketContactByEmailEnabled;
    }

    /**
     * Sets the value of the localMarketContactByEmailEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocalMarketContactByEmailEnabled(Boolean value) {
        this.localMarketContactByEmailEnabled = value;
    }

    /**
     * Gets the value of the localMarketBestOfferEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link ClassifiedAdBestOfferEnabledCodeType }
     *     
     */
    public ClassifiedAdBestOfferEnabledCodeType getLocalMarketBestOfferEnabled() {
        return localMarketBestOfferEnabled;
    }

    /**
     * Sets the value of the localMarketBestOfferEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassifiedAdBestOfferEnabledCodeType }
     *     
     */
    public void setLocalMarketBestOfferEnabled(ClassifiedAdBestOfferEnabledCodeType value) {
        this.localMarketBestOfferEnabled = value;
    }

    /**
     * Gets the value of the localMarketAutoAcceptEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocalMarketAutoAcceptEnabled() {
        return localMarketAutoAcceptEnabled;
    }

    /**
     * Sets the value of the localMarketAutoAcceptEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocalMarketAutoAcceptEnabled(Boolean value) {
        this.localMarketAutoAcceptEnabled = value;
    }

    /**
     * Gets the value of the localMarketAutoDeclineEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocalMarketAutoDeclineEnabled() {
        return localMarketAutoDeclineEnabled;
    }

    /**
     * Sets the value of the localMarketAutoDeclineEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocalMarketAutoDeclineEnabled(Boolean value) {
        this.localMarketAutoDeclineEnabled = value;
    }

    /**
     * Gets the value of the localMarketPaymentMethodCheckOutEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link ClassifiedAdPaymentMethodEnabledCodeType }
     *     
     */
    public ClassifiedAdPaymentMethodEnabledCodeType getLocalMarketPaymentMethodCheckOutEnabled() {
        return localMarketPaymentMethodCheckOutEnabled;
    }

    /**
     * Sets the value of the localMarketPaymentMethodCheckOutEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassifiedAdPaymentMethodEnabledCodeType }
     *     
     */
    public void setLocalMarketPaymentMethodCheckOutEnabled(ClassifiedAdPaymentMethodEnabledCodeType value) {
        this.localMarketPaymentMethodCheckOutEnabled = value;
    }

    /**
     * Gets the value of the localMarketShippingMethodEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocalMarketShippingMethodEnabled() {
        return localMarketShippingMethodEnabled;
    }

    /**
     * Sets the value of the localMarketShippingMethodEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocalMarketShippingMethodEnabled(Boolean value) {
        this.localMarketShippingMethodEnabled = value;
    }

    /**
     * Gets the value of the localMarketCounterOfferEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocalMarketCounterOfferEnabled() {
        return localMarketCounterOfferEnabled;
    }

    /**
     * Sets the value of the localMarketCounterOfferEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocalMarketCounterOfferEnabled(Boolean value) {
        this.localMarketCounterOfferEnabled = value;
    }

    /**
     * Gets the value of the localMarketSellerContactDetailsEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocalMarketSellerContactDetailsEnabled() {
        return localMarketSellerContactDetailsEnabled;
    }

    /**
     * Sets the value of the localMarketSellerContactDetailsEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocalMarketSellerContactDetailsEnabled(Boolean value) {
        this.localMarketSellerContactDetailsEnabled = value;
    }

    /**
     * Gets the value of the classifiedAdPhoneCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getClassifiedAdPhoneCount() {
        return classifiedAdPhoneCount;
    }

    /**
     * Sets the value of the classifiedAdPhoneCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setClassifiedAdPhoneCount(Integer value) {
        this.classifiedAdPhoneCount = value;
    }

    /**
     * Gets the value of the classifiedAdContactByAddressEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClassifiedAdContactByAddressEnabled() {
        return classifiedAdContactByAddressEnabled;
    }

    /**
     * Sets the value of the classifiedAdContactByAddressEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClassifiedAdContactByAddressEnabled(Boolean value) {
        this.classifiedAdContactByAddressEnabled = value;
    }

    /**
     * Gets the value of the classifiedAdStreetCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getClassifiedAdStreetCount() {
        return classifiedAdStreetCount;
    }

    /**
     * Sets the value of the classifiedAdStreetCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setClassifiedAdStreetCount(Integer value) {
        this.classifiedAdStreetCount = value;
    }

    /**
     * Gets the value of the classifiedAdCompanyNameEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClassifiedAdCompanyNameEnabled() {
        return classifiedAdCompanyNameEnabled;
    }

    /**
     * Sets the value of the classifiedAdCompanyNameEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClassifiedAdCompanyNameEnabled(Boolean value) {
        this.classifiedAdCompanyNameEnabled = value;
    }

    /**
     * Gets the value of the specialitySubscription property.
     * 
     * @return
     *     possible object is
     *     {@link GeographicExposureCodeType }
     *     
     */
    public GeographicExposureCodeType getSpecialitySubscription() {
        return specialitySubscription;
    }

    /**
     * Sets the value of the specialitySubscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicExposureCodeType }
     *     
     */
    public void setSpecialitySubscription(GeographicExposureCodeType value) {
        this.specialitySubscription = value;
    }

    /**
     * Gets the value of the regularSubscription property.
     * 
     * @return
     *     possible object is
     *     {@link GeographicExposureCodeType }
     *     
     */
    public GeographicExposureCodeType getRegularSubscription() {
        return regularSubscription;
    }

    /**
     * Sets the value of the regularSubscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicExposureCodeType }
     *     
     */
    public void setRegularSubscription(GeographicExposureCodeType value) {
        this.regularSubscription = value;
    }

    /**
     * Gets the value of the premiumSubscription property.
     * 
     * @return
     *     possible object is
     *     {@link GeographicExposureCodeType }
     *     
     */
    public GeographicExposureCodeType getPremiumSubscription() {
        return premiumSubscription;
    }

    /**
     * Sets the value of the premiumSubscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicExposureCodeType }
     *     
     */
    public void setPremiumSubscription(GeographicExposureCodeType value) {
        this.premiumSubscription = value;
    }

    /**
     * Gets the value of the nonSubscription property.
     * 
     * @return
     *     possible object is
     *     {@link GeographicExposureCodeType }
     *     
     */
    public GeographicExposureCodeType getNonSubscription() {
        return nonSubscription;
    }

    /**
     * Sets the value of the nonSubscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicExposureCodeType }
     *     
     */
    public void setNonSubscription(GeographicExposureCodeType value) {
        this.nonSubscription = value;
    }

    /**
     * Gets the value of the payPalRequiredForStoreOwner property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPayPalRequiredForStoreOwner() {
        return payPalRequiredForStoreOwner;
    }

    /**
     * Sets the value of the payPalRequiredForStoreOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPayPalRequiredForStoreOwner(Boolean value) {
        this.payPalRequiredForStoreOwner = value;
    }

    /**
     * Gets the value of the reviseQuantityAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReviseQuantityAllowed() {
        return reviseQuantityAllowed;
    }

    /**
     * Sets the value of the reviseQuantityAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReviseQuantityAllowed(Boolean value) {
        this.reviseQuantityAllowed = value;
    }

    /**
     * Gets the value of the revisePriceAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRevisePriceAllowed() {
        return revisePriceAllowed;
    }

    /**
     * Sets the value of the revisePriceAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRevisePriceAllowed(Boolean value) {
        this.revisePriceAllowed = value;
    }

    /**
     * Gets the value of the storeOwnerExtendedListingDurationsEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStoreOwnerExtendedListingDurationsEnabled() {
        return storeOwnerExtendedListingDurationsEnabled;
    }

    /**
     * Sets the value of the storeOwnerExtendedListingDurationsEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStoreOwnerExtendedListingDurationsEnabled(Boolean value) {
        this.storeOwnerExtendedListingDurationsEnabled = value;
    }

    /**
     * Gets the value of the storeOwnerExtendedListingDurations property.
     * 
     * @return
     *     possible object is
     *     {@link StoreOwnerExtendedListingDurationsType }
     *     
     */
    public StoreOwnerExtendedListingDurationsType getStoreOwnerExtendedListingDurations() {
        return storeOwnerExtendedListingDurations;
    }

    /**
     * Sets the value of the storeOwnerExtendedListingDurations property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoreOwnerExtendedListingDurationsType }
     *     
     */
    public void setStoreOwnerExtendedListingDurations(StoreOwnerExtendedListingDurationsType value) {
        this.storeOwnerExtendedListingDurations = value;
    }

    /**
     * Gets the value of the returnPolicyEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnPolicyEnabled() {
        return returnPolicyEnabled;
    }

    /**
     * Sets the value of the returnPolicyEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnPolicyEnabled(Boolean value) {
        this.returnPolicyEnabled = value;
    }

    /**
     * Gets the value of the handlingTimeEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHandlingTimeEnabled() {
        return handlingTimeEnabled;
    }

    /**
     * Sets the value of the handlingTimeEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHandlingTimeEnabled(Boolean value) {
        this.handlingTimeEnabled = value;
    }

    /**
     * Gets the value of the maxFlatShippingCost property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getMaxFlatShippingCost() {
        return maxFlatShippingCost;
    }

    /**
     * Sets the value of the maxFlatShippingCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setMaxFlatShippingCost(AmountType value) {
        this.maxFlatShippingCost = value;
    }

    /**
     * Gets the value of the maxFlatShippingCostCBTExempt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaxFlatShippingCostCBTExempt() {
        return maxFlatShippingCostCBTExempt;
    }

    /**
     * Sets the value of the maxFlatShippingCostCBTExempt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaxFlatShippingCostCBTExempt(Boolean value) {
        this.maxFlatShippingCostCBTExempt = value;
    }

    /**
     * Gets the value of the group1MaxFlatShippingCost property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getGroup1MaxFlatShippingCost() {
        return group1MaxFlatShippingCost;
    }

    /**
     * Sets the value of the group1MaxFlatShippingCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setGroup1MaxFlatShippingCost(AmountType value) {
        this.group1MaxFlatShippingCost = value;
    }

    /**
     * Gets the value of the group2MaxFlatShippingCost property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getGroup2MaxFlatShippingCost() {
        return group2MaxFlatShippingCost;
    }

    /**
     * Sets the value of the group2MaxFlatShippingCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setGroup2MaxFlatShippingCost(AmountType value) {
        this.group2MaxFlatShippingCost = value;
    }

    /**
     * Gets the value of the group3MaxFlatShippingCost property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getGroup3MaxFlatShippingCost() {
        return group3MaxFlatShippingCost;
    }

    /**
     * Sets the value of the group3MaxFlatShippingCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setGroup3MaxFlatShippingCost(AmountType value) {
        this.group3MaxFlatShippingCost = value;
    }

    /**
     * Gets the value of the paymentMethod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentMethod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BuyerPaymentMethodCodeType }
     * 
     * 
     */
    public List<BuyerPaymentMethodCodeType> getPaymentMethod() {
        if (paymentMethod == null) {
            paymentMethod = new ArrayList<BuyerPaymentMethodCodeType>();
        }
        return this.paymentMethod;
    }

    /**
     * Gets the value of the variationsEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVariationsEnabled() {
        return variationsEnabled;
    }

    /**
     * Sets the value of the variationsEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVariationsEnabled(Boolean value) {
        this.variationsEnabled = value;
    }

    /**
     * Gets the value of the attributeConversionEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeConversionEnabledCodeType }
     *     
     */
    public AttributeConversionEnabledCodeType getAttributeConversionEnabled() {
        return attributeConversionEnabled;
    }

    /**
     * Sets the value of the attributeConversionEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeConversionEnabledCodeType }
     *     
     */
    public void setAttributeConversionEnabled(AttributeConversionEnabledCodeType value) {
        this.attributeConversionEnabled = value;
    }

    /**
     * Gets the value of the freeGalleryPlusEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFreeGalleryPlusEnabled() {
        return freeGalleryPlusEnabled;
    }

    /**
     * Sets the value of the freeGalleryPlusEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFreeGalleryPlusEnabled(Boolean value) {
        this.freeGalleryPlusEnabled = value;
    }

    /**
     * Gets the value of the freePicturePackEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFreePicturePackEnabled() {
        return freePicturePackEnabled;
    }

    /**
     * Sets the value of the freePicturePackEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFreePicturePackEnabled(Boolean value) {
        this.freePicturePackEnabled = value;
    }

    /**
     * Gets the value of the itemCompatibilityEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link ItemCompatibilityEnabledCodeType }
     *     
     */
    public ItemCompatibilityEnabledCodeType getItemCompatibilityEnabled() {
        return itemCompatibilityEnabled;
    }

    /**
     * Sets the value of the itemCompatibilityEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemCompatibilityEnabledCodeType }
     *     
     */
    public void setItemCompatibilityEnabled(ItemCompatibilityEnabledCodeType value) {
        this.itemCompatibilityEnabled = value;
    }

    /**
     * Gets the value of the minItemCompatibility property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinItemCompatibility() {
        return minItemCompatibility;
    }

    /**
     * Sets the value of the minItemCompatibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinItemCompatibility(Integer value) {
        this.minItemCompatibility = value;
    }

    /**
     * Gets the value of the maxItemCompatibility property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxItemCompatibility() {
        return maxItemCompatibility;
    }

    /**
     * Sets the value of the maxItemCompatibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxItemCompatibility(Integer value) {
        this.maxItemCompatibility = value;
    }

    /**
     * Gets the value of the conditionEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionEnabledCodeType }
     *     
     */
    public ConditionEnabledCodeType getConditionEnabled() {
        return conditionEnabled;
    }

    /**
     * Sets the value of the conditionEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionEnabledCodeType }
     *     
     */
    public void setConditionEnabled(ConditionEnabledCodeType value) {
        this.conditionEnabled = value;
    }

    /**
     * Gets the value of the conditionValues property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionValuesType }
     *     
     */
    public ConditionValuesType getConditionValues() {
        return conditionValues;
    }

    /**
     * Sets the value of the conditionValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionValuesType }
     *     
     */
    public void setConditionValues(ConditionValuesType value) {
        this.conditionValues = value;
    }

    /**
     * Gets the value of the valueCategory property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isValueCategory() {
        return valueCategory;
    }

    /**
     * Sets the value of the valueCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setValueCategory(Boolean value) {
        this.valueCategory = value;
    }

    /**
     * Gets the value of the productCreationEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link ProductCreationEnabledCodeType }
     *     
     */
    public ProductCreationEnabledCodeType getProductCreationEnabled() {
        return productCreationEnabled;
    }

    /**
     * Sets the value of the productCreationEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductCreationEnabledCodeType }
     *     
     */
    public void setProductCreationEnabled(ProductCreationEnabledCodeType value) {
        this.productCreationEnabled = value;
    }

    /**
     * Gets the value of the eanEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link ProductIdentiferEnabledCodeType }
     *     
     */
    public ProductIdentiferEnabledCodeType getEANEnabled() {
        return eanEnabled;
    }

    /**
     * Sets the value of the eanEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductIdentiferEnabledCodeType }
     *     
     */
    public void setEANEnabled(ProductIdentiferEnabledCodeType value) {
        this.eanEnabled = value;
    }

    /**
     * Gets the value of the isbnEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link ProductIdentiferEnabledCodeType }
     *     
     */
    public ProductIdentiferEnabledCodeType getISBNEnabled() {
        return isbnEnabled;
    }

    /**
     * Sets the value of the isbnEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductIdentiferEnabledCodeType }
     *     
     */
    public void setISBNEnabled(ProductIdentiferEnabledCodeType value) {
        this.isbnEnabled = value;
    }

    /**
     * Gets the value of the upcEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link ProductIdentiferEnabledCodeType }
     *     
     */
    public ProductIdentiferEnabledCodeType getUPCEnabled() {
        return upcEnabled;
    }

    /**
     * Sets the value of the upcEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductIdentiferEnabledCodeType }
     *     
     */
    public void setUPCEnabled(ProductIdentiferEnabledCodeType value) {
        this.upcEnabled = value;
    }

    /**
     * Gets the value of the maxGranularFitmentCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxGranularFitmentCount() {
        return maxGranularFitmentCount;
    }

    /**
     * Sets the value of the maxGranularFitmentCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxGranularFitmentCount(Integer value) {
        this.maxGranularFitmentCount = value;
    }

    /**
     * Gets the value of the compatibleVehicleType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompatibleVehicleType() {
        return compatibleVehicleType;
    }

    /**
     * Sets the value of the compatibleVehicleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompatibleVehicleType(String value) {
        this.compatibleVehicleType = value;
    }

    /**
     * Gets the value of the paymentOptionsGroup property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentOptionsGroupEnabledCodeType }
     *     
     */
    public PaymentOptionsGroupEnabledCodeType getPaymentOptionsGroup() {
        return paymentOptionsGroup;
    }

    /**
     * Sets the value of the paymentOptionsGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentOptionsGroupEnabledCodeType }
     *     
     */
    public void setPaymentOptionsGroup(PaymentOptionsGroupEnabledCodeType value) {
        this.paymentOptionsGroup = value;
    }

    /**
     * Gets the value of the shippingProfileCategoryGroup property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileCategoryGroupCodeType }
     *     
     */
    public ProfileCategoryGroupCodeType getShippingProfileCategoryGroup() {
        return shippingProfileCategoryGroup;
    }

    /**
     * Sets the value of the shippingProfileCategoryGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileCategoryGroupCodeType }
     *     
     */
    public void setShippingProfileCategoryGroup(ProfileCategoryGroupCodeType value) {
        this.shippingProfileCategoryGroup = value;
    }

    /**
     * Gets the value of the paymentProfileCategoryGroup property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileCategoryGroupCodeType }
     *     
     */
    public ProfileCategoryGroupCodeType getPaymentProfileCategoryGroup() {
        return paymentProfileCategoryGroup;
    }

    /**
     * Sets the value of the paymentProfileCategoryGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileCategoryGroupCodeType }
     *     
     */
    public void setPaymentProfileCategoryGroup(ProfileCategoryGroupCodeType value) {
        this.paymentProfileCategoryGroup = value;
    }

    /**
     * Gets the value of the returnPolicyProfileCategoryGroup property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileCategoryGroupCodeType }
     *     
     */
    public ProfileCategoryGroupCodeType getReturnPolicyProfileCategoryGroup() {
        return returnPolicyProfileCategoryGroup;
    }

    /**
     * Sets the value of the returnPolicyProfileCategoryGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileCategoryGroupCodeType }
     *     
     */
    public void setReturnPolicyProfileCategoryGroup(ProfileCategoryGroupCodeType value) {
        this.returnPolicyProfileCategoryGroup = value;
    }

    /**
     * Gets the value of the vinSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVINSupported() {
        return vinSupported;
    }

    /**
     * Sets the value of the vinSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVINSupported(Boolean value) {
        this.vinSupported = value;
    }

    /**
     * Gets the value of the vrmSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVRMSupported() {
        return vrmSupported;
    }

    /**
     * Sets the value of the vrmSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVRMSupported(Boolean value) {
        this.vrmSupported = value;
    }

    /**
     * Gets the value of the sellerProvidedTitleSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSellerProvidedTitleSupported() {
        return sellerProvidedTitleSupported;
    }

    /**
     * Sets the value of the sellerProvidedTitleSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSellerProvidedTitleSupported(Boolean value) {
        this.sellerProvidedTitleSupported = value;
    }

    /**
     * Gets the value of the depositSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDepositSupported() {
        return depositSupported;
    }

    /**
     * Sets the value of the depositSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDepositSupported(Boolean value) {
        this.depositSupported = value;
    }

    /**
     * Gets the value of the globalShippingEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGlobalShippingEnabled() {
        return globalShippingEnabled;
    }

    /**
     * Sets the value of the globalShippingEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGlobalShippingEnabled(Boolean value) {
        this.globalShippingEnabled = value;
    }

    /**
     * Gets the value of the additionalCompatibilityEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdditionalCompatibilityEnabled() {
        return additionalCompatibilityEnabled;
    }

    /**
     * Sets the value of the additionalCompatibilityEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdditionalCompatibilityEnabled(Boolean value) {
        this.additionalCompatibilityEnabled = value;
    }

    /**
     * Gets the value of the pickupDropOffEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPickupDropOffEnabled() {
        return pickupDropOffEnabled;
    }

    /**
     * Sets the value of the pickupDropOffEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPickupDropOffEnabled(Boolean value) {
        this.pickupDropOffEnabled = value;
    }

    /**
     * Gets the value of the digitalGoodDeliveryEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDigitalGoodDeliveryEnabled() {
        return digitalGoodDeliveryEnabled;
    }

    /**
     * Sets the value of the digitalGoodDeliveryEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDigitalGoodDeliveryEnabled(Boolean value) {
        this.digitalGoodDeliveryEnabled = value;
    }

    /**
     * Gets the value of the epidSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEpidSupported() {
        return epidSupported;
    }

    /**
     * Sets the value of the epidSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEpidSupported(Boolean value) {
        this.epidSupported = value;
    }

    /**
     * Gets the value of the kTypeSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKTypeSupported() {
        return kTypeSupported;
    }

    /**
     * Sets the value of the kTypeSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKTypeSupported(Boolean value) {
        this.kTypeSupported = value;
    }

}
