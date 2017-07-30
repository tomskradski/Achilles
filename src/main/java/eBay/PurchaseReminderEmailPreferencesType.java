
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 			  Contains a seller's preference for sending a "Payment Reminder Email" to buyers.
 * 			
 * 
 * <p>Java class for PurchaseReminderEmailPreferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PurchaseReminderEmailPreferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PurchaseReminderEmailPreferences" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PurchaseReminderEmailPreferencesType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "purchaseReminderEmailPreferences"
})
public class PurchaseReminderEmailPreferencesType {

    @XmlElement(name = "PurchaseReminderEmailPreferences", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean purchaseReminderEmailPreferences;

    /**
     * Gets the value of the purchaseReminderEmailPreferences property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPurchaseReminderEmailPreferences() {
        return purchaseReminderEmailPreferences;
    }

    /**
     * Sets the value of the purchaseReminderEmailPreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPurchaseReminderEmailPreferences(Boolean value) {
        this.purchaseReminderEmailPreferences = value;
    }

}
