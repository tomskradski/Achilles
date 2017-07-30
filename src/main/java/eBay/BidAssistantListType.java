
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This type is deprecated.
 * 			
 * 
 * <p>Java class for BidAssistantListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BidAssistantListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BidGroupID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="IncludeNotes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BidAssistantListType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "bidGroupID",
    "includeNotes"
})
public class BidAssistantListType {

    @XmlElement(name = "BidGroupID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Long bidGroupID;
    @XmlElement(name = "IncludeNotes", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean includeNotes;

    /**
     * Gets the value of the bidGroupID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBidGroupID() {
        return bidGroupID;
    }

    /**
     * Sets the value of the bidGroupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBidGroupID(Long value) {
        this.bidGroupID = value;
    }

    /**
     * Gets the value of the includeNotes property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeNotes() {
        return includeNotes;
    }

    /**
     * Sets the value of the includeNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeNotes(Boolean value) {
        this.includeNotes = value;
    }

}
