
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Sets the preferences for a user's eBay Store.
 * 			
 * 
 * <p>Java class for SetStorePreferencesRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetStorePreferencesRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="StorePreferences" type="{urn:ebay:apis:eBLBaseComponents}StorePreferencesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetStorePreferencesRequestType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "storePreferences"
})
public class SetStorePreferencesRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "StorePreferences", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected StorePreferencesType storePreferences;

    /**
     * Gets the value of the storePreferences property.
     * 
     * @return
     *     possible object is
     *     {@link StorePreferencesType }
     *     
     */
    public StorePreferencesType getStorePreferences() {
        return storePreferences;
    }

    /**
     * Sets the value of the storePreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link StorePreferencesType }
     *     
     */
    public void setStorePreferences(StorePreferencesType value) {
        this.storePreferences = value;
    }

}
