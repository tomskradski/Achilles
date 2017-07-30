
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				The type the defines the fields for Half.com item attributes. This is used only for Half.com items.
 * 			
 * 
 * <p>Java class for ValType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ValueLiteral" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SuggestedValueLiteral" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ValueID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "valueLiteral",
    "suggestedValueLiteral",
    "valueID"
})
public class ValType {

    @XmlElement(name = "ValueLiteral", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String valueLiteral;
    @XmlElement(name = "SuggestedValueLiteral", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<String> suggestedValueLiteral;
    @XmlElement(name = "ValueID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer valueID;

    /**
     * Gets the value of the valueLiteral property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueLiteral() {
        return valueLiteral;
    }

    /**
     * Sets the value of the valueLiteral property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueLiteral(String value) {
        this.valueLiteral = value;
    }

    /**
     * Gets the value of the suggestedValueLiteral property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the suggestedValueLiteral property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSuggestedValueLiteral().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSuggestedValueLiteral() {
        if (suggestedValueLiteral == null) {
            suggestedValueLiteral = new ArrayList<String>();
        }
        return this.suggestedValueLiteral;
    }

    /**
     * Gets the value of the valueID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getValueID() {
        return valueID;
    }

    /**
     * Sets the value of the valueID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setValueID(Integer value) {
        this.valueID = value;
    }

}
