
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 			  Type defining the <b>SellerPaymentPreferences</b> container, which
 * 				consists of the seller's payment preferences. Payment preferences specified in a 
 * 				<b>SetUserPreferences</b> call override the settings in My eBay payment 
 * 				preferences.
 * 			
 * 
 * <p>Java class for SellerPaymentPreferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SellerPaymentPreferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AlwaysUseThisPaymentAddress" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DisplayPayNowButton" type="{urn:ebay:apis:eBLBaseComponents}DisplayPayNowButtonCodeType" minOccurs="0"/>
 *         &lt;element name="PayPalPreferred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DefaultPayPalEmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PayPalAlwaysOn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SellerPaymentAddress" type="{urn:ebay:apis:eBLBaseComponents}AddressType" minOccurs="0"/>
 *         &lt;element name="UPSRateOption" type="{urn:ebay:apis:eBLBaseComponents}UPSRateOptionCodeType" minOccurs="0"/>
 *         &lt;element name="FedExRateOption" type="{urn:ebay:apis:eBLBaseComponents}FedExRateOptionCodeType" minOccurs="0"/>
 *         &lt;element name="USPSRateOption" type="{urn:ebay:apis:eBLBaseComponents}USPSRateOptionCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SellerPaymentPreferencesType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "alwaysUseThisPaymentAddress",
    "displayPayNowButton",
    "payPalPreferred",
    "defaultPayPalEmailAddress",
    "payPalAlwaysOn",
    "sellerPaymentAddress",
    "upsRateOption",
    "fedExRateOption",
    "uspsRateOption"
})
public class SellerPaymentPreferencesType {

    @XmlElement(name = "AlwaysUseThisPaymentAddress", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean alwaysUseThisPaymentAddress;
    @XmlElement(name = "DisplayPayNowButton", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected DisplayPayNowButtonCodeType displayPayNowButton;
    @XmlElement(name = "PayPalPreferred", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean payPalPreferred;
    @XmlElement(name = "DefaultPayPalEmailAddress", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String defaultPayPalEmailAddress;
    @XmlElement(name = "PayPalAlwaysOn", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean payPalAlwaysOn;
    @XmlElement(name = "SellerPaymentAddress", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AddressType sellerPaymentAddress;
    @XmlElement(name = "UPSRateOption", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected UPSRateOptionCodeType upsRateOption;
    @XmlElement(name = "FedExRateOption", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected FedExRateOptionCodeType fedExRateOption;
    @XmlElement(name = "USPSRateOption", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected USPSRateOptionCodeType uspsRateOption;

    /**
     * Gets the value of the alwaysUseThisPaymentAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAlwaysUseThisPaymentAddress() {
        return alwaysUseThisPaymentAddress;
    }

    /**
     * Sets the value of the alwaysUseThisPaymentAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlwaysUseThisPaymentAddress(Boolean value) {
        this.alwaysUseThisPaymentAddress = value;
    }

    /**
     * Gets the value of the displayPayNowButton property.
     * 
     * @return
     *     possible object is
     *     {@link DisplayPayNowButtonCodeType }
     *     
     */
    public DisplayPayNowButtonCodeType getDisplayPayNowButton() {
        return displayPayNowButton;
    }

    /**
     * Sets the value of the displayPayNowButton property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisplayPayNowButtonCodeType }
     *     
     */
    public void setDisplayPayNowButton(DisplayPayNowButtonCodeType value) {
        this.displayPayNowButton = value;
    }

    /**
     * Gets the value of the payPalPreferred property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPayPalPreferred() {
        return payPalPreferred;
    }

    /**
     * Sets the value of the payPalPreferred property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPayPalPreferred(Boolean value) {
        this.payPalPreferred = value;
    }

    /**
     * Gets the value of the defaultPayPalEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultPayPalEmailAddress() {
        return defaultPayPalEmailAddress;
    }

    /**
     * Sets the value of the defaultPayPalEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultPayPalEmailAddress(String value) {
        this.defaultPayPalEmailAddress = value;
    }

    /**
     * Gets the value of the payPalAlwaysOn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPayPalAlwaysOn() {
        return payPalAlwaysOn;
    }

    /**
     * Sets the value of the payPalAlwaysOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPayPalAlwaysOn(Boolean value) {
        this.payPalAlwaysOn = value;
    }

    /**
     * Gets the value of the sellerPaymentAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getSellerPaymentAddress() {
        return sellerPaymentAddress;
    }

    /**
     * Sets the value of the sellerPaymentAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setSellerPaymentAddress(AddressType value) {
        this.sellerPaymentAddress = value;
    }

    /**
     * Gets the value of the upsRateOption property.
     * 
     * @return
     *     possible object is
     *     {@link UPSRateOptionCodeType }
     *     
     */
    public UPSRateOptionCodeType getUPSRateOption() {
        return upsRateOption;
    }

    /**
     * Sets the value of the upsRateOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link UPSRateOptionCodeType }
     *     
     */
    public void setUPSRateOption(UPSRateOptionCodeType value) {
        this.upsRateOption = value;
    }

    /**
     * Gets the value of the fedExRateOption property.
     * 
     * @return
     *     possible object is
     *     {@link FedExRateOptionCodeType }
     *     
     */
    public FedExRateOptionCodeType getFedExRateOption() {
        return fedExRateOption;
    }

    /**
     * Sets the value of the fedExRateOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link FedExRateOptionCodeType }
     *     
     */
    public void setFedExRateOption(FedExRateOptionCodeType value) {
        this.fedExRateOption = value;
    }

    /**
     * Gets the value of the uspsRateOption property.
     * 
     * @return
     *     possible object is
     *     {@link USPSRateOptionCodeType }
     *     
     */
    public USPSRateOptionCodeType getUSPSRateOption() {
        return uspsRateOption;
    }

    /**
     * Sets the value of the uspsRateOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link USPSRateOptionCodeType }
     *     
     */
    public void setUSPSRateOption(USPSRateOptionCodeType value) {
        this.uspsRateOption = value;
    }

}
