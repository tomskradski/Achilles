
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
 * <p>Java class for RefundTransactionArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RefundTransactionArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RefundTransaction" type="{urn:ebay:apis:eBLBaseComponents}RefundTransactionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RefundTransactionArrayType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "refundTransaction"
})
public class RefundTransactionArrayType {

    @XmlElement(name = "RefundTransaction", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<RefundTransactionType> refundTransaction;

    /**
     * Gets the value of the refundTransaction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refundTransaction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefundTransaction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RefundTransactionType }
     * 
     * 
     */
    public List<RefundTransactionType> getRefundTransaction() {
        if (refundTransaction == null) {
            refundTransaction = new ArrayList<RefundTransactionType>();
        }
        return this.refundTransaction;
    }

}
