
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 			Currently applies to tickets. May apply to other categories in the future.
 * 			
 * 
 * <p>Java class for QuantityInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuantityInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MinimumRemnantSet" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuantityInfoType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "minimumRemnantSet"
})
public class QuantityInfoType {

    @XmlElement(name = "MinimumRemnantSet", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer minimumRemnantSet;

    /**
     * Gets the value of the minimumRemnantSet property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinimumRemnantSet() {
        return minimumRemnantSet;
    }

    /**
     * Sets the value of the minimumRemnantSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinimumRemnantSet(Integer value) {
        this.minimumRemnantSet = value;
    }

}
