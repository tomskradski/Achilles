
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
 * 	      Retrieves a paginated list containing details of a user's Selling Manager inventory.
 * 				This call is subject to change without notice; the deprecation process is
 * 				inapplicable to this call.
 * 			
 * 
 * <p>Java class for GetSellingManagerInventoryRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSellingManagerInventoryRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="Sort" type="{urn:ebay:apis:eBLBaseComponents}SellingManagerProductSortCodeType" minOccurs="0"/>
 *         &lt;element name="FolderID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Pagination" type="{urn:ebay:apis:eBLBaseComponents}PaginationType" minOccurs="0"/>
 *         &lt;element name="SortOrder" type="{urn:ebay:apis:eBLBaseComponents}SortOrderCodeType" minOccurs="0"/>
 *         &lt;element name="Search" type="{urn:ebay:apis:eBLBaseComponents}SellingManagerSearchType" minOccurs="0"/>
 *         &lt;element name="StoreCategoryID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Filter" type="{urn:ebay:apis:eBLBaseComponents}SellingManagerInventoryPropertyTypeCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSellingManagerInventoryRequestType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "sort",
    "folderID",
    "pagination",
    "sortOrder",
    "search",
    "storeCategoryID",
    "filter"
})
public class GetSellingManagerInventoryRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "Sort", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected SellingManagerProductSortCodeType sort;
    @XmlElement(name = "FolderID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Long folderID;
    @XmlElement(name = "Pagination", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected PaginationType pagination;
    @XmlElement(name = "SortOrder", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected SortOrderCodeType sortOrder;
    @XmlElement(name = "Search", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected SellingManagerSearchType search;
    @XmlElement(name = "StoreCategoryID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Long storeCategoryID;
    @XmlElement(name = "Filter", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected List<SellingManagerInventoryPropertyTypeCodeType> filter;

    /**
     * Gets the value of the sort property.
     * 
     * @return
     *     possible object is
     *     {@link SellingManagerProductSortCodeType }
     *     
     */
    public SellingManagerProductSortCodeType getSort() {
        return sort;
    }

    /**
     * Sets the value of the sort property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellingManagerProductSortCodeType }
     *     
     */
    public void setSort(SellingManagerProductSortCodeType value) {
        this.sort = value;
    }

    /**
     * Gets the value of the folderID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFolderID() {
        return folderID;
    }

    /**
     * Sets the value of the folderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFolderID(Long value) {
        this.folderID = value;
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
     * {@link SellingManagerInventoryPropertyTypeCodeType }
     * 
     * 
     */
    public List<SellingManagerInventoryPropertyTypeCodeType> getFilter() {
        if (filter == null) {
            filter = new ArrayList<SellingManagerInventoryPropertyTypeCodeType>();
        }
        return this.filter;
    }

}
