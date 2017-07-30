
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 					This type is deprecated.
 * 				
 * 
 * <p>Java class for LocalSearchType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocalSearchType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MaxDistance" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocalSearchType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "maxDistance",
    "postalCode"
})
public class LocalSearchType {

    @XmlElement(name = "MaxDistance", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected int maxDistance;
    @XmlElement(name = "PostalCode", namespace = "urn:ebay:apis:eBLBaseComponents", required = true)
    protected String postalCode;

    /**
     * Gets the value of the maxDistance property.
     * 
     */
    public int getMaxDistance() {
        return maxDistance;
    }

    /**
     * Sets the value of the maxDistance property.
     * 
     */
    public void setMaxDistance(int value) {
        this.maxDistance = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

}
