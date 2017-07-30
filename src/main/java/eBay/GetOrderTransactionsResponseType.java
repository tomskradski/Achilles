
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				The base response type for the <b>GetOrderTransactions</b> call. This call retrieves detailed information about one or more eBay.com and/or Half.com orders. An <b>OrderArray.Order</b> container is returned for each order that matches the input criteria in the call request.
 * 			
 * 
 * <p>Java class for GetOrderTransactionsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetOrderTransactionsResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="OrderArray" type="{urn:ebay:apis:eBLBaseComponents}OrderArrayType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetOrderTransactionsResponseType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "orderArray"
})
public class GetOrderTransactionsResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "OrderArray", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected OrderArrayType orderArray;

    /**
     * Gets the value of the orderArray property.
     * 
     * @return
     *     possible object is
     *     {@link OrderArrayType }
     *     
     */
    public OrderArrayType getOrderArray() {
        return orderArray;
    }

    /**
     * Sets the value of the orderArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderArrayType }
     *     
     */
    public void setOrderArray(OrderArrayType value) {
        this.orderArray = value;
    }

}
