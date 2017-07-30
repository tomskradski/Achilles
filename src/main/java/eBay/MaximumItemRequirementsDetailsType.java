
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A means of limiting unpaying or low feedback bidders.
 * 
 * <p>Java class for MaximumItemRequirementsDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaximumItemRequirementsDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MaximumItemCount" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MinimumFeedbackScore" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaximumItemRequirementsDetailsType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "maximumItemCount",
    "minimumFeedbackScore"
})
public class MaximumItemRequirementsDetailsType {

    @XmlElement(name = "MaximumItemCount", namespace = "urn:ebay:apis:eBLBaseComponents", type = Integer.class)
    protected List<Integer> maximumItemCount;
    @XmlElement(name = "MinimumFeedbackScore", namespace = "urn:ebay:apis:eBLBaseComponents", type = Integer.class)
    protected List<Integer> minimumFeedbackScore;

    /**
     * Gets the value of the maximumItemCount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the maximumItemCount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaximumItemCount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getMaximumItemCount() {
        if (maximumItemCount == null) {
            maximumItemCount = new ArrayList<Integer>();
        }
        return this.maximumItemCount;
    }

    /**
     * Gets the value of the minimumFeedbackScore property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the minimumFeedbackScore property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMinimumFeedbackScore().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getMinimumFeedbackScore() {
        if (minimumFeedbackScore == null) {
            minimumFeedbackScore = new ArrayList<Integer>();
        }
        return this.minimumFeedbackScore;
    }

}
