
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This type is used by the <b>AverageRatingSummary</b> container that is returned in the <b>GetFeedback</b> call to display the seller's rating information across the four different Detail Seller Rating areas. The Detail Seller Rating subject areas include Item as Described, Communication, Shipping Time, and Shipping and Handling charges.
 * 			
 * 
 * <p>Java class for AverageRatingSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AverageRatingSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FeedbackSummaryPeriod" type="{urn:ebay:apis:eBLBaseComponents}FeedbackSummaryPeriodCodeType" minOccurs="0"/>
 *         &lt;element name="AverageRatingDetails" type="{urn:ebay:apis:eBLBaseComponents}AverageRatingDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AverageRatingSummaryType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "feedbackSummaryPeriod",
    "averageRatingDetails"
})
public class AverageRatingSummaryType {

    @XmlElement(name = "FeedbackSummaryPeriod", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected FeedbackSummaryPeriodCodeType feedbackSummaryPeriod;
    @XmlElement(name = "AverageRatingDetails", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<AverageRatingDetailsType> averageRatingDetails;

    /**
     * Gets the value of the feedbackSummaryPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link FeedbackSummaryPeriodCodeType }
     *     
     */
    public FeedbackSummaryPeriodCodeType getFeedbackSummaryPeriod() {
        return feedbackSummaryPeriod;
    }

    /**
     * Sets the value of the feedbackSummaryPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeedbackSummaryPeriodCodeType }
     *     
     */
    public void setFeedbackSummaryPeriod(FeedbackSummaryPeriodCodeType value) {
        this.feedbackSummaryPeriod = value;
    }

    /**
     * Gets the value of the averageRatingDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the averageRatingDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAverageRatingDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AverageRatingDetailsType }
     * 
     * 
     */
    public List<AverageRatingDetailsType> getAverageRatingDetails() {
        if (averageRatingDetails == null) {
            averageRatingDetails = new ArrayList<AverageRatingDetailsType>();
        }
        return this.averageRatingDetails;
    }

}
