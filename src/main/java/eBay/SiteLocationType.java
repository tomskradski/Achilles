
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Contains the data that defines a site-based filter (used when searching for 
 * 				items and filtering the search result set).
 * 			
 * 
 * <p>Java class for SiteLocationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SiteLocationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SiteID" type="{urn:ebay:apis:eBLBaseComponents}SiteIDFilterCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SiteLocationType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "siteID"
})
public class SiteLocationType {

    @XmlElement(name = "SiteID", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected SiteIDFilterCodeType siteID;

    /**
     * Gets the value of the siteID property.
     * 
     * @return
     *     possible object is
     *     {@link SiteIDFilterCodeType }
     *     
     */
    public SiteIDFilterCodeType getSiteID() {
        return siteID;
    }

    /**
     * Sets the value of the siteID property.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteIDFilterCodeType }
     *     
     */
    public void setSiteID(SiteIDFilterCodeType value) {
        this.siteID = value;
    }

}
