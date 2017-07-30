
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 	      This type is deprecated.
 * 			
 * 
 * <p>Java class for SIFFTASRecommendationsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SIFFTASRecommendationsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AttributeSetArray" type="{urn:ebay:apis:eBLBaseComponents}AttributeSetArrayType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SIFFTASRecommendationsType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "attributeSetArray"
})
public class SIFFTASRecommendationsType {

    @XmlElement(name = "AttributeSetArray", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AttributeSetArrayType attributeSetArray;

    /**
     * Gets the value of the attributeSetArray property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeSetArrayType }
     *     
     */
    public AttributeSetArrayType getAttributeSetArray() {
        return attributeSetArray;
    }

    /**
     * Sets the value of the attributeSetArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeSetArrayType }
     *     
     */
    public void setAttributeSetArray(AttributeSetArrayType value) {
        this.attributeSetArray = value;
    }

}
