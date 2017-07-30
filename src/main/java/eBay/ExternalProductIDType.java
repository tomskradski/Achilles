
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
 * 				This type is deprecated.  
 * 			
 * 
 * <p>Java class for ExternalProductIDType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExternalProductIDType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReturnSearchResultOnDuplicates" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Type" type="{urn:ebay:apis:eBLBaseComponents}ExternalProductCodeType" minOccurs="0"/>
 *         &lt;element name="AlternateValue" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExternalProductIDType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "value",
    "returnSearchResultOnDuplicates",
    "type",
    "alternateValue"
})
public class ExternalProductIDType {

    @XmlElement(name = "Value", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String value;
    @XmlElement(name = "ReturnSearchResultOnDuplicates", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean returnSearchResultOnDuplicates;
    @XmlElement(name = "Type", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected ExternalProductCodeType type;
    @XmlElement(name = "AlternateValue", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<String> alternateValue;

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
     * Gets the value of the returnSearchResultOnDuplicates property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnSearchResultOnDuplicates() {
        return returnSearchResultOnDuplicates;
    }

    /**
     * Sets the value of the returnSearchResultOnDuplicates property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnSearchResultOnDuplicates(Boolean value) {
        this.returnSearchResultOnDuplicates = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalProductCodeType }
     *     
     */
    public ExternalProductCodeType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalProductCodeType }
     *     
     */
    public void setType(ExternalProductCodeType value) {
        this.type = value;
    }

    /**
     * Gets the value of the alternateValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternateValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternateValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAlternateValue() {
        if (alternateValue == null) {
            alternateValue = new ArrayList<String>();
        }
        return this.alternateValue;
    }

}
