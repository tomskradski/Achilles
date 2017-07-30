
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 			 Type defining the <b>BuyerRequirementDetails.VerifiedUserRequirements</b> 
 * 			 container that is returned in <b>GeteBayDetails</b>. The
 * 			 <b>VerifiedUserRequirements</b> container provides the <b>VerifiedUser</b> 
 * 			 and <b>FeedbackScore</b> values that may be used in listing calls to restrict
 * 			 unverified users who have Feedback scores below the minimum threshold.
 * 			
 * 
 * <p>Java class for VerifiedUserRequirementsDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VerifiedUserRequirementsDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VerifiedUser" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "VerifiedUserRequirementsDetailsType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "verifiedUser",
    "feedbackScore"
})
public class VerifiedUserRequirementsDetailsType {

    @XmlElement(name = "VerifiedUser", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean verifiedUser;
    @XmlElement(name = "FeedbackScore", namespace = "urn:ebay:apis:eBLBaseComponents", type = Integer.class)
    protected List<Integer> feedbackScore;

    /**
     * Gets the value of the verifiedUser property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVerifiedUser() {
        return verifiedUser;
    }

    /**
     * Sets the value of the verifiedUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVerifiedUser(Boolean value) {
        this.verifiedUser = value;
    }

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
