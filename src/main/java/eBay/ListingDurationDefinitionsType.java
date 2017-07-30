
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				A container node for sets of durations, each set describing the durations allowed for
 * 				one listing type.
 * 			
 * 
 * <p>Java class for ListingDurationDefinitionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListingDurationDefinitionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListingDuration" type="{urn:ebay:apis:eBLBaseComponents}ListingDurationDefinitionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListingDurationDefinitionsType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "listingDuration"
})
public class ListingDurationDefinitionsType {

    @XmlElement(name = "ListingDuration", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<ListingDurationDefinitionType> listingDuration;
    @XmlAttribute(name = "Version")
    protected Integer version;

    /**
     * Gets the value of the listingDuration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listingDuration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListingDuration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListingDurationDefinitionType }
     * 
     * 
     */
    public List<ListingDurationDefinitionType> getListingDuration() {
        if (listingDuration == null) {
            listingDuration = new ArrayList<ListingDurationDefinitionType>();
        }
        return this.listingDuration;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVersion(Integer value) {
        this.version = value;
    }

}
