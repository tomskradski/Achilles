
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Type used by the <b>DisputeArray</b> container that is returned in the response of the <b>GetUserDisputes</b>. The <b>DisputeArray</b> container holds an array of one or more disputes that match the filter criteria in the call request.
 * 				<br/><br/>
 * 				<span class="tablenote"><strong>Note:</strong>
 * 					These are not eBay Money Back Guarantee cases.
 * 				</span>
 * 			
 * 
 * <p>Java class for DisputeArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DisputeArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Dispute" type="{urn:ebay:apis:eBLBaseComponents}DisputeType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisputeArrayType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "dispute"
})
public class DisputeArrayType {

    @XmlElement(name = "Dispute", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<DisputeType> dispute;

    /**
     * Gets the value of the dispute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dispute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDispute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DisputeType }
     * 
     * 
     */
    public List<DisputeType> getDispute() {
        if (dispute == null) {
            dispute = new ArrayList<DisputeType>();
        }
        return this.dispute;
    }

}
