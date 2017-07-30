
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Type defining the call-specific response fields for the <b>GetSellingManagerAlerts</b>
 * 				call.
 * 			
 * 
 * <p>Java class for GetSellingManagerAlertsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSellingManagerAlertsResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="Alert" type="{urn:ebay:apis:eBLBaseComponents}SellingManagerAlertType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSellingManagerAlertsResponseType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "alert"
})
public class GetSellingManagerAlertsResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "Alert", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<SellingManagerAlertType> alert;

    /**
     * Gets the value of the alert property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alert property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlert().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SellingManagerAlertType }
     * 
     * 
     */
    public List<SellingManagerAlertType> getAlert() {
        if (alert == null) {
            alert = new ArrayList<SellingManagerAlertType>();
        }
        return this.alert;
    }

}
