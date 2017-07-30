
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
 * 				This type is used by the <b>ValidationRules</b> containers returned in the <b>GetCategorySpecifics</b> response, which contains some rules and limits for the recommended Item Specific name (specified in the <b>NameRecommendation.Name</b> field) and corresponding value(s) (specified in the <b>ValueRecommendation.Value</b> field). These rules and limits will apply when the recommended Item Specific is subsequently used in Add/Revise/Relist call.
 * 			
 * 
 * <p>Java class for RecommendationValidationRulesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecommendationValidationRulesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ValueType" type="{urn:ebay:apis:eBLBaseComponents}ValueTypeCodeType" minOccurs="0"/>
 *         &lt;element name="MinValues" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MaxValues" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SelectionMode" type="{urn:ebay:apis:eBLBaseComponents}SelectionModeCodeType" minOccurs="0"/>
 *         &lt;element name="Confidence" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Relationship" type="{urn:ebay:apis:eBLBaseComponents}NameValueRelationshipType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="VariationPicture" type="{urn:ebay:apis:eBLBaseComponents}VariationPictureRuleCodeType" minOccurs="0"/>
 *         &lt;element name="VariationSpecifics" type="{urn:ebay:apis:eBLBaseComponents}VariationSpecificsRuleCodeType" minOccurs="0"/>
 *         &lt;element name="ValueFormat" type="{urn:ebay:apis:eBLBaseComponents}ValueFormatCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecommendationValidationRulesType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "valueType",
    "minValues",
    "maxValues",
    "selectionMode",
    "confidence",
    "relationship",
    "variationPicture",
    "variationSpecifics",
    "valueFormat"
})
public class RecommendationValidationRulesType {

    @XmlElement(name = "ValueType", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected ValueTypeCodeType valueType;
    @XmlElement(name = "MinValues", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer minValues;
    @XmlElement(name = "MaxValues", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer maxValues;
    @XmlElement(name = "SelectionMode", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "string")
    protected SelectionModeCodeType selectionMode;
    @XmlElement(name = "Confidence", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer confidence;
    @XmlElement(name = "Relationship", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<NameValueRelationshipType> relationship;
    @XmlElement(name = "VariationPicture", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected VariationPictureRuleCodeType variationPicture;
    @XmlElement(name = "VariationSpecifics", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected VariationSpecificsRuleCodeType variationSpecifics;
    @XmlElement(name = "ValueFormat", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected ValueFormatCodeType valueFormat;

    /**
     * Gets the value of the valueType property.
     * 
     * @return
     *     possible object is
     *     {@link ValueTypeCodeType }
     *     
     */
    public ValueTypeCodeType getValueType() {
        return valueType;
    }

    /**
     * Sets the value of the valueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueTypeCodeType }
     *     
     */
    public void setValueType(ValueTypeCodeType value) {
        this.valueType = value;
    }

    /**
     * Gets the value of the minValues property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinValues() {
        return minValues;
    }

    /**
     * Sets the value of the minValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinValues(Integer value) {
        this.minValues = value;
    }

    /**
     * Gets the value of the maxValues property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxValues() {
        return maxValues;
    }

    /**
     * Sets the value of the maxValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxValues(Integer value) {
        this.maxValues = value;
    }

    /**
     * Gets the value of the selectionMode property.
     * 
     * @return
     *     possible object is
     *     {@link SelectionModeCodeType }
     *     
     */
    public SelectionModeCodeType getSelectionMode() {
        return selectionMode;
    }

    /**
     * Sets the value of the selectionMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectionModeCodeType }
     *     
     */
    public void setSelectionMode(SelectionModeCodeType value) {
        this.selectionMode = value;
    }

    /**
     * Gets the value of the confidence property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConfidence() {
        return confidence;
    }

    /**
     * Sets the value of the confidence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConfidence(Integer value) {
        this.confidence = value;
    }

    /**
     * Gets the value of the relationship property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relationship property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelationship().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameValueRelationshipType }
     * 
     * 
     */
    public List<NameValueRelationshipType> getRelationship() {
        if (relationship == null) {
            relationship = new ArrayList<NameValueRelationshipType>();
        }
        return this.relationship;
    }

    /**
     * Gets the value of the variationPicture property.
     * 
     * @return
     *     possible object is
     *     {@link VariationPictureRuleCodeType }
     *     
     */
    public VariationPictureRuleCodeType getVariationPicture() {
        return variationPicture;
    }

    /**
     * Sets the value of the variationPicture property.
     * 
     * @param value
     *     allowed object is
     *     {@link VariationPictureRuleCodeType }
     *     
     */
    public void setVariationPicture(VariationPictureRuleCodeType value) {
        this.variationPicture = value;
    }

    /**
     * Gets the value of the variationSpecifics property.
     * 
     * @return
     *     possible object is
     *     {@link VariationSpecificsRuleCodeType }
     *     
     */
    public VariationSpecificsRuleCodeType getVariationSpecifics() {
        return variationSpecifics;
    }

    /**
     * Sets the value of the variationSpecifics property.
     * 
     * @param value
     *     allowed object is
     *     {@link VariationSpecificsRuleCodeType }
     *     
     */
    public void setVariationSpecifics(VariationSpecificsRuleCodeType value) {
        this.variationSpecifics = value;
    }

    /**
     * Gets the value of the valueFormat property.
     * 
     * @return
     *     possible object is
     *     {@link ValueFormatCodeType }
     *     
     */
    public ValueFormatCodeType getValueFormat() {
        return valueFormat;
    }

    /**
     * Sets the value of the valueFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueFormatCodeType }
     *     
     */
    public void setValueFormat(ValueFormatCodeType value) {
        this.valueFormat = value;
    }

}
