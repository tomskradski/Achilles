
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Container for a set of feedback statistics. Contains zero one or
 * 				multiple FeedbackPeriod objects. Output only, for the summary
 * 				feedback data returned by GetFeedback.
 * 			
 * 
 * <p>Java class for FeedbackPeriodArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeedbackPeriodArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FeedbackPeriod" type="{urn:ebay:apis:eBLBaseComponents}FeedbackPeriodType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeedbackPeriodArrayType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "feedbackPeriod"
})
public class FeedbackPeriodArrayType {

    @XmlElement(name = "FeedbackPeriod", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<FeedbackPeriodType> feedbackPeriod;

    /**
     * Gets the value of the feedbackPeriod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feedbackPeriod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeedbackPeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeedbackPeriodType }
     * 
     * 
     */
    public List<FeedbackPeriodType> getFeedbackPeriod() {
        if (feedbackPeriod == null) {
            feedbackPeriod = new ArrayList<FeedbackPeriodType>();
        }
        return this.feedbackPeriod;
    }

}
