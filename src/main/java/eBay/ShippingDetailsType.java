
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 * 				Type defining the <b>ShippingDetails</b> container, which contains the shipping-related
 * 				details for an item (pre-checkout) or order (post-checkout).
 * 				<br/><br/>
 *             <span class="tablenote">
 *             <strong>IMPORTANT:</strong> To avoid loss of shipping details when revising a listing, you must include all <strong>ShippingDetails</strong> fields that were originally provided. Do not omit any tag, even if its value does not change. Omitting a shipping field when revising an item will remove that detail from the listing.
 *             </span>
 * 			
 * 
 * <p>Java class for ShippingDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShippingDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AllowPaymentEdit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ApplyShippingDiscount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="GlobalShipping" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CalculatedShippingRate" type="{urn:ebay:apis:eBLBaseComponents}CalculatedShippingRateType" minOccurs="0"/>
 *         &lt;element name="ChangePaymentInstructions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="InsuranceWanted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PaymentEdited" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PaymentInstructions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesTax" type="{urn:ebay:apis:eBLBaseComponents}SalesTaxType" minOccurs="0"/>
 *         &lt;element name="ShippingRateErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShippingRateType" type="{urn:ebay:apis:eBLBaseComponents}ShippingRateTypeCodeType" minOccurs="0"/>
 *         &lt;element name="ShippingServiceOptions" type="{urn:ebay:apis:eBLBaseComponents}ShippingServiceOptionsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="InternationalShippingServiceOption" type="{urn:ebay:apis:eBLBaseComponents}InternationalShippingServiceOptionsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ShippingType" type="{urn:ebay:apis:eBLBaseComponents}ShippingTypeCodeType" minOccurs="0"/>
 *         &lt;element name="SellingManagerSalesRecordNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ThirdPartyCheckout" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TaxTable" type="{urn:ebay:apis:eBLBaseComponents}TaxTableType" minOccurs="0"/>
 *         &lt;element name="GetItFast" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ShippingServiceUsed" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="DefaultShippingCost" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="InsuranceDetails" type="{urn:ebay:apis:eBLBaseComponents}InsuranceDetailsType" minOccurs="0"/>
 *         &lt;element name="InternationalInsuranceDetails" type="{urn:ebay:apis:eBLBaseComponents}InsuranceDetailsType" minOccurs="0"/>
 *         &lt;element name="ShippingDiscountProfileID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FlatShippingDiscount" type="{urn:ebay:apis:eBLBaseComponents}FlatShippingDiscountType" minOccurs="0"/>
 *         &lt;element name="CalculatedShippingDiscount" type="{urn:ebay:apis:eBLBaseComponents}CalculatedShippingDiscountType" minOccurs="0"/>
 *         &lt;element name="PromotionalShippingDiscount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="InternationalShippingDiscountProfileID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InternationalFlatShippingDiscount" type="{urn:ebay:apis:eBLBaseComponents}FlatShippingDiscountType" minOccurs="0"/>
 *         &lt;element name="InternationalCalculatedShippingDiscount" type="{urn:ebay:apis:eBLBaseComponents}CalculatedShippingDiscountType" minOccurs="0"/>
 *         &lt;element name="InternationalPromotionalShippingDiscount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PromotionalShippingDiscountDetails" type="{urn:ebay:apis:eBLBaseComponents}PromotionalShippingDiscountDetailsType" minOccurs="0"/>
 *         &lt;element name="CODCost" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="ExcludeShipToLocation" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SellerExcludeShipToLocationsPreference" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ShipmentTrackingDetails" type="{urn:ebay:apis:eBLBaseComponents}ShipmentTrackingDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RateTableDetails" type="{urn:ebay:apis:eBLBaseComponents}RateTableDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShippingDetailsType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "allowPaymentEdit",
    "applyShippingDiscount",
    "globalShipping",
    "calculatedShippingRate",
    "changePaymentInstructions",
    "insuranceWanted",
    "paymentEdited",
    "paymentInstructions",
    "salesTax",
    "shippingRateErrorMessage",
    "shippingRateType",
    "shippingServiceOptions",
    "internationalShippingServiceOption",
    "shippingType",
    "sellingManagerSalesRecordNumber",
    "thirdPartyCheckout",
    "taxTable",
    "getItFast",
    "shippingServiceUsed",
    "defaultShippingCost",
    "insuranceDetails",
    "internationalInsuranceDetails",
    "shippingDiscountProfileID",
    "flatShippingDiscount",
    "calculatedShippingDiscount",
    "promotionalShippingDiscount",
    "internationalShippingDiscountProfileID",
    "internationalFlatShippingDiscount",
    "internationalCalculatedShippingDiscount",
    "internationalPromotionalShippingDiscount",
    "promotionalShippingDiscountDetails",
    "codCost",
    "excludeShipToLocation",
    "sellerExcludeShipToLocationsPreference",
    "shipmentTrackingDetails",
    "rateTableDetails"
})
public class ShippingDetailsType {

