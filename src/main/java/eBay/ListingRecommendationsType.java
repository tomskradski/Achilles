
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Type defining the <b>ListingRecommendations</b> container that is
 * 				conditionally returned in all Add/Revise/Relist/Verify API calls. A
 * 				<b>ListingRecommendations</b> container consists of one or
 * 				more <b>Recommendation</b> containers, and each
 * 				<b>Recommendation</b> container provides a message to the seller on how a
 * 				listing can be improved or brought up to standard in regards to top-rated seller/listing requirements, mandated or recommended Item Specifics, picture quality requirements, pricing and/or listing format recommendations, recommended keywords and/or Item Specifics in a Title, and/or a recommendation to use Fast 'N Free shipping.
 * 				<br><br>
 * 				The <b>ListingRecommendations</b> container is only returned if the
 * 				<b>IncludeRecommendations</b> flag is included and set to 'true' in the
 * 				API call request.
 * 			
 * 
 * <p>Java class for ListingRecommendationsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListingRecommendationsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Recommendation" type="{urn:ebay:apis:eBLBaseComponents}ListingRecommendationType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListingRecommendationsType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "recommendation"
})
public class ListingRecommendationsType {

    @XmlElement(name = "Recommendation", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<ListingRecommendationType> recommendation;

    /**
     * Gets the value of the recommendation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recommendation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecommendation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListingRecommendationType }
     * 
     * 
     */
    public List<ListingRecommendationType> getRecommendation() {
        if (recommendation == null) {
            recommendation = new ArrayList<ListingRecommendationType>();
        }
        return this.recommendation;
    }

}
