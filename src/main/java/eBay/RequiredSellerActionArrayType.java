
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This type defines the <b>RequiredSellerActionArray</b> container,
 * 				which may contain one or more <b>RequiredSellerAction</b> fields.
 * 			
 * 
 * <p>Java class for RequiredSellerActionArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequiredSellerActionArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequiredSellerAction" type="{urn:ebay:apis:eBLBaseComponents}RequiredSellerActionCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequiredSellerActionArrayType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "requiredSellerAction"
})
public class RequiredSellerActionArrayType {

    @XmlElement(name = "RequiredSellerAction", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected List<RequiredSellerActionCodeType> requiredSellerAction;

    /**
     * Gets the value of the requiredSellerAction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requiredSellerAction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequiredSellerAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequiredSellerActionCodeType }
     * 
     * 
     */
    public List<RequiredSellerActionCodeType> getRequiredSellerAction() {
        if (requiredSellerAction == null) {
            requiredSellerAction = new ArrayList<RequiredSellerActionCodeType>();
        }
        return this.requiredSellerAction;
    }

}
