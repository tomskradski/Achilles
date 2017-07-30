
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This type is used by the <b>DuplicateInvocationDetails</b> container that is returned in some calls if a duplicate <b>InvocationID</b> or <b>InvocationTrackingID</b> is used in the call request.
 * 			
 * 
 * <p>Java class for DuplicateInvocationDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DuplicateInvocationDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DuplicateInvocationID" type="{urn:ebay:apis:eBLBaseComponents}UUIDType" minOccurs="0"/>
 *         &lt;element name="Status" type="{urn:ebay:apis:eBLBaseComponents}InvocationStatusType" minOccurs="0"/>
 *         &lt;element name="InvocationTrackingID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DuplicateInvocationDetailsType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "duplicateInvocationID",
    "status",
    "invocationTrackingID"
})
public class DuplicateInvocationDetailsType {

    @XmlElement(name = "DuplicateInvocationID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String duplicateInvocationID;
    @XmlElement(name = "Status", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected InvocationStatusType status;
    @XmlElement(name = "InvocationTrackingID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String invocationTrackingID;

    /**
     * Gets the value of the duplicateInvocationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuplicateInvocationID() {
        return duplicateInvocationID;
    }

    /**
     * Sets the value of the duplicateInvocationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuplicateInvocationID(String value) {
        this.duplicateInvocationID = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link InvocationStatusType }
     *     
     */
    public InvocationStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvocationStatusType }
     *     
     */
    public void setStatus(InvocationStatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the invocationTrackingID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvocationTrackingID() {
        return invocationTrackingID;
    }

    /**
     * Sets the value of the invocationTrackingID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvocationTrackingID(String value) {
        this.invocationTrackingID = value;
    }

}
