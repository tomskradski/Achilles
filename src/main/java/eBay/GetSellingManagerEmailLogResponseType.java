
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Returns the log of emails not sent.
 * 			
 * 
 * <p>Java class for GetSellingManagerEmailLogResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSellingManagerEmailLogResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="EmailLog" type="{urn:ebay:apis:eBLBaseComponents}SellingManagerEmailLogType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSellingManagerEmailLogResponseType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "emailLog"
})
public class GetSellingManagerEmailLogResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "EmailLog", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<SellingManagerEmailLogType> emailLog;

    /**
     * Gets the value of the emailLog property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emailLog property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmailLog().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SellingManagerEmailLogType }
     * 
     * 
     */
    public List<SellingManagerEmailLogType> getEmailLog() {
        if (emailLog == null) {
            emailLog = new ArrayList<SellingManagerEmailLogType>();
        }
        return this.emailLog;
    }

}
