
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This type is deprecated.
 * 			
 * 
 * <p>Java class for BidGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BidGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BidGroupItem" type="{urn:ebay:apis:eBLBaseComponents}BidGroupItemType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BidGroupID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="BidGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BidGroupStatus" type="{urn:ebay:apis:eBLBaseComponents}BidGroupStatusCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BidGroupType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "bidGroupItem",
    "bidGroupID",
    "bidGroupName",
    "bidGroupStatus"
})
public class BidGroupType {

    @XmlElement(name = "BidGroupItem", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<BidGroupItemType> bidGroupItem;
    @XmlElement(name = "BidGroupID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Long bidGroupID;
    @XmlElement(name = "BidGroupName", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String bidGroupName;
    @XmlElement(name = "BidGroupStatus", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected BidGroupStatusCodeType bidGroupStatus;

    /**
     * Gets the value of the bidGroupItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bidGroupItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBidGroupItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BidGroupItemType }
     * 
     * 
     */
    public List<BidGroupItemType> getBidGroupItem() {
        if (bidGroupItem == null) {
            bidGroupItem = new ArrayList<BidGroupItemType>();
        }
        return this.bidGroupItem;
    }

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
     * Gets the value of the bidGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBidGroupName() {
        return bidGroupName;
    }

    /**
     * Sets the value of the bidGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBidGroupName(String value) {
        this.bidGroupName = value;
    }

    /**
     * Gets the value of the bidGroupStatus property.
     * 
     * @return
     *     possible object is
     *     {@link BidGroupStatusCodeType }
     *     
     */
    public BidGroupStatusCodeType getBidGroupStatus() {
        return bidGroupStatus;
    }

    /**
     * Sets the value of the bidGroupStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BidGroupStatusCodeType }
     *     
     */
    public void setBidGroupStatus(BidGroupStatusCodeType value) {
        this.bidGroupStatus = value;
    }

}
