
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Applicable to sites that support the Detailed Seller Rating (DSR) feature.
 * 				The <b>AverageRatingDetails</b> container consists of the average detailed seller ratings in an area. When buyers leave an overall Feedback rating (positive, neutral, or negative) for a seller, they also can leave ratings in four areas: item as described, communication, shipping time, and charges for shipping and handling. Users retrieve detailed ratings as averages of the ratings left by buyers.
 * 			
 * 
 * <p>Java class for AverageRatingDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AverageRatingDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RatingDetail" type="{urn:ebay:apis:eBLBaseComponents}FeedbackRatingDetailCodeType" minOccurs="0"/>
 *         &lt;element name="Rating" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="RatingCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AverageRatingDetailsType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "ratingDetail",
    "rating",
    "ratingCount"
})
public class AverageRatingDetailsType {

    @XmlElement(name = "RatingDetail", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected FeedbackRatingDetailCodeType ratingDetail;
    @XmlElement(name = "Rating", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Double rating;
    @XmlElement(name = "RatingCount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer ratingCount;

    /**
     * Gets the value of the ratingDetail property.
     * 
     * @return
     *     possible object is
     *     {@link FeedbackRatingDetailCodeType }
     *     
     */
    public FeedbackRatingDetailCodeType getRatingDetail() {
        return ratingDetail;
    }

    /**
     * Sets the value of the ratingDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeedbackRatingDetailCodeType }
     *     
     */
    public void setRatingDetail(FeedbackRatingDetailCodeType value) {
        this.ratingDetail = value;
    }

    /**
     * Gets the value of the rating property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRating() {
        return rating;
    }

    /**
     * Sets the value of the rating property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRating(Double value) {
        this.rating = value;
    }

    /**
     * Gets the value of the ratingCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRatingCount() {
        return ratingCount;
    }

    /**
     * Sets the value of the ratingCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRatingCount(Integer value) {
        this.ratingCount = value;
    }

}
