
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * 				Contains all information about a dispute resolution. A dispute
 * 				can have a resolution even if the seller does not receive payment.
 * 				The resolution can have various results, including a Final Value Fee credit to
 * 				the seller or a strike to the buyer.
 * 				<br/><br/>
 * 				<span class="tablenote"><strong>Note:</strong>
 * 					These are not eBay money back guarantee disputes.
 * 				</span>
 * 			
 * 
 * <p>Java class for DisputeResolutionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DisputeResolutionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DisputeResolutionRecordType" type="{urn:ebay:apis:eBLBaseComponents}DisputeResolutionRecordTypeCodeType" minOccurs="0"/>
 *         &lt;element name="DisputeResolutionReason" type="{urn:ebay:apis:eBLBaseComponents}DisputeResolutionReasonCodeType" minOccurs="0"/>
 *         &lt;element name="ResolutionTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisputeResolutionType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "disputeResolutionRecordType",
    "disputeResolutionReason",
    "resolutionTime"
})
public class DisputeResolutionType {

    @XmlElement(name = "DisputeResolutionRecordType", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected DisputeResolutionRecordTypeCodeType disputeResolutionRecordType;
    @XmlElement(name = "DisputeResolutionReason", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected DisputeResolutionReasonCodeType disputeResolutionReason;
    @XmlElement(name = "ResolutionTime", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar resolutionTime;

    /**
     * Gets the value of the disputeResolutionRecordType property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeResolutionRecordTypeCodeType }
     *     
     */
    public DisputeResolutionRecordTypeCodeType getDisputeResolutionRecordType() {
        return disputeResolutionRecordType;
    }

    /**
     * Sets the value of the disputeResolutionRecordType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeResolutionRecordTypeCodeType }
     *     
     */
    public void setDisputeResolutionRecordType(DisputeResolutionRecordTypeCodeType value) {
        this.disputeResolutionRecordType = value;
    }

    /**
     * Gets the value of the disputeResolutionReason property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeResolutionReasonCodeType }
     *     
     */
    public DisputeResolutionReasonCodeType getDisputeResolutionReason() {
        return disputeResolutionReason;
    }

    /**
     * Sets the value of the disputeResolutionReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeResolutionReasonCodeType }
     *     
     */
    public void setDisputeResolutionReason(DisputeResolutionReasonCodeType value) {
        this.disputeResolutionReason = value;
    }

    /**
     * Gets the value of the resolutionTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getResolutionTime() {
        return resolutionTime;
    }

    /**
     * Sets the value of the resolutionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setResolutionTime(XMLGregorianCalendar value) {
        this.resolutionTime = value;
    }

}
