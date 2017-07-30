
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Type used by the <b>AffiliateTrackingDetails</b> container, which is included in the <b>PlaceOffer</b> call to pass in eBay Partner Network affiliate-related data, so affiliates can earn commissions based on user activity and the number of calls made by the user's application.
 * 			
 * 
 * <p>Java class for AffiliateTrackingDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AffiliateTrackingDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TrackingID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TrackingPartnerCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ApplicationDeviceType" type="{urn:ebay:apis:eBLBaseComponents}ApplicationDeviceTypeCodeType" minOccurs="0"/>
 *         &lt;element name="AffiliateUserID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffiliateTrackingDetailsType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "trackingID",
    "trackingPartnerCode",
    "applicationDeviceType",
    "affiliateUserID"
})
public class AffiliateTrackingDetailsType {

    @XmlElement(name = "TrackingID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String trackingID;
    @XmlElement(name = "TrackingPartnerCode", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String trackingPartnerCode;
    @XmlElement(name = "ApplicationDeviceType", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected ApplicationDeviceTypeCodeType applicationDeviceType;
    @XmlElement(name = "AffiliateUserID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String affiliateUserID;

    /**
     * Gets the value of the trackingID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingID() {
        return trackingID;
    }

    /**
     * Sets the value of the trackingID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingID(String value) {
        this.trackingID = value;
    }

    /**
     * Gets the value of the trackingPartnerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingPartnerCode() {
        return trackingPartnerCode;
    }

    /**
     * Sets the value of the trackingPartnerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingPartnerCode(String value) {
        this.trackingPartnerCode = value;
    }

    /**
     * Gets the value of the applicationDeviceType property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationDeviceTypeCodeType }
     *     
     */
    public ApplicationDeviceTypeCodeType getApplicationDeviceType() {
        return applicationDeviceType;
    }

    /**
     * Sets the value of the applicationDeviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationDeviceTypeCodeType }
     *     
     */
    public void setApplicationDeviceType(ApplicationDeviceTypeCodeType value) {
        this.applicationDeviceType = value;
    }

    /**
     * Gets the value of the affiliateUserID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAffiliateUserID() {
        return affiliateUserID;
    }

    /**
     * Sets the value of the affiliateUserID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAffiliateUserID(String value) {
        this.affiliateUserID = value;
    }

}
