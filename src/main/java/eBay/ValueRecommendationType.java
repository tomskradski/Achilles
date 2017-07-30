
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 			Defines details about recommended values for custom Item Specifics.
 * 		
 * 
 * <p>Java class for ValueRecommendationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValueRecommendationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValidationRules" type="{urn:ebay:apis:eBLBaseComponents}RecommendationValidationRulesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValueRecommendationType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "value",
    "validationRules"
})
public class ValueRecommendationType {

    @XmlElement(name = "Value", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String value;
    @XmlElement(name = "ValidationRules", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected RecommendationValidationRulesType validationRules;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the validationRules property.
     * 
     * @return
     *     possible object is
     *     {@link RecommendationValidationRulesType }
     *     
     */
    public RecommendationValidationRulesType getValidationRules() {
        return validationRules;
    }

    /**
     * Sets the value of the validationRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecommendationValidationRulesType }
     *     
     */
    public void setValidationRules(RecommendationValidationRulesType value) {
        this.validationRules = value;
    }

}
