
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * 			Defines the options available for an automated listing rule that
 * 			keeps a minimum number of items on the site.
 * 			
 * 
 * <p>Java class for SellingManagerAutoListMinActiveItemsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SellingManagerAutoListMinActiveItemsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MinActiveItemCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ListTimeFrom" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="ListTimeTo" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="SpacingIntervalInMinutes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ListingHoldInventoryLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SellingManagerAutoListMinActiveItemsType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "minActiveItemCount",
    "listTimeFrom",
    "listTimeTo",
    "spacingIntervalInMinutes",
    "listingHoldInventoryLevel"
})
public class SellingManagerAutoListMinActiveItemsType {

    @XmlElement(name = "MinActiveItemCount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer minActiveItemCount;
    @XmlElement(name = "ListTimeFrom", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar listTimeFrom;
    @XmlElement(name = "ListTimeTo", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar listTimeTo;
    @XmlElement(name = "SpacingIntervalInMinutes", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer spacingIntervalInMinutes;
    @XmlElement(name = "ListingHoldInventoryLevel", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer listingHoldInventoryLevel;

    /**
     * Gets the value of the minActiveItemCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinActiveItemCount() {
        return minActiveItemCount;
    }

    /**
     * Sets the value of the minActiveItemCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinActiveItemCount(Integer value) {
        this.minActiveItemCount = value;
    }

    /**
     * Gets the value of the listTimeFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getListTimeFrom() {
        return listTimeFrom;
    }

    /**
     * Sets the value of the listTimeFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setListTimeFrom(XMLGregorianCalendar value) {
        this.listTimeFrom = value;
    }

    /**
     * Gets the value of the listTimeTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getListTimeTo() {
        return listTimeTo;
    }

    /**
     * Sets the value of the listTimeTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setListTimeTo(XMLGregorianCalendar value) {
        this.listTimeTo = value;
    }

    /**
     * Gets the value of the spacingIntervalInMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSpacingIntervalInMinutes() {
        return spacingIntervalInMinutes;
    }

    /**
     * Sets the value of the spacingIntervalInMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSpacingIntervalInMinutes(Integer value) {
        this.spacingIntervalInMinutes = value;
    }

    /**
     * Gets the value of the listingHoldInventoryLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getListingHoldInventoryLevel() {
        return listingHoldInventoryLevel;
    }

    /**
     * Sets the value of the listingHoldInventoryLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setListingHoldInventoryLevel(Integer value) {
        this.listingHoldInventoryLevel = value;
    }

}
