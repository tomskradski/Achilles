
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Contains a list of orders, transactions, or both, each of OrderTransactionType.
 * 			
 * 
 * <p>Java class for OrderTransactionArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderTransactionArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrderTransaction" type="{urn:ebay:apis:eBLBaseComponents}OrderTransactionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderTransactionArrayType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "orderTransaction"
})
public class OrderTransactionArrayType {

    @XmlElement(name = "OrderTransaction", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<OrderTransactionType> orderTransaction;

    /**
     * Gets the value of the orderTransaction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderTransaction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderTransaction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderTransactionType }
     * 
     * 
     */
    public List<OrderTransactionType> getOrderTransaction() {
        if (orderTransaction == null) {
            orderTransaction = new ArrayList<OrderTransactionType>();
        }
        return this.orderTransaction;
    }

}
