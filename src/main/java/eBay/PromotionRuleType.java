
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This type is deprecated.
 * 			
 * 
 * <p>Java class for PromotionRuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PromotionRuleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PromotedStoreCategoryID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PromotedeBayCategoryID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PromotedKeywords" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReferringItemID" type="{urn:ebay:apis:eBLBaseComponents}ItemIDType" minOccurs="0"/>
 *         &lt;element name="ReferringStoreCategoryID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ReferringeBayCategoryID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReferringKeywords" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PromotionScheme" type="{urn:ebay:apis:eBLBaseComponents}PromotionSchemeCodeType" minOccurs="0"/>
 *         &lt;element name="PromotionMethod" type="{urn:ebay:apis:eBLBaseComponents}PromotionMethodCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromotionRuleType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "promotedStoreCategoryID",
    "promotedeBayCategoryID",
    "promotedKeywords",
    "referringItemID",
    "referringStoreCategoryID",
    "referringeBayCategoryID",
    "referringKeywords",
    "promotionScheme",
    "promotionMethod"
})
public class PromotionRuleType {

    @XmlElement(name = "PromotedStoreCategoryID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Long promotedStoreCategoryID;
    @XmlElement(name = "PromotedeBayCategoryID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String promotedeBayCategoryID;
    @XmlElement(name = "PromotedKeywords", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String promotedKeywords;
    @XmlElement(name = "ReferringItemID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String referringItemID;
    @XmlElement(name = "ReferringStoreCategoryID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Long referringStoreCategoryID;
    @XmlElement(name = "ReferringeBayCategoryID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String referringeBayCategoryID;
    @XmlElement(name = "ReferringKeywords", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String referringKeywords;
    @XmlElement(name = "PromotionScheme", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected PromotionSchemeCodeType promotionScheme;
    @XmlElement(name = "PromotionMethod", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected PromotionMethodCodeType promotionMethod;

    /**
     * Gets the value of the promotedStoreCategoryID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPromotedStoreCategoryID() {
        return promotedStoreCategoryID;
    }

    /**
     * Sets the value of the promotedStoreCategoryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPromotedStoreCategoryID(Long value) {
        this.promotedStoreCategoryID = value;
    }

    /**
     * Gets the value of the promotedeBayCategoryID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotedeBayCategoryID() {
        return promotedeBayCategoryID;
    }

    /**
     * Sets the value of the promotedeBayCategoryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotedeBayCategoryID(String value) {
        this.promotedeBayCategoryID = value;
    }

    /**
     * Gets the value of the promotedKeywords property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotedKeywords() {
        return promotedKeywords;
    }

    /**
     * Sets the value of the promotedKeywords property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotedKeywords(String value) {
        this.promotedKeywords = value;
    }

    /**
     * Gets the value of the referringItemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferringItemID() {
        return referringItemID;
    }

    /**
     * Sets the value of the referringItemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferringItemID(String value) {
        this.referringItemID = value;
    }

    /**
     * Gets the value of the referringStoreCategoryID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReferringStoreCategoryID() {
        return referringStoreCategoryID;
    }

    /**
     * Sets the value of the referringStoreCategoryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReferringStoreCategoryID(Long value) {
        this.referringStoreCategoryID = value;
    }

    /**
     * Gets the value of the referringeBayCategoryID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferringeBayCategoryID() {
        return referringeBayCategoryID;
    }

    /**
     * Sets the value of the referringeBayCategoryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferringeBayCategoryID(String value) {
        this.referringeBayCategoryID = value;
    }

    /**
     * Gets the value of the referringKeywords property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferringKeywords() {
        return referringKeywords;
    }

    /**
     * Sets the value of the referringKeywords property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferringKeywords(String value) {
        this.referringKeywords = value;
    }

    /**
     * Gets the value of the promotionScheme property.
     * 
     * @return
     *     possible object is
     *     {@link PromotionSchemeCodeType }
     *     
     */
    public PromotionSchemeCodeType getPromotionScheme() {
        return promotionScheme;
    }

    /**
     * Sets the value of the promotionScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionSchemeCodeType }
     *     
     */
    public void setPromotionScheme(PromotionSchemeCodeType value) {
        this.promotionScheme = value;
    }

    /**
     * Gets the value of the promotionMethod property.
     * 
     * @return
     *     possible object is
     *     {@link PromotionMethodCodeType }
     *     
     */
    public PromotionMethodCodeType getPromotionMethod() {
        return promotionMethod;
    }

    /**
     * Sets the value of the promotionMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionMethodCodeType }
     *     
     */
    public void setPromotionMethod(PromotionMethodCodeType value) {
        this.promotionMethod = value;
    }

}
