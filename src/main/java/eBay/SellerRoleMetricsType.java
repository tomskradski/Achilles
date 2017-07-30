
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Specifies 1 year feedback metrics for a seller.
 * 			
 * 
 * <p>Java class for SellerRoleMetricsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SellerRoleMetricsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PositiveFeedbackLeftCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NegativeFeedbackLeftCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NeutralFeedbackLeftCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FeedbackLeftPercent" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="RepeatBuyerCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RepeatBuyerPercent" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="UniqueBuyerCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TransactionPercent" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="CrossBorderTransactionCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CrossBorderTransactionPercent" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SellerRoleMetricsType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "positiveFeedbackLeftCount",
    "negativeFeedbackLeftCount",
    "neutralFeedbackLeftCount",
    "feedbackLeftPercent",
    "repeatBuyerCount",
    "repeatBuyerPercent",
    "uniqueBuyerCount",
    "transactionPercent",
    "crossBorderTransactionCount",
    "crossBorderTransactionPercent"
})
public class SellerRoleMetricsType {

    @XmlElement(name = "PositiveFeedbackLeftCount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer positiveFeedbackLeftCount;
    @XmlElement(name = "NegativeFeedbackLeftCount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer negativeFeedbackLeftCount;
    @XmlElement(name = "NeutralFeedbackLeftCount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer neutralFeedbackLeftCount;
    @XmlElement(name = "FeedbackLeftPercent", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Float feedbackLeftPercent;
    @XmlElement(name = "RepeatBuyerCount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer repeatBuyerCount;
    @XmlElement(name = "RepeatBuyerPercent", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Float repeatBuyerPercent;
    @XmlElement(name = "UniqueBuyerCount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer uniqueBuyerCount;
    @XmlElement(name = "TransactionPercent", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Float transactionPercent;
    @XmlElement(name = "CrossBorderTransactionCount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer crossBorderTransactionCount;
    @XmlElement(name = "CrossBorderTransactionPercent", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Float crossBorderTransactionPercent;

    /**
     * Gets the value of the positiveFeedbackLeftCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPositiveFeedbackLeftCount() {
        return positiveFeedbackLeftCount;
    }

    /**
     * Sets the value of the positiveFeedbackLeftCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPositiveFeedbackLeftCount(Integer value) {
        this.positiveFeedbackLeftCount = value;
    }

    /**
     * Gets the value of the negativeFeedbackLeftCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNegativeFeedbackLeftCount() {
        return negativeFeedbackLeftCount;
    }

    /**
     * Sets the value of the negativeFeedbackLeftCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNegativeFeedbackLeftCount(Integer value) {
        this.negativeFeedbackLeftCount = value;
    }

    /**
     * Gets the value of the neutralFeedbackLeftCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNeutralFeedbackLeftCount() {
        return neutralFeedbackLeftCount;
    }

    /**
     * Sets the value of the neutralFeedbackLeftCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNeutralFeedbackLeftCount(Integer value) {
        this.neutralFeedbackLeftCount = value;
    }

    /**
     * Gets the value of the feedbackLeftPercent property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getFeedbackLeftPercent() {
        return feedbackLeftPercent;
    }

    /**
     * Sets the value of the feedbackLeftPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setFeedbackLeftPercent(Float value) {
        this.feedbackLeftPercent = value;
    }

    /**
     * Gets the value of the repeatBuyerCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRepeatBuyerCount() {
        return repeatBuyerCount;
    }

    /**
     * Sets the value of the repeatBuyerCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRepeatBuyerCount(Integer value) {
        this.repeatBuyerCount = value;
    }

    /**
     * Gets the value of the repeatBuyerPercent property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRepeatBuyerPercent() {
        return repeatBuyerPercent;
    }

    /**
     * Sets the value of the repeatBuyerPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRepeatBuyerPercent(Float value) {
        this.repeatBuyerPercent = value;
    }

    /**
     * Gets the value of the uniqueBuyerCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUniqueBuyerCount() {
        return uniqueBuyerCount;
    }

    /**
     * Sets the value of the uniqueBuyerCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUniqueBuyerCount(Integer value) {
        this.uniqueBuyerCount = value;
    }

    /**
     * Gets the value of the transactionPercent property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTransactionPercent() {
        return transactionPercent;
    }

    /**
     * Sets the value of the transactionPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTransactionPercent(Float value) {
        this.transactionPercent = value;
    }

    /**
     * Gets the value of the crossBorderTransactionCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCrossBorderTransactionCount() {
        return crossBorderTransactionCount;
    }

    /**
     * Sets the value of the crossBorderTransactionCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCrossBorderTransactionCount(Integer value) {
        this.crossBorderTransactionCount = value;
    }

    /**
     * Gets the value of the crossBorderTransactionPercent property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCrossBorderTransactionPercent() {
        return crossBorderTransactionPercent;
    }

    /**
     * Sets the value of the crossBorderTransactionPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCrossBorderTransactionPercent(Float value) {
        this.crossBorderTransactionPercent = value;
    }

}
