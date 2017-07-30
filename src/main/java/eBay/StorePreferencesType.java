
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Store Preferences type.
 * 			
 * 
 * <p>Java class for StorePreferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StorePreferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VacationPreferences" type="{urn:ebay:apis:eBLBaseComponents}StoreVacationPreferencesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StorePreferencesType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "vacationPreferences"
})
public class StorePreferencesType {

    @XmlElement(name = "VacationPreferences", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected StoreVacationPreferencesType vacationPreferences;

    /**
     * Gets the value of the vacationPreferences property.
     * 
     * @return
     *     possible object is
     *     {@link StoreVacationPreferencesType }
     *     
     */
    public StoreVacationPreferencesType getVacationPreferences() {
        return vacationPreferences;
    }

    /**
     * Sets the value of the vacationPreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoreVacationPreferencesType }
     *     
     */
    public void setVacationPreferences(StoreVacationPreferencesType value) {
        this.vacationPreferences = value;
    }

}
