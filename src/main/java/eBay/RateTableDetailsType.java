
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 			   This type is used to reference a seller's specific domestic and/or international shipping rate tables. Shipping rate tables allow sellers to configure specific shipping costs based on the shipping destinations and level of service (e.g. economy, standard, expedite, and one-day). Generally speaking, sellers want to use these shipping rate tables so they can charge a higher shipping cost to the buyer whenever shipping costs are higher for them as well. For example, shipping to Alaska or Hawaii is generally more expensive than shipping to any other of the 48 US states, or in regards to international shipping, shipping to some regions and countries are more expensive than others.
 *    			 <br><br>
 * 				 Sellers configure domestic and international shipping rate tables in My eBay Shipping Preferences. To apply shipping rate tables, the shipping cost type must be flat-rate.
 * 				 <br><br>
 * 				 For domestic shipping rate tables, the three supported domestic regions are Alaska & Hawaii, US Protectorates (e.g. Puerto Rico and Guam), and APO/FPO destinations, which are US military bases/locations outside of the continental US. In addition to setting one flat rate based on the destination and service level, the seller also has the option of adding an extra charge based on the weight of the shipping package, or they can add a surcharge instead.
 * 				 <br><br>
 * 				 For international shipping rate tables, specific rates may be set up for any and all geographical regions and individual countries within those regions. Similar to domestic shipping rate tables, the seller has the option of adding an extra charge based on the weight of the shipping package. Sellers cannot add a surcharge for international shipping.
 * 				 <br/><br/>
 * 				<span class="tablenote"><b>Note: </b> Currently, only one domestic and one international shipping rate table may be set up per seller account. However, the ability to create and use multiple domestic and international shipping rate tables (a maximum of 20 per seller account) will become available to US and Australia sellers later in June 2017, and this feature will roll out to UK and Germany sellers in July 2017. The new shipping rate tables will be set up and managed in My eBay Shipping Preferences or in Seller Hub. The <b>DomesticRateTableId</b> and <b>InternationalRateTableId</b> fields were added for Version 1019, but these fields will not be applicable until the new shipping rate tables are added to My eBay Shipping Preferences and Seller Hub, and the feature is wired on. Once the new shipping rate tables are wired on and available for use, sellers will not be able to mix and match shipping rate tables. They either have to use the original shipping rate tables (controlled with <b>DomesticRateTable</b> and <b>InternationalRateTable</b> fields), or the new shipping rate tables (controlled with <b>DomesticRateTableId</b> and <b>InternationalRateTableId</b> fields). The new shipping rate tables will have all of the functionality of the old shipping rate tables, plus the seller will have access to all domestic regions and not just the special regions such as Alaska & Hawaii, US Protectorates, and APO/FPO locations.
 * 				</span>
 * 			
 * 
 * <p>Java class for RateTableDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RateTableDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DomesticRateTable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InternationalRateTable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DomesticRateTableId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InternationalRateTableId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateTableDetailsType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "domesticRateTable",
    "internationalRateTable",
    "domesticRateTableId",
    "internationalRateTableId"
})
public class RateTableDetailsType {

    @XmlElement(name = "DomesticRateTable", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String domesticRateTable;
    @XmlElement(name = "InternationalRateTable", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String internationalRateTable;
    @XmlElement(name = "DomesticRateTableId", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String domesticRateTableId;
    @XmlElement(name = "InternationalRateTableId", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String internationalRateTableId;

    /**
     * Gets the value of the domesticRateTable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomesticRateTable() {
        return domesticRateTable;
    }

    /**
     * Sets the value of the domesticRateTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomesticRateTable(String value) {
        this.domesticRateTable = value;
    }

    /**
     * Gets the value of the internationalRateTable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternationalRateTable() {
        return internationalRateTable;
    }

    /**
     * Sets the value of the internationalRateTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternationalRateTable(String value) {
        this.internationalRateTable = value;
    }

    /**
     * Gets the value of the domesticRateTableId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomesticRateTableId() {
        return domesticRateTableId;
    }

    /**
     * Sets the value of the domesticRateTableId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomesticRateTableId(String value) {
        this.domesticRateTableId = value;
    }

    /**
     * Gets the value of the internationalRateTableId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternationalRateTableId() {
        return internationalRateTableId;
    }

    /**
     * Sets the value of the internationalRateTableId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternationalRateTableId(String value) {
        this.internationalRateTableId = value;
    }

}
