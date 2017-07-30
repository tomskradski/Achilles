
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
 * 			This type provides details about recommended names and values for custom Item Specifics and/or Product Identifier types.
 * 		
 * 
 * <p>Java class for NameRecommendationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NameRecommendationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValidationRules" type="{urn:ebay:apis:eBLBaseComponents}RecommendationValidationRulesType" minOccurs="0"/>
 *         &lt;element name="ValueRecommendation" type="{urn:ebay:apis:eBLBaseComponents}ValueRecommendationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="HelpURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="Source" type="{urn:ebay:apis:eBLBaseComponents}ItemSpecificSourceCodeType" minOccurs="0"/>
 *         &lt;element name="HelpText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NameRecommendationType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "name",
    "validationRules",
    "valueRecommendation",
    "helpURL",
    "source",
    "helpText"
})
public class NameRecommendationType {

    @XmlElement(name = "Name", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String name;
    @XmlElement(name = "ValidationRules", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected RecommendationValidationRulesType validationRules;
    @XmlElement(name = "ValueRecommendation", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<ValueRecommendationType> valueRecommendation;
    @XmlElement(name = "HelpURL", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "anyURI")
    protected String helpURL;
    @XmlElement(name = "Source", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected ItemSpecificSourceCodeType source;
    @XmlElement(name = "HelpText", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String helpText;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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

    /**
     * Gets the value of the valueRecommendation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valueRecommendation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValueRecommendation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValueRecommendationType }
     * 
     * 
     */
    public List<ValueRecommendationType> getValueRecommendation() {
        if (valueRecommendation == null) {
            valueRecommendation = new ArrayList<ValueRecommendationType>();
        }
        return this.valueRecommendation;
    }

    /**
     * Gets the value of the helpURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHelpURL() {
        return helpURL;
    }

    /**
     * Sets the value of the helpURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHelpURL(String value) {
        this.helpURL = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link ItemSpecificSourceCodeType }
     *     
     */
    public ItemSpecificSourceCodeType getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSpecificSourceCodeType }
     *     
     */
    public void setSource(ItemSpecificSourceCodeType value) {
        this.source = value;
    }

    /**
     * Gets the value of the helpText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHelpText() {
        return helpText;
    }

    /**
     * Sets the value of the helpText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHelpText(String value) {
        this.helpText = value;
    }

}
