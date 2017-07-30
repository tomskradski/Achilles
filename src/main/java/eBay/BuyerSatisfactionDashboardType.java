
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
 * 				Type defining the <b>BuyerSatisfaction</b> container returned in the 
 * 				<b>GetSellerDashboard</b> response. The <b>BuyerSatisfaction</b> 
 * 				container consists of the seller's buyer satisfaction rating, as well as any alerts
 * 				related to customer service.
 * 			
 * 
 * <p>Java class for BuyerSatisfactionDashboardType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BuyerSatisfactionDashboardType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Status" type="{urn:ebay:apis:eBLBaseComponents}BuyerSatisfactionStatusCodeType" minOccurs="0"/>
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
@XmlType(name = "BuyerSatisfactionDashboardType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "status",
    "alert"
})
public class BuyerSatisfactionDashboardType {

    @XmlElement(name = "Status", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected BuyerSatisfactionStatusCodeType status;
    @XmlElement(name = "Alert", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<SellerDashboardAlertType> alert;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link BuyerSatisfactionStatusCodeType }
     *     
     */
    public BuyerSatisfactionStatusCodeType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuyerSatisfactionStatusCodeType }
     *     
     */
    public void setStatus(BuyerSatisfactionStatusCodeType value) {
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
