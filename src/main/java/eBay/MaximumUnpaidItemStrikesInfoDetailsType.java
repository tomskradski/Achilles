
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Details of a buyer's maximum unpaid item strikes in a pre-defined time period. This is applicable only to sellers.
 * 
 * <p>Java class for MaximumUnpaidItemStrikesInfoDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaximumUnpaidItemStrikesInfoDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MaximumUnpaidItemStrikesCount" type="{urn:ebay:apis:eBLBaseComponents}MaximumUnpaidItemStrikesCountDetailsType" minOccurs="0"/>
 *         &lt;element name="MaximumUnpaidItemStrikesDuration" type="{urn:ebay:apis:eBLBaseComponents}MaximumUnpaidItemStrikesDurationDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaximumUnpaidItemStrikesInfoDetailsType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "maximumUnpaidItemStrikesCount",
    "maximumUnpaidItemStrikesDuration"
})
public class MaximumUnpaidItemStrikesInfoDetailsType {

    @XmlElement(name = "MaximumUnpaidItemStrikesCount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected MaximumUnpaidItemStrikesCountDetailsType maximumUnpaidItemStrikesCount;
    @XmlElement(name = "MaximumUnpaidItemStrikesDuration", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<MaximumUnpaidItemStrikesDurationDetailsType> maximumUnpaidItemStrikesDuration;

    /**
     * Gets the value of the maximumUnpaidItemStrikesCount property.
     * 
     * @return
     *     possible object is
     *     {@link MaximumUnpaidItemStrikesCountDetailsType }
     *     
     */
    public MaximumUnpaidItemStrikesCountDetailsType getMaximumUnpaidItemStrikesCount() {
        return maximumUnpaidItemStrikesCount;
    }

    /**
     * Sets the value of the maximumUnpaidItemStrikesCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumUnpaidItemStrikesCountDetailsType }
     *     
     */
    public void setMaximumUnpaidItemStrikesCount(MaximumUnpaidItemStrikesCountDetailsType value) {
        this.maximumUnpaidItemStrikesCount = value;
    }

    /**
     * Gets the value of the maximumUnpaidItemStrikesDuration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the maximumUnpaidItemStrikesDuration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaximumUnpaidItemStrikesDuration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaximumUnpaidItemStrikesDurationDetailsType }
     * 
     * 
     */
    public List<MaximumUnpaidItemStrikesDurationDetailsType> getMaximumUnpaidItemStrikesDuration() {
        if (maximumUnpaidItemStrikesDuration == null) {
            maximumUnpaidItemStrikesDuration = new ArrayList<MaximumUnpaidItemStrikesDurationDetailsType>();
        }
        return this.maximumUnpaidItemStrikesDuration;
    }

}
