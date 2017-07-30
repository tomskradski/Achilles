
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
 *         Type defining the <b>Shipment</b> container, which is used by 
 *         the seller in <b>CompleteSale</b> to provide shipping information. The 
 *         <b>Shipment</b> container is also returned in the  
 *         <b>GetSellingManagerSaleRecord</b> response.
 *       
 * 
 * <p>Java class for ShipmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EstimatedDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="InsuredValue" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="PackageDepth" type="{urn:ebay:apis:eBLBaseComponents}MeasureType" minOccurs="0"/>
 *         &lt;element name="PackageLength" type="{urn:ebay:apis:eBLBaseComponents}MeasureType" minOccurs="0"/>
 *         &lt;element name="PackageWidth" type="{urn:ebay:apis:eBLBaseComponents}MeasureType" minOccurs="0"/>
 *         &lt;element name="PayPalShipmentID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipmentID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PostageTotal" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="PrintedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ShipFromAddress" type="{urn:ebay:apis:eBLBaseComponents}AddressType" minOccurs="0"/>
 *         &lt;element name="ShippingAddress" type="{urn:ebay:apis:eBLBaseComponents}AddressType" minOccurs="0"/>
 *         &lt;element name="ShippingCarrierUsed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShippingFeature" type="{urn:ebay:apis:eBLBaseComponents}ShippingFeatureCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ShippingPackage" type="{urn:ebay:apis:eBLBaseComponents}ShippingPackageCodeType" minOccurs="0"/>
 *         &lt;element name="ShippingServiceUsed" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="ShipmentTrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WeightMajor" type="{urn:ebay:apis:eBLBaseComponents}MeasureType" minOccurs="0"/>
 *         &lt;element name="WeightMinor" type="{urn:ebay:apis:eBLBaseComponents}MeasureType" minOccurs="0"/>
 *         &lt;element name="ItemTransactionID" type="{urn:ebay:apis:eBLBaseComponents}ItemTransactionIDType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DeliveryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DeliveryStatus" type="{urn:ebay:apis:eBLBaseComponents}ShipmentDeliveryStatusCodeType" minOccurs="0"/>
 *         &lt;element name="RefundGrantedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="RefundRequestedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Status" type="{urn:ebay:apis:eBLBaseComponents}ShipmentStatusCodeType" minOccurs="0"/>
 *         &lt;element name="ShippedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipmentTrackingDetails" type="{urn:ebay:apis:eBLBaseComponents}ShipmentTrackingDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ShipmentLineItem" type="{urn:ebay:apis:eBLBaseComponents}ShipmentLineItemType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "estimatedDeliveryDate",
    "insuredValue",
    "packageDepth",
    "packageLength",
    "packageWidth",
    "payPalShipmentID",
    "shipmentID",
    "postageTotal",
    "printedTime",
    "shipFromAddress",
    "shippingAddress",
    "shippingCarrierUsed",
    "shippingFeature",
    "shippingPackage",
    "shippingServiceUsed",
    "shipmentTrackingNumber",
    "weightMajor",
    "weightMinor",
    "itemTransactionID",
    "deliveryDate",
    "deliveryStatus",
    "refundGrantedTime",
    "refundRequestedTime",
    "status",
    "shippedTime",
    "notes",
    "shipmentTrackingDetails",
    "shipmentLineItem"
})
public class ShipmentType {

