
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This type is deprecated.
 * 			
 * 
 * <p>Java class for AttributeSetArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttributeSetArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AttributeSet" type="{urn:ebay:apis:eBLBaseComponents}AttributeSetType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttributeSetArrayType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "attributeSet"
})
public class AttributeSetArrayType {

    @XmlElement(name = "AttributeSet", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<AttributeSetType> attributeSet;

    /**
     * Gets the value of the attributeSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributeSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributeSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttributeSetType }
     * 
     * 
     */
    public List<AttributeSetType> getAttributeSet() {
        if (attributeSet == null) {
            attributeSet = new ArrayList<AttributeSetType>();
        }
        return this.attributeSet;
    }

}
