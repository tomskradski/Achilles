
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This type is deprecated.
 * 			
 * 
 * <p>Java class for MyMessagesAlertIDArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MyMessagesAlertIDArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AlertID" type="{urn:ebay:apis:eBLBaseComponents}MyMessagesAlertIDType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MyMessagesAlertIDArrayType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "alertID"
})
public class MyMessagesAlertIDArrayType {

    @XmlElement(name = "AlertID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<String> alertID;

    /**
     * Gets the value of the alertID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alertID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlertID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAlertID() {
        if (alertID == null) {
            alertID = new ArrayList<String>();
        }
        return this.alertID;
    }

}
