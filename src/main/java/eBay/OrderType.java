
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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * 				There are single line item and multiple line item orders. A single
 * 				payment is made for both order types.
 * 				<br>
 * 				<br>
 * 				We strongly recommend that you avoid mixing digital and non-digital listings in
 * 				the same <a href="http://developer.ebay.com/DevZone/guides/ebayfeatures/Development/Listing-AnItem.html#CombinedInvoice">Combined Invoice</a>
 * 				order.
 * 			
 * 
 * <p>Java class for OrderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrderID" type="{urn:ebay:apis:eBLBaseComponents}OrderIDType" minOccurs="0"/>
 *         &lt;element name="OrderStatus" type="{urn:ebay:apis:eBLBaseComponents}OrderStatusCodeType" minOccurs="0"/>
 *         &lt;element name="AdjustmentAmount" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="AmountPaid" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="AmountSaved" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="CheckoutStatus" type="{urn:ebay:apis:eBLBaseComponents}CheckoutStatusType" minOccurs="0"/>
 *         &lt;element name="ShippingDetails" type="{urn:ebay:apis:eBLBaseComponents}ShippingDetailsType" minOccurs="0"/>
 *         &lt;element name="CreatingUserRole" type="{urn:ebay:apis:eBLBaseComponents}TradingRoleCodeType" minOccurs="0"/>
 *         &lt;element name="CreatedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PaymentMethods" type="{urn:ebay:apis:eBLBaseComponents}BuyerPaymentMethodCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SellerEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShippingAddress" type="{urn:ebay:apis:eBLBaseComponents}AddressType" minOccurs="0"/>
 *         &lt;element name="ShippingServiceSelected" type="{urn:ebay:apis:eBLBaseComponents}ShippingServiceOptionsType" minOccurs="0"/>
 *         &lt;element name="Subtotal" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="Total" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="ExternalTransaction" type="{urn:ebay:apis:eBLBaseComponents}ExternalTransactionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TransactionArray" type="{urn:ebay:apis:eBLBaseComponents}TransactionArrayType" minOccurs="0"/>
 *         &lt;element name="BuyerUserID" type="{urn:ebay:apis:eBLBaseComponents}UserIDType" minOccurs="0"/>
 *         &lt;element name="PaidTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ShippedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="IntegratedMerchantCreditCardEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BundlePurchase" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BuyerCheckoutMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EIASToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentHoldStatus" type="{urn:ebay:apis:eBLBaseComponents}PaymentHoldStatusCodeType" minOccurs="0"/>
 *         &lt;element name="PaymentHoldDetails" type="{urn:ebay:apis:eBLBaseComponents}PaymentHoldDetailType" minOccurs="0"/>
 *         &lt;element name="RefundAmount" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="RefundStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RefundArray" type="{urn:ebay:apis:eBLBaseComponents}RefundArrayType" minOccurs="0"/>
 *         &lt;element name="IsMultiLegShipping" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MultiLegShippingDetails" type="{urn:ebay:apis:eBLBaseComponents}MultiLegShippingDetailsType" minOccurs="0"/>
 *         &lt;element name="MonetaryDetails" type="{urn:ebay:apis:eBLBaseComponents}PaymentsInformationType" minOccurs="0"/>
 *         &lt;element name="PickupDetails" type="{urn:ebay:apis:eBLBaseComponents}PickupDetailsType" minOccurs="0"/>
 *         &lt;element name="PickupMethodSelected" type="{urn:ebay:apis:eBLBaseComponents}PickupMethodSelectedType" minOccurs="0"/>
 *         &lt;element name="SellerUserID" type="{urn:ebay:apis:eBLBaseComponents}UserIDType" minOccurs="0"/>
 *         &lt;element name="SellerEIASToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CancelReason" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="CancelStatus" type="{urn:ebay:apis:eBLBaseComponents}CancelStatusCodeType" minOccurs="0"/>
 *         &lt;element name="CancelReasonDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShippingConvenienceCharge" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="CancelDetail" type="{urn:ebay:apis:eBLBaseComponents}CancelDetailType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LogisticsPlanType" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="BuyerTaxIdentifier" type="{urn:ebay:apis:eBLBaseComponents}TaxIdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BuyerPackageEnclosures" type="{urn:ebay:apis:eBLBaseComponents}BuyerPackageEnclosuresType" minOccurs="0"/>
 *         &lt;element name="ExtendedOrderID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContainseBayPlusTransaction" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "orderID",
    "orderStatus",
    "adjustmentAmount",
    "amountPaid",
    "amountSaved",
    "checkoutStatus",
    "shippingDetails",
    "creatingUserRole",
    "createdTime",
    "paymentMethods",
    "sellerEmail",
    "shippingAddress",
    "shippingServiceSelected",
    "subtotal",
    "total",
    "externalTransaction",
    "transactionArray",
    "buyerUserID",
    "paidTime",
    "shippedTime",
    "integratedMerchantCreditCardEnabled",
    "bundlePurchase",
    "buyerCheckoutMessage",
    "eiasToken",
    "paymentHoldStatus",
    "paymentHoldDetails",
    "refundAmount",
    "refundStatus",
    "refundArray",
    "isMultiLegShipping",
    "multiLegShippingDetails",
    "monetaryDetails",
    "pickupDetails",
    "pickupMethodSelected",
    "sellerUserID",
    "sellerEIASToken",
    "cancelReason",
    "cancelStatus",
    "cancelReasonDetails",
    "shippingConvenienceCharge",
    "cancelDetail",
    "logisticsPlanType",
    "buyerTaxIdentifier",
    "buyerPackageEnclosures",
    "extendedOrderID",
    "containseBayPlusTransaction"
})
public class OrderType {

