
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 			This type is deprecated.
 * 			
 * 
 * <p>Java class for BidApprovalType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BidApprovalType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UserID" type="{urn:ebay:apis:eBLBaseComponents}UserIDType" minOccurs="0"/>
 *         &lt;element name="ApprovedBiddingLimit" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="DeclinedComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{urn:ebay:apis:eBLBaseComponents}BidderStatusCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BidApprovalType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "userID",
    "approvedBiddingLimit",
    "declinedComment",
    "status"
})
public class BidApprovalType {

    @XmlElement(name = "UserID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String userID;
    @XmlElement(name = "ApprovedBiddingLimit", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType approvedBiddingLimit;
    @XmlElement(name = "DeclinedComment", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String declinedComment;
    @XmlElement(name = "Status", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected BidderStatusCodeType status;

    /**
     * Gets the value of the userID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserID(String value) {
        this.userID = value;
    }

    /**
     * Gets the value of the approvedBiddingLimit property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getApprovedBiddingLimit() {
        return approvedBiddingLimit;
    }

    /**
     * Sets the value of the approvedBiddingLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setApprovedBiddingLimit(AmountType value) {
        this.approvedBiddingLimit = value;
    }

    /**
     * Gets the value of the declinedComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeclinedComment() {
        return declinedComment;
    }

    /**
     * Sets the value of the declinedComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeclinedComment(String value) {
        this.declinedComment = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link BidderStatusCodeType }
     *     
     */
    public BidderStatusCodeType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link BidderStatusCodeType }
     *     
     */
    public void setStatus(BidderStatusCodeType value) {
        this.status = value;
    }

}
