
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Returns number of leads and contact and other information for each lead. One
 * 				AdFormatLead node is returned for each lead.
 * 			
 * 
 * <p>Java class for GetAdFormatLeadsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAdFormatLeadsResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="AdFormatLead" type="{urn:ebay:apis:eBLBaseComponents}AdFormatLeadType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AdFormatLeadCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAdFormatLeadsResponseType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "adFormatLead",
    "adFormatLeadCount"
})
public class GetAdFormatLeadsResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "AdFormatLead", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<AdFormatLeadType> adFormatLead;
    @XmlElement(name = "AdFormatLeadCount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer adFormatLeadCount;

    /**
     * Gets the value of the adFormatLead property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adFormatLead property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdFormatLead().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdFormatLeadType }
     * 
     * 
     */
    public List<AdFormatLeadType> getAdFormatLead() {
        if (adFormatLead == null) {
            adFormatLead = new ArrayList<AdFormatLeadType>();
        }
        return this.adFormatLead;
    }

    /**
     * Gets the value of the adFormatLeadCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAdFormatLeadCount() {
        return adFormatLeadCount;
    }

    /**
     * Sets the value of the adFormatLeadCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAdFormatLeadCount(Integer value) {
        this.adFormatLeadCount = value;
    }

}
