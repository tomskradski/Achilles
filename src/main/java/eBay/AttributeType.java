
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 			  A salient aspect or feature of a Half.com item that is specified by the seller so that a buyers can find the item more easily.
 * 		  
 * 
 * <p>Java class for AttributeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttributeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Value" type="{urn:ebay:apis:eBLBaseComponents}ValType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="attributeID" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="attributeLabel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttributeType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "value"
})
public class AttributeType {

    @XmlElement(name = "Value", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<ValType> value;
    @XmlAttribute(name = "attributeID")
    protected Integer attributeID;
    @XmlAttribute(name = "attributeLabel")
    protected String attributeLabel;

    /**
     * Gets the value of the value property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the value property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValType }
     * 
     * 
     */
    public List<ValType> getValue() {
        if (value == null) {
            value = new ArrayList<ValType>();
        }
        return this.value;
    }

    /**
     * Gets the value of the attributeID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAttributeID() {
        return attributeID;
    }

    /**
     * Sets the value of the attributeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAttributeID(Integer value) {
        this.attributeID = value;
    }

    /**
     * Gets the value of the attributeLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeLabel() {
        return attributeLabel;
    }

    /**
     * Sets the value of the attributeLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeLabel(String value) {
        this.attributeLabel = value;
    }

}
