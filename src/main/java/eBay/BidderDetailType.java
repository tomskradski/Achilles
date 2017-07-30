
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         This type is deprecated.
 * 			
 * 
 * <p>Java class for BidderDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BidderDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UserID" type="{urn:ebay:apis:eBLBaseComponents}UserIDType" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FeedbackScore" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UniqueNegativeFeedbackCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UniquePositiveFeedbackCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UniqueNeutralFeedbackCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BidderDetailType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "userID",
    "email",
    "feedbackScore",
    "uniqueNegativeFeedbackCount",
    "uniquePositiveFeedbackCount",
    "uniqueNeutralFeedbackCount"
})
public class BidderDetailType {

    @XmlElement(name = "UserID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String userID;
    @XmlElement(name = "Email", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String email;
    @XmlElement(name = "FeedbackScore", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer feedbackScore;
    @XmlElement(name = "UniqueNegativeFeedbackCount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer uniqueNegativeFeedbackCount;
    @XmlElement(name = "UniquePositiveFeedbackCount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer uniquePositiveFeedbackCount;
    @XmlElement(name = "UniqueNeutralFeedbackCount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer uniqueNeutralFeedbackCount;

    /**
     * Gets the value of the userID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserID(String value) {
        this.userID = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the feedbackScore property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFeedbackScore() {
        return feedbackScore;
    }

    /**
     * Sets the value of the feedbackScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFeedbackScore(Integer value) {
        this.feedbackScore = value;
    }

    /**
     * Gets the value of the uniqueNegativeFeedbackCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUniqueNegativeFeedbackCount() {
        return uniqueNegativeFeedbackCount;
    }

    /**
     * Sets the value of the uniqueNegativeFeedbackCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUniqueNegativeFeedbackCount(Integer value) {
        this.uniqueNegativeFeedbackCount = value;
    }

    /**
     * Gets the value of the uniquePositiveFeedbackCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUniquePositiveFeedbackCount() {
        return uniquePositiveFeedbackCount;
    }

    /**
     * Sets the value of the uniquePositiveFeedbackCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUniquePositiveFeedbackCount(Integer value) {
        this.uniquePositiveFeedbackCount = value;
    }

    /**
     * Gets the value of the uniqueNeutralFeedbackCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUniqueNeutralFeedbackCount() {
        return uniqueNeutralFeedbackCount;
    }

    /**
     * Sets the value of the uniqueNeutralFeedbackCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUniqueNeutralFeedbackCount(Integer value) {
        this.uniqueNeutralFeedbackCount = value;
    }

}
