
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 			Type used by the Subscription container that is returned in GetStoreOptions to indicate the subscription level and monthly fee associated with the eBay Store.
 * 		
 * 
 * <p>Java class for StoreSubscriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StoreSubscriptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Level" type="{urn:ebay:apis:eBLBaseComponents}StoreSubscriptionLevelCodeType" minOccurs="0"/>
 *         &lt;element name="Fee" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StoreSubscriptionType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "level",
    "fee"
})
public class StoreSubscriptionType {

    @XmlElement(name = "Level", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected StoreSubscriptionLevelCodeType level;
    @XmlElement(name = "Fee", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType fee;

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link StoreSubscriptionLevelCodeType }
     *     
     */
    public StoreSubscriptionLevelCodeType getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoreSubscriptionLevelCodeType }
     *     
     */
    public void setLevel(StoreSubscriptionLevelCodeType value) {
        this.level = value;
    }

    /**
     * Gets the value of the fee property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getFee() {
        return fee;
    }

    /**
     * Sets the value of the fee property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setFee(AmountType value) {
        this.fee = value;
    }

}
