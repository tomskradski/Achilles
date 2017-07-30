
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Validate the user response to botblock challenge.
 * 			
 * 
 * <p>Java class for ValidateChallengeInputResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidateChallengeInputResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="ValidToken" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidateChallengeInputResponseType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "validToken"
})
public class ValidateChallengeInputResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "ValidToken", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean validToken;

    /**
     * Gets the value of the validToken property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isValidToken() {
        return validToken;
    }

    /**
     * Sets the value of the validToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setValidToken(Boolean value) {
        this.validToken = value;
    }

}
