
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Type defining the <b>BuyerRoleMetrics</b> container, which consists of details relating to the eBay buyer's one-year history of leaving feedback for the seller.
 * 			
 * 
 * <p>Java class for BuyerRoleMetricsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BuyerRoleMetricsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PositiveFeedbackLeftCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NegativeFeedbackLeftCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NeutralFeedbackLeftCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FeedbackLeftPercent" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuyerRoleMetricsType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "positiveFeedbackLeftCount",
    "negativeFeedbackLeftCount",
    "neutralFeedbackLeftCount",
    "feedbackLeftPercent"
})
public class BuyerRoleMetricsType {

    @XmlElement(name = "PositiveFeedbackLeftCount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer positiveFeedbackLeftCount;
    @XmlElement(name = "NegativeFeedbackLeftCount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer negativeFeedbackLeftCount;
    @XmlElement(name = "NeutralFeedbackLeftCount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer neutralFeedbackLeftCount;
    @XmlElement(name = "FeedbackLeftPercent", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Float feedbackLeftPercent;

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

}
