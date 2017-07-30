
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
 * <p>Java class for LookupAttributeArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LookupAttributeArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LookupAttribute" type="{urn:ebay:apis:eBLBaseComponents}LookupAttributeType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LookupAttributeArrayType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "lookupAttribute"
})
public class LookupAttributeArrayType {

    @XmlElement(name = "LookupAttribute", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<LookupAttributeType> lookupAttribute;

    /**
     * Gets the value of the lookupAttribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lookupAttribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLookupAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LookupAttributeType }
     * 
     * 
     */
    public List<LookupAttributeType> getLookupAttribute() {
        if (lookupAttribute == null) {
            lookupAttribute = new ArrayList<LookupAttributeType>();
        }
        return this.lookupAttribute;
    }

}
