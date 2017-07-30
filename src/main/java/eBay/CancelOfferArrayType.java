
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
 * <p>Java class for CancelOfferArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CancelOfferArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CancelOffer" type="{urn:ebay:apis:eBLBaseComponents}CancelOfferType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelOfferArrayType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "cancelOffer"
})
public class CancelOfferArrayType {

    @XmlElement(name = "CancelOffer", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<CancelOfferType> cancelOffer;

    /**
     * Gets the value of the cancelOffer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cancelOffer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCancelOffer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CancelOfferType }
     * 
     * 
     */
    public List<CancelOfferType> getCancelOffer() {
        if (cancelOffer == null) {
            cancelOffer = new ArrayList<CancelOfferType>();
        }
        return this.cancelOffer;
    }

}
