
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * 				Details for a single promotional sale.
 * 			
 * 
 * <p>Java class for PromotionalSaleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PromotionalSaleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PromotionalSaleID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PromotionalSaleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PromotionalSaleItemIDArray" type="{urn:ebay:apis:eBLBaseComponents}ItemIDArrayType" minOccurs="0"/>
 *         &lt;element name="Status" type="{urn:ebay:apis:eBLBaseComponents}PromotionalSaleStatusCodeType" minOccurs="0"/>
 *         &lt;element name="DiscountType" type="{urn:ebay:apis:eBLBaseComponents}DiscountCodeType" minOccurs="0"/>
 *         &lt;element name="DiscountValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="PromotionalSaleStartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PromotionalSaleEndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PromotionalSaleType" type="{urn:ebay:apis:eBLBaseComponents}PromotionalSaleTypeCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromotionalSaleType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "promotionalSaleID",
    "promotionalSaleName",
    "promotionalSaleItemIDArray",
    "status",
    "discountType",
    "discountValue",
    "promotionalSaleStartTime",
    "promotionalSaleEndTime",
    "promotionalSaleType"
})
public class PromotionalSaleType {

    @XmlElement(name = "PromotionalSaleID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Long promotionalSaleID;
    @XmlElement(name = "PromotionalSaleName", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String promotionalSaleName;
    @XmlElement(name = "PromotionalSaleItemIDArray", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected ItemIDArrayType promotionalSaleItemIDArray;
    @XmlElement(name = "Status", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected PromotionalSaleStatusCodeType status;
    @XmlElement(name = "DiscountType", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected DiscountCodeType discountType;
    @XmlElement(name = "DiscountValue", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Double discountValue;
    @XmlElement(name = "PromotionalSaleStartTime", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar promotionalSaleStartTime;
    @XmlElement(name = "PromotionalSaleEndTime", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar promotionalSaleEndTime;
    @XmlElement(name = "PromotionalSaleType", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected PromotionalSaleTypeCodeType promotionalSaleType;

    /**
     * Gets the value of the promotionalSaleID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPromotionalSaleID() {
        return promotionalSaleID;
    }

    /**
     * Sets the value of the promotionalSaleID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPromotionalSaleID(Long value) {
        this.promotionalSaleID = value;
    }

    /**
     * Gets the value of the promotionalSaleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionalSaleName() {
        return promotionalSaleName;
    }

    /**
     * Sets the value of the promotionalSaleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionalSaleName(String value) {
        this.promotionalSaleName = value;
    }

    /**
     * Gets the value of the promotionalSaleItemIDArray property.
     * 
     * @return
     *     possible object is
     *     {@link ItemIDArrayType }
     *     
     */
    public ItemIDArrayType getPromotionalSaleItemIDArray() {
        return promotionalSaleItemIDArray;
    }

    /**
     * Sets the value of the promotionalSaleItemIDArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemIDArrayType }
     *     
     */
    public void setPromotionalSaleItemIDArray(ItemIDArrayType value) {
        this.promotionalSaleItemIDArray = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link PromotionalSaleStatusCodeType }
     *     
     */
    public PromotionalSaleStatusCodeType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionalSaleStatusCodeType }
     *     
     */
    public void setStatus(PromotionalSaleStatusCodeType value) {
        this.status = value;
    }

    /**
     * Gets the value of the discountType property.
     * 
     * @return
     *     possible object is
     *     {@link DiscountCodeType }
     *     
     */
    public DiscountCodeType getDiscountType() {
        return discountType;
    }

    /**
     * Sets the value of the discountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountCodeType }
     *     
     */
    public void setDiscountType(DiscountCodeType value) {
        this.discountType = value;
    }

    /**
     * Gets the value of the discountValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDiscountValue() {
        return discountValue;
    }

    /**
     * Sets the value of the discountValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDiscountValue(Double value) {
        this.discountValue = value;
    }

    /**
     * Gets the value of the promotionalSaleStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPromotionalSaleStartTime() {
        return promotionalSaleStartTime;
    }

    /**
     * Sets the value of the promotionalSaleStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPromotionalSaleStartTime(XMLGregorianCalendar value) {
        this.promotionalSaleStartTime = value;
    }

    /**
     * Gets the value of the promotionalSaleEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPromotionalSaleEndTime() {
        return promotionalSaleEndTime;
    }

    /**
     * Sets the value of the promotionalSaleEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPromotionalSaleEndTime(XMLGregorianCalendar value) {
        this.promotionalSaleEndTime = value;
    }

    /**
     * Gets the value of the promotionalSaleType property.
     * 
     * @return
     *     possible object is
     *     {@link PromotionalSaleTypeCodeType }
     *     
     */
    public PromotionalSaleTypeCodeType getPromotionalSaleType() {
        return promotionalSaleType;
    }

    /**
     * Sets the value of the promotionalSaleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionalSaleTypeCodeType }
     *     
     */
    public void setPromotionalSaleType(PromotionalSaleTypeCodeType value) {
        this.promotionalSaleType = value;
    }

}