    @XmlElement(name = "EstimatedDeliveryDate", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar estimatedDeliveryDate;
    @XmlElement(name = "InsuredValue", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType insuredValue;
    @XmlElement(name = "PackageDepth", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected MeasureType packageDepth;
    @XmlElement(name = "PackageLength", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected MeasureType packageLength;
    @XmlElement(name = "PackageWidth", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected MeasureType packageWidth;
    @XmlElement(name = "PayPalShipmentID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String payPalShipmentID;
    @XmlElement(name = "ShipmentID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Long shipmentID;
    @XmlElement(name = "PostageTotal", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType postageTotal;
    @XmlElement(name = "PrintedTime", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar printedTime;
    @XmlElement(name = "ShipFromAddress", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AddressType shipFromAddress;
    @XmlElement(name = "ShippingAddress", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AddressType shippingAddress;
    @XmlElement(name = "ShippingCarrierUsed", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String shippingCarrierUsed;
    @XmlElement(name = "ShippingFeature", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected List<ShippingFeatureCodeType> shippingFeature;
    @XmlElement(name = "ShippingPackage", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected ShippingPackageCodeType shippingPackage;
    @XmlElement(name = "ShippingServiceUsed", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String shippingServiceUsed;
    @XmlElement(name = "ShipmentTrackingNumber", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String shipmentTrackingNumber;
    @XmlElement(name = "WeightMajor", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected MeasureType weightMajor;
    @XmlElement(name = "WeightMinor", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected MeasureType weightMinor;
    @XmlElement(name = "ItemTransactionID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<ItemTransactionIDType> itemTransactionID;
    @XmlElement(name = "DeliveryDate", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deliveryDate;
    @XmlElement(name = "DeliveryStatus", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected ShipmentDeliveryStatusCodeType deliveryStatus;
    @XmlElement(name = "RefundGrantedTime", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar refundGrantedTime;
    @XmlElement(name = "RefundRequestedTime", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar refundRequestedTime;
    @XmlElement(name = "Status", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected ShipmentStatusCodeType status;
    @XmlElement(name = "ShippedTime", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar shippedTime;
    @XmlElement(name = "Notes", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String notes;
    @XmlElement(name = "ShipmentTrackingDetails", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<ShipmentTrackingDetailsType> shipmentTrackingDetails;
    @XmlElement(name = "ShipmentLineItem", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected ShipmentLineItemType shipmentLineItem;

    /**
     * Gets the value of the estimatedDeliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEstimatedDeliveryDate() {
        return estimatedDeliveryDate;
    }

    /**
     * Sets the value of the estimatedDeliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEstimatedDeliveryDate(XMLGregorianCalendar value) {
        this.estimatedDeliveryDate = value;
    }

    /**
     * Gets the value of the insuredValue property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getInsuredValue() {
        return insuredValue;
    }

    /**
     * Sets the value of the insuredValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setInsuredValue(AmountType value) {
        this.insuredValue = value;
    }

    /**
     * Gets the value of the packageDepth property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getPackageDepth() {
        return packageDepth;
    }

    /**
     * Sets the value of the packageDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setPackageDepth(MeasureType value) {
        this.packageDepth = value;
    }

    /**
     * Gets the value of the packageLength property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getPackageLength() {
        return packageLength;
    }

    /**
     * Sets the value of the packageLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setPackageLength(MeasureType value) {
        this.packageLength = value;
    }

    /**
     * Gets the value of the packageWidth property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getPackageWidth() {
        return packageWidth;
    }

    /**
     * Sets the value of the packageWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setPackageWidth(MeasureType value) {
        this.packageWidth = value;
    }

    /**
     * Gets the value of the payPalShipmentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayPalShipmentID() {
        return payPalShipmentID;
    }

    /**
     * Sets the value of the payPalShipmentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayPalShipmentID(String value) {
        this.payPalShipmentID = value;
    }

    /**
     * Gets the value of the shipmentID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getShipmentID() {
        return shipmentID;
    }

    /**
     * Sets the value of the shipmentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setShipmentID(Long value) {
        this.shipmentID = value;
    }

    /**
     * Gets the value of the postageTotal property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPostageTotal() {
        return postageTotal;
    }

    /**
     * Sets the value of the postageTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPostageTotal(AmountType value) {
        this.postageTotal = value;
    }

    /**
     * Gets the value of the printedTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPrintedTime() {
        return printedTime;
    }

    /**
     * Sets the value of the printedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPrintedTime(XMLGregorianCalendar value) {
        this.printedTime = value;
    }

    /**
     * Gets the value of the shipFromAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getShipFromAddress() {
        return shipFromAddress;
    }

    /**
     * Sets the value of the shipFromAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setShipFromAddress(AddressType value) {
        this.shipFromAddress = value;
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
     * Gets the value of the shippingCarrierUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingCarrierUsed() {
        return shippingCarrierUsed;
    }

    /**
     * Sets the value of the shippingCarrierUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingCarrierUsed(String value) {
        this.shippingCarrierUsed = value;
    }

    /**
     * Gets the value of the shippingFeature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shippingFeature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShippingFeature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShippingFeatureCodeType }
     * 
     * 
     */
    public List<ShippingFeatureCodeType> getShippingFeature() {
        if (shippingFeature == null) {
            shippingFeature = new ArrayList<ShippingFeatureCodeType>();
        }
        return this.shippingFeature;
    }

    /**
     * Gets the value of the shippingPackage property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingPackageCodeType }
     *     
     */
    public ShippingPackageCodeType getShippingPackage() {
        return shippingPackage;
    }

    /**
     * Sets the value of the shippingPackage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingPackageCodeType }
     *     
     */
    public void setShippingPackage(ShippingPackageCodeType value) {
        this.shippingPackage = value;
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
     * Gets the value of the shipmentTrackingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentTrackingNumber() {
        return shipmentTrackingNumber;
    }

    /**
     * Sets the value of the shipmentTrackingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentTrackingNumber(String value) {
        this.shipmentTrackingNumber = value;
    }

    /**
     * Gets the value of the weightMajor property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getWeightMajor() {
        return weightMajor;
    }

    /**
     * Sets the value of the weightMajor property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setWeightMajor(MeasureType value) {
        this.weightMajor = value;
    }

    /**
     * Gets the value of the weightMinor property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getWeightMinor() {
        return weightMinor;
    }

    /**
     * Sets the value of the weightMinor property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setWeightMinor(MeasureType value) {
        this.weightMinor = value;
    }

    /**
     * Gets the value of the itemTransactionID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemTransactionID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemTransactionID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemTransactionIDType }
     * 
     * 
     */
    public List<ItemTransactionIDType> getItemTransactionID() {
        if (itemTransactionID == null) {
            itemTransactionID = new ArrayList<ItemTransactionIDType>();
        }
        return this.itemTransactionID;
    }

    /**
     * Gets the value of the deliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeliveryDate() {
        return deliveryDate;
    }

    /**
     * Sets the value of the deliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeliveryDate(XMLGregorianCalendar value) {
        this.deliveryDate = value;
    }

    /**
     * Gets the value of the deliveryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentDeliveryStatusCodeType }
     *     
     */
    public ShipmentDeliveryStatusCodeType getDeliveryStatus() {
        return deliveryStatus;
    }

    /**
     * Sets the value of the deliveryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentDeliveryStatusCodeType }
     *     
     */
    public void setDeliveryStatus(ShipmentDeliveryStatusCodeType value) {
        this.deliveryStatus = value;
    }

    /**
     * Gets the value of the refundGrantedTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRefundGrantedTime() {
        return refundGrantedTime;
    }

    /**
     * Sets the value of the refundGrantedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRefundGrantedTime(XMLGregorianCalendar value) {
        this.refundGrantedTime = value;
    }

    /**
     * Gets the value of the refundRequestedTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRefundRequestedTime() {
        return refundRequestedTime;
    }

    /**
     * Sets the value of the refundRequestedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRefundRequestedTime(XMLGregorianCalendar value) {
        this.refundRequestedTime = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentStatusCodeType }
     *     
     */
    public ShipmentStatusCodeType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentStatusCodeType }
     *     
     */
    public void setStatus(ShipmentStatusCodeType value) {
        this.status = value;
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
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
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
     * Gets the value of the shipmentLineItem property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentLineItemType }
     *     
     */
    public ShipmentLineItemType getShipmentLineItem() {
        return shipmentLineItem;
    }

    /**
     * Sets the value of the shipmentLineItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentLineItemType }
     *     
     */
    public void setShipmentLineItem(ShipmentLineItemType value) {
        this.shipmentLineItem = value;
    }

}
