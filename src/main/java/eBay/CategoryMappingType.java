
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This type is used by the <b>CategoryMapping</b> fields that are returned in the <b>GetCategoryMappings</b> response to indicate any eBay Category IDs that have changed recently.
 * 			
 * 
 * <p>Java class for CategoryMappingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CategoryMappingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="oldID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CategoryMappingType", namespace = "urn:ebay:apis:eBLBaseComponents")
public class CategoryMappingType {

    @XmlAttribute(name = "oldID")
    protected String oldID;
    @XmlAttribute(name = "id")
    protected String id;

    /**
     * Gets the value of the oldID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldID() {
        return oldID;
    }

    /**
     * Sets the value of the oldID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldID(String value) {
        this.oldID = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
