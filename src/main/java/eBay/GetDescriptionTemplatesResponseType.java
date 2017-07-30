
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 					This is the base response type for the <b>GetDescriptionTemplates</b> call. This call retrieves the Listing Designer templates that are available for use by the seller. The user has the option of retrieving all available Listing Designer templates for all categories, for all motor vehicle categories, or for a specific eBay category.
 * 				
 * 
 * <p>Java class for GetDescriptionTemplatesResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetDescriptionTemplatesResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="DescriptionTemplate" type="{urn:ebay:apis:eBLBaseComponents}DescriptionTemplateType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LayoutTotal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ObsoleteLayoutID" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ObsoleteThemeID" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ThemeGroup" type="{urn:ebay:apis:eBLBaseComponents}ThemeGroupType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ThemeTotal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetDescriptionTemplatesResponseType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "descriptionTemplate",
    "layoutTotal",
    "obsoleteLayoutID",
    "obsoleteThemeID",
    "themeGroup",
    "themeTotal"
})
public class GetDescriptionTemplatesResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "DescriptionTemplate", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<DescriptionTemplateType> descriptionTemplate;
    @XmlElement(name = "LayoutTotal", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer layoutTotal;
    @XmlElement(name = "ObsoleteLayoutID", namespace = "urn:ebay:apis:eBLBaseComponents", type = Integer.class)
    protected List<Integer> obsoleteLayoutID;
    @XmlElement(name = "ObsoleteThemeID", namespace = "urn:ebay:apis:eBLBaseComponents", type = Integer.class)
    protected List<Integer> obsoleteThemeID;
    @XmlElement(name = "ThemeGroup", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<ThemeGroupType> themeGroup;
    @XmlElement(name = "ThemeTotal", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer themeTotal;

    /**
     * Gets the value of the descriptionTemplate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the descriptionTemplate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescriptionTemplate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescriptionTemplateType }
     * 
     * 
     */
    public List<DescriptionTemplateType> getDescriptionTemplate() {
        if (descriptionTemplate == null) {
            descriptionTemplate = new ArrayList<DescriptionTemplateType>();
        }
        return this.descriptionTemplate;
    }

    /**
     * Gets the value of the layoutTotal property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLayoutTotal() {
        return layoutTotal;
    }

    /**
     * Sets the value of the layoutTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLayoutTotal(Integer value) {
        this.layoutTotal = value;
    }

    /**
     * Gets the value of the obsoleteLayoutID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the obsoleteLayoutID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObsoleteLayoutID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getObsoleteLayoutID() {
        if (obsoleteLayoutID == null) {
            obsoleteLayoutID = new ArrayList<Integer>();
        }
        return this.obsoleteLayoutID;
    }

    /**
     * Gets the value of the obsoleteThemeID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the obsoleteThemeID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObsoleteThemeID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getObsoleteThemeID() {
        if (obsoleteThemeID == null) {
            obsoleteThemeID = new ArrayList<Integer>();
        }
        return this.obsoleteThemeID;
    }

    /**
     * Gets the value of the themeGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the themeGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getThemeGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ThemeGroupType }
     * 
     * 
     */
    public List<ThemeGroupType> getThemeGroup() {
        if (themeGroup == null) {
            themeGroup = new ArrayList<ThemeGroupType>();
        }
        return this.themeGroup;
    }

    /**
     * Gets the value of the themeTotal property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getThemeTotal() {
        return themeTotal;
    }

    /**
     * Sets the value of the themeTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setThemeTotal(Integer value) {
        this.themeTotal = value;
    }

}
