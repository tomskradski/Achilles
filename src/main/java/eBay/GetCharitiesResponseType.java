
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 			This is the base response type for the <b>GetCharities</b> call. This call is used to search for eBay for Charity nonprofit organizations. A <b>Charity</b> container is returned for each nonprofit organization that matches the criteria in the call request.
 * 			
 * 
 * <p>Java class for GetCharitiesResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCharitiesResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="Charity" type="{urn:ebay:apis:eBLBaseComponents}CharityInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCharitiesResponseType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "charity"
})
public class GetCharitiesResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "Charity", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<CharityInfoType> charity;

    /**
     * Gets the value of the charity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the charity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCharity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CharityInfoType }
     * 
     * 
     */
    public List<CharityInfoType> getCharity() {
        if (charity == null) {
            charity = new ArrayList<CharityInfoType>();
        }
        return this.charity;
    }

}
