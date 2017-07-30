
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
 *         Details about a specific shipping service.
 *       
 * 
 * <p>Java class for ShippingServiceDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShippingServiceDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExpeditedService" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="InternationalService" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ShippingService" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="ShippingServiceID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ShippingTimeMax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ShippingTimeMin" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ShippingServiceCode" type="{urn:ebay:apis:eBLBaseComponents}ShippingServiceCodeType" minOccurs="0"/>
 *         &lt;element name="ServiceType" type="{urn:ebay:apis:eBLBaseComponents}ShippingTypeCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ShippingPackage" type="{urn:ebay:apis:eBLBaseComponents}ShippingPackageCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DimensionsRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ValidForSellingFlow" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SurchargeApplicable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ShippingCarrier" type="{urn:ebay:apis:eBLBaseComponents}ShippingCarrierCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CODService" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DeprecationDetails" type="{urn:ebay:apis:eBLBaseComponents}AnnouncementMessageType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MappedToShippingServiceID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CostGroupFlat" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="ShippingServicePackageDetails" type="{urn:ebay:apis:eBLBaseComponents}ShippingServicePackageDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="WeightRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DetailVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UpdateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ShippingCategory" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShippingServiceDetailsType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "description",
    "expeditedService",
    "internationalService",
    "shippingService",
    "shippingServiceID",
    "shippingTimeMax",
    "shippingTimeMin",
    "shippingServiceCode",
    "serviceType",
    "shippingPackage",
    "dimensionsRequired",
    "validForSellingFlow",
    "surchargeApplicable",
    "shippingCarrier",
    "codService",
    "deprecationDetails",
    "mappedToShippingServiceID",
    "costGroupFlat",
    "shippingServicePackageDetails",
    "weightRequired",
    "detailVersion",
    "updateTime",
    "shippingCategory"
})
public class ShippingServiceDetailsType {

