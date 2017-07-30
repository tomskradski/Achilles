
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Type defining the <b>MinimumFeedbackScore</b> container that is returned in 
 * 				<b>GeteBayDetails</b>. The <b>MinimumFeedbackScore</b> container 
 * 				consists of the values that can be used in the 
 * 				<b>BuyerRequirementDetails.MinimumFeedbackScore</b> field when listing an 
 * 				item through an Add/Revise/Relist API call. The Feedback Score for a potential buyer 
 * 				must be greater than or equal to the specified value, or that buyer is blocked from 
 * 				buying the item.
 * 				<br/><br/>
 * 				For the <b>MinimumFeedbackScore</b> 
 * 				container to appear in the <b>GeteBayDetails</b> response,  
 * 				<b>BuyerRequirementDetails</b> must be one of the values passed into the 
 * 				<b>DetailName</b> field in the <b>GeteBayDetails</b> request 
 * 				(or, no  <b>DetailName</b> filters should be used).
 * 			
 * 
 * <p>Java class for MinimumFeedbackScoreDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MinimumFeedbackScoreDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FeedbackScore" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MinimumFeedbackScoreDetailsType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "feedbackScore"
})
public class MinimumFeedbackScoreDetailsType {

    @XmlElement(name = "FeedbackScore", namespace = "urn:ebay:apis:eBLBaseComponents", type = Integer.class)
    protected List<Integer> feedbackScore;

    /**
     * Gets the value of the feedbackScore property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feedbackScore property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeedbackScore().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getFeedbackScore() {
        if (feedbackScore == null) {
            feedbackScore = new ArrayList<Integer>();
        }
        return this.feedbackScore;
    }

}
