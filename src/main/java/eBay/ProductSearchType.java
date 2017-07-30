
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
 * <p>Java class for ProductSearchType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductSearchType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductSearchID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AttributeSetID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ProductFinderID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ProductID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SortAttributeID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MaxChildrenPerFamily" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SearchAttributes" type="{urn:ebay:apis:eBLBaseComponents}SearchAttributesType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Pagination" type="{urn:ebay:apis:eBLBaseComponents}PaginationType" minOccurs="0"/>
 *         &lt;element name="AvailableItemsOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="QueryKeywords" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CharacteristicSetIDs" type="{urn:ebay:apis:eBLBaseComponents}CharacteristicSetIDsType" minOccurs="0"/>
 *         &lt;element name="ProductReferenceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExternalProductID" type="{urn:ebay:apis:eBLBaseComponents}ExternalProductIDType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductSearchType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "productSearchID",
    "attributeSetID",
    "productFinderID",
    "productID",
    "sortAttributeID",
    "maxChildrenPerFamily",
    "searchAttributes",
    "pagination",
    "availableItemsOnly",
    "queryKeywords",
    "characteristicSetIDs",
    "productReferenceID",
    "externalProductID"
})
public class ProductSearchType {

    @XmlElement(name = "ProductSearchID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String productSearchID;
    @XmlElement(name = "AttributeSetID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected int attributeSetID;
    @XmlElement(name = "ProductFinderID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer productFinderID;
    @XmlElement(name = "ProductID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String productID;
    @XmlElement(name = "SortAttributeID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer sortAttributeID;
    @XmlElement(name = "MaxChildrenPerFamily", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer maxChildrenPerFamily;
    @XmlElement(name = "SearchAttributes", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<SearchAttributesType> searchAttributes;
    @XmlElement(name = "Pagination", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected PaginationType pagination;
    @XmlElement(name = "AvailableItemsOnly", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean availableItemsOnly;
    @XmlElement(name = "QueryKeywords", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String queryKeywords;
    @XmlElement(name = "CharacteristicSetIDs", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected CharacteristicSetIDsType characteristicSetIDs;
    @XmlElement(name = "ProductReferenceID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String productReferenceID;
    @XmlElement(name = "ExternalProductID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected ExternalProductIDType externalProductID;

    /**
     * Gets the value of the productSearchID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductSearchID() {
        return productSearchID;
    }

    /**
     * Sets the value of the productSearchID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductSearchID(String value) {
        this.productSearchID = value;
    }

    /**
     * Gets the value of the attributeSetID property.
     * 
     */
    public int getAttributeSetID() {
        return attributeSetID;
    }

    /**
     * Sets the value of the attributeSetID property.
     * 
     */
    public void setAttributeSetID(int value) {
        this.attributeSetID = value;
    }

    /**
     * Gets the value of the productFinderID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProductFinderID() {
        return productFinderID;
    }

    /**
     * Sets the value of the productFinderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProductFinderID(Integer value) {
        this.productFinderID = value;
    }

    /**
     * Gets the value of the productID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductID() {
        return productID;
    }

    /**
     * Sets the value of the productID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductID(String value) {
        this.productID = value;
    }

    /**
     * Gets the value of the sortAttributeID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSortAttributeID() {
        return sortAttributeID;
    }

    /**
     * Sets the value of the sortAttributeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSortAttributeID(Integer value) {
        this.sortAttributeID = value;
    }

    /**
     * Gets the value of the maxChildrenPerFamily property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxChildrenPerFamily() {
        return maxChildrenPerFamily;
    }

    /**
     * Sets the value of the maxChildrenPerFamily property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxChildrenPerFamily(Integer value) {
        this.maxChildrenPerFamily = value;
    }

    /**
     * Gets the value of the searchAttributes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchAttributes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchAttributes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchAttributesType }
     * 
     * 
     */
    public List<SearchAttributesType> getSearchAttributes() {
        if (searchAttributes == null) {
            searchAttributes = new ArrayList<SearchAttributesType>();
        }
        return this.searchAttributes;
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
     * Gets the value of the availableItemsOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAvailableItemsOnly() {
        return availableItemsOnly;
    }

    /**
     * Sets the value of the availableItemsOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAvailableItemsOnly(Boolean value) {
        this.availableItemsOnly = value;
    }

    /**
     * Gets the value of the queryKeywords property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryKeywords() {
        return queryKeywords;
    }

    /**
     * Sets the value of the queryKeywords property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryKeywords(String value) {
        this.queryKeywords = value;
    }

    /**
     * Gets the value of the characteristicSetIDs property.
     * 
     * @return
     *     possible object is
     *     {@link CharacteristicSetIDsType }
     *     
     */
    public CharacteristicSetIDsType getCharacteristicSetIDs() {
        return characteristicSetIDs;
    }

    /**
     * Sets the value of the characteristicSetIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacteristicSetIDsType }
     *     
     */
    public void setCharacteristicSetIDs(CharacteristicSetIDsType value) {
        this.characteristicSetIDs = value;
    }

    /**
     * Gets the value of the productReferenceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductReferenceID() {
        return productReferenceID;
    }

    /**
     * Sets the value of the productReferenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductReferenceID(String value) {
        this.productReferenceID = value;
    }

    /**
     * Gets the value of the externalProductID property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalProductIDType }
     *     
     */
    public ExternalProductIDType getExternalProductID() {
        return externalProductID;
    }

    /**
     * Sets the value of the externalProductID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalProductIDType }
     *     
     */
    public void setExternalProductID(ExternalProductIDType value) {
        this.externalProductID = value;
    }

}
