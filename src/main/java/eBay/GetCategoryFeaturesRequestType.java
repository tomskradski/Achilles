
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
 * 				Returns information about the features that are applicable to different categories,
 * 				such as listing durations, shipping term requirements, and Best Offer support.
 * 			
 * 
 * <p>Java class for GetCategoryFeaturesRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCategoryFeaturesRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="CategoryID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LevelLimit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ViewAllNodes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FeatureID" type="{urn:ebay:apis:eBLBaseComponents}FeatureIDCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AllFeaturesForCategory" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCategoryFeaturesRequestType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "categoryID",
    "levelLimit",
    "viewAllNodes",
    "featureID",
    "allFeaturesForCategory"
})
public class GetCategoryFeaturesRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "CategoryID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String categoryID;
    @XmlElement(name = "LevelLimit", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer levelLimit;
    @XmlElement(name = "ViewAllNodes", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean viewAllNodes;
    @XmlElement(name = "FeatureID", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected List<FeatureIDCodeType> featureID;
    @XmlElement(name = "AllFeaturesForCategory", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean allFeaturesForCategory;

    /**
     * Gets the value of the categoryID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryID() {
        return categoryID;
    }

    /**
     * Sets the value of the categoryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryID(String value) {
        this.categoryID = value;
    }

    /**
     * Gets the value of the levelLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLevelLimit() {
        return levelLimit;
    }

    /**
     * Sets the value of the levelLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLevelLimit(Integer value) {
        this.levelLimit = value;
    }

    /**
     * Gets the value of the viewAllNodes property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isViewAllNodes() {
        return viewAllNodes;
    }

    /**
     * Sets the value of the viewAllNodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setViewAllNodes(Boolean value) {
        this.viewAllNodes = value;
    }

    /**
     * Gets the value of the featureID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the featureID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeatureID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeatureIDCodeType }
     * 
     * 
     */
    public List<FeatureIDCodeType> getFeatureID() {
        if (featureID == null) {
            featureID = new ArrayList<FeatureIDCodeType>();
        }
        return this.featureID;
    }

    /**
     * Gets the value of the allFeaturesForCategory property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllFeaturesForCategory() {
        return allFeaturesForCategory;
    }

    /**
     * Sets the value of the allFeaturesForCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllFeaturesForCategory(Boolean value) {
        this.allFeaturesForCategory = value;
    }

}
