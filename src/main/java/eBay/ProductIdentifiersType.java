
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This type is used to provide details about recommended Product Identifier types. The <b>ProductIdentifiers</b>  container will consist of one or more Product Identifier types that can be, or possibly required to be used when listing a product.
 * 				<br>
 * 				<br>
 * 				<span class="tablenote"><b>Note:</b>
 * 				The <b>ProductIdentifiers</b> container will only be returned in the Sandbox environment for the time being. This container has not been wired on in production. An alternative way to see if a Product Identifier type is required for a category is to use the <b>GetCategoryFeatures</b> call and look for the values returned under the <b>EANEnabled</b>, <b>ISBNEnabled</b>, <b>UPCEnabled</b>, and other fields that indicate the Product Identifier types that are supported/required for the category.<br>
 * 				<br>
 * 			
 * 
 * <p>Java class for ProductIdentifiersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductIdentifiersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ValidationRules" type="{urn:ebay:apis:eBLBaseComponents}GroupValidationRulesType"/>
 *         &lt;element name="NameRecommendation" type="{urn:ebay:apis:eBLBaseComponents}NameRecommendationType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductIdentifiersType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "validationRules",
    "nameRecommendation"
})
public class ProductIdentifiersType {

    @XmlElement(name = "ValidationRules", namespace = "urn:ebay:apis:eBLBaseComponents", required = true)
    protected GroupValidationRulesType validationRules;
    @XmlElement(name = "NameRecommendation", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<NameRecommendationType> nameRecommendation;

    /**
     * Gets the value of the validationRules property.
     * 
     * @return
     *     possible object is
     *     {@link GroupValidationRulesType }
     *     
     */
    public GroupValidationRulesType getValidationRules() {
        return validationRules;
    }

    /**
     * Sets the value of the validationRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupValidationRulesType }
     *     
     */
    public void setValidationRules(GroupValidationRulesType value) {
        this.validationRules = value;
    }

    /**
     * Gets the value of the nameRecommendation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nameRecommendation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNameRecommendation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameRecommendationType }
     * 
     * 
     */
    public List<NameRecommendationType> getNameRecommendation() {
        if (nameRecommendation == null) {
            nameRecommendation = new ArrayList<NameRecommendationType>();
        }
        return this.nameRecommendation;
    }

}
