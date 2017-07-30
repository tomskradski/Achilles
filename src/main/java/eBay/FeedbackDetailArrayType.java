
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This type is used by the <b>FeedbackDetailArray</b> container that is returned in the <b>GetFeedback</b> call. The <b>FeedbackDetailArray</b> container consists of an array of one or more Feedback entries. The Feedback entries that are returned will depend on the fields/values included in the call request.
 * 			
 * 
 * <p>Java class for FeedbackDetailArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeedbackDetailArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FeedbackDetail" type="{urn:ebay:apis:eBLBaseComponents}FeedbackDetailType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeedbackDetailArrayType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "feedbackDetail"
})
public class FeedbackDetailArrayType {

    @XmlElement(name = "FeedbackDetail", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<FeedbackDetailType> feedbackDetail;

    /**
     * Gets the value of the feedbackDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feedbackDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeedbackDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeedbackDetailType }
     * 
     * 
     */
    public List<FeedbackDetailType> getFeedbackDetail() {
        if (feedbackDetail == null) {
            feedbackDetail = new ArrayList<FeedbackDetailType>();
        }
        return this.feedbackDetail;
    }

}
