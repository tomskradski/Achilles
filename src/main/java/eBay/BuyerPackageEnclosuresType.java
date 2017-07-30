
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Type defining the <b>BuyerPackageEnclosures</b> container, which is returned in <b>GetOrders</b> (and other order management calls) if the 'Pay Upon Invoice' option is being offered to the buyer, and the seller is including payment instructions in the shipping package(s). A <b>BuyerPackageEnclosure</b> container will be returned for each shipping package containing payment instructions. The 'Pay Upon Invoice' option is only available on the German site.
 * 			
 * 
 * <p>Java class for BuyerPackageEnclosuresType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BuyerPackageEnclosuresType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BuyerPackageEnclosure" type="{urn:ebay:apis:eBLBaseComponents}BuyerPackageEnclosureType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuyerPackageEnclosuresType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "buyerPackageEnclosure"
})
public class BuyerPackageEnclosuresType {

    @XmlElement(name = "BuyerPackageEnclosure", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<BuyerPackageEnclosureType> buyerPackageEnclosure;

    /**
     * Gets the value of the buyerPackageEnclosure property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the buyerPackageEnclosure property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBuyerPackageEnclosure().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BuyerPackageEnclosureType }
     * 
     * 
     */
    public List<BuyerPackageEnclosureType> getBuyerPackageEnclosure() {
        if (buyerPackageEnclosure == null) {
            buyerPackageEnclosure = new ArrayList<BuyerPackageEnclosureType>();
        }
        return this.buyerPackageEnclosure;
    }

}
