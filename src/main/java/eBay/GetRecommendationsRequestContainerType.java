
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
 * 				This type is deprecated.
 * 			
 * 
 * <p>Java class for GetRecommendationsRequestContainerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetRecommendationsRequestContainerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListingFlow" type="{urn:ebay:apis:eBLBaseComponents}ListingFlowCodeType" minOccurs="0"/>
 *         &lt;element name="Item" type="{urn:ebay:apis:eBLBaseComponents}ItemType" minOccurs="0"/>
 *         &lt;element name="RecommendationEngine" type="{urn:ebay:apis:eBLBaseComponents}RecommendationEngineCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Query" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CorrelationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeletedField" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ExcludeRelationships" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IncludeConfidence" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetRecommendationsRequestContainerType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "listingFlow",
    "item",
    "recommendationEngine",
    "query",
    "correlationID",
    "deletedField",
    "excludeRelationships",
    "includeConfidence"
})
public class GetRecommendationsRequestContainerType {

    @XmlElement(name = "ListingFlow", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected ListingFlowCodeType listingFlow;
    @XmlElement(name = "Item", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected ItemType item;
    @XmlElement(name = "RecommendationEngine", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected List<RecommendationEngineCodeType> recommendationEngine;
    @XmlElement(name = "Query", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String query;
    @XmlElement(name = "CorrelationID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String correlationID;
    @XmlElement(name = "DeletedField", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<String> deletedField;
    @XmlElement(name = "ExcludeRelationships", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean excludeRelationships;
    @XmlElement(name = "IncludeConfidence", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean includeConfidence;

    /**
     * Gets the value of the listingFlow property.
     * 
     * @return
     *     possible object is
     *     {@link ListingFlowCodeType }
     *     
     */
    public ListingFlowCodeType getListingFlow() {
        return listingFlow;
    }

    /**
     * Sets the value of the listingFlow property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListingFlowCodeType }
     *     
     */
    public void setListingFlow(ListingFlowCodeType value) {
        this.listingFlow = value;
    }

    /**
     * Gets the value of the item property.
     * 
     * @return
     *     possible object is
     *     {@link ItemType }
     *     
     */
    public ItemType getItem() {
        return item;
    }

    /**
     * Sets the value of the item property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemType }
     *     
     */
    public void setItem(ItemType value) {
        this.item = value;
    }

    /**
     * Gets the value of the recommendationEngine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recommendationEngine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecommendationEngine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecommendationEngineCodeType }
     * 
     * 
     */
    public List<RecommendationEngineCodeType> getRecommendationEngine() {
        if (recommendationEngine == null) {
            recommendationEngine = new ArrayList<RecommendationEngineCodeType>();
        }
        return this.recommendationEngine;
    }

    /**
     * Gets the value of the query property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuery() {
        return query;
    }

    /**
     * Sets the value of the query property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuery(String value) {
        this.query = value;
    }

    /**
     * Gets the value of the correlationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrelationID() {
        return correlationID;
    }

    /**
     * Sets the value of the correlationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrelationID(String value) {
        this.correlationID = value;
    }

    /**
     * Gets the value of the deletedField property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deletedField property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeletedField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDeletedField() {
        if (deletedField == null) {
            deletedField = new ArrayList<String>();
        }
        return this.deletedField;
    }

    /**
     * Gets the value of the excludeRelationships property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcludeRelationships() {
        return excludeRelationships;
    }

    /**
     * Sets the value of the excludeRelationships property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludeRelationships(Boolean value) {
        this.excludeRelationships = value;
    }

    /**
     * Gets the value of the includeConfidence property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeConfidence() {
        return includeConfidence;
    }

    /**
     * Sets the value of the includeConfidence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeConfidence(Boolean value) {
        this.includeConfidence = value;
    }

}
