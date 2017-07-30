
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This is the base request type of the <b>GetMyeBayReminders</b> call. This call returns the total counts for My eBay Buying and/or My eBay Selling Reminders for a user.
 * 			
 * 
 * <p>Java class for GetMyeBayRemindersRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetMyeBayRemindersRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="BuyingReminders" type="{urn:ebay:apis:eBLBaseComponents}ReminderCustomizationType" minOccurs="0"/>
 *         &lt;element name="SellingReminders" type="{urn:ebay:apis:eBLBaseComponents}ReminderCustomizationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetMyeBayRemindersRequestType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "buyingReminders",
    "sellingReminders"
})
public class GetMyeBayRemindersRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "BuyingReminders", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected ReminderCustomizationType buyingReminders;
    @XmlElement(name = "SellingReminders", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected ReminderCustomizationType sellingReminders;

    /**
     * Gets the value of the buyingReminders property.
     * 
     * @return
     *     possible object is
     *     {@link ReminderCustomizationType }
     *     
     */
    public ReminderCustomizationType getBuyingReminders() {
        return buyingReminders;
    }

    /**
     * Sets the value of the buyingReminders property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReminderCustomizationType }
     *     
     */
    public void setBuyingReminders(ReminderCustomizationType value) {
        this.buyingReminders = value;
    }

    /**
     * Gets the value of the sellingReminders property.
     * 
     * @return
     *     possible object is
     *     {@link ReminderCustomizationType }
     *     
     */
    public ReminderCustomizationType getSellingReminders() {
        return sellingReminders;
    }

    /**
     * Sets the value of the sellingReminders property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReminderCustomizationType }
     *     
     */
    public void setSellingReminders(ReminderCustomizationType value) {
        this.sellingReminders = value;
    }

}
