
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Specifies how to return the result list for My eBay features such as saved
 * 				searches, favorite sellers, and second chance offers.
 * 			
 * 
 * <p>Java class for MyeBaySelectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MyeBaySelectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Include" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IncludeItemCount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IncludeFavoriteSearcheCount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IncludeFavoriteSellerCount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Sort" type="{urn:ebay:apis:eBLBaseComponents}SortOrderCodeType" minOccurs="0"/>
 *         &lt;element name="MaxResults" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UserDefinedListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IncludeListContents" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MyeBaySelectionType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "include",
    "includeItemCount",
    "includeFavoriteSearcheCount",
    "includeFavoriteSellerCount",
    "sort",
    "maxResults",
    "userDefinedListName",
    "includeListContents"
})
public class MyeBaySelectionType {

    @XmlElement(name = "Include", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean include;
    @XmlElement(name = "IncludeItemCount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean includeItemCount;
    @XmlElement(name = "IncludeFavoriteSearcheCount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean includeFavoriteSearcheCount;
    @XmlElement(name = "IncludeFavoriteSellerCount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean includeFavoriteSellerCount;
    @XmlElement(name = "Sort", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected SortOrderCodeType sort;
    @XmlElement(name = "MaxResults", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer maxResults;
    @XmlElement(name = "UserDefinedListName", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String userDefinedListName;
    @XmlElement(name = "IncludeListContents", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean includeListContents;

    /**
     * Gets the value of the include property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInclude() {
        return include;
    }

    /**
     * Sets the value of the include property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInclude(Boolean value) {
        this.include = value;
    }

    /**
     * Gets the value of the includeItemCount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeItemCount() {
        return includeItemCount;
    }

    /**
     * Sets the value of the includeItemCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeItemCount(Boolean value) {
        this.includeItemCount = value;
    }

    /**
     * Gets the value of the includeFavoriteSearcheCount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeFavoriteSearcheCount() {
        return includeFavoriteSearcheCount;
    }

    /**
     * Sets the value of the includeFavoriteSearcheCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeFavoriteSearcheCount(Boolean value) {
        this.includeFavoriteSearcheCount = value;
    }

    /**
     * Gets the value of the includeFavoriteSellerCount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeFavoriteSellerCount() {
        return includeFavoriteSellerCount;
    }

    /**
     * Sets the value of the includeFavoriteSellerCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeFavoriteSellerCount(Boolean value) {
        this.includeFavoriteSellerCount = value;
    }

    /**
     * Gets the value of the sort property.
     * 
     * @return
     *     possible object is
     *     {@link SortOrderCodeType }
     *     
     */
    public SortOrderCodeType getSort() {
        return sort;
    }

    /**
     * Sets the value of the sort property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortOrderCodeType }
     *     
     */
    public void setSort(SortOrderCodeType value) {
        this.sort = value;
    }

    /**
     * Gets the value of the maxResults property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * Sets the value of the maxResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxResults(Integer value) {
        this.maxResults = value;
    }

    /**
     * Gets the value of the userDefinedListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserDefinedListName() {
        return userDefinedListName;
    }

    /**
     * Sets the value of the userDefinedListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserDefinedListName(String value) {
        this.userDefinedListName = value;
    }

    /**
     * Gets the value of the includeListContents property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeListContents() {
        return includeListContents;
    }

    /**
     * Sets the value of the includeListContents property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeListContents(Boolean value) {
        this.includeListContents = value;
    }

}
