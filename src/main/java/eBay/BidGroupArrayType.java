
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
 * <p>Java class for BidGroupArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BidGroupArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BidGroup" type="{urn:ebay:apis:eBLBaseComponents}BidGroupType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BidGroupArrayType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "bidGroup"
})
public class BidGroupArrayType {

    @XmlElement(name = "BidGroup", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<BidGroupType> bidGroup;

    /**
     * Gets the value of the bidGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bidGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBidGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BidGroupType }
     * 
     * 
     */
    public List<BidGroupType> getBidGroup() {
        if (bidGroup == null) {
            bidGroup = new ArrayList<BidGroupType>();
        }
        return this.bidGroup;
    }

}
