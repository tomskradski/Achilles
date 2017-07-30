
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
 * 				Type defining the <b>ReturnPolicyDetails</b> container, which is returned in <b>GeteBayDetails</b>, and provides the seller with the Return Policy features (and applicable values) that are supported by the listing site.
 * 				<br/><br/>
 * 				<span class="tablenote"><b>Note: </b>
 * 				This container is only returned if <b>ReturnPolicyDetails</b> is included as a <b>DetailName</b>
 * 				filter in the call request, or if no <b>DetailName</b> filters are used in the request.
 * 				</span>
 * 			
 * 
 * <p>Java class for ReturnPolicyDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReturnPolicyDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Refund" type="{urn:ebay:apis:eBLBaseComponents}RefundDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ReturnsWithin" type="{urn:ebay:apis:eBLBaseComponents}ReturnsWithinDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ReturnsAccepted" type="{urn:ebay:apis:eBLBaseComponents}ReturnsAcceptedDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="WarrantyOffered" type="{urn:ebay:apis:eBLBaseComponents}WarrantyOfferedDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="WarrantyType" type="{urn:ebay:apis:eBLBaseComponents}WarrantyTypeDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="WarrantyDuration" type="{urn:ebay:apis:eBLBaseComponents}WarrantyDurationDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EAN" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ShippingCostPaidBy" type="{urn:ebay:apis:eBLBaseComponents}ShippingCostPaidByDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RestockingFeeValue" type="{urn:ebay:apis:eBLBaseComponents}RestockingFeeValueDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DetailVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UpdateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReturnPolicyDetailsType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "refund",
    "returnsWithin",
    "returnsAccepted",
    "description",
    "warrantyOffered",
    "warrantyType",
    "warrantyDuration",
    "ean",
    "shippingCostPaidBy",
    "restockingFeeValue",
    "detailVersion",
    "updateTime"
})
public class ReturnPolicyDetailsType {

    @XmlElement(name = "Refund", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<RefundDetailsType> refund;
    @XmlElement(name = "ReturnsWithin", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<ReturnsWithinDetailsType> returnsWithin;
    @XmlElement(name = "ReturnsAccepted", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<ReturnsAcceptedDetailsType> returnsAccepted;
    @XmlElement(name = "Description", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean description;
    @XmlElement(name = "WarrantyOffered", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<WarrantyOfferedDetailsType> warrantyOffered;
    @XmlElement(name = "WarrantyType", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<WarrantyTypeDetailsType> warrantyType;
    @XmlElement(name = "WarrantyDuration", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<WarrantyDurationDetailsType> warrantyDuration;
    @XmlElement(name = "EAN", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean ean;
    @XmlElement(name = "ShippingCostPaidBy", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<ShippingCostPaidByDetailsType> shippingCostPaidBy;
    @XmlElement(name = "RestockingFeeValue", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<RestockingFeeValueDetailsType> restockingFeeValue;
    @XmlElement(name = "DetailVersion", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String detailVersion;
    @XmlElement(name = "UpdateTime", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updateTime;

    /**
     * Gets the value of the refund property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refund property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefund().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RefundDetailsType }
     * 
     * 
     */
    public List<RefundDetailsType> getRefund() {
        if (refund == null) {
            refund = new ArrayList<RefundDetailsType>();
        }
        return this.refund;
    }

    /**
     * Gets the value of the returnsWithin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the returnsWithin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReturnsWithin().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReturnsWithinDetailsType }
     * 
     * 
     */
    public List<ReturnsWithinDetailsType> getReturnsWithin() {
        if (returnsWithin == null) {
            returnsWithin = new ArrayList<ReturnsWithinDetailsType>();
        }
        return this.returnsWithin;
    }

    /**
     * Gets the value of the returnsAccepted property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the returnsAccepted property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReturnsAccepted().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReturnsAcceptedDetailsType }
     * 
     * 
     */
    public List<ReturnsAcceptedDetailsType> getReturnsAccepted() {
        if (returnsAccepted == null) {
            returnsAccepted = new ArrayList<ReturnsAcceptedDetailsType>();
        }
        return this.returnsAccepted;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDescription(Boolean value) {
        this.description = value;
    }

    /**
     * Gets the value of the warrantyOffered property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the warrantyOffered property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWarrantyOffered().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WarrantyOfferedDetailsType }
     * 
     * 
     */
    public List<WarrantyOfferedDetailsType> getWarrantyOffered() {
        if (warrantyOffered == null) {
            warrantyOffered = new ArrayList<WarrantyOfferedDetailsType>();
        }
        return this.warrantyOffered;
    }

    /**
     * Gets the value of the warrantyType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the warrantyType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWarrantyType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WarrantyTypeDetailsType }
     * 
     * 
     */
    public List<WarrantyTypeDetailsType> getWarrantyType() {
        if (warrantyType == null) {
            warrantyType = new ArrayList<WarrantyTypeDetailsType>();
        }
        return this.warrantyType;
    }

    /**
     * Gets the value of the warrantyDuration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the warrantyDuration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWarrantyDuration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WarrantyDurationDetailsType }
     * 
     * 
     */
    public List<WarrantyDurationDetailsType> getWarrantyDuration() {
        if (warrantyDuration == null) {
            warrantyDuration = new ArrayList<WarrantyDurationDetailsType>();
        }
        return this.warrantyDuration;
    }

    /**
     * Gets the value of the ean property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEAN() {
        return ean;
    }

    /**
     * Sets the value of the ean property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEAN(Boolean value) {
        this.ean = value;
    }

    /**
     * Gets the value of the shippingCostPaidBy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shippingCostPaidBy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShippingCostPaidBy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShippingCostPaidByDetailsType }
     * 
     * 
     */
    public List<ShippingCostPaidByDetailsType> getShippingCostPaidBy() {
        if (shippingCostPaidBy == null) {
            shippingCostPaidBy = new ArrayList<ShippingCostPaidByDetailsType>();
        }
        return this.shippingCostPaidBy;
    }

    /**
     * Gets the value of the restockingFeeValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the restockingFeeValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRestockingFeeValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RestockingFeeValueDetailsType }
     * 
     * 
     */
    public List<RestockingFeeValueDetailsType> getRestockingFeeValue() {
        if (restockingFeeValue == null) {
            restockingFeeValue = new ArrayList<RestockingFeeValueDetailsType>();
        }
        return this.restockingFeeValue;
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

}
