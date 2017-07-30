
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
 * <p>Java class for PromotionDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PromotionDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PromotionPrice" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="PromotionPriceType" type="{urn:ebay:apis:eBLBaseComponents}PromotionItemPriceTypeCodeType" minOccurs="0"/>
 *         &lt;element name="BidCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ConvertedPromotionPrice" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromotionDetailsType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "promotionPrice",
    "promotionPriceType",
    "bidCount",
    "convertedPromotionPrice"
})
public class PromotionDetailsType {

    @XmlElement(name = "PromotionPrice", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType promotionPrice;
    @XmlElement(name = "PromotionPriceType", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected PromotionItemPriceTypeCodeType promotionPriceType;
    @XmlElement(name = "BidCount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer bidCount;
    @XmlElement(name = "ConvertedPromotionPrice", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType convertedPromotionPrice;

    /**
     * Gets the value of the promotionPrice property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPromotionPrice() {
        return promotionPrice;
    }

    /**
     * Sets the value of the promotionPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPromotionPrice(AmountType value) {
        this.promotionPrice = value;
    }

    /**
     * Gets the value of the promotionPriceType property.
     * 
     * @return
     *     possible object is
     *     {@link PromotionItemPriceTypeCodeType }
     *     
     */
    public PromotionItemPriceTypeCodeType getPromotionPriceType() {
        return promotionPriceType;
    }

    /**
     * Sets the value of the promotionPriceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionItemPriceTypeCodeType }
     *     
     */
    public void setPromotionPriceType(PromotionItemPriceTypeCodeType value) {
        this.promotionPriceType = value;
    }

    /**
     * Gets the value of the bidCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBidCount() {
        return bidCount;
    }

    /**
     * Sets the value of the bidCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBidCount(Integer value) {
        this.bidCount = value;
    }

    /**
     * Gets the value of the convertedPromotionPrice property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getConvertedPromotionPrice() {
        return convertedPromotionPrice;
    }

    /**
     * Sets the value of the convertedPromotionPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setConvertedPromotionPrice(AmountType value) {
        this.convertedPromotionPrice = value;
    }

}
