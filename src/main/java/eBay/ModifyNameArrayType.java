
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				A list of one or more ModifyName containers. Each ModifyName container has Name and NewName elements.
 * 			
 * 
 * <p>Java class for ModifyNameArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModifyNameArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ModifyName" type="{urn:ebay:apis:eBLBaseComponents}ModifyNameType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModifyNameArrayType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "modifyName"
})
public class ModifyNameArrayType {

    @XmlElement(name = "ModifyName", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<ModifyNameType> modifyName;

    /**
     * Gets the value of the modifyName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modifyName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModifyName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModifyNameType }
     * 
     * 
     */
    public List<ModifyNameType> getModifyName() {
        if (modifyName == null) {
            modifyName = new ArrayList<ModifyNameType>();
        }
        return this.modifyName;
    }

}
