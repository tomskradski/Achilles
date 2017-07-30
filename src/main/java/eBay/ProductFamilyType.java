
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
 * 				This type is deprecated.  
 * 			
 * 
 * <p>Java class for ProductFamilyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductFamilyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ParentProduct" type="{urn:ebay:apis:eBLBaseComponents}ProductType" minOccurs="0"/>
 *         &lt;element name="FamilyMembers" type="{urn:ebay:apis:eBLBaseComponents}ProductType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="hasMoreChildren" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductFamilyType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "parentProduct",
    "familyMembers"
})
public class ProductFamilyType {

    @XmlElement(name = "ParentProduct", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected ProductType parentProduct;
    @XmlElement(name = "FamilyMembers", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<ProductType> familyMembers;
    @XmlAttribute(name = "hasMoreChildren")
    protected Boolean hasMoreChildren;

    /**
     * Gets the value of the parentProduct property.
     * 
     * @return
     *     possible object is
     *     {@link ProductType }
     *     
     */
    public ProductType getParentProduct() {
        return parentProduct;
    }

    /**
     * Sets the value of the parentProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductType }
     *     
     */
    public void setParentProduct(ProductType value) {
        this.parentProduct = value;
    }

    /**
     * Gets the value of the familyMembers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the familyMembers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFamilyMembers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductType }
     * 
     * 
     */
    public List<ProductType> getFamilyMembers() {
        if (familyMembers == null) {
            familyMembers = new ArrayList<ProductType>();
        }
        return this.familyMembers;
    }

    /**
     * Gets the value of the hasMoreChildren property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasMoreChildren() {
        return hasMoreChildren;
    }

    /**
     * Sets the value of the hasMoreChildren property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasMoreChildren(Boolean value) {
        this.hasMoreChildren = value;
    }

}
