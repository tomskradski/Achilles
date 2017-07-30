
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * 			  Contains a seller's cut off time preferences for same day handling for item shipping.
 * 			
 * 
 * <p>Java class for DispatchCutoffTimePreferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DispatchCutoffTimePreferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CutoffTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DispatchCutoffTimePreferencesType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "cutoffTime"
})
public class DispatchCutoffTimePreferencesType {

    @XmlElement(name = "CutoffTime", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar cutoffTime;

    /**
     * Gets the value of the cutoffTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCutoffTime() {
        return cutoffTime;
    }

    /**
     * Sets the value of the cutoffTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCutoffTime(XMLGregorianCalendar value) {
        this.cutoffTime = value;
    }

}
