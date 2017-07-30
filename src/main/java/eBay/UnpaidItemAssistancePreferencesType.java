
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 			  This type defines the <b>UnpaidItemAssistancePreferences</b> container. This container is
 * 				used in <b>SetUserPreferences</b> to set the preferences related to the <b>Unpaid Item
 * 				Assistant</b> feature. The <b>UnpaidItemAssistancePreferences</b> container is also returned in
 * 				<b>GetUserPreferences</b> (if the <b>ShowUnpaidItemAssistancePreference</b> flag is included and
 * 				set to true in the request).
 * 				<br/><br/>
 * 				See the <a href="http://pages.ebay.com/help/sell/unpaid-item-assistant.html">Using Unpaid Item Assistant</a> Help topic for more information about setting up and using the Unpaid Item Assistant feature.
 * 			
 * 
 * <p>Java class for UnpaidItemAssistancePreferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnpaidItemAssistancePreferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DelayBeforeOpeningDispute" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OptInStatus" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AutoRelist" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RemoveAllExcludedUsers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ExcludedUser" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AutoOptDonationRefund" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnpaidItemAssistancePreferencesType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "delayBeforeOpeningDispute",
    "optInStatus",
    "autoRelist",
    "removeAllExcludedUsers",
    "excludedUser",
    "autoOptDonationRefund"
})
public class UnpaidItemAssistancePreferencesType {

    @XmlElement(name = "DelayBeforeOpeningDispute", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer delayBeforeOpeningDispute;
    @XmlElement(name = "OptInStatus", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean optInStatus;
    @XmlElement(name = "AutoRelist", namespace = "urn:ebay:apis:eBLBaseComponents", defaultValue = "false")
    protected Boolean autoRelist;
    @XmlElement(name = "RemoveAllExcludedUsers", namespace = "urn:ebay:apis:eBLBaseComponents", defaultValue = "false")
    protected Boolean removeAllExcludedUsers;
    @XmlElement(name = "ExcludedUser", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<String> excludedUser;
    @XmlElement(name = "AutoOptDonationRefund", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean autoOptDonationRefund;

    /**
     * Gets the value of the delayBeforeOpeningDispute property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDelayBeforeOpeningDispute() {
        return delayBeforeOpeningDispute;
    }

    /**
     * Sets the value of the delayBeforeOpeningDispute property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDelayBeforeOpeningDispute(Integer value) {
        this.delayBeforeOpeningDispute = value;
    }

    /**
     * Gets the value of the optInStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOptInStatus() {
        return optInStatus;
    }

    /**
     * Sets the value of the optInStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOptInStatus(Boolean value) {
        this.optInStatus = value;
    }

    /**
     * Gets the value of the autoRelist property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoRelist() {
        return autoRelist;
    }

    /**
     * Sets the value of the autoRelist property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoRelist(Boolean value) {
        this.autoRelist = value;
    }

    /**
     * Gets the value of the removeAllExcludedUsers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRemoveAllExcludedUsers() {
        return removeAllExcludedUsers;
    }

    /**
     * Sets the value of the removeAllExcludedUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRemoveAllExcludedUsers(Boolean value) {
        this.removeAllExcludedUsers = value;
    }

    /**
     * Gets the value of the excludedUser property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the excludedUser property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExcludedUser().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getExcludedUser() {
        if (excludedUser == null) {
            excludedUser = new ArrayList<String>();
        }
        return this.excludedUser;
    }

    /**
     * Gets the value of the autoOptDonationRefund property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoOptDonationRefund() {
        return autoOptDonationRefund;
    }

    /**
     * Sets the value of the autoOptDonationRefund property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoOptDonationRefund(Boolean value) {
        this.autoOptDonationRefund = value;
    }

}
