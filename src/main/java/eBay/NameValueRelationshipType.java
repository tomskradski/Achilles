
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Information about a parent name-value pair that indicates the 
 * 				relationships between	Item Specifics.
 * 			
 * 
 * <p>Java class for NameValueRelationshipType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NameValueRelationshipType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ParentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParentValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NameValueRelationshipType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "parentName",
    "parentValue"
})
public class NameValueRelationshipType {

    @XmlElement(name = "ParentName", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String parentName;
    @XmlElement(name = "ParentValue", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String parentValue;

    /**
     * Gets the value of the parentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentName() {
        return parentName;
    }

    /**
     * Sets the value of the parentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentName(String value) {
        this.parentName = value;
    }

    /**
     * Gets the value of the parentValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentValue() {
        return parentValue;
    }

    /**
     * Sets the value of the parentValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentValue(String value) {
        this.parentValue = value;
    }

}
