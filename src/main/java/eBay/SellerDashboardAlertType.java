
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				A message to help the you understand your status as a seller (PowerSeller status, 
 * 				policy compliance status, etc.).
 * 			
 * 
 * <p>Java class for SellerDashboardAlertType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SellerDashboardAlertType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Severity" type="{urn:ebay:apis:eBLBaseComponents}SellerDashboardAlertSeverityCodeType" minOccurs="0"/>
 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SellerDashboardAlertType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "severity",
    "text"
})
public class SellerDashboardAlertType {

    @XmlElement(name = "Severity", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected SellerDashboardAlertSeverityCodeType severity;
    @XmlElement(name = "Text", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String text;

    /**
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link SellerDashboardAlertSeverityCodeType }
     *     
     */
    public SellerDashboardAlertSeverityCodeType getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellerDashboardAlertSeverityCodeType }
     *     
     */
    public void setSeverity(SellerDashboardAlertSeverityCodeType value) {
        this.severity = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

}
