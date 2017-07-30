
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * 				This type is deprecated.
 * 			
 * 
 * <p>Java class for UserAgreementInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserAgreementInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Site" type="{urn:ebay:apis:eBLBaseComponents}SiteCodeType" minOccurs="0"/>
 *         &lt;element name="SellereBayPaymentProcessStatus" type="{urn:ebay:apis:eBLBaseComponents}SellereBayPaymentProcessStatusCodeType" minOccurs="0"/>
 *         &lt;element name="AcceptedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="SellereBayPaymentProcessEnableTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="UserAgreementURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserAgreementInfoType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "site",
    "sellereBayPaymentProcessStatus",
    "acceptedTime",
    "sellereBayPaymentProcessEnableTime",
    "userAgreementURL"
})
public class UserAgreementInfoType {

    @XmlElement(name = "Site", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected SiteCodeType site;
    @XmlElement(name = "SellereBayPaymentProcessStatus", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected SellereBayPaymentProcessStatusCodeType sellereBayPaymentProcessStatus;
    @XmlElement(name = "AcceptedTime", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar acceptedTime;
    @XmlElement(name = "SellereBayPaymentProcessEnableTime", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sellereBayPaymentProcessEnableTime;
    @XmlElement(name = "UserAgreementURL", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "anyURI")
    protected String userAgreementURL;

    /**
     * Gets the value of the site property.
     * 
     * @return
     *     possible object is
     *     {@link SiteCodeType }
     *     
     */
    public SiteCodeType getSite() {
        return site;
    }

    /**
     * Sets the value of the site property.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteCodeType }
     *     
     */
    public void setSite(SiteCodeType value) {
        this.site = value;
    }

    /**
     * Gets the value of the sellereBayPaymentProcessStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SellereBayPaymentProcessStatusCodeType }
     *     
     */
    public SellereBayPaymentProcessStatusCodeType getSellereBayPaymentProcessStatus() {
        return sellereBayPaymentProcessStatus;
    }

    /**
     * Sets the value of the sellereBayPaymentProcessStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellereBayPaymentProcessStatusCodeType }
     *     
     */
    public void setSellereBayPaymentProcessStatus(SellereBayPaymentProcessStatusCodeType value) {
        this.sellereBayPaymentProcessStatus = value;
    }

    /**
     * Gets the value of the acceptedTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAcceptedTime() {
        return acceptedTime;
    }

    /**
     * Sets the value of the acceptedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAcceptedTime(XMLGregorianCalendar value) {
        this.acceptedTime = value;
    }

    /**
     * Gets the value of the sellereBayPaymentProcessEnableTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSellereBayPaymentProcessEnableTime() {
        return sellereBayPaymentProcessEnableTime;
    }

    /**
     * Sets the value of the sellereBayPaymentProcessEnableTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSellereBayPaymentProcessEnableTime(XMLGregorianCalendar value) {
        this.sellereBayPaymentProcessEnableTime = value;
    }

    /**
     * Gets the value of the userAgreementURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserAgreementURL() {
        return userAgreementURL;
    }

    /**
     * Sets the value of the userAgreementURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserAgreementURL(String value) {
        this.userAgreementURL = value;
    }

}
