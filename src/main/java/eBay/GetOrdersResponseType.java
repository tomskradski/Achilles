
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Returns the set of orders that match the order IDs or filter criteria specified.
 * 			
 * 
 * <p>Java class for GetOrdersResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetOrdersResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="PaginationResult" type="{urn:ebay:apis:eBLBaseComponents}PaginationResultType" minOccurs="0"/>
 *         &lt;element name="HasMoreOrders" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OrderArray" type="{urn:ebay:apis:eBLBaseComponents}OrderArrayType" minOccurs="0"/>
 *         &lt;element name="OrdersPerPage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PageNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ReturnedOrderCountActual" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetOrdersResponseType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "paginationResult",
    "hasMoreOrders",
    "orderArray",
    "ordersPerPage",
    "pageNumber",
    "returnedOrderCountActual"
})
public class GetOrdersResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "PaginationResult", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected PaginationResultType paginationResult;
    @XmlElement(name = "HasMoreOrders", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean hasMoreOrders;
    @XmlElement(name = "OrderArray", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected OrderArrayType orderArray;
    @XmlElement(name = "OrdersPerPage", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer ordersPerPage;
    @XmlElement(name = "PageNumber", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer pageNumber;
    @XmlElement(name = "ReturnedOrderCountActual", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer returnedOrderCountActual;

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

    /**
     * Gets the value of the hasMoreOrders property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasMoreOrders() {
        return hasMoreOrders;
    }

    /**
     * Sets the value of the hasMoreOrders property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasMoreOrders(Boolean value) {
        this.hasMoreOrders = value;
    }

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

    /**
     * Gets the value of the ordersPerPage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrdersPerPage() {
        return ordersPerPage;
    }

    /**
     * Sets the value of the ordersPerPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrdersPerPage(Integer value) {
        this.ordersPerPage = value;
    }

    /**
     * Gets the value of the pageNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * Sets the value of the pageNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageNumber(Integer value) {
        this.pageNumber = value;
    }

    /**
     * Gets the value of the returnedOrderCountActual property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReturnedOrderCountActual() {
        return returnedOrderCountActual;
    }

    /**
     * Sets the value of the returnedOrderCountActual property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReturnedOrderCountActual(Integer value) {
        this.returnedOrderCountActual = value;
    }

}
