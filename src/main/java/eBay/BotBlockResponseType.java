
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This type is used by the <b>BotBlock</b> container that is returned in the <b>PlaceOffer</b> call response if eBay is requiring that the user supply an authentication token and URL in order for eBay to process the <b>PlaceOffer</b> call. The authentication token and URL values that are returned in the <b>PlaceOffer</b> call response are then passed in the <b>BotBlock</b> container of a subsequent <b>PlaceOffer</b> call.
 * 			
 * 
 * <p>Java class for BotBlockResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BotBlockResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BotBlockToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BotBlockUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BotBlockAudioUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BotBlockResponseType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "botBlockToken",
    "botBlockUrl",
    "botBlockAudioUrl"
})
public class BotBlockResponseType {

    @XmlElement(name = "BotBlockToken", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String botBlockToken;
    @XmlElement(name = "BotBlockUrl", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String botBlockUrl;
    @XmlElement(name = "BotBlockAudioUrl", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String botBlockAudioUrl;

    /**
     * Gets the value of the botBlockToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBotBlockToken() {
        return botBlockToken;
    }

    /**
     * Sets the value of the botBlockToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBotBlockToken(String value) {
        this.botBlockToken = value;
    }

    /**
     * Gets the value of the botBlockUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBotBlockUrl() {
        return botBlockUrl;
    }

    /**
     * Sets the value of the botBlockUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBotBlockUrl(String value) {
        this.botBlockUrl = value;
    }

    /**
     * Gets the value of the botBlockAudioUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBotBlockAudioUrl() {
        return botBlockAudioUrl;
    }

    /**
     * Sets the value of the botBlockAudioUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBotBlockAudioUrl(String value) {
        this.botBlockAudioUrl = value;
    }

}
