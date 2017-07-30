
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
 * 				Fields in this type provide condition values and display names.
 * 			
 * 
 * <p>Java class for ConditionValuesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConditionValuesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Condition" type="{urn:ebay:apis:eBLBaseComponents}ConditionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ConditionHelpURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConditionValuesType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "condition",
    "conditionHelpURL"
})
public class ConditionValuesType {

    @XmlElement(name = "Condition", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<ConditionType> condition;
    @XmlElement(name = "ConditionHelpURL", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "anyURI")
    protected String conditionHelpURL;

    /**
     * Gets the value of the condition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the condition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCondition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConditionType }
     * 
     * 
     */
    public List<ConditionType> getCondition() {
        if (condition == null) {
            condition = new ArrayList<ConditionType>();
        }
        return this.condition;
    }

    /**
     * Gets the value of the conditionHelpURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConditionHelpURL() {
        return conditionHelpURL;
    }

    /**
     * Sets the value of the conditionHelpURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConditionHelpURL(String value) {
        this.conditionHelpURL = value;
    }

}
