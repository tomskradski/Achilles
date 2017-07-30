
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Type defining the <b>ReportedItem</b> container which is returned in the 
 * 				<b>GetVeROReportStatus</b> response. The <b>ReportedItem</b> 
 * 				container consists of the <b>ItemID</b> of the item that has infringed 
 * 				upon the seller's copyright, trademark, or intellectual property rights, as well as the
 * 				submission status of the VeRO Report.
 * 			
 * 
 * <p>Java class for VeROReportedItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VeROReportedItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ItemID" type="{urn:ebay:apis:eBLBaseComponents}ItemIDType" minOccurs="0"/>
 *         &lt;element name="ItemStatus" type="{urn:ebay:apis:eBLBaseComponents}VeROItemStatusCodeType" minOccurs="0"/>
 *         &lt;element name="ItemReasonForFailure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VeROReportedItemType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "itemID",
    "itemStatus",
    "itemReasonForFailure"
})
public class VeROReportedItemType {

    @XmlElement(name = "ItemID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String itemID;
    @XmlElement(name = "ItemStatus", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected VeROItemStatusCodeType itemStatus;
    @XmlElement(name = "ItemReasonForFailure", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String itemReasonForFailure;

    /**
     * Gets the value of the itemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemID() {
        return itemID;
    }

    /**
     * Sets the value of the itemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemID(String value) {
        this.itemID = value;
    }

    /**
     * Gets the value of the itemStatus property.
     * 
     * @return
     *     possible object is
     *     {@link VeROItemStatusCodeType }
     *     
     */
    public VeROItemStatusCodeType getItemStatus() {
        return itemStatus;
    }

    /**
     * Sets the value of the itemStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link VeROItemStatusCodeType }
     *     
     */
    public void setItemStatus(VeROItemStatusCodeType value) {
        this.itemStatus = value;
    }

    /**
     * Gets the value of the itemReasonForFailure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemReasonForFailure() {
        return itemReasonForFailure;
    }

    /**
     * Sets the value of the itemReasonForFailure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemReasonForFailure(String value) {
        this.itemReasonForFailure = value;
    }

}
