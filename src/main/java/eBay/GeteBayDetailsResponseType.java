
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
 * 				Details about a specified site in response to <b>GeteBayDetailsRequest</b>. If no <b>DetailName</b> field is identified in the request, all elements of <b>GeteBayDetailsResponse</b> are returned. Otherwise, eBay returns only the elements corresponding to the specified <b>DetailName</b> fields. <b>UpdateTime</b> gives the time of modification of the most recently modified <b>DetailName</b>.
 * 			
 * 
 * <p>Java class for GeteBayDetailsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeteBayDetailsResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="CountryDetails" type="{urn:ebay:apis:eBLBaseComponents}CountryDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CurrencyDetails" type="{urn:ebay:apis:eBLBaseComponents}CurrencyDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DispatchTimeMaxDetails" type="{urn:ebay:apis:eBLBaseComponents}DispatchTimeMaxDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PaymentOptionDetails" type="{urn:ebay:apis:eBLBaseComponents}PaymentOptionDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RegionDetails" type="{urn:ebay:apis:eBLBaseComponents}RegionDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ShippingLocationDetails" type="{urn:ebay:apis:eBLBaseComponents}ShippingLocationDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ShippingServiceDetails" type="{urn:ebay:apis:eBLBaseComponents}ShippingServiceDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SiteDetails" type="{urn:ebay:apis:eBLBaseComponents}SiteDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TaxJurisdiction" type="{urn:ebay:apis:eBLBaseComponents}TaxJurisdictionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="URLDetails" type="{urn:ebay:apis:eBLBaseComponents}URLDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TimeZoneDetails" type="{urn:ebay:apis:eBLBaseComponents}TimeZoneDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ItemSpecificDetails" type="{urn:ebay:apis:eBLBaseComponents}ItemSpecificDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="UnitOfMeasurementDetails" type="{urn:ebay:apis:eBLBaseComponents}UnitOfMeasurementDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RegionOfOriginDetails" type="{urn:ebay:apis:eBLBaseComponents}RegionOfOriginDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ShippingPackageDetails" type="{urn:ebay:apis:eBLBaseComponents}ShippingPackageDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ShippingCarrierDetails" type="{urn:ebay:apis:eBLBaseComponents}ShippingCarrierDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ReturnPolicyDetails" type="{urn:ebay:apis:eBLBaseComponents}ReturnPolicyDetailsType" minOccurs="0"/>
 *         &lt;element name="ListingStartPriceDetails" type="{urn:ebay:apis:eBLBaseComponents}ListingStartPriceDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BuyerRequirementDetails" type="{urn:ebay:apis:eBLBaseComponents}SiteBuyerRequirementDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ListingFeatureDetails" type="{urn:ebay:apis:eBLBaseComponents}ListingFeatureDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="VariationDetails" type="{urn:ebay:apis:eBLBaseComponents}VariationDetailsType" minOccurs="0"/>
 *         &lt;element name="ExcludeShippingLocationDetails" type="{urn:ebay:apis:eBLBaseComponents}ExcludeShippingLocationDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="UpdateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="RecoupmentPolicyDetails" type="{urn:ebay:apis:eBLBaseComponents}RecoupmentPolicyDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ShippingCategoryDetails" type="{urn:ebay:apis:eBLBaseComponents}ShippingCategoryDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ProductDetails" type="{urn:ebay:apis:eBLBaseComponents}ProductDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeteBayDetailsResponseType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "countryDetails",
    "currencyDetails",
    "dispatchTimeMaxDetails",
    "paymentOptionDetails",
    "regionDetails",
    "shippingLocationDetails",
    "shippingServiceDetails",
    "siteDetails",
    "taxJurisdiction",
    "urlDetails",
    "timeZoneDetails",
    "itemSpecificDetails",
    "unitOfMeasurementDetails",
    "regionOfOriginDetails",
    "shippingPackageDetails",
    "shippingCarrierDetails",
    "returnPolicyDetails",
    "listingStartPriceDetails",
    "buyerRequirementDetails",
    "listingFeatureDetails",
    "variationDetails",
    "excludeShippingLocationDetails",
    "updateTime",
    "recoupmentPolicyDetails",
    "shippingCategoryDetails",
    "productDetails"
})
public class GeteBayDetailsResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "CountryDetails", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<CountryDetailsType> countryDetails;
    @XmlElement(name = "CurrencyDetails", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<CurrencyDetailsType> currencyDetails;
    @XmlElement(name = "DispatchTimeMaxDetails", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<DispatchTimeMaxDetailsType> dispatchTimeMaxDetails;
    @XmlElement(name = "PaymentOptionDetails", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<PaymentOptionDetailsType> paymentOptionDetails;
    @XmlElement(name = "RegionDetails", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<RegionDetailsType> regionDetails;
    @XmlElement(name = "ShippingLocationDetails", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<ShippingLocationDetailsType> shippingLocationDetails;
    @XmlElement(name = "ShippingServiceDetails", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<ShippingServiceDetailsType> shippingServiceDetails;
    @XmlElement(name = "SiteDetails", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<SiteDetailsType> siteDetails;
    @XmlElement(name = "TaxJurisdiction", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<TaxJurisdictionType> taxJurisdiction;
    @XmlElement(name = "URLDetails", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<URLDetailsType> urlDetails;
    @XmlElement(name = "TimeZoneDetails", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<TimeZoneDetailsType> timeZoneDetails;
    @XmlElement(name = "ItemSpecificDetails", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<ItemSpecificDetailsType> itemSpecificDetails;
    @XmlElement(name = "UnitOfMeasurementDetails", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<UnitOfMeasurementDetailsType> unitOfMeasurementDetails;
    @XmlElement(name = "RegionOfOriginDetails", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<RegionOfOriginDetailsType> regionOfOriginDetails;
    @XmlElement(name = "ShippingPackageDetails", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<ShippingPackageDetailsType> shippingPackageDetails;
    @XmlElement(name = "ShippingCarrierDetails", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<ShippingCarrierDetailsType> shippingCarrierDetails;
    @XmlElement(name = "ReturnPolicyDetails", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected ReturnPolicyDetailsType returnPolicyDetails;
    @XmlElement(name = "ListingStartPriceDetails", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<ListingStartPriceDetailsType> listingStartPriceDetails;
    @XmlElement(name = "BuyerRequirementDetails", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<SiteBuyerRequirementDetailsType> buyerRequirementDetails;
    @XmlElement(name = "ListingFeatureDetails", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<ListingFeatureDetailsType> listingFeatureDetails;
    @XmlElement(name = "VariationDetails", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected VariationDetailsType variationDetails;
    @XmlElement(name = "ExcludeShippingLocationDetails", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<ExcludeShippingLocationDetailsType> excludeShippingLocationDetails;
    @XmlElement(name = "UpdateTime", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updateTime;
    @XmlElement(name = "RecoupmentPolicyDetails", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<RecoupmentPolicyDetailsType> recoupmentPolicyDetails;
    @XmlElement(name = "ShippingCategoryDetails", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<ShippingCategoryDetailsType> shippingCategoryDetails;
    @XmlElement(name = "ProductDetails", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected ProductDetailsType productDetails;

    /**
     * Gets the value of the countryDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the countryDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountryDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CountryDetailsType }
     * 
     * 
     */
    public List<CountryDetailsType> getCountryDetails() {
        if (countryDetails == null) {
            countryDetails = new ArrayList<CountryDetailsType>();
        }
        return this.countryDetails;
    }

    /**
     * Gets the value of the currencyDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the currencyDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurrencyDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CurrencyDetailsType }
     * 
     * 
     */
    public List<CurrencyDetailsType> getCurrencyDetails() {
        if (currencyDetails == null) {
            currencyDetails = new ArrayList<CurrencyDetailsType>();
        }
        return this.currencyDetails;
    }

    /**
     * Gets the value of the dispatchTimeMaxDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dispatchTimeMaxDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDispatchTimeMaxDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DispatchTimeMaxDetailsType }
     * 
     * 
     */
    public List<DispatchTimeMaxDetailsType> getDispatchTimeMaxDetails() {
        if (dispatchTimeMaxDetails == null) {
            dispatchTimeMaxDetails = new ArrayList<DispatchTimeMaxDetailsType>();
        }
        return this.dispatchTimeMaxDetails;
    }

    /**
     * Gets the value of the paymentOptionDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentOptionDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentOptionDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentOptionDetailsType }
     * 
     * 
     */
    public List<PaymentOptionDetailsType> getPaymentOptionDetails() {
        if (paymentOptionDetails == null) {
            paymentOptionDetails = new ArrayList<PaymentOptionDetailsType>();
        }
        return this.paymentOptionDetails;
    }

    /**
     * Gets the value of the regionDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the regionDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegionDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegionDetailsType }
     * 
     * 
     */
    public List<RegionDetailsType> getRegionDetails() {
        if (regionDetails == null) {
            regionDetails = new ArrayList<RegionDetailsType>();
        }
        return this.regionDetails;
    }

    /**
     * Gets the value of the shippingLocationDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shippingLocationDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShippingLocationDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShippingLocationDetailsType }
     * 
     * 
     */
    public List<ShippingLocationDetailsType> getShippingLocationDetails() {
        if (shippingLocationDetails == null) {
            shippingLocationDetails = new ArrayList<ShippingLocationDetailsType>();
        }
        return this.shippingLocationDetails;
    }

    /**
     * Gets the value of the shippingServiceDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shippingServiceDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShippingServiceDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShippingServiceDetailsType }
     * 
     * 
     */
    public List<ShippingServiceDetailsType> getShippingServiceDetails() {
        if (shippingServiceDetails == null) {
            shippingServiceDetails = new ArrayList<ShippingServiceDetailsType>();
        }
        return this.shippingServiceDetails;
    }

    /**
     * Gets the value of the siteDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the siteDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSiteDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SiteDetailsType }
     * 
     * 
     */
    public List<SiteDetailsType> getSiteDetails() {
        if (siteDetails == null) {
            siteDetails = new ArrayList<SiteDetailsType>();
        }
        return this.siteDetails;
    }

    /**
     * Gets the value of the taxJurisdiction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxJurisdiction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxJurisdiction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxJurisdictionType }
     * 
     * 
     */
    public List<TaxJurisdictionType> getTaxJurisdiction() {
        if (taxJurisdiction == null) {
            taxJurisdiction = new ArrayList<TaxJurisdictionType>();
        }
        return this.taxJurisdiction;
    }

    /**
     * Gets the value of the urlDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the urlDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getURLDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link URLDetailsType }
     * 
     * 
     */
    public List<URLDetailsType> getURLDetails() {
        if (urlDetails == null) {
            urlDetails = new ArrayList<URLDetailsType>();
        }
        return this.urlDetails;
    }

    /**
     * Gets the value of the timeZoneDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timeZoneDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeZoneDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimeZoneDetailsType }
     * 
     * 
     */
    public List<TimeZoneDetailsType> getTimeZoneDetails() {
        if (timeZoneDetails == null) {
            timeZoneDetails = new ArrayList<TimeZoneDetailsType>();
        }
        return this.timeZoneDetails;
    }

    /**
     * Gets the value of the itemSpecificDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemSpecificDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemSpecificDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemSpecificDetailsType }
     * 
     * 
     */
    public List<ItemSpecificDetailsType> getItemSpecificDetails() {
        if (itemSpecificDetails == null) {
            itemSpecificDetails = new ArrayList<ItemSpecificDetailsType>();
        }
        return this.itemSpecificDetails;
    }

    /**
     * Gets the value of the unitOfMeasurementDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unitOfMeasurementDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnitOfMeasurementDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnitOfMeasurementDetailsType }
     * 
     * 
     */
    public List<UnitOfMeasurementDetailsType> getUnitOfMeasurementDetails() {
        if (unitOfMeasurementDetails == null) {
            unitOfMeasurementDetails = new ArrayList<UnitOfMeasurementDetailsType>();
        }
        return this.unitOfMeasurementDetails;
    }

    /**
     * Gets the value of the regionOfOriginDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the regionOfOriginDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegionOfOriginDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegionOfOriginDetailsType }
     * 
     * 
     */
    public List<RegionOfOriginDetailsType> getRegionOfOriginDetails() {
        if (regionOfOriginDetails == null) {
            regionOfOriginDetails = new ArrayList<RegionOfOriginDetailsType>();
        }
        return this.regionOfOriginDetails;
    }

    /**
     * Gets the value of the shippingPackageDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shippingPackageDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShippingPackageDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShippingPackageDetailsType }
     * 
     * 
     */
    public List<ShippingPackageDetailsType> getShippingPackageDetails() {
        if (shippingPackageDetails == null) {
            shippingPackageDetails = new ArrayList<ShippingPackageDetailsType>();
        }
        return this.shippingPackageDetails;
    }

    /**
     * Gets the value of the shippingCarrierDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shippingCarrierDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShippingCarrierDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShippingCarrierDetailsType }
     * 
     * 
     */
    public List<ShippingCarrierDetailsType> getShippingCarrierDetails() {
        if (shippingCarrierDetails == null) {
            shippingCarrierDetails = new ArrayList<ShippingCarrierDetailsType>();
        }
        return this.shippingCarrierDetails;
    }

    /**
     * Gets the value of the returnPolicyDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnPolicyDetailsType }
     *     
     */
    public ReturnPolicyDetailsType getReturnPolicyDetails() {
        return returnPolicyDetails;
    }

    /**
     * Sets the value of the returnPolicyDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnPolicyDetailsType }
     *     
     */
    public void setReturnPolicyDetails(ReturnPolicyDetailsType value) {
        this.returnPolicyDetails = value;
    }

    /**
     * Gets the value of the listingStartPriceDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listingStartPriceDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListingStartPriceDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListingStartPriceDetailsType }
     * 
     * 
     */
    public List<ListingStartPriceDetailsType> getListingStartPriceDetails() {
        if (listingStartPriceDetails == null) {
            listingStartPriceDetails = new ArrayList<ListingStartPriceDetailsType>();
        }
        return this.listingStartPriceDetails;
    }

    /**
     * Gets the value of the buyerRequirementDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the buyerRequirementDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBuyerRequirementDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SiteBuyerRequirementDetailsType }
     * 
     * 
     */
    public List<SiteBuyerRequirementDetailsType> getBuyerRequirementDetails() {
        if (buyerRequirementDetails == null) {
            buyerRequirementDetails = new ArrayList<SiteBuyerRequirementDetailsType>();
        }
        return this.buyerRequirementDetails;
    }

    /**
     * Gets the value of the listingFeatureDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listingFeatureDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListingFeatureDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListingFeatureDetailsType }
     * 
     * 
     */
    public List<ListingFeatureDetailsType> getListingFeatureDetails() {
        if (listingFeatureDetails == null) {
            listingFeatureDetails = new ArrayList<ListingFeatureDetailsType>();
        }
        return this.listingFeatureDetails;
    }

    /**
     * Gets the value of the variationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link VariationDetailsType }
     *     
     */
    public VariationDetailsType getVariationDetails() {
        return variationDetails;
    }

    /**
     * Sets the value of the variationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link VariationDetailsType }
     *     
     */
    public void setVariationDetails(VariationDetailsType value) {
        this.variationDetails = value;
    }

    /**
     * Gets the value of the excludeShippingLocationDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the excludeShippingLocationDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExcludeShippingLocationDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExcludeShippingLocationDetailsType }
     * 
     * 
     */
    public List<ExcludeShippingLocationDetailsType> getExcludeShippingLocationDetails() {
        if (excludeShippingLocationDetails == null) {
            excludeShippingLocationDetails = new ArrayList<ExcludeShippingLocationDetailsType>();
        }
        return this.excludeShippingLocationDetails;
    }

    /**
     * Gets the value of the updateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdateTime() {
        return updateTime;
    }

    /**
     * Sets the value of the updateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdateTime(XMLGregorianCalendar value) {
        this.updateTime = value;
    }

    /**
     * Gets the value of the recoupmentPolicyDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recoupmentPolicyDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecoupmentPolicyDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecoupmentPolicyDetailsType }
     * 
     * 
     */
    public List<RecoupmentPolicyDetailsType> getRecoupmentPolicyDetails() {
        if (recoupmentPolicyDetails == null) {
            recoupmentPolicyDetails = new ArrayList<RecoupmentPolicyDetailsType>();
        }
        return this.recoupmentPolicyDetails;
    }

    /**
     * Gets the value of the shippingCategoryDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shippingCategoryDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShippingCategoryDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShippingCategoryDetailsType }
     * 
     * 
     */
    public List<ShippingCategoryDetailsType> getShippingCategoryDetails() {
        if (shippingCategoryDetails == null) {
            shippingCategoryDetails = new ArrayList<ShippingCategoryDetailsType>();
        }
        return this.shippingCategoryDetails;
    }

    /**
     * Gets the value of the productDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ProductDetailsType }
     *     
     */
    public ProductDetailsType getProductDetails() {
        return productDetails;
    }

    /**
     * Sets the value of the productDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductDetailsType }
     *     
     */
    public void setProductDetails(ProductDetailsType value) {
        this.productDetails = value;
    }

}
