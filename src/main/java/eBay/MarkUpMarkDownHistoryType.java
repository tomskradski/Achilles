
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				List of objects representing markup or markdown events for a given application
 * 				and time period. If no time period is specified in the request, the information
 * 				for only one day (24 hours before the time the call is made to the time the call
 * 				is made) is included. The maximum time period is allowed is 3 days (72 hours
 * 				before the call is made to the time the call is made).
 * 			
 * 
 * <p>Java class for MarkUpMarkDownHistoryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MarkUpMarkDownHistoryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MarkUpMarkDownEvent" type="{urn:ebay:apis:eBLBaseComponents}MarkUpMarkDownEventType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarkUpMarkDownHistoryType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "markUpMarkDownEvent"
})
public class MarkUpMarkDownHistoryType {

    @XmlElement(name = "MarkUpMarkDownEvent", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<MarkUpMarkDownEventType> markUpMarkDownEvent;

    /**
     * Gets the value of the markUpMarkDownEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the markUpMarkDownEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarkUpMarkDownEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MarkUpMarkDownEventType }
     * 
     * 
     */
    public List<MarkUpMarkDownEventType> getMarkUpMarkDownEvent() {
        if (markUpMarkDownEvent == null) {
            markUpMarkDownEvent = new ArrayList<MarkUpMarkDownEventType>();
        }
        return this.markUpMarkDownEvent;
    }

}
