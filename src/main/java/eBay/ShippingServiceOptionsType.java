
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
 * 				Container consisting of shipping costs and other details related to a domestic
 * 				shipping service. An exception to the domestic shipping service rule is seen in the
 * 				<b>ShippingServiceSelected</b> container returned under the <b>Order</b> and Transact<b>ion</b>
 * 				containers in order and order line item retrieval calls such as <b>GetOrders</b> or
 * 				<b>GetItemTransactions</b>. In this scenario, the <b>SelectedShippingService</b> container
 * 				consists of either domestic or international shipping service data, based on the
 * 				selected service according to the buyer's shipping address.
 * 				<br/><br/>
 * 				If one or more international shipping services are provided, the
 * 				seller must specify at least one domestic shipping service as well.
 * 				<br/><br/>
 * 				<span class="tablenote">
 * 				<strong>Note:</strong> For <b>GetItemTransactions</b> and <b>GetSellerTransactions</b>, this container does not return accurate shipping service and cost information for multiple line item orders. Use <b>GetOrders</b> instead, and provide the order's combined <strong>OrderID</strong> to retrieve this information.
 * 				</span>
 * 			
 * 
 * <p>Java class for ShippingServiceOptionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShippingServiceOptionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ShippingInsuranceCost" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="ShippingService" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="ShippingServiceCost" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="ShippingServiceAdditionalCost" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="ShippingServicePriority" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ExpeditedService" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ShippingTimeMin" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ShippingTimeMax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ShippingSurcharge" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="FreeShipping" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LocalPickup" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ImportCharge" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="ShippingPackageInfo" type="{urn:ebay:apis:eBLBaseComponents}ShippingPackageInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ShippingServiceCutOffTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LogisticPlanType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShippingServiceOptionsType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "shippingInsuranceCost",
    "shippingService",
    "shippingServiceCost",
    "shippingServiceAdditionalCost",
    "shippingServicePriority",
    "expeditedService",
    "shippingTimeMin",
    "shippingTimeMax",
    "shippingSurcharge",
    "freeShipping",
    "localPickup",
    "importCharge",
    "shippingPackageInfo",
    "shippingServiceCutOffTime",
    "logisticPlanType"
})
public class ShippingServiceOptionsType {

    @XmlElement(name = "ShippingInsuranceCost", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType shippingInsuranceCost;
    @XmlElement(name = "ShippingService", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String shippingService;
    @XmlElement(name = "ShippingServiceCost", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType shippingServiceCost;
    @XmlElement(name = "ShippingServiceAdditionalCost", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType shippingServiceAdditionalCost;
    @XmlElement(name = "ShippingServicePriority", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer shippingServicePriority;
    @XmlElement(name = "ExpeditedService", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean expeditedService;
    @XmlElement(name = "ShippingTimeMin", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer shippingTimeMin;
    @XmlElement(name = "ShippingTimeMax", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer shippingTimeMax;
    @XmlElement(name = "ShippingSurcharge", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType shippingSurcharge;
    @XmlElement(name = "FreeShipping", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean freeShipping;
    @XmlElement(name = "LocalPickup", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean localPickup;
    @XmlElement(name = "ImportCharge", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType importCharge;
    @XmlElement(name = "ShippingPackageInfo", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<ShippingPackageInfoType> shippingPackageInfo;
    @XmlElement(name = "ShippingServiceCutOffTime", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar shippingServiceCutOffTime;
    @XmlElement(name = "LogisticPlanType", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String logisticPlanType;

    /**
     * Gets the value of the shippingInsuranceCost property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getShippingInsuranceCost() {
        return shippingInsuranceCost;
    }

    /**
     * Sets the value of the shippingInsuranceCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setShippingInsuranceCost(AmountType value) {
        this.shippingInsuranceCost = value;
    }

    /**
     * Gets the value of the shippingService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingService() {
        return shippingService;
    }

    /**
     * Sets the value of the shippingService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingService(String value) {
        this.shippingService = value;
    }

    /**
     * Gets the value of the shippingServiceCost property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getShippingServiceCost() {
        return shippingServiceCost;
    }

    /**
     * Sets the value of the shippingServiceCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setShippingServiceCost(AmountType value) {
        this.shippingServiceCost = value;
    }

    /**
     * Gets the value of the shippingServiceAdditionalCost property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getShippingServiceAdditionalCost() {
        return shippingServiceAdditionalCost;
    }

    /**
     * Sets the value of the shippingServiceAdditionalCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setShippingServiceAdditionalCost(AmountType value) {
        this.shippingServiceAdditionalCost = value;
    }

    /**
     * Gets the value of the shippingServicePriority property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getShippingServicePriority() {
        return shippingServicePriority;
    }

    /**
     * Sets the value of the shippingServicePriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setShippingServicePriority(Integer value) {
        this.shippingServicePriority = value;
    }

    /**
     * Gets the value of the expeditedService property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExpeditedService() {
        return expeditedService;
    }

    /**
     * Sets the value of the expeditedService property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExpeditedService(Boolean value) {
        this.expeditedService = value;
    }

    /**
     * Gets the value of the shippingTimeMin property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getShippingTimeMin() {
        return shippingTimeMin;
    }

    /**
     * Sets the value of the shippingTimeMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setShippingTimeMin(Integer value) {
        this.shippingTimeMin = value;
    }

    /**
     * Gets the value of the shippingTimeMax property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getShippingTimeMax() {
        return shippingTimeMax;
    }

    /**
     * Sets the value of the shippingTimeMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setShippingTimeMax(Integer value) {
        this.shippingTimeMax = value;
    }

    /**
     * Gets the value of the shippingSurcharge property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getShippingSurcharge() {
        return shippingSurcharge;
    }

    /**
     * Sets the value of the shippingSurcharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setShippingSurcharge(AmountType value) {
        this.shippingSurcharge = value;
    }

    /**
     * Gets the value of the freeShipping property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFreeShipping() {
        return freeShipping;
    }

    /**
     * Sets the value of the freeShipping property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFreeShipping(Boolean value) {
        this.freeShipping = value;
    }

    /**
     * Gets the value of the localPickup property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocalPickup() {
        return localPickup;
    }

    /**
     * Sets the value of the localPickup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocalPickup(Boolean value) {
        this.localPickup = value;
    }

    /**
     * Gets the value of the importCharge property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getImportCharge() {
        return importCharge;
    }

    /**
     * Sets the value of the importCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setImportCharge(AmountType value) {
        this.importCharge = value;
    }

    /**
     * Gets the value of the shippingPackageInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shippingPackageInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShippingPackageInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShippingPackageInfoType }
     * 
     * 
     */
    public List<ShippingPackageInfoType> getShippingPackageInfo() {
        if (shippingPackageInfo == null) {
            shippingPackageInfo = new ArrayList<ShippingPackageInfoType>();
        }
        return this.shippingPackageInfo;
    }

    /**
     * Gets the value of the shippingServiceCutOffTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getShippingServiceCutOffTime() {
        return shippingServiceCutOffTime;
    }

    /**
     * Sets the value of the shippingServiceCutOffTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setShippingServiceCutOffTime(XMLGregorianCalendar value) {
        this.shippingServiceCutOffTime = value;
    }

    /**
     * Gets the value of the logisticPlanType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogisticPlanType() {
        return logisticPlanType;
    }

    /**
     * Sets the value of the logisticPlanType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogisticPlanType(String value) {
        this.logisticPlanType = value;
    }

}
