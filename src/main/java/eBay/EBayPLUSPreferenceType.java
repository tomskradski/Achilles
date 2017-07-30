
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Contains information about a country where a specified seller is eligible to offer eBay Plus on listings, as well as the seller's opt-in status and listing preference for that country. 
 * 				<br/><br/>
 * 				eBay Plus is a premium account option for buyers, which provides benefits such as fast free domestic shipping and free returns on selected items. Top Rated eBay sellers must opt in to eBay Plus to be able offer the program on qualifying listings. Sellers must commit to next-day delivery of those items.
 * 				<br/><br/>
 * 				<span class="tablenote">
 * 				<strong>Note:</strong> Currently, eBay Plus is available only to buyers in Germany (DE).
 * 				</span>
 * 				For more details about eBay Plus, see <a href="../../../../guides/ebayfeatures/Development/Feature-eBayPlus.html">Offering eBay Plus</a>.
 * 			
 * 
 * <p>Java class for eBayPLUSPreferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="eBayPLUSPreferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Country" type="{urn:ebay:apis:eBLBaseComponents}CountryCodeType" minOccurs="0"/>
 *         &lt;element name="OptInStatus" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ListingPreference" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eBayPLUSPreferenceType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "country",
    "optInStatus",
    "listingPreference"
})
public class EBayPLUSPreferenceType {

    @XmlElement(name = "Country", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected CountryCodeType country;
    @XmlElement(name = "OptInStatus", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean optInStatus;
    @XmlElement(name = "ListingPreference", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean listingPreference;

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCodeType }
     *     
     */
    public CountryCodeType getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCodeType }
     *     
     */
    public void setCountry(CountryCodeType value) {
        this.country = value;
    }

    /**
     * Gets the value of the optInStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOptInStatus() {
        return optInStatus;
    }

    /**
     * Sets the value of the optInStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOptInStatus(Boolean value) {
        this.optInStatus = value;
    }

    /**
     * Gets the value of the listingPreference property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isListingPreference() {
        return listingPreference;
    }

    /**
     * Sets the value of the listingPreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setListingPreference(Boolean value) {
        this.listingPreference = value;
    }

}