    @XmlElement(name = "AllowPaymentEdit", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean allowPaymentEdit;
    @XmlElement(name = "ApplyShippingDiscount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean applyShippingDiscount;
    @XmlElement(name = "GlobalShipping", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean globalShipping;
    @XmlElement(name = "CalculatedShippingRate", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected CalculatedShippingRateType calculatedShippingRate;
    @XmlElement(name = "ChangePaymentInstructions", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean changePaymentInstructions;
    @XmlElement(name = "InsuranceWanted", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean insuranceWanted;
    @XmlElement(name = "PaymentEdited", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean paymentEdited;
    @XmlElement(name = "PaymentInstructions", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String paymentInstructions;
    @XmlElement(name = "SalesTax", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected SalesTaxType salesTax;
    @XmlElement(name = "ShippingRateErrorMessage", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String shippingRateErrorMessage;
    @XmlElement(name = "ShippingRateType", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected ShippingRateTypeCodeType shippingRateType;
    @XmlElement(name = "ShippingServiceOptions", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<ShippingServiceOptionsType> shippingServiceOptions;
    @XmlElement(name = "InternationalShippingServiceOption", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<InternationalShippingServiceOptionsType> internationalShippingServiceOption;
    @XmlElement(name = "ShippingType", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected ShippingTypeCodeType shippingType;
    @XmlElement(name = "SellingManagerSalesRecordNumber", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer sellingManagerSalesRecordNumber;
    @XmlElement(name = "ThirdPartyCheckout", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean thirdPartyCheckout;
    @XmlElement(name = "TaxTable", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected TaxTableType taxTable;
    @XmlElement(name = "GetItFast", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean getItFast;
    @XmlElement(name = "ShippingServiceUsed", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String shippingServiceUsed;
    @XmlElement(name = "DefaultShippingCost", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType defaultShippingCost;
    @XmlElement(name = "InsuranceDetails", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected InsuranceDetailsType insuranceDetails;
    @XmlElement(name = "InternationalInsuranceDetails", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected InsuranceDetailsType internationalInsuranceDetails;
    @XmlElement(name = "ShippingDiscountProfileID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String shippingDiscountProfileID;
    @XmlElement(name = "FlatShippingDiscount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected FlatShippingDiscountType flatShippingDiscount;
    @XmlElement(name = "CalculatedShippingDiscount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected CalculatedShippingDiscountType calculatedShippingDiscount;
    @XmlElement(name = "PromotionalShippingDiscount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean promotionalShippingDiscount;
    @XmlElement(name = "InternationalShippingDiscountProfileID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String internationalShippingDiscountProfileID;
    @XmlElement(name = "InternationalFlatShippingDiscount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected FlatShippingDiscountType internationalFlatShippingDiscount;
    @XmlElement(name = "InternationalCalculatedShippingDiscount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected CalculatedShippingDiscountType internationalCalculatedShippingDiscount;
    @XmlElement(name = "InternationalPromotionalShippingDiscount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean internationalPromotionalShippingDiscount;
    @XmlElement(name = "PromotionalShippingDiscountDetails", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected PromotionalShippingDiscountDetailsType promotionalShippingDiscountDetails;
    @XmlElement(name = "CODCost", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType codCost;
    @XmlElement(name = "ExcludeShipToLocation", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<String> excludeShipToLocation;
    @XmlElement(name = "SellerExcludeShipToLocationsPreference", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean sellerExcludeShipToLocationsPreference;
    @XmlElement(name = "ShipmentTrackingDetails", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<ShipmentTrackingDetailsType> shipmentTrackingDetails;
    @XmlElement(name = "RateTableDetails", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected RateTableDetailsType rateTableDetails;

    /**
     * Gets the value of the allowPaymentEdit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowPaymentEdit() {
        return allowPaymentEdit;
    }

    /**
     * Sets the value of the allowPaymentEdit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowPaymentEdit(Boolean value) {
        this.allowPaymentEdit = value;
    }

    /**
     * Gets the value of the applyShippingDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApplyShippingDiscount() {
        return applyShippingDiscount;
    }

    /**
     * Sets the value of the applyShippingDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApplyShippingDiscount(Boolean value) {
        this.applyShippingDiscount = value;
    }

    /**
     * Gets the value of the globalShipping property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGlobalShipping() {
        return globalShipping;
    }

    /**
     * Sets the value of the globalShipping property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGlobalShipping(Boolean value) {
        this.globalShipping = value;
    }

    /**
     * Gets the value of the calculatedShippingRate property.
     * 
     * @return
     *     possible object is
     *     {@link CalculatedShippingRateType }
     *     
     */
    public CalculatedShippingRateType getCalculatedShippingRate() {
        return calculatedShippingRate;
    }

    /**
     * Sets the value of the calculatedShippingRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculatedShippingRateType }
     *     
     */
    public void setCalculatedShippingRate(CalculatedShippingRateType value) {
        this.calculatedShippingRate = value;
    }

    /**
     * Gets the value of the changePaymentInstructions property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChangePaymentInstructions() {
        return changePaymentInstructions;
    }

    /**
     * Sets the value of the changePaymentInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChangePaymentInstructions(Boolean value) {
        this.changePaymentInstructions = value;
    }

    /**
     * Gets the value of the insuranceWanted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInsuranceWanted() {
        return insuranceWanted;
    }

    /**
     * Sets the value of the insuranceWanted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInsuranceWanted(Boolean value) {
        this.insuranceWanted = value;
    }

    /**
     * Gets the value of the paymentEdited property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPaymentEdited() {
        return paymentEdited;
    }

    /**
     * Sets the value of the paymentEdited property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPaymentEdited(Boolean value) {
        this.paymentEdited = value;
    }

    /**
     * Gets the value of the paymentInstructions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentInstructions() {
        return paymentInstructions;
    }

    /**
     * Sets the value of the paymentInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentInstructions(String value) {
        this.paymentInstructions = value;
    }

    /**
     * Gets the value of the salesTax property.
     * 
     * @return
     *     possible object is
     *     {@link SalesTaxType }
     *     
     */
    public SalesTaxType getSalesTax() {
        return salesTax;
    }

    /**
     * Sets the value of the salesTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesTaxType }
     *     
     */
    public void setSalesTax(SalesTaxType value) {
        this.salesTax = value;
    }

    /**
     * Gets the value of the shippingRateErrorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingRateErrorMessage() {
        return shippingRateErrorMessage;
    }

    /**
     * Sets the value of the shippingRateErrorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingRateErrorMessage(String value) {
        this.shippingRateErrorMessage = value;
    }

    /**
     * Gets the value of the shippingRateType property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingRateTypeCodeType }
     *     
     */
    public ShippingRateTypeCodeType getShippingRateType() {
        return shippingRateType;
    }

    /**
     * Sets the value of the shippingRateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingRateTypeCodeType }
     *     
     */
    public void setShippingRateType(ShippingRateTypeCodeType value) {
        this.shippingRateType = value;
    }

    /**
     * Gets the value of the shippingServiceOptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shippingServiceOptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShippingServiceOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShippingServiceOptionsType }
     * 
     * 
     */
    public List<ShippingServiceOptionsType> getShippingServiceOptions() {
        if (shippingServiceOptions == null) {
            shippingServiceOptions = new ArrayList<ShippingServiceOptionsType>();
        }
        return this.shippingServiceOptions;
    }

    /**
     * Gets the value of the internationalShippingServiceOption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the internationalShippingServiceOption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInternationalShippingServiceOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InternationalShippingServiceOptionsType }
     * 
     * 
     */
    public List<InternationalShippingServiceOptionsType> getInternationalShippingServiceOption() {
        if (internationalShippingServiceOption == null) {
            internationalShippingServiceOption = new ArrayList<InternationalShippingServiceOptionsType>();
        }
        return this.internationalShippingServiceOption;
    }

    /**
     * Gets the value of the shippingType property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingTypeCodeType }
     *     
     */
    public ShippingTypeCodeType getShippingType() {
        return shippingType;
    }

    /**
     * Sets the value of the shippingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingTypeCodeType }
     *     
     */
    public void setShippingType(ShippingTypeCodeType value) {
        this.shippingType = value;
    }

    /**
     * Gets the value of the sellingManagerSalesRecordNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSellingManagerSalesRecordNumber() {
        return sellingManagerSalesRecordNumber;
    }

    /**
     * Sets the value of the sellingManagerSalesRecordNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSellingManagerSalesRecordNumber(Integer value) {
        this.sellingManagerSalesRecordNumber = value;
    }

    /**
     * Gets the value of the thirdPartyCheckout property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isThirdPartyCheckout() {
        return thirdPartyCheckout;
    }

    /**
     * Sets the value of the thirdPartyCheckout property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setThirdPartyCheckout(Boolean value) {
        this.thirdPartyCheckout = value;
    }

    /**
     * Gets the value of the taxTable property.
     * 
     * @return
     *     possible object is
     *     {@link TaxTableType }
     *     
     */
    public TaxTableType getTaxTable() {
        return taxTable;
    }

    /**
     * Sets the value of the taxTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxTableType }
     *     
     */
    public void setTaxTable(TaxTableType value) {
        this.taxTable = value;
    }

    /**
     * Gets the value of the getItFast property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGetItFast() {
        return getItFast;
    }

    /**
     * Sets the value of the getItFast property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGetItFast(Boolean value) {
        this.getItFast = value;
    }

    /**
     * Gets the value of the shippingServiceUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingServiceUsed() {
        return shippingServiceUsed;
    }

    /**
     * Sets the value of the shippingServiceUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingServiceUsed(String value) {
        this.shippingServiceUsed = value;
    }

    /**
     * Gets the value of the defaultShippingCost property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDefaultShippingCost() {
        return defaultShippingCost;
    }

    /**
     * Sets the value of the defaultShippingCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDefaultShippingCost(AmountType value) {
        this.defaultShippingCost = value;
    }

    /**
     * Gets the value of the insuranceDetails property.
     * 
     * @return
     *     possible object is
     *     {@link InsuranceDetailsType }
     *     
     */
    public InsuranceDetailsType getInsuranceDetails() {
        return insuranceDetails;
    }

    /**
     * Sets the value of the insuranceDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceDetailsType }
     *     
     */
    public void setInsuranceDetails(InsuranceDetailsType value) {
        this.insuranceDetails = value;
    }

    /**
     * Gets the value of the internationalInsuranceDetails property.
     * 
     * @return
     *     possible object is
     *     {@link InsuranceDetailsType }
     *     
     */
    public InsuranceDetailsType getInternationalInsuranceDetails() {
        return internationalInsuranceDetails;
    }

    /**
     * Sets the value of the internationalInsuranceDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceDetailsType }
     *     
     */
    public void setInternationalInsuranceDetails(InsuranceDetailsType value) {
        this.internationalInsuranceDetails = value;
    }

    /**
     * Gets the value of the shippingDiscountProfileID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingDiscountProfileID() {
        return shippingDiscountProfileID;
    }

    /**
     * Sets the value of the shippingDiscountProfileID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingDiscountProfileID(String value) {
        this.shippingDiscountProfileID = value;
    }

    /**
     * Gets the value of the flatShippingDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link FlatShippingDiscountType }
     *     
     */
    public FlatShippingDiscountType getFlatShippingDiscount() {
        return flatShippingDiscount;
    }

    /**
     * Sets the value of the flatShippingDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlatShippingDiscountType }
     *     
     */
    public void setFlatShippingDiscount(FlatShippingDiscountType value) {
        this.flatShippingDiscount = value;
    }

    /**
     * Gets the value of the calculatedShippingDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link CalculatedShippingDiscountType }
     *     
     */
    public CalculatedShippingDiscountType getCalculatedShippingDiscount() {
        return calculatedShippingDiscount;
    }

    /**
     * Sets the value of the calculatedShippingDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculatedShippingDiscountType }
     *     
     */
    public void setCalculatedShippingDiscount(CalculatedShippingDiscountType value) {
        this.calculatedShippingDiscount = value;
    }

    /**
     * Gets the value of the promotionalShippingDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPromotionalShippingDiscount() {
        return promotionalShippingDiscount;
    }

    /**
     * Sets the value of the promotionalShippingDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPromotionalShippingDiscount(Boolean value) {
        this.promotionalShippingDiscount = value;
    }

    /**
     * Gets the value of the internationalShippingDiscountProfileID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternationalShippingDiscountProfileID() {
        return internationalShippingDiscountProfileID;
    }

    /**
     * Sets the value of the internationalShippingDiscountProfileID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternationalShippingDiscountProfileID(String value) {
        this.internationalShippingDiscountProfileID = value;
    }

    /**
     * Gets the value of the internationalFlatShippingDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link FlatShippingDiscountType }
     *     
     */
    public FlatShippingDiscountType getInternationalFlatShippingDiscount() {
        return internationalFlatShippingDiscount;
    }

    /**
     * Sets the value of the internationalFlatShippingDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlatShippingDiscountType }
     *     
     */
    public void setInternationalFlatShippingDiscount(FlatShippingDiscountType value) {
        this.internationalFlatShippingDiscount = value;
    }

    /**
     * Gets the value of the internationalCalculatedShippingDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link CalculatedShippingDiscountType }
     *     
     */
    public CalculatedShippingDiscountType getInternationalCalculatedShippingDiscount() {
        return internationalCalculatedShippingDiscount;
    }

    /**
     * Sets the value of the internationalCalculatedShippingDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculatedShippingDiscountType }
     *     
     */
    public void setInternationalCalculatedShippingDiscount(CalculatedShippingDiscountType value) {
        this.internationalCalculatedShippingDiscount = value;
    }

    /**
     * Gets the value of the internationalPromotionalShippingDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInternationalPromotionalShippingDiscount() {
        return internationalPromotionalShippingDiscount;
    }

    /**
     * Sets the value of the internationalPromotionalShippingDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInternationalPromotionalShippingDiscount(Boolean value) {
        this.internationalPromotionalShippingDiscount = value;
    }

    /**
     * Gets the value of the promotionalShippingDiscountDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PromotionalShippingDiscountDetailsType }
     *     
     */
    public PromotionalShippingDiscountDetailsType getPromotionalShippingDiscountDetails() {
        return promotionalShippingDiscountDetails;
    }

    /**
     * Sets the value of the promotionalShippingDiscountDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionalShippingDiscountDetailsType }
     *     
     */
    public void setPromotionalShippingDiscountDetails(PromotionalShippingDiscountDetailsType value) {
        this.promotionalShippingDiscountDetails = value;
    }

    /**
     * Gets the value of the codCost property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCODCost() {
        return codCost;
    }

    /**
     * Sets the value of the codCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCODCost(AmountType value) {
        this.codCost = value;
    }

    /**
     * Gets the value of the excludeShipToLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the excludeShipToLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExcludeShipToLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getExcludeShipToLocation() {
        if (excludeShipToLocation == null) {
            excludeShipToLocation = new ArrayList<String>();
        }
        return this.excludeShipToLocation;
    }

    /**
     * Gets the value of the sellerExcludeShipToLocationsPreference property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSellerExcludeShipToLocationsPreference() {
        return sellerExcludeShipToLocationsPreference;
    }

    /**
     * Sets the value of the sellerExcludeShipToLocationsPreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSellerExcludeShipToLocationsPreference(Boolean value) {
        this.sellerExcludeShipToLocationsPreference = value;
    }

    /**
     * Gets the value of the shipmentTrackingDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipmentTrackingDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipmentTrackingDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentTrackingDetailsType }
     * 
     * 
     */
    public List<ShipmentTrackingDetailsType> getShipmentTrackingDetails() {
        if (shipmentTrackingDetails == null) {
            shipmentTrackingDetails = new ArrayList<ShipmentTrackingDetailsType>();
        }
        return this.shipmentTrackingDetails;
    }

    /**
     * Gets the value of the rateTableDetails property.
     * 
     * @return
     *     possible object is
     *     {@link RateTableDetailsType }
     *     
     */
    public RateTableDetailsType getRateTableDetails() {
        return rateTableDetails;
    }

    /**
     * Sets the value of the rateTableDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateTableDetailsType }
     *     
     */
    public void setRateTableDetails(RateTableDetailsType value) {
        this.rateTableDetails = value;
    }

}