    @XmlElement(name = "OrderID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String orderID;
    @XmlElement(name = "OrderStatus", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected OrderStatusCodeType orderStatus;
    @XmlElement(name = "AdjustmentAmount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType adjustmentAmount;
    @XmlElement(name = "AmountPaid", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType amountPaid;
    @XmlElement(name = "AmountSaved", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType amountSaved;
    @XmlElement(name = "CheckoutStatus", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected CheckoutStatusType checkoutStatus;
    @XmlElement(name = "ShippingDetails", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected ShippingDetailsType shippingDetails;
    @XmlElement(name = "CreatingUserRole", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected TradingRoleCodeType creatingUserRole;
    @XmlElement(name = "CreatedTime", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdTime;
    @XmlElement(name = "PaymentMethods", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected List<BuyerPaymentMethodCodeType> paymentMethods;
    @XmlElement(name = "SellerEmail", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String sellerEmail;
    @XmlElement(name = "ShippingAddress", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AddressType shippingAddress;
    @XmlElement(name = "ShippingServiceSelected", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected ShippingServiceOptionsType shippingServiceSelected;
    @XmlElement(name = "Subtotal", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType subtotal;
    @XmlElement(name = "Total", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType total;
    @XmlElement(name = "ExternalTransaction", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<ExternalTransactionType> externalTransaction;
    @XmlElement(name = "TransactionArray", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected TransactionArrayType transactionArray;
    @XmlElement(name = "BuyerUserID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String buyerUserID;
    @XmlElement(name = "PaidTime", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar paidTime;
    @XmlElement(name = "ShippedTime", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar shippedTime;
    @XmlElement(name = "IntegratedMerchantCreditCardEnabled", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean integratedMerchantCreditCardEnabled;
    @XmlElement(name = "BundlePurchase", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean bundlePurchase;
    @XmlElement(name = "BuyerCheckoutMessage", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String buyerCheckoutMessage;
    @XmlElement(name = "EIASToken", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String eiasToken;
    @XmlElement(name = "PaymentHoldStatus", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected PaymentHoldStatusCodeType paymentHoldStatus;
    @XmlElement(name = "PaymentHoldDetails", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected PaymentHoldDetailType paymentHoldDetails;
    @XmlElement(name = "RefundAmount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType refundAmount;
    @XmlElement(name = "RefundStatus", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String refundStatus;
    @XmlElement(name = "RefundArray", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected RefundArrayType refundArray;
    @XmlElement(name = "IsMultiLegShipping", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean isMultiLegShipping;
    @XmlElement(name = "MultiLegShippingDetails", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected MultiLegShippingDetailsType multiLegShippingDetails;
    @XmlElement(name = "MonetaryDetails", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected PaymentsInformationType monetaryDetails;
    @XmlElement(name = "PickupDetails", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected PickupDetailsType pickupDetails;
    @XmlElement(name = "PickupMethodSelected", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected PickupMethodSelectedType pickupMethodSelected;
    @XmlElement(name = "SellerUserID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String sellerUserID;
    @XmlElement(name = "SellerEIASToken", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String sellerEIASToken;
    @XmlElement(name = "CancelReason", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String cancelReason;
    @XmlElement(name = "CancelStatus", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected CancelStatusCodeType cancelStatus;
    @XmlElement(name = "CancelReasonDetails", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String cancelReasonDetails;
    @XmlElement(name = "ShippingConvenienceCharge", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType shippingConvenienceCharge;
    @XmlElement(name = "CancelDetail", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<CancelDetailType> cancelDetail;
    @XmlElement(name = "LogisticsPlanType", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String logisticsPlanType;
    @XmlElement(name = "BuyerTaxIdentifier", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<TaxIdentifierType> buyerTaxIdentifier;
    @XmlElement(name = "BuyerPackageEnclosures", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected BuyerPackageEnclosuresType buyerPackageEnclosures;
    @XmlElement(name = "ExtendedOrderID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String extendedOrderID;
    @XmlElement(name = "ContainseBayPlusTransaction", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean containseBayPlusTransaction;

    /**
     * Gets the value of the orderID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderID() {
        return orderID;
    }

    /**
     * Sets the value of the orderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderID(String value) {
        this.orderID = value;
    }

    /**
     * Gets the value of the orderStatus property.
     * 
     * @return
     *     possible object is
     *     {@link OrderStatusCodeType }
     *     
     */
    public OrderStatusCodeType getOrderStatus() {
        return orderStatus;
    }

    /**
     * Sets the value of the orderStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderStatusCodeType }
     *     
     */
    public void setOrderStatus(OrderStatusCodeType value) {
        this.orderStatus = value;
    }

    /**
     * Gets the value of the adjustmentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAdjustmentAmount() {
        return adjustmentAmount;
    }

    /**
     * Sets the value of the adjustmentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAdjustmentAmount(AmountType value) {
        this.adjustmentAmount = value;
    }

    /**
     * Gets the value of the amountPaid property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmountPaid() {
        return amountPaid;
    }

    /**
     * Sets the value of the amountPaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmountPaid(AmountType value) {
        this.amountPaid = value;
    }

    /**
     * Gets the value of the amountSaved property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmountSaved() {
        return amountSaved;
    }

    /**
     * Sets the value of the amountSaved property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmountSaved(AmountType value) {
        this.amountSaved = value;
    }

    /**
     * Gets the value of the checkoutStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CheckoutStatusType }
     *     
     */
    public CheckoutStatusType getCheckoutStatus() {
        return checkoutStatus;
    }

    /**
     * Sets the value of the checkoutStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckoutStatusType }
     *     
     */
    public void setCheckoutStatus(CheckoutStatusType value) {
        this.checkoutStatus = value;
    }

    /**
     * Gets the value of the shippingDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingDetailsType }
     *     
     */
    public ShippingDetailsType getShippingDetails() {
        return shippingDetails;
    }

    /**
     * Sets the value of the shippingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingDetailsType }
     *     
     */
    public void setShippingDetails(ShippingDetailsType value) {
        this.shippingDetails = value;
    }

    /**
     * Gets the value of the creatingUserRole property.
     * 
     * @return
     *     possible object is
     *     {@link TradingRoleCodeType }
     *     
     */
    public TradingRoleCodeType getCreatingUserRole() {
        return creatingUserRole;
    }

    /**
     * Sets the value of the creatingUserRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradingRoleCodeType }
     *     
     */
    public void setCreatingUserRole(TradingRoleCodeType value) {
        this.creatingUserRole = value;
    }

    /**
     * Gets the value of the createdTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedTime() {
        return createdTime;
    }

    /**
     * Sets the value of the createdTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedTime(XMLGregorianCalendar value) {
        this.createdTime = value;
    }

    /**
     * Gets the value of the paymentMethods property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentMethods property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentMethods().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BuyerPaymentMethodCodeType }
     * 
     * 
     */
    public List<BuyerPaymentMethodCodeType> getPaymentMethods() {
        if (paymentMethods == null) {
            paymentMethods = new ArrayList<BuyerPaymentMethodCodeType>();
        }
        return this.paymentMethods;
    }

    /**
     * Gets the value of the sellerEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerEmail() {
        return sellerEmail;
    }

    /**
     * Sets the value of the sellerEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerEmail(String value) {
        this.sellerEmail = value;
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
     * Gets the value of the shippingServiceSelected property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingServiceOptionsType }
     *     
     */
    public ShippingServiceOptionsType getShippingServiceSelected() {
        return shippingServiceSelected;
    }

    /**
     * Sets the value of the shippingServiceSelected property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingServiceOptionsType }
     *     
     */
    public void setShippingServiceSelected(ShippingServiceOptionsType value) {
        this.shippingServiceSelected = value;
    }

    /**
     * Gets the value of the subtotal property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getSubtotal() {
        return subtotal;
    }

    /**
     * Sets the value of the subtotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setSubtotal(AmountType value) {
        this.subtotal = value;
    }

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotal(AmountType value) {
        this.total = value;
    }

    /**
     * Gets the value of the externalTransaction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the externalTransaction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExternalTransaction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExternalTransactionType }
     * 
     * 
     */
    public List<ExternalTransactionType> getExternalTransaction() {
        if (externalTransaction == null) {
            externalTransaction = new ArrayList<ExternalTransactionType>();
        }
        return this.externalTransaction;
    }

    /**
     * Gets the value of the transactionArray property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionArrayType }
     *     
     */
    public TransactionArrayType getTransactionArray() {
        return transactionArray;
    }

    /**
     * Sets the value of the transactionArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionArrayType }
     *     
     */
    public void setTransactionArray(TransactionArrayType value) {
        this.transactionArray = value;
    }

    /**
     * Gets the value of the buyerUserID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyerUserID() {
        return buyerUserID;
    }

    /**
     * Sets the value of the buyerUserID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyerUserID(String value) {
        this.buyerUserID = value;
    }

    /**
     * Gets the value of the paidTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPaidTime() {
        return paidTime;
    }

    /**
     * Sets the value of the paidTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPaidTime(XMLGregorianCalendar value) {
        this.paidTime = value;
    }

    /**
     * Gets the value of the shippedTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getShippedTime() {
        return shippedTime;
    }

    /**
     * Sets the value of the shippedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setShippedTime(XMLGregorianCalendar value) {
        this.shippedTime = value;
    }

    /**
     * Gets the value of the integratedMerchantCreditCardEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIntegratedMerchantCreditCardEnabled() {
        return integratedMerchantCreditCardEnabled;
    }

    /**
     * Sets the value of the integratedMerchantCreditCardEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIntegratedMerchantCreditCardEnabled(Boolean value) {
        this.integratedMerchantCreditCardEnabled = value;
    }

    /**
     * Gets the value of the bundlePurchase property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBundlePurchase() {
        return bundlePurchase;
    }

    /**
     * Sets the value of the bundlePurchase property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBundlePurchase(Boolean value) {
        this.bundlePurchase = value;
    }

    /**
     * Gets the value of the buyerCheckoutMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyerCheckoutMessage() {
        return buyerCheckoutMessage;
    }

    /**
     * Sets the value of the buyerCheckoutMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyerCheckoutMessage(String value) {
        this.buyerCheckoutMessage = value;
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
     * Gets the value of the paymentHoldStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentHoldStatusCodeType }
     *     
     */
    public PaymentHoldStatusCodeType getPaymentHoldStatus() {
        return paymentHoldStatus;
    }

    /**
     * Sets the value of the paymentHoldStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentHoldStatusCodeType }
     *     
     */
    public void setPaymentHoldStatus(PaymentHoldStatusCodeType value) {
        this.paymentHoldStatus = value;
    }

    /**
     * Gets the value of the paymentHoldDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentHoldDetailType }
     *     
     */
    public PaymentHoldDetailType getPaymentHoldDetails() {
        return paymentHoldDetails;
    }

    /**
     * Sets the value of the paymentHoldDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentHoldDetailType }
     *     
     */
    public void setPaymentHoldDetails(PaymentHoldDetailType value) {
        this.paymentHoldDetails = value;
    }

    /**
     * Gets the value of the refundAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getRefundAmount() {
        return refundAmount;
    }

    /**
     * Sets the value of the refundAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setRefundAmount(AmountType value) {
        this.refundAmount = value;
    }

    /**
     * Gets the value of the refundStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundStatus() {
        return refundStatus;
    }

    /**
     * Sets the value of the refundStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundStatus(String value) {
        this.refundStatus = value;
    }

    /**
     * Gets the value of the refundArray property.
     * 
     * @return
     *     possible object is
     *     {@link RefundArrayType }
     *     
     */
    public RefundArrayType getRefundArray() {
        return refundArray;
    }

    /**
     * Sets the value of the refundArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefundArrayType }
     *     
     */
    public void setRefundArray(RefundArrayType value) {
        this.refundArray = value;
    }

    /**
     * Gets the value of the isMultiLegShipping property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsMultiLegShipping() {
        return isMultiLegShipping;
    }

    /**
     * Sets the value of the isMultiLegShipping property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMultiLegShipping(Boolean value) {
        this.isMultiLegShipping = value;
    }

    /**
     * Gets the value of the multiLegShippingDetails property.
     * 
     * @return
     *     possible object is
     *     {@link MultiLegShippingDetailsType }
     *     
     */
    public MultiLegShippingDetailsType getMultiLegShippingDetails() {
        return multiLegShippingDetails;
    }

    /**
     * Sets the value of the multiLegShippingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiLegShippingDetailsType }
     *     
     */
    public void setMultiLegShippingDetails(MultiLegShippingDetailsType value) {
        this.multiLegShippingDetails = value;
    }

    /**
     * Gets the value of the monetaryDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentsInformationType }
     *     
     */
    public PaymentsInformationType getMonetaryDetails() {
        return monetaryDetails;
    }

    /**
     * Sets the value of the monetaryDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentsInformationType }
     *     
     */
    public void setMonetaryDetails(PaymentsInformationType value) {
        this.monetaryDetails = value;
    }

    /**
     * Gets the value of the pickupDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PickupDetailsType }
     *     
     */
    public PickupDetailsType getPickupDetails() {
        return pickupDetails;
    }

    /**
     * Sets the value of the pickupDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PickupDetailsType }
     *     
     */
    public void setPickupDetails(PickupDetailsType value) {
        this.pickupDetails = value;
    }

    /**
     * Gets the value of the pickupMethodSelected property.
     * 
     * @return
     *     possible object is
     *     {@link PickupMethodSelectedType }
     *     
     */
    public PickupMethodSelectedType getPickupMethodSelected() {
        return pickupMethodSelected;
    }

    /**
     * Sets the value of the pickupMethodSelected property.
     * 
     * @param value
     *     allowed object is
     *     {@link PickupMethodSelectedType }
     *     
     */
    public void setPickupMethodSelected(PickupMethodSelectedType value) {
        this.pickupMethodSelected = value;
    }

    /**
     * Gets the value of the sellerUserID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerUserID() {
        return sellerUserID;
    }

    /**
     * Sets the value of the sellerUserID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerUserID(String value) {
        this.sellerUserID = value;
    }

    /**
     * Gets the value of the sellerEIASToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerEIASToken() {
        return sellerEIASToken;
    }

    /**
     * Sets the value of the sellerEIASToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerEIASToken(String value) {
        this.sellerEIASToken = value;
    }

    /**
     * Gets the value of the cancelReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelReason() {
        return cancelReason;
    }

    /**
     * Sets the value of the cancelReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelReason(String value) {
        this.cancelReason = value;
    }

    /**
     * Gets the value of the cancelStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CancelStatusCodeType }
     *     
     */
    public CancelStatusCodeType getCancelStatus() {
        return cancelStatus;
    }

    /**
     * Sets the value of the cancelStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelStatusCodeType }
     *     
     */
    public void setCancelStatus(CancelStatusCodeType value) {
        this.cancelStatus = value;
    }

    /**
     * Gets the value of the cancelReasonDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelReasonDetails() {
        return cancelReasonDetails;
    }

    /**
     * Sets the value of the cancelReasonDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelReasonDetails(String value) {
        this.cancelReasonDetails = value;
    }

    /**
     * Gets the value of the shippingConvenienceCharge property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getShippingConvenienceCharge() {
        return shippingConvenienceCharge;
    }

    /**
     * Sets the value of the shippingConvenienceCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setShippingConvenienceCharge(AmountType value) {
        this.shippingConvenienceCharge = value;
    }

    /**
     * Gets the value of the cancelDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cancelDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCancelDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CancelDetailType }
     * 
     * 
     */
    public List<CancelDetailType> getCancelDetail() {
        if (cancelDetail == null) {
            cancelDetail = new ArrayList<CancelDetailType>();
        }
        return this.cancelDetail;
    }

    /**
     * Gets the value of the logisticsPlanType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogisticsPlanType() {
        return logisticsPlanType;
    }

    /**
     * Sets the value of the logisticsPlanType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogisticsPlanType(String value) {
        this.logisticsPlanType = value;
    }

    /**
     * Gets the value of the buyerTaxIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the buyerTaxIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBuyerTaxIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxIdentifierType }
     * 
     * 
     */
    public List<TaxIdentifierType> getBuyerTaxIdentifier() {
        if (buyerTaxIdentifier == null) {
            buyerTaxIdentifier = new ArrayList<TaxIdentifierType>();
        }
        return this.buyerTaxIdentifier;
    }

    /**
     * Gets the value of the buyerPackageEnclosures property.
     * 
     * @return
     *     possible object is
     *     {@link BuyerPackageEnclosuresType }
     *     
     */
    public BuyerPackageEnclosuresType getBuyerPackageEnclosures() {
        return buyerPackageEnclosures;
    }

    /**
     * Sets the value of the buyerPackageEnclosures property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuyerPackageEnclosuresType }
     *     
     */
    public void setBuyerPackageEnclosures(BuyerPackageEnclosuresType value) {
        this.buyerPackageEnclosures = value;
    }

    /**
     * Gets the value of the extendedOrderID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtendedOrderID() {
        return extendedOrderID;
    }

    /**
     * Sets the value of the extendedOrderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtendedOrderID(String value) {
        this.extendedOrderID = value;
    }

    /**
     * Gets the value of the containseBayPlusTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContainseBayPlusTransaction() {
        return containseBayPlusTransaction;
    }

    /**
     * Sets the value of the containseBayPlusTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContainseBayPlusTransaction(Boolean value) {
        this.containseBayPlusTransaction = value;
    }

}
