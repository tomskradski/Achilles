
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				A list of NotificationEnable entries. Each entry specifies
 * 				one notification and whether it is enabled.
 * 			
 * 
 * <p>Java class for NotificationEnableArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotificationEnableArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NotificationEnable" type="{urn:ebay:apis:eBLBaseComponents}NotificationEnableType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationEnableArrayType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "notificationEnable"
})
public class NotificationEnableArrayType {

    @XmlElement(name = "NotificationEnable", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<NotificationEnableType> notificationEnable;

    /**
     * Gets the value of the notificationEnable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notificationEnable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotificationEnable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotificationEnableType }
     * 
     * 
     */
    public List<NotificationEnableType> getNotificationEnable() {
        if (notificationEnable == null) {
            notificationEnable = new ArrayList<NotificationEnableType>();
        }
        return this.notificationEnable;
    }

}
