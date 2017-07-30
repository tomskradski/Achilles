
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Returns information about notifications sent to the given application
 * 				for the given ItemID. It will only be returned if ItemID was specified in the
 * 				input parameters.
 * 			
 * 
 * <p>Java class for NotificationDetailsArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotificationDetailsArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NotificationDetails" type="{urn:ebay:apis:eBLBaseComponents}NotificationDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationDetailsArrayType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "notificationDetails"
})
public class NotificationDetailsArrayType {

    @XmlElement(name = "NotificationDetails", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<NotificationDetailsType> notificationDetails;

    /**
     * Gets the value of the notificationDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notificationDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotificationDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotificationDetailsType }
     * 
     * 
     */
    public List<NotificationDetailsType> getNotificationDetails() {
        if (notificationDetails == null) {
            notificationDetails = new ArrayList<NotificationDetailsType>();
        }
        return this.notificationDetails;
    }

}
