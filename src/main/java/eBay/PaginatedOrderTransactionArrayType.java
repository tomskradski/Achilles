
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 			Contains a paginated list of orders.
 * 			
 * 
 * <p>Java class for PaginatedOrderTransactionArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaginatedOrderTransactionArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrderTransactionArray" type="{urn:ebay:apis:eBLBaseComponents}OrderTransactionArrayType" minOccurs="0"/>
 *         &lt;element name="PaginationResult" type="{urn:ebay:apis:eBLBaseComponents}PaginationResultType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaginatedOrderTransactionArrayType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "orderTransactionArray",
    "paginationResult"
})
public class PaginatedOrderTransactionArrayType {

    @XmlElement(name = "OrderTransactionArray", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected OrderTransactionArrayType orderTransactionArray;
    @XmlElement(name = "PaginationResult", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected PaginationResultType paginationResult;

    /**
     * Gets the value of the orderTransactionArray property.
     * 
     * @return
     *     possible object is
     *     {@link OrderTransactionArrayType }
     *     
     */
    public OrderTransactionArrayType getOrderTransactionArray() {
        return orderTransactionArray;
    }

    /**
     * Sets the value of the orderTransactionArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderTransactionArrayType }
     *     
     */
    public void setOrderTransactionArray(OrderTransactionArrayType value) {
        this.orderTransactionArray = value;
    }

    /**
     * Gets the value of the paginationResult property.
     * 
     * @return
     *     possible object is
     *     {@link PaginationResultType }
     *     
     */
    public PaginationResultType getPaginationResult() {
        return paginationResult;
    }

    /**
     * Sets the value of the paginationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaginationResultType }
     *     
     */
    public void setPaginationResult(PaginationResultType value) {
        this.paginationResult = value;
    }

}
