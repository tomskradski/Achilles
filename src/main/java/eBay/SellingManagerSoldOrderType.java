
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
 * 				Contains information about a sale record.
 * 			
 * 
 * <p>Java class for SellingManagerSoldOrderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SellingManagerSoldOrderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SellingManagerSoldTransaction" type="{urn:ebay:apis:eBLBaseComponents}SellingManagerSoldTransactionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ShippingAddress" type="{urn:ebay:apis:eBLBaseComponents}AddressType" minOccurs="0"/>
 *         &lt;element name="ShippingDetails" type="{urn:ebay:apis:eBLBaseComponents}ShippingDetailsType" minOccurs="0"/>
 *         &lt;element name="CashOnDeliveryCost" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalAmount" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalQuantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ItemCost" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="VATRate" type="{urn:ebay:apis:eBLBaseComponents}VATRateType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NetInsuranceFee" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="VATInsuranceFee" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="VATShippingFee" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="NetShippingFee" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="NetTotalAmount" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="VATTotalAmount" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="ActualShippingCost" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="AdjustmentAmount" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="NotesToBuyer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NotesFromBuyer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NotesToSeller" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderStatus" type="{urn:ebay:apis:eBLBaseComponents}SellingManagerOrderStatusType" minOccurs="0"/>
 *         &lt;element name="UnpaidItemStatus" type="{urn:ebay:apis:eBLBaseComponents}UnpaidItemStatusTypeCodeType" minOccurs="0"/>
 *         &lt;element name="SalePrice" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="EmailsSent" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DaysSinceSale" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BuyerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BuyerEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SaleRecordID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CreationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="RefundAmount" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="RefundStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SellingManagerSoldOrderType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "sellingManagerSoldTransaction",
    "shippingAddress",
    "shippingDetails",
    "cashOnDeliveryCost",
    "totalAmount",
    "totalQuantity",
    "itemCost",
    "vatRate",
    "netInsuranceFee",
    "vatInsuranceFee",
    "vatShippingFee",
    "netShippingFee",
    "netTotalAmount",
    "vatTotalAmount",
    "actualShippingCost",
    "adjustmentAmount",
    "notesToBuyer",
    "notesFromBuyer",
    "notesToSeller",
    "orderStatus",
    "unpaidItemStatus",
    "salePrice",
    "emailsSent",
    "daysSinceSale",
    "buyerID",
    "buyerEmail",
    "saleRecordID",
    "creationTime",
    "refundAmount",
    "refundStatus"
})
public class SellingManagerSoldOrderType {

