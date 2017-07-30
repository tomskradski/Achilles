
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * 				Retrieves all items the user is currently bidding on, and the ones they have won
 * 				or purchased.
 * 			
 * 
 * 
 * 					Retrieves all items the user is currently bidding on, and the ones they have won
 * 					or purchased.
 * 				
 * 
 * <p>Java class for GetBidderListRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetBidderListRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="ActiveItemsOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EndTimeFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EndTimeTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="UserID" type="{urn:ebay:apis:eBLBaseComponents}UserIDType" minOccurs="0"/>
 *         &lt;element name="GranularityLevel" type="{urn:ebay:apis:eBLBaseComponents}GranularityLevelCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetBidderListRequestType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "activeItemsOnly",
    "endTimeFrom",
    "endTimeTo",
    "userID",
    "granularityLevel"
})
public class GetBidderListRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "ActiveItemsOnly", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean activeItemsOnly;
    @XmlElement(name = "EndTimeFrom", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endTimeFrom;
    @XmlElement(name = "EndTimeTo", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endTimeTo;
    @XmlElement(name = "UserID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String userID;
    @XmlElement(name = "GranularityLevel", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected GranularityLevelCodeType granularityLevel;

    /**
     * Gets the value of the activeItemsOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActiveItemsOnly() {
        return activeItemsOnly;
    }

    /**
     * Sets the value of the activeItemsOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActiveItemsOnly(Boolean value) {
        this.activeItemsOnly = value;
    }

    /**
     * Gets the value of the endTimeFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndTimeFrom() {
        return endTimeFrom;
    }

    /**
     * Sets the value of the endTimeFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndTimeFrom(XMLGregorianCalendar value) {
        this.endTimeFrom = value;
    }

    /**
     * Gets the value of the endTimeTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndTimeTo() {
        return endTimeTo;
    }

    /**
     * Sets the value of the endTimeTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndTimeTo(XMLGregorianCalendar value) {
        this.endTimeTo = value;
    }

    /**
     * Gets the value of the userID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserID(String value) {
        this.userID = value;
    }

    /**
     * Gets the value of the granularityLevel property.
     * 
     * @return
     *     possible object is
     *     {@link GranularityLevelCodeType }
     *     
     */
    public GranularityLevelCodeType getGranularityLevel() {
        return granularityLevel;
    }

    /**
     * Sets the value of the granularityLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link GranularityLevelCodeType }
     *     
     */
    public void setGranularityLevel(GranularityLevelCodeType value) {
        this.granularityLevel = value;
    }

}
