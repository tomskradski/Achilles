
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Data for one theme group. Returned for GetDescriptionTemplates
 * 				if theme groups are requested.
 * 			
 * 
 * <p>Java class for ThemeGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ThemeGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GroupID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="GroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ThemeID" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ThemeTotal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThemeGroupType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "groupID",
    "groupName",
    "themeID",
    "themeTotal"
})
public class ThemeGroupType {

    @XmlElement(name = "GroupID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer groupID;
    @XmlElement(name = "GroupName", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String groupName;
    @XmlElement(name = "ThemeID", namespace = "urn:ebay:apis:eBLBaseComponents", type = Integer.class)
    protected List<Integer> themeID;
    @XmlElement(name = "ThemeTotal", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer themeTotal;

    /**
     * Gets the value of the groupID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGroupID() {
        return groupID;
    }

    /**
     * Sets the value of the groupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGroupID(Integer value) {
        this.groupID = value;
    }

    /**
     * Gets the value of the groupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * Sets the value of the groupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupName(String value) {
        this.groupName = value;
    }

    /**
     * Gets the value of the themeID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the themeID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getThemeID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getThemeID() {
        if (themeID == null) {
            themeID = new ArrayList<Integer>();
        }
        return this.themeID;
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
