
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Type defining the <b>OrderIDArray</b> container, which consists of an array of order IDs. These order IDs specify the single and multiple line item orders to retrieve.
 * 			
 * 
 * <p>Java class for OrderIDArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderIDArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrderID" type="{urn:ebay:apis:eBLBaseComponents}OrderIDType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderIDArrayType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "orderID"
})
public class OrderIDArrayType {

    @XmlElement(name = "OrderID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<String> orderID;

    /**
     * Gets the value of the orderID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOrderID() {
        if (orderID == null) {
            orderID = new ArrayList<String>();
        }
        return this.orderID;
    }

}
