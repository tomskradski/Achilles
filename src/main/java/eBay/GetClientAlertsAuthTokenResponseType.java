
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * 				Returns a Client Alerts token.
 * 			
 * 
 * <p>Java class for GetClientAlertsAuthTokenResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetClientAlertsAuthTokenResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="ClientAlertsAuthToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HardExpirationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetClientAlertsAuthTokenResponseType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "clientAlertsAuthToken",
    "hardExpirationTime"
})
public class GetClientAlertsAuthTokenResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "ClientAlertsAuthToken", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String clientAlertsAuthToken;
    @XmlElement(name = "HardExpirationTime", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar hardExpirationTime;

    /**
     * Gets the value of the clientAlertsAuthToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientAlertsAuthToken() {
        return clientAlertsAuthToken;
    }

    /**
     * Sets the value of the clientAlertsAuthToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientAlertsAuthToken(String value) {
        this.clientAlertsAuthToken = value;
    }

    /**
     * Gets the value of the hardExpirationTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHardExpirationTime() {
        return hardExpirationTime;
    }

    /**
     * Sets the value of the hardExpirationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHardExpirationTime(XMLGregorianCalendar value) {
        this.hardExpirationTime = value;
    }

}
