
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This type is deprecated.
 * 			
 * 
 * <p>Java class for BidderDetailArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BidderDetailArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BidderDetail" type="{urn:ebay:apis:eBLBaseComponents}BidderDetailType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BidderDetailArrayType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "bidderDetail"
})
public class BidderDetailArrayType {

    @XmlElement(name = "BidderDetail", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<BidderDetailType> bidderDetail;

    /**
     * Gets the value of the bidderDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bidderDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBidderDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BidderDetailType }
     * 
     * 
     */
    public List<BidderDetailType> getBidderDetail() {
        if (bidderDetail == null) {
            bidderDetail = new ArrayList<BidderDetailType>();
        }
        return this.bidderDetail;
    }

}