    @XmlElement(name = "Description", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String description;
    @XmlElement(name = "ExpeditedService", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean expeditedService;
    @XmlElement(name = "InternationalService", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean internationalService;
    @XmlElement(name = "ShippingService", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String shippingService;
    @XmlElement(name = "ShippingServiceID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer shippingServiceID;
    @XmlElement(name = "ShippingTimeMax", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer shippingTimeMax;
    @XmlElement(name = "ShippingTimeMin", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer shippingTimeMin;
    @XmlElement(name = "ShippingServiceCode", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String shippingServiceCode;
    @XmlElement(name = "ServiceType", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected List<ShippingTypeCodeType> serviceType;
    @XmlElement(name = "ShippingPackage", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected List<ShippingPackageCodeType> shippingPackage;
    @XmlElement(name = "DimensionsRequired", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean dimensionsRequired;
    @XmlElement(name = "ValidForSellingFlow", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean validForSellingFlow;
    @XmlElement(name = "SurchargeApplicable", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean surchargeApplicable;
    @XmlElement(name = "ShippingCarrier", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected List<ShippingCarrierCodeType> shippingCarrier;
    @XmlElement(name = "CODService", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean codService;
    @XmlElement(name = "DeprecationDetails", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<AnnouncementMessageType> deprecationDetails;
    @XmlElement(name = "MappedToShippingServiceID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer mappedToShippingServiceID;
    @XmlElement(name = "CostGroupFlat", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String costGroupFlat;
    @XmlElement(name = "ShippingServicePackageDetails", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<ShippingServicePackageDetailsType> shippingServicePackageDetails;
    @XmlElement(name = "WeightRequired", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean weightRequired;
    @XmlElement(name = "DetailVersion", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String detailVersion;
    @XmlElement(name = "UpdateTime", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updateTime;
    @XmlElement(name = "ShippingCategory", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String shippingCategory;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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
     * Gets the value of the internationalService property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInternationalService() {
        return internationalService;
    }

    /**
     * Sets the value of the internationalService property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInternationalService(Boolean value) {
        this.internationalService = value;
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
     * Gets the value of the shippingServiceID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getShippingServiceID() {
        return shippingServiceID;
    }

    /**
     * Sets the value of the shippingServiceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setShippingServiceID(Integer value) {
        this.shippingServiceID = value;
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
     * Gets the value of the shippingServiceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingServiceCode() {
        return shippingServiceCode;
    }

    /**
     * Sets the value of the shippingServiceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingServiceCode(String value) {
        this.shippingServiceCode = value;
    }

    /**
     * Gets the value of the serviceType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShippingTypeCodeType }
     * 
     * 
     */
    public List<ShippingTypeCodeType> getServiceType() {
        if (serviceType == null) {
            serviceType = new ArrayList<ShippingTypeCodeType>();
        }
        return this.serviceType;
    }

    /**
     * Gets the value of the shippingPackage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shippingPackage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShippingPackage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShippingPackageCodeType }
     * 
     * 
     */
    public List<ShippingPackageCodeType> getShippingPackage() {
        if (shippingPackage == null) {
            shippingPackage = new ArrayList<ShippingPackageCodeType>();
        }
        return this.shippingPackage;
    }

    /**
     * Gets the value of the dimensionsRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDimensionsRequired() {
        return dimensionsRequired;
    }

    /**
     * Sets the value of the dimensionsRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDimensionsRequired(Boolean value) {
        this.dimensionsRequired = value;
    }

    /**
     * Gets the value of the validForSellingFlow property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isValidForSellingFlow() {
        return validForSellingFlow;
    }

    /**
     * Sets the value of the validForSellingFlow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setValidForSellingFlow(Boolean value) {
        this.validForSellingFlow = value;
    }

    /**
     * Gets the value of the surchargeApplicable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSurchargeApplicable() {
        return surchargeApplicable;
    }

    /**
     * Sets the value of the surchargeApplicable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSurchargeApplicable(Boolean value) {
        this.surchargeApplicable = value;
    }

    /**
     * Gets the value of the shippingCarrier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shippingCarrier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShippingCarrier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShippingCarrierCodeType }
     * 
     * 
     */
    public List<ShippingCarrierCodeType> getShippingCarrier() {
        if (shippingCarrier == null) {
            shippingCarrier = new ArrayList<ShippingCarrierCodeType>();
        }
        return this.shippingCarrier;
    }

    /**
     * Gets the value of the codService property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCODService() {
        return codService;
    }

    /**
     * Sets the value of the codService property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCODService(Boolean value) {
        this.codService = value;
    }

    /**
     * Gets the value of the deprecationDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deprecationDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeprecationDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnnouncementMessageType }
     * 
     * 
     */
    public List<AnnouncementMessageType> getDeprecationDetails() {
        if (deprecationDetails == null) {
            deprecationDetails = new ArrayList<AnnouncementMessageType>();
        }
        return this.deprecationDetails;
    }

    /**
     * Gets the value of the mappedToShippingServiceID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMappedToShippingServiceID() {
        return mappedToShippingServiceID;
    }

    /**
     * Sets the value of the mappedToShippingServiceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMappedToShippingServiceID(Integer value) {
        this.mappedToShippingServiceID = value;
    }

    /**
     * Gets the value of the costGroupFlat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostGroupFlat() {
        return costGroupFlat;
    }

    /**
     * Sets the value of the costGroupFlat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostGroupFlat(String value) {
        this.costGroupFlat = value;
    }

    /**
     * Gets the value of the shippingServicePackageDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shippingServicePackageDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShippingServicePackageDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShippingServicePackageDetailsType }
     * 
     * 
     */
    public List<ShippingServicePackageDetailsType> getShippingServicePackageDetails() {
        if (shippingServicePackageDetails == null) {
            shippingServicePackageDetails = new ArrayList<ShippingServicePackageDetailsType>();
        }
        return this.shippingServicePackageDetails;
    }

    /**
     * Gets the value of the weightRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWeightRequired() {
        return weightRequired;
    }

    /**
     * Sets the value of the weightRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWeightRequired(Boolean value) {
        this.weightRequired = value;
    }

    /**
     * Gets the value of the detailVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetailVersion() {
        return detailVersion;
    }

    /**
     * Sets the value of the detailVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetailVersion(String value) {
        this.detailVersion = value;
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
     * Gets the value of the shippingCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingCategory() {
        return shippingCategory;
    }

    /**
     * Sets the value of the shippingCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingCategory(String value) {
        this.shippingCategory = value;
    }

}
