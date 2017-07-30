
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Container for reason code details for all sites.
 * 			
 * 
 * <p>Java class for VeROReasonCodeDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VeROReasonCodeDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VeROSiteDetail" type="{urn:ebay:apis:eBLBaseComponents}VeROSiteDetailType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VeROReasonCodeDetailsType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "veROSiteDetail"
})
public class VeROReasonCodeDetailsType {

    @XmlElement(name = "VeROSiteDetail", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<VeROSiteDetailType> veROSiteDetail;

    /**
     * Gets the value of the veROSiteDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the veROSiteDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVeROSiteDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VeROSiteDetailType }
     * 
     * 
     */
    public List<VeROSiteDetailType> getVeROSiteDetail() {
        if (veROSiteDetail == null) {
            veROSiteDetail = new ArrayList<VeROSiteDetailType>();
        }
        return this.veROSiteDetail;
    }

}
