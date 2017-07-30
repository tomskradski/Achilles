
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 			Returns token status.
 * 			
 * 
 * <p>Java class for GetTokenStatusResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetTokenStatusResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="TokenStatus" type="{urn:ebay:apis:eBLBaseComponents}TokenStatusType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetTokenStatusResponseType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "tokenStatus"
})
public class GetTokenStatusResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "TokenStatus", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected TokenStatusType tokenStatus;

    /**
     * Gets the value of the tokenStatus property.
     * 
     * @return
     *     possible object is
     *     {@link TokenStatusType }
     *     
     */
    public TokenStatusType getTokenStatus() {
        return tokenStatus;
    }

    /**
     * Sets the value of the tokenStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link TokenStatusType }
     *     
     */
    public void setTokenStatus(TokenStatusType value) {
        this.tokenStatus = value;
    }

}
