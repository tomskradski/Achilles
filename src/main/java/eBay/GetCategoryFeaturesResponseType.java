
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
 * <p>Java class for GetCategoryFeaturesResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCategoryFeaturesResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="CategoryVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UpdateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Category" type="{urn:ebay:apis:eBLBaseComponents}CategoryFeatureType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SiteDefaults" type="{urn:ebay:apis:eBLBaseComponents}SiteDefaultsType" minOccurs="0"/>
 *         &lt;element name="FeatureDefinitions" type="{urn:ebay:apis:eBLBaseComponents}FeatureDefinitionsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCategoryFeaturesResponseType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "categoryVersion",
    "updateTime",
    "category",
    "siteDefaults",
    "featureDefinitions"
})
public class GetCategoryFeaturesResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "CategoryVersion", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String categoryVersion;
    @XmlElement(name = "UpdateTime", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updateTime;
    @XmlElement(name = "Category", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<CategoryFeatureType> category;
    @XmlElement(name = "SiteDefaults", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected SiteDefaultsType siteDefaults;
    @XmlElement(name = "FeatureDefinitions", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected FeatureDefinitionsType featureDefinitions;

    /**
     * Gets the value of the categoryVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryVersion() {
        return categoryVersion;
    }

    /**
     * Sets the value of the categoryVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryVersion(String value) {
        this.categoryVersion = value;
    }

    /**
     * Gets the value of the updateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdateTime() {
        return updateTime;
    }

    /**
     * Sets the value of the updateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdateTime(XMLGregorianCalendar value) {
        this.updateTime = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the category property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CategoryFeatureType }
     * 
     * 
     */
    public List<CategoryFeatureType> getCategory() {
        if (category == null) {
            category = new ArrayList<CategoryFeatureType>();
        }
        return this.category;
    }

    /**
     * Gets the value of the siteDefaults property.
     * 
     * @return
     *     possible object is
     *     {@link SiteDefaultsType }
     *     
     */
    public SiteDefaultsType getSiteDefaults() {
        return siteDefaults;
    }

    /**
     * Sets the value of the siteDefaults property.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteDefaultsType }
     *     
     */
    public void setSiteDefaults(SiteDefaultsType value) {
        this.siteDefaults = value;
    }

    /**
     * Gets the value of the featureDefinitions property.
     * 
     * @return
     *     possible object is
     *     {@link FeatureDefinitionsType }
     *     
     */
    public FeatureDefinitionsType getFeatureDefinitions() {
        return featureDefinitions;
    }

    /**
     * Sets the value of the featureDefinitions property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureDefinitionsType }
     *     
     */
    public void setFeatureDefinitions(FeatureDefinitionsType value) {
        this.featureDefinitions = value;
    }

}
