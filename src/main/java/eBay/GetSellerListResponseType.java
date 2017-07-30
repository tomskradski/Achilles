
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Contains a list of the items listed by the seller specified as input. The list of
 * 				items is returned in an ItemArrayType object, in which are returned zero, one, or
 * 				multiple ItemType objects. Each ItemType object contains the detail data for one
 * 				item listing.
 * 			
 * 
 * <p>Java class for GetSellerListResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSellerListResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="PaginationResult" type="{urn:ebay:apis:eBLBaseComponents}PaginationResultType" minOccurs="0"/>
 *         &lt;element name="HasMoreItems" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ItemArray" type="{urn:ebay:apis:eBLBaseComponents}ItemArrayType" minOccurs="0"/>
 *         &lt;element name="ItemsPerPage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PageNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ReturnedItemCountActual" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Seller" type="{urn:ebay:apis:eBLBaseComponents}UserType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSellerListResponseType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "paginationResult",
    "hasMoreItems",
    "itemArray",
    "itemsPerPage",
    "pageNumber",
    "returnedItemCountActual",
    "seller"
})
public class GetSellerListResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "PaginationResult", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected PaginationResultType paginationResult;
    @XmlElement(name = "HasMoreItems", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean hasMoreItems;
    @XmlElement(name = "ItemArray", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected ItemArrayType itemArray;
    @XmlElement(name = "ItemsPerPage", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer itemsPerPage;
    @XmlElement(name = "PageNumber", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer pageNumber;
    @XmlElement(name = "ReturnedItemCountActual", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer returnedItemCountActual;
    @XmlElement(name = "Seller", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected UserType seller;

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
     * Gets the value of the hasMoreItems property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasMoreItems() {
        return hasMoreItems;
    }

    /**
     * Sets the value of the hasMoreItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasMoreItems(Boolean value) {
        this.hasMoreItems = value;
    }

    /**
     * Gets the value of the itemArray property.
     * 
     * @return
     *     possible object is
     *     {@link ItemArrayType }
     *     
     */
    public ItemArrayType getItemArray() {
        return itemArray;
    }

    /**
     * Sets the value of the itemArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemArrayType }
     *     
     */
    public void setItemArray(ItemArrayType value) {
        this.itemArray = value;
    }

    /**
     * Gets the value of the itemsPerPage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getItemsPerPage() {
        return itemsPerPage;
    }

    /**
     * Sets the value of the itemsPerPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setItemsPerPage(Integer value) {
        this.itemsPerPage = value;
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
     * Gets the value of the returnedItemCountActual property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReturnedItemCountActual() {
        return returnedItemCountActual;
    }

    /**
     * Sets the value of the returnedItemCountActual property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReturnedItemCountActual(Integer value) {
        this.returnedItemCountActual = value;
    }

    /**
     * Gets the value of the seller property.
     * 
     * @return
     *     possible object is
     *     {@link UserType }
     *     
     */
    public UserType getSeller() {
        return seller;
    }

    /**
     * Sets the value of the seller property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserType }
     *     
     */
    public void setSeller(UserType value) {
        this.seller = value;
    }

}
