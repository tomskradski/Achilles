
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				A list of compatible applications specified as name and value pairs. Describes an
 * 				assembly with which a part is compatible (i.e., parts compatibility by application). For
 * 				example, to specify a part's compatibility with a vehicle, the name would map to
 * 				standard vehicle characteristics (e.g., Year, Make, Model, Trim, and Engine). The
 * 				values would desribe the specific vehicle, such as a 2006 Honda Accord.
 * 			
 * 
 * <p>Java class for ItemCompatibilityListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemCompatibilityListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Compatibility" type="{urn:ebay:apis:eBLBaseComponents}ItemCompatibilityType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ReplaceAll" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemCompatibilityListType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "compatibility",
    "replaceAll"
})
public class ItemCompatibilityListType {

    @XmlElement(name = "Compatibility", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<ItemCompatibilityType> compatibility;
    @XmlElement(name = "ReplaceAll", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean replaceAll;

    /**
     * Gets the value of the compatibility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the compatibility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompatibility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemCompatibilityType }
     * 
     * 
     */
    public List<ItemCompatibilityType> getCompatibility() {
        if (compatibility == null) {
            compatibility = new ArrayList<ItemCompatibilityType>();
        }
        return this.compatibility;
    }

    /**
     * Gets the value of the replaceAll property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReplaceAll() {
        return replaceAll;
    }

    /**
     * Sets the value of the replaceAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReplaceAll(Boolean value) {
        this.replaceAll = value;
    }

}
