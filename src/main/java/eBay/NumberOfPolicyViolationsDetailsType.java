
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Type defining the <b>NumberOfPolicyViolations</b> container that is returned 
 * 				in the <b>GeteBayDetails</b> response. The <b>NumberOfPolicyViolations</b> 
 * 				container consists of multiple <b>Count</b> fields with values that can be 
 * 				used in the <b>BuyerRequirementDetails.MaximumBuyerPolicyViolations.Count</b> 
 * 				field when using the Trading API to add, revise, or relist an item.
 * 				<br><br>
 * 				The <b>Item.MaximumBuyerPolicyViolations</b> container in Add/Revise/Relist 
 * 				API calls is used to block buyers with buyer policy violations equal to or exceeding
 * 				the specified <b>Count</b> value during the specified <b>Period</b> 
 * 				value from buying/bidding on the item.
 * 			
 * 
 * <p>Java class for NumberOfPolicyViolationsDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NumberOfPolicyViolationsDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumberOfPolicyViolationsDetailsType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "count"
})
public class NumberOfPolicyViolationsDetailsType {

    @XmlElement(name = "Count", namespace = "urn:ebay:apis:eBLBaseComponents", type = Integer.class)
    protected List<Integer> count;

    /**
     * Gets the value of the count property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the count property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getCount() {
        if (count == null) {
            count = new ArrayList<Integer>();
        }
        return this.count;
    }

}
