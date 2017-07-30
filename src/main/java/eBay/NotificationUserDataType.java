
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				User data related to notifications.
 * 			
 * 
 * <p>Java class for NotificationUserDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotificationUserDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SMSSubscription" type="{urn:ebay:apis:eBLBaseComponents}SMSSubscriptionType" minOccurs="0"/>
 *         &lt;element name="SummarySchedule" type="{urn:ebay:apis:eBLBaseComponents}SummaryEventScheduleType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ExternalUserData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationUserDataType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "smsSubscription",
    "summarySchedule",
    "externalUserData"
})
public class NotificationUserDataType {

    @XmlElement(name = "SMSSubscription", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected SMSSubscriptionType smsSubscription;
    @XmlElement(name = "SummarySchedule", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<SummaryEventScheduleType> summarySchedule;
    @XmlElement(name = "ExternalUserData", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String externalUserData;

    /**
     * Gets the value of the smsSubscription property.
     * 
     * @return
     *     possible object is
     *     {@link SMSSubscriptionType }
     *     
     */
    public SMSSubscriptionType getSMSSubscription() {
        return smsSubscription;
    }

    /**
     * Sets the value of the smsSubscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link SMSSubscriptionType }
     *     
     */
    public void setSMSSubscription(SMSSubscriptionType value) {
        this.smsSubscription = value;
    }

    /**
     * Gets the value of the summarySchedule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the summarySchedule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSummarySchedule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SummaryEventScheduleType }
     * 
     * 
     */
    public List<SummaryEventScheduleType> getSummarySchedule() {
        if (summarySchedule == null) {
            summarySchedule = new ArrayList<SummaryEventScheduleType>();
        }
        return this.summarySchedule;
    }

    /**
     * Gets the value of the externalUserData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalUserData() {
        return externalUserData;
    }

    /**
     * Sets the value of the externalUserData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalUserData(String value) {
        this.externalUserData = value;
    }

}
