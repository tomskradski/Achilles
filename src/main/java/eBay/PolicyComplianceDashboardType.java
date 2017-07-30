
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
 * 				This type has been deprecated. 
 * 			
 * 
 * <p>Java class for PolicyComplianceDashboardType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PolicyComplianceDashboardType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Status" type="{urn:ebay:apis:eBLBaseComponents}PolicyComplianceStatusCodeType" minOccurs="0"/>
 *         &lt;element name="Alert" type="{urn:ebay:apis:eBLBaseComponents}SellerDashboardAlertType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolicyComplianceDashboardType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "status",
    "alert"
})
public class PolicyComplianceDashboardType {

    @XmlElement(name = "Status", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected PolicyComplianceStatusCodeType status;
    @XmlElement(name = "Alert", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<SellerDashboardAlertType> alert;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link PolicyComplianceStatusCodeType }
     *     
     */
    public PolicyComplianceStatusCodeType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyComplianceStatusCodeType }
     *     
     */
    public void setStatus(PolicyComplianceStatusCodeType value) {
        this.status = value;
    }

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
     * {@link SellerDashboardAlertType }
     * 
     * 
     */
    public List<SellerDashboardAlertType> getAlert() {
        if (alert == null) {
            alert = new ArrayList<SellerDashboardAlertType>();
        }
        return this.alert;
    }

}
