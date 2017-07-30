
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * 				Details the recoupment policy on this site.  There are two sites involved in recoupment - the listing site
 * 				and the user registration site, each of which must agree before eBay enforces recoupment for a seller and listing.
 * 			
 * 
 * <p>Java class for RecoupmentPolicyDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecoupmentPolicyDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EnforcedOnListingSite" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EnforcedOnRegistrationSite" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DetailVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UpdateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecoupmentPolicyDetailsType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "enforcedOnListingSite",
    "enforcedOnRegistrationSite",
    "detailVersion",
    "updateTime"
})
public class RecoupmentPolicyDetailsType {

    @XmlElement(name = "EnforcedOnListingSite", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean enforcedOnListingSite;
    @XmlElement(name = "EnforcedOnRegistrationSite", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean enforcedOnRegistrationSite;
    @XmlElement(name = "DetailVersion", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String detailVersion;
    @XmlElement(name = "UpdateTime", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updateTime;

    /**
     * Gets the value of the enforcedOnListingSite property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnforcedOnListingSite() {
        return enforcedOnListingSite;
    }

    /**
     * Sets the value of the enforcedOnListingSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnforcedOnListingSite(Boolean value) {
        this.enforcedOnListingSite = value;
    }

    /**
     * Gets the value of the enforcedOnRegistrationSite property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnforcedOnRegistrationSite() {
        return enforcedOnRegistrationSite;
    }

    /**
     * Sets the value of the enforcedOnRegistrationSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnforcedOnRegistrationSite(Boolean value) {
        this.enforcedOnRegistrationSite = value;
    }

    /**
     * Gets the value of the detailVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetailVersion() {
        return detailVersion;
    }

    /**
     * Sets the value of the detailVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetailVersion(String value) {
        this.detailVersion = value;
    }

    /**
     * Gets the value of the updateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdateTime() {
        return updateTime;
    }

    /**
     * Sets the value of the updateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdateTime(XMLGregorianCalendar value) {
        this.updateTime = value;
    }

}