    @XmlElement(name = "SellingManagerSoldTransaction", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<SellingManagerSoldTransactionType> sellingManagerSoldTransaction;
    @XmlElement(name = "ShippingAddress", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AddressType shippingAddress;
    @XmlElement(name = "ShippingDetails", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected ShippingDetailsType shippingDetails;
    @XmlElement(name = "CashOnDeliveryCost", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType cashOnDeliveryCost;
    @XmlElement(name = "TotalAmount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType totalAmount;
    @XmlElement(name = "TotalQuantity", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer totalQuantity;
    @XmlElement(name = "ItemCost", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType itemCost;
    @XmlElement(name = "VATRate", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<VATRateType> vatRate;
    @XmlElement(name = "NetInsuranceFee", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType netInsuranceFee;
    @XmlElement(name = "VATInsuranceFee", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType vatInsuranceFee;
    @XmlElement(name = "VATShippingFee", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType vatShippingFee;
    @XmlElement(name = "NetShippingFee", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType netShippingFee;
    @XmlElement(name = "NetTotalAmount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType netTotalAmount;
    @XmlElement(name = "VATTotalAmount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType vatTotalAmount;
    @XmlElement(name = "ActualShippingCost", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType actualShippingCost;
    @XmlElement(name = "AdjustmentAmount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType adjustmentAmount;
    @XmlElement(name = "NotesToBuyer", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String notesToBuyer;
    @XmlElement(name = "NotesFromBuyer", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String notesFromBuyer;
    @XmlElement(name = "NotesToSeller", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String notesToSeller;
    @XmlElement(name = "OrderStatus", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected SellingManagerOrderStatusType orderStatus;
    @XmlElement(name = "UnpaidItemStatus", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected UnpaidItemStatusTypeCodeType unpaidItemStatus;
    @XmlElement(name = "SalePrice", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType salePrice;
    @XmlElement(name = "EmailsSent", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer emailsSent;
    @XmlElement(name = "DaysSinceSale", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer daysSinceSale;
    @XmlElement(name = "BuyerID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String buyerID;
    @XmlElement(name = "BuyerEmail", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String buyerEmail;
    @XmlElement(name = "SaleRecordID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Long saleRecordID;
    @XmlElement(name = "CreationTime", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationTime;
    @XmlElement(name = "RefundAmount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType refundAmount;
    @XmlElement(name = "RefundStatus", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String refundStatus;

    /**
     * Gets the value of the sellingManagerSoldTransaction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sellingManagerSoldTransaction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSellingManagerSoldTransaction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SellingManagerSoldTransactionType }
     * 
     * 
     */
    public List<SellingManagerSoldTransactionType> getSellingManagerSoldTransaction() {
        if (sellingManagerSoldTransaction == null) {
            sellingManagerSoldTransaction = new ArrayList<SellingManagerSoldTransactionType>();
        }
        return this.sellingManagerSoldTransaction;
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
     * Gets the value of the cashOnDeliveryCost property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCashOnDeliveryCost() {
        return cashOnDeliveryCost;
    }

    /**
     * Sets the value of the cashOnDeliveryCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCashOnDeliveryCost(AmountType value) {
        this.cashOnDeliveryCost = value;
    }

    /**
     * Gets the value of the totalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalAmount(AmountType value) {
        this.totalAmount = value;
    }

    /**
     * Gets the value of the totalQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalQuantity() {
        return totalQuantity;
    }

    /**
     * Sets the value of the totalQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalQuantity(Integer value) {
        this.totalQuantity = value;
    }

    /**
     * Gets the value of the itemCost property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getItemCost() {
        return itemCost;
    }

    /**
     * Sets the value of the itemCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setItemCost(AmountType value) {
        this.itemCost = value;
    }

    /**
     * Gets the value of the vatRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vatRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVATRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VATRateType }
     * 
     * 
     */
    public List<VATRateType> getVATRate() {
        if (vatRate == null) {
            vatRate = new ArrayList<VATRateType>();
        }
        return this.vatRate;
    }

    /**
     * Gets the value of the netInsuranceFee property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getNetInsuranceFee() {
        return netInsuranceFee;
    }

    /**
     * Sets the value of the netInsuranceFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setNetInsuranceFee(AmountType value) {
        this.netInsuranceFee = value;
    }

    /**
     * Gets the value of the vatInsuranceFee property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getVATInsuranceFee() {
        return vatInsuranceFee;
    }

    /**
     * Sets the value of the vatInsuranceFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setVATInsuranceFee(AmountType value) {
        this.vatInsuranceFee = value;
    }

    /**
     * Gets the value of the vatShippingFee property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getVATShippingFee() {
        return vatShippingFee;
    }

    /**
     * Sets the value of the vatShippingFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setVATShippingFee(AmountType value) {
        this.vatShippingFee = value;
    }

    /**
     * Gets the value of the netShippingFee property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getNetShippingFee() {
        return netShippingFee;
    }

    /**
     * Sets the value of the netShippingFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setNetShippingFee(AmountType value) {
        this.netShippingFee = value;
    }

    /**
     * Gets the value of the netTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getNetTotalAmount() {
        return netTotalAmount;
    }

    /**
     * Sets the value of the netTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setNetTotalAmount(AmountType value) {
        this.netTotalAmount = value;
    }

    /**
     * Gets the value of the vatTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getVATTotalAmount() {
        return vatTotalAmount;
    }

    /**
     * Sets the value of the vatTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setVATTotalAmount(AmountType value) {
        this.vatTotalAmount = value;
    }

    /**
     * Gets the value of the actualShippingCost property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getActualShippingCost() {
        return actualShippingCost;
    }

    /**
     * Sets the value of the actualShippingCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setActualShippingCost(AmountType value) {
        this.actualShippingCost = value;
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
     * Gets the value of the notesToBuyer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotesToBuyer() {
        return notesToBuyer;
    }

    /**
     * Sets the value of the notesToBuyer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotesToBuyer(String value) {
        this.notesToBuyer = value;
    }

    /**
     * Gets the value of the notesFromBuyer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotesFromBuyer() {
        return notesFromBuyer;
    }

    /**
     * Sets the value of the notesFromBuyer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotesFromBuyer(String value) {
        this.notesFromBuyer = value;
    }

    /**
     * Gets the value of the notesToSeller property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotesToSeller() {
        return notesToSeller;
    }

    /**
     * Sets the value of the notesToSeller property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotesToSeller(String value) {
        this.notesToSeller = value;
    }

    /**
     * Gets the value of the orderStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SellingManagerOrderStatusType }
     *     
     */
    public SellingManagerOrderStatusType getOrderStatus() {
        return orderStatus;
    }

    /**
     * Sets the value of the orderStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellingManagerOrderStatusType }
     *     
     */
    public void setOrderStatus(SellingManagerOrderStatusType value) {
        this.orderStatus = value;
    }

    /**
     * Gets the value of the unpaidItemStatus property.
     * 
     * @return
     *     possible object is
     *     {@link UnpaidItemStatusTypeCodeType }
     *     
     */
    public UnpaidItemStatusTypeCodeType getUnpaidItemStatus() {
        return unpaidItemStatus;
    }

    /**
     * Sets the value of the unpaidItemStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnpaidItemStatusTypeCodeType }
     *     
     */
    public void setUnpaidItemStatus(UnpaidItemStatusTypeCodeType value) {
        this.unpaidItemStatus = value;
    }

    /**
     * Gets the value of the salePrice property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getSalePrice() {
        return salePrice;
    }

    /**
     * Sets the value of the salePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setSalePrice(AmountType value) {
        this.salePrice = value;
    }

    /**
     * Gets the value of the emailsSent property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEmailsSent() {
        return emailsSent;
    }

    /**
     * Sets the value of the emailsSent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEmailsSent(Integer value) {
        this.emailsSent = value;
    }

    /**
     * Gets the value of the daysSinceSale property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDaysSinceSale() {
        return daysSinceSale;
    }

    /**
     * Sets the value of the daysSinceSale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDaysSinceSale(Integer value) {
        this.daysSinceSale = value;
    }

    /**
     * Gets the value of the buyerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyerID() {
        return buyerID;
    }

    /**
     * Sets the value of the buyerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyerID(String value) {
        this.buyerID = value;
    }

    /**
     * Gets the value of the buyerEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyerEmail() {
        return buyerEmail;
    }

    /**
     * Sets the value of the buyerEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyerEmail(String value) {
        this.buyerEmail = value;
    }

    /**
     * Gets the value of the saleRecordID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSaleRecordID() {
        return saleRecordID;
    }

    /**
     * Sets the value of the saleRecordID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSaleRecordID(Long value) {
        this.saleRecordID = value;
    }

    /**
     * Gets the value of the creationTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationTime() {
        return creationTime;
    }

    /**
     * Sets the value of the creationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationTime(XMLGregorianCalendar value) {
        this.creationTime = value;
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

}
