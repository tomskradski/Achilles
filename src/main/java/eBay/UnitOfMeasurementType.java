
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This type is deprecated.
 * 			
 * 
 * <p>Java class for UnitOfMeasurementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnitOfMeasurementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AlternateText" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SuggestedText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnitOfMeasurementType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "alternateText",
    "suggestedText"
})
public class UnitOfMeasurementType {

    @XmlElement(name = "AlternateText", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<String> alternateText;
    @XmlElement(name = "SuggestedText", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String suggestedText;

    /**
     * Gets the value of the alternateText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternateText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternateText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAlternateText() {
        if (alternateText == null) {
            alternateText = new ArrayList<String>();
        }
        return this.alternateText;
    }

    /**
     * Gets the value of the suggestedText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuggestedText() {
        return suggestedText;
    }

    /**
     * Sets the value of the suggestedText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuggestedText(String value) {
        this.suggestedText = value;
    }

}
