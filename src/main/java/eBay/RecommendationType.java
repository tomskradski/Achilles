
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This type is reserved for future or internal use.
 * 			
 * 
 * <p>Java class for RecommendationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecommendationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FieldGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FieldName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecommendationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecommendedValue" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecommendationType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "fieldGroup",
    "fieldName",
    "recommendationCode",
    "recommendedValue",
    "message"
})
public class RecommendationType {

    @XmlElement(name = "FieldGroup", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String fieldGroup;
    @XmlElement(name = "FieldName", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String fieldName;
    @XmlElement(name = "RecommendationCode", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String recommendationCode;
    @XmlElement(name = "RecommendedValue", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<String> recommendedValue;
    @XmlElement(name = "Message", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String message;

    /**
     * Gets the value of the fieldGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldGroup() {
        return fieldGroup;
    }

    /**
     * Sets the value of the fieldGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldGroup(String value) {
        this.fieldGroup = value;
    }

    /**
     * Gets the value of the fieldName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldName() {
        return fieldName;
    }

    /**
     * Sets the value of the fieldName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldName(String value) {
        this.fieldName = value;
    }

    /**
     * Gets the value of the recommendationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecommendationCode() {
        return recommendationCode;
    }

    /**
     * Sets the value of the recommendationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecommendationCode(String value) {
        this.recommendationCode = value;
    }

    /**
     * Gets the value of the recommendedValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recommendedValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecommendedValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRecommendedValue() {
        if (recommendedValue == null) {
            recommendedValue = new ArrayList<String>();
        }
        return this.recommendedValue;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

}
