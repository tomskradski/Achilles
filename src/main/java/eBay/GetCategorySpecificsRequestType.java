
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * 				This is the base request type for the <b>GetCategorySpecifics</b> call. This call is used to retrieve recommended Item Specifics names and values for one or multiple eBay Categories.
 * 			
 * 
 * <p>Java class for GetCategorySpecificsRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCategorySpecificsRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="CategoryID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LastUpdateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="MaxNames" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MaxValuesPerName" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CategorySpecific" type="{urn:ebay:apis:eBLBaseComponents}CategoryItemSpecificsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ExcludeRelationships" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IncludeConfidence" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CategorySpecificsFileInfo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCategorySpecificsRequestType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "categoryID",
    "lastUpdateTime",
    "maxNames",
    "maxValuesPerName",
    "name",
    "categorySpecific",
    "excludeRelationships",
    "includeConfidence",
    "categorySpecificsFileInfo"
})
public class GetCategorySpecificsRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "CategoryID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<String> categoryID;
    @XmlElement(name = "LastUpdateTime", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpdateTime;
    @XmlElement(name = "MaxNames", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer maxNames;
    @XmlElement(name = "MaxValuesPerName", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer maxValuesPerName;
    @XmlElement(name = "Name", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String name;
    @XmlElement(name = "CategorySpecific", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<CategoryItemSpecificsType> categorySpecific;
    @XmlElement(name = "ExcludeRelationships", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean excludeRelationships;
    @XmlElement(name = "IncludeConfidence", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean includeConfidence;
    @XmlElement(name = "CategorySpecificsFileInfo", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean categorySpecificsFileInfo;

    /**
     * Gets the value of the categoryID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the categoryID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategoryID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCategoryID() {
        if (categoryID == null) {
            categoryID = new ArrayList<String>();
        }
        return this.categoryID;
    }

    /**
     * Gets the value of the lastUpdateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * Sets the value of the lastUpdateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdateTime(XMLGregorianCalendar value) {
        this.lastUpdateTime = value;
    }

    /**
     * Gets the value of the maxNames property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxNames() {
        return maxNames;
    }

    /**
     * Sets the value of the maxNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxNames(Integer value) {
        this.maxNames = value;
    }

    /**
     * Gets the value of the maxValuesPerName property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxValuesPerName() {
        return maxValuesPerName;
    }

    /**
     * Sets the value of the maxValuesPerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxValuesPerName(Integer value) {
        this.maxValuesPerName = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the categorySpecific property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the categorySpecific property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategorySpecific().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CategoryItemSpecificsType }
     * 
     * 
     */
    public List<CategoryItemSpecificsType> getCategorySpecific() {
        if (categorySpecific == null) {
            categorySpecific = new ArrayList<CategoryItemSpecificsType>();
        }
        return this.categorySpecific;
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

    /**
     * Gets the value of the categorySpecificsFileInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCategorySpecificsFileInfo() {
        return categorySpecificsFileInfo;
    }

    /**
     * Sets the value of the categorySpecificsFileInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCategorySpecificsFileInfo(Boolean value) {
        this.categorySpecificsFileInfo = value;
    }

}
