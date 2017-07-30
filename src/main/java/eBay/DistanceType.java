
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This type is deprecated.
 * 			
 * 
 * <p>Java class for DistanceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DistanceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DistanceMeasurement" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DistanceUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistanceType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "distanceMeasurement",
    "distanceUnit"
})
public class DistanceType {

    @XmlElement(name = "DistanceMeasurement", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected int distanceMeasurement;
    @XmlElement(name = "DistanceUnit", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String distanceUnit;

    /**
     * Gets the value of the distanceMeasurement property.
     * 
     */
    public int getDistanceMeasurement() {
        return distanceMeasurement;
    }

    /**
     * Sets the value of the distanceMeasurement property.
     * 
     */
    public void setDistanceMeasurement(int value) {
        this.distanceMeasurement = value;
    }

    /**
     * Gets the value of the distanceUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistanceUnit() {
        return distanceUnit;
    }

    /**
     * Sets the value of the distanceUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistanceUnit(String value) {
        this.distanceUnit = value;
    }

}
