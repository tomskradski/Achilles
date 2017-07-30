
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This is the base request type for the <b>GeteBayDetails</b> call. This call retrieves the latest eBay feature-related metadata values that are supported when listing items. This metadata includes country codes, currency codes, Item Specifics thresholds, supported Return Policy values, available shipping carriers and shipping service options, and more. This call may be used to keep metadata up-to-date in your applications.
 * 				<br><br>
 * 				In some cases, the data returned in the response will vary according to the eBay site that you use for the request.
 * 			
 * 
 * <p>Java class for GeteBayDetailsRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeteBayDetailsRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="DetailName" type="{urn:ebay:apis:eBLBaseComponents}DetailNameCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeteBayDetailsRequestType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "detailName"
})
public class GeteBayDetailsRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "DetailName", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected List<DetailNameCodeType> detailName;

    /**
     * Gets the value of the detailName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detailName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetailName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailNameCodeType }
     * 
     * 
     */
    public List<DetailNameCodeType> getDetailName() {
        if (detailName == null) {
            detailName = new ArrayList<DetailNameCodeType>();
        }
        return this.detailName;
    }

}
