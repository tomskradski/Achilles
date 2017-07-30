
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Custom listing header link.
 * 			
 * 
 * <p>Java class for StoreCustomListingHeaderLinkType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StoreCustomListingHeaderLinkType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LinkID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Order" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LinkType" type="{urn:ebay:apis:eBLBaseComponents}StoreCustomListingHeaderLinkCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StoreCustomListingHeaderLinkType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "linkID",
    "order",
    "linkType"
})
public class StoreCustomListingHeaderLinkType {

    @XmlElement(name = "LinkID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected int linkID;
    @XmlElement(name = "Order", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected int order;
    @XmlElement(name = "LinkType", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected StoreCustomListingHeaderLinkCodeType linkType;

    /**
     * Gets the value of the linkID property.
     * 
     */
    public int getLinkID() {
        return linkID;
    }

    /**
     * Sets the value of the linkID property.
     * 
     */
    public void setLinkID(int value) {
        this.linkID = value;
    }

    /**
     * Gets the value of the order property.
     * 
     */
    public int getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     */
    public void setOrder(int value) {
        this.order = value;
    }

    /**
     * Gets the value of the linkType property.
     * 
     * @return
     *     possible object is
     *     {@link StoreCustomListingHeaderLinkCodeType }
     *     
     */
    public StoreCustomListingHeaderLinkCodeType getLinkType() {
        return linkType;
    }

    /**
     * Sets the value of the linkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoreCustomListingHeaderLinkCodeType }
     *     
     */
    public void setLinkType(StoreCustomListingHeaderLinkCodeType value) {
        this.linkType = value;
    }

}
