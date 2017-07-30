
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This type is used by the <b>SuggestedBidValues</b> container that is returned if the buyer is attempting to bid on an auction item through the <b>PlaceOffer</b> call.
 * 			
 * 
 * <p>Java class for SuggestedBidValueType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SuggestedBidValueType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BidValue" type="{urn:ebay:apis:eBLBaseComponents}AmountType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SuggestedBidValueType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "bidValue"
})
public class SuggestedBidValueType {

    @XmlElement(name = "BidValue", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<AmountType> bidValue;

    /**
     * Gets the value of the bidValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bidValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBidValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getBidValue() {
        if (bidValue == null) {
            bidValue = new ArrayList<AmountType>();
        }
        return this.bidValue;
    }

}
