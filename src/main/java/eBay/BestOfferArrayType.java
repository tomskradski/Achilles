
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *  
 * 				An array of one or more Best Offers. This type is used in the responses of the  <b>GetBestOffers</b> and <b>RespondToBestOffer</b> calls. 
 * 			
 * 
 * <p>Java class for BestOfferArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BestOfferArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BestOffer" type="{urn:ebay:apis:eBLBaseComponents}BestOfferType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BestOfferArrayType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "bestOffer"
})
public class BestOfferArrayType {

    @XmlElement(name = "BestOffer", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<BestOfferType> bestOffer;

    /**
     * Gets the value of the bestOffer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bestOffer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBestOffer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BestOfferType }
     * 
     * 
     */
    public List<BestOfferType> getBestOffer() {
        if (bestOffer == null) {
            bestOffer = new ArrayList<BestOfferType>();
        }
        return this.bestOffer;
    }

}
