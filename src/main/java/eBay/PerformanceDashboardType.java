
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
 * 				Type defining the <b>Performance</b> container returned in the 
 * 				<b>GetSellerDashboard</b> response. The <b>Performance</b> 
 * 				container consists of the seller's overall selling performance rating on all eBay sites 
 * 				on which the seller is sellling, as well as any alerts related to performance.
 * 			
 * 
 * <p>Java class for PerformanceDashboardType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PerformanceDashboardType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Site" type="{urn:ebay:apis:eBLBaseComponents}SiteCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Status" type="{urn:ebay:apis:eBLBaseComponents}PerformanceStatusCodeType" minOccurs="0"/>
 *         &lt;element name="Alert" type="{urn:ebay:apis:eBLBaseComponents}SellerDashboardAlertType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerformanceDashboardType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "site",
    "status",
    "alert"
})
public class PerformanceDashboardType {

    @XmlElement(name = "Site", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected List<SiteCodeType> site;
    @XmlElement(name = "Status", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected PerformanceStatusCodeType status;
    @XmlElement(name = "Alert", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected SellerDashboardAlertType alert;

    /**
     * Gets the value of the site property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the site property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSite().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SiteCodeType }
     * 
     * 
     */
    public List<SiteCodeType> getSite() {
        if (site == null) {
            site = new ArrayList<SiteCodeType>();
        }
        return this.site;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link PerformanceStatusCodeType }
     *     
     */
    public PerformanceStatusCodeType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link PerformanceStatusCodeType }
     *     
     */
    public void setStatus(PerformanceStatusCodeType value) {
        this.status = value;
    }

    /**
     * Gets the value of the alert property.
     * 
     * @return
     *     possible object is
     *     {@link SellerDashboardAlertType }
     *     
     */
    public SellerDashboardAlertType getAlert() {
        return alert;
    }

    /**
     * Sets the value of the alert property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellerDashboardAlertType }
     *     
     */
    public void setAlert(SellerDashboardAlertType value) {
        this.alert = value;
    }

}
