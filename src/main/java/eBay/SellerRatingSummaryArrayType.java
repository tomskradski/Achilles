
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Type defining the <b>SellerRatingSummaryArray</b> container that is returned 
 * 				in the <b>GetFeedback</b> response. The <b>SellerRatingSummaryArray</b> 
 * 				container consists of an array of <b>AverageRatingSummary</b> containers, 
 * 				which provide details on Detailed Seller Ratings (DSRs), including the type of rating 
 * 				(Communication, Item As Described, Shipping and Handling Charges, or Shipping Time), the 
 * 				seller's average rating for that DSR type, the total number of DSR ratings, and the 
 * 				period in which those ratings were received (the last year or the last 30 days).
 * 			
 * 
 * <p>Java class for SellerRatingSummaryArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SellerRatingSummaryArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AverageRatingSummary" type="{urn:ebay:apis:eBLBaseComponents}AverageRatingSummaryType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SellerRatingSummaryArrayType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "averageRatingSummary"
})
public class SellerRatingSummaryArrayType {

    @XmlElement(name = "AverageRatingSummary", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<AverageRatingSummaryType> averageRatingSummary;

    /**
     * Gets the value of the averageRatingSummary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the averageRatingSummary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAverageRatingSummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AverageRatingSummaryType }
     * 
     * 
     */
    public List<AverageRatingSummaryType> getAverageRatingSummary() {
        if (averageRatingSummary == null) {
            averageRatingSummary = new ArrayList<AverageRatingSummaryType>();
        }
        return this.averageRatingSummary;
    }

}
