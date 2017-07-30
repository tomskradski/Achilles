
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Type defining the <b>TicketListingDetails</b> container, which is used in
 * 				an <b>Add</b>/<b>Revise</b>/<b>Relist</b> call to provide more details about event tickets.
 * 			
 * 
 * <p>Java class for TicketListingDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TicketListingDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EventTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Venue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrintedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrintedTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketListingDetailsType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "eventTitle",
    "venue",
    "printedDate",
    "printedTime"
})
public class TicketListingDetailsType {

    @XmlElement(name = "EventTitle", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String eventTitle;
    @XmlElement(name = "Venue", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String venue;
    @XmlElement(name = "PrintedDate", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String printedDate;
    @XmlElement(name = "PrintedTime", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String printedTime;

    /**
     * Gets the value of the eventTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventTitle() {
        return eventTitle;
    }

    /**
     * Sets the value of the eventTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventTitle(String value) {
        this.eventTitle = value;
    }

    /**
     * Gets the value of the venue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVenue() {
        return venue;
    }

    /**
     * Sets the value of the venue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVenue(String value) {
        this.venue = value;
    }

    /**
     * Gets the value of the printedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrintedDate() {
        return printedDate;
    }

    /**
     * Sets the value of the printedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrintedDate(String value) {
        this.printedDate = value;
    }

    /**
     * Gets the value of the printedTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrintedTime() {
        return printedTime;
    }

    /**
     * Sets the value of the printedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrintedTime(String value) {
        this.printedTime = value;
    }

}
