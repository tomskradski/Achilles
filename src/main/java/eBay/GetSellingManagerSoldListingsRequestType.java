
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 			  Returns a Selling Manager user's sold listings.
 * 				<br><br>
 * 				This call is subject to change without notice; the deprecation process is
 * 				inapplicable to this call.
 * 			
 * 
 * <p>Java class for GetSellingManagerSoldListingsRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSellingManagerSoldListingsRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="Search" type="{urn:ebay:apis:eBLBaseComponents}SellingManagerSearchType" minOccurs="0"/>
 *         &lt;element name="StoreCategoryID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Filter" type="{urn:ebay:apis:eBLBaseComponents}SellingManagerSoldListingsPropertyTypeCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Archived" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Sort" type="{urn:ebay:apis:eBLBaseComponents}SellingManagerSoldListingsSortTypeCodeType" minOccurs="0"/>
 *         &lt;element name="SortOrder" type="{urn:ebay:apis:eBLBaseComponents}SortOrderCodeType" minOccurs="0"/>
 *         &lt;element name="Pagination" type="{urn:ebay:apis:eBLBaseComponents}PaginationType" minOccurs="0"/>
 *         &lt;element name="SaleDateRange" type="{urn:ebay:apis:eBLBaseComponents}TimeRangeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSellingManagerSoldListingsRequestType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "search",
    "storeCategoryID",
    "filter",
    "archived",
    "sort",
    "sortOrder",
    "pagination",
    "saleDateRange"
})
public class GetSellingManagerSoldListingsRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "Search", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected SellingManagerSearchType search;
    @XmlElement(name = "StoreCategoryID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Long storeCategoryID;
    @XmlElement(name = "Filter", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected List<SellingManagerSoldListingsPropertyTypeCodeType> filter;
    @XmlElement(name = "Archived", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean archived;
    @XmlElement(name = "Sort", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected SellingManagerSoldListingsSortTypeCodeType sort;
    @XmlElement(name = "SortOrder", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected SortOrderCodeType sortOrder;
    @XmlElement(name = "Pagination", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected PaginationType pagination;
    @XmlElement(name = "SaleDateRange", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected TimeRangeType saleDateRange;

    /**
     * Gets the value of the search property.
     * 
     * @return
     *     possible object is
     *     {@link SellingManagerSearchType }
     *     
     */
    public SellingManagerSearchType getSearch() {
        return search;
    }

    /**
     * Sets the value of the search property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellingManagerSearchType }
     *     
     */
    public void setSearch(SellingManagerSearchType value) {
        this.search = value;
    }

    /**
     * Gets the value of the storeCategoryID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStoreCategoryID() {
        return storeCategoryID;
    }

    /**
     * Sets the value of the storeCategoryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStoreCategoryID(Long value) {
        this.storeCategoryID = value;
    }

    /**
     * Gets the value of the filter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SellingManagerSoldListingsPropertyTypeCodeType }
     * 
     * 
     */
    public List<SellingManagerSoldListingsPropertyTypeCodeType> getFilter() {
        if (filter == null) {
            filter = new ArrayList<SellingManagerSoldListingsPropertyTypeCodeType>();
        }
        return this.filter;
    }

    /**
     * Gets the value of the archived property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isArchived() {
        return archived;
    }

    /**
     * Sets the value of the archived property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setArchived(Boolean value) {
        this.archived = value;
    }

    /**
     * Gets the value of the sort property.
     * 
     * @return
     *     possible object is
     *     {@link SellingManagerSoldListingsSortTypeCodeType }
     *     
     */
    public SellingManagerSoldListingsSortTypeCodeType getSort() {
        return sort;
    }

    /**
     * Sets the value of the sort property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellingManagerSoldListingsSortTypeCodeType }
     *     
     */
    public void setSort(SellingManagerSoldListingsSortTypeCodeType value) {
        this.sort = value;
    }

    /**
     * Gets the value of the sortOrder property.
     * 
     * @return
     *     possible object is
     *     {@link SortOrderCodeType }
     *     
     */
    public SortOrderCodeType getSortOrder() {
        return sortOrder;
    }

    /**
     * Sets the value of the sortOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortOrderCodeType }
     *     
     */
    public void setSortOrder(SortOrderCodeType value) {
        this.sortOrder = value;
    }

    /**
     * Gets the value of the pagination property.
     * 
     * @return
     *     possible object is
     *     {@link PaginationType }
     *     
     */
    public PaginationType getPagination() {
        return pagination;
    }

    /**
     * Sets the value of the pagination property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaginationType }
     *     
     */
    public void setPagination(PaginationType value) {
        this.pagination = value;
    }

    /**
     * Gets the value of the saleDateRange property.
     * 
     * @return
     *     possible object is
     *     {@link TimeRangeType }
     *     
     */
    public TimeRangeType getSaleDateRange() {
        return saleDateRange;
    }

    /**
     * Sets the value of the saleDateRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeRangeType }
     *     
     */
    public void setSaleDateRange(TimeRangeType value) {
        this.saleDateRange = value;
    }

}
