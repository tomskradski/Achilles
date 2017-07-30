
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * 				Contains all information describing a dispute.
 * 				<br/><br/>
 * 				<span class="tablenote"><strong>Note:</strong>
 * 					These are not eBay money back guarantee disputes.
 * 				</span>
 * 			
 * 
 * <p>Java class for DisputeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DisputeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DisputeID" type="{urn:ebay:apis:eBLBaseComponents}DisputeIDType" minOccurs="0"/>
 *         &lt;element name="DisputeRecordType" type="{urn:ebay:apis:eBLBaseComponents}DisputeRecordTypeCodeType" minOccurs="0"/>
 *         &lt;element name="DisputeState" type="{urn:ebay:apis:eBLBaseComponents}DisputeStateCodeType" minOccurs="0"/>
 *         &lt;element name="DisputeStatus" type="{urn:ebay:apis:eBLBaseComponents}DisputeStatusCodeType" minOccurs="0"/>
 *         &lt;element name="OtherPartyRole" type="{urn:ebay:apis:eBLBaseComponents}TradingRoleCodeType" minOccurs="0"/>
 *         &lt;element name="OtherPartyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserRole" type="{urn:ebay:apis:eBLBaseComponents}TradingRoleCodeType" minOccurs="0"/>
 *         &lt;element name="BuyerUserID" type="{urn:ebay:apis:eBLBaseComponents}UserIDType" minOccurs="0"/>
 *         &lt;element name="SellerUserID" type="{urn:ebay:apis:eBLBaseComponents}UserIDType" minOccurs="0"/>
 *         &lt;element name="TransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Item" type="{urn:ebay:apis:eBLBaseComponents}ItemType" minOccurs="0"/>
 *         &lt;element name="DisputeReason" type="{urn:ebay:apis:eBLBaseComponents}DisputeReasonCodeType" minOccurs="0"/>
 *         &lt;element name="DisputeExplanation" type="{urn:ebay:apis:eBLBaseComponents}DisputeExplanationCodeType" minOccurs="0"/>
 *         &lt;element name="DisputeCreditEligibility" type="{urn:ebay:apis:eBLBaseComponents}DisputeCreditEligibilityCodeType" minOccurs="0"/>
 *         &lt;element name="DisputeCreatedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DisputeModifiedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DisputeResolution" type="{urn:ebay:apis:eBLBaseComponents}DisputeResolutionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DisputeMessage" type="{urn:ebay:apis:eBLBaseComponents}DisputeMessageType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Escalation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PurchaseProtection" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OrderLineItemID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisputeType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "disputeID",
    "disputeRecordType",
    "disputeState",
    "disputeStatus",
    "otherPartyRole",
    "otherPartyName",
    "userRole",
    "buyerUserID",
    "sellerUserID",
    "transactionID",
    "item",
    "disputeReason",
    "disputeExplanation",
    "disputeCreditEligibility",
    "disputeCreatedTime",
    "disputeModifiedTime",
    "disputeResolution",
    "disputeMessage",
    "escalation",
    "purchaseProtection",
    "orderLineItemID"
})
public class DisputeType {

    @XmlElement(name = "DisputeID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String disputeID;
    @XmlElement(name = "DisputeRecordType", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected DisputeRecordTypeCodeType disputeRecordType;
    @XmlElement(name = "DisputeState", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected DisputeStateCodeType disputeState;
    @XmlElement(name = "DisputeStatus", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected DisputeStatusCodeType disputeStatus;
    @XmlElement(name = "OtherPartyRole", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected TradingRoleCodeType otherPartyRole;
    @XmlElement(name = "OtherPartyName", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String otherPartyName;
    @XmlElement(name = "UserRole", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected TradingRoleCodeType userRole;
    @XmlElement(name = "BuyerUserID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String buyerUserID;
    @XmlElement(name = "SellerUserID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String sellerUserID;
    @XmlElement(name = "TransactionID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String transactionID;
    @XmlElement(name = "Item", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected ItemType item;
    @XmlElement(name = "DisputeReason", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected DisputeReasonCodeType disputeReason;
    @XmlElement(name = "DisputeExplanation", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected DisputeExplanationCodeType disputeExplanation;
    @XmlElement(name = "DisputeCreditEligibility", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected DisputeCreditEligibilityCodeType disputeCreditEligibility;
    @XmlElement(name = "DisputeCreatedTime", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar disputeCreatedTime;
    @XmlElement(name = "DisputeModifiedTime", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar disputeModifiedTime;
    @XmlElement(name = "DisputeResolution", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<DisputeResolutionType> disputeResolution;
    @XmlElement(name = "DisputeMessage", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<DisputeMessageType> disputeMessage;
    @XmlElement(name = "Escalation", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean escalation;
    @XmlElement(name = "PurchaseProtection", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean purchaseProtection;
    @XmlElement(name = "OrderLineItemID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String orderLineItemID;

    /**
     * Gets the value of the disputeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisputeID() {
        return disputeID;
    }

    /**
     * Sets the value of the disputeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisputeID(String value) {
        this.disputeID = value;
    }

    /**
     * Gets the value of the disputeRecordType property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeRecordTypeCodeType }
     *     
     */
    public DisputeRecordTypeCodeType getDisputeRecordType() {
        return disputeRecordType;
    }

    /**
     * Sets the value of the disputeRecordType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeRecordTypeCodeType }
     *     
     */
    public void setDisputeRecordType(DisputeRecordTypeCodeType value) {
        this.disputeRecordType = value;
    }

    /**
     * Gets the value of the disputeState property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeStateCodeType }
     *     
     */
    public DisputeStateCodeType getDisputeState() {
        return disputeState;
    }

    /**
     * Sets the value of the disputeState property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeStateCodeType }
     *     
     */
    public void setDisputeState(DisputeStateCodeType value) {
        this.disputeState = value;
    }

    /**
     * Gets the value of the disputeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeStatusCodeType }
     *     
     */
    public DisputeStatusCodeType getDisputeStatus() {
        return disputeStatus;
    }

    /**
     * Sets the value of the disputeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeStatusCodeType }
     *     
     */
    public void setDisputeStatus(DisputeStatusCodeType value) {
        this.disputeStatus = value;
    }

    /**
     * Gets the value of the otherPartyRole property.
     * 
     * @return
     *     possible object is
     *     {@link TradingRoleCodeType }
     *     
     */
    public TradingRoleCodeType getOtherPartyRole() {
        return otherPartyRole;
    }

    /**
     * Sets the value of the otherPartyRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradingRoleCodeType }
     *     
     */
    public void setOtherPartyRole(TradingRoleCodeType value) {
        this.otherPartyRole = value;
    }

    /**
     * Gets the value of the otherPartyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherPartyName() {
        return otherPartyName;
    }

    /**
     * Sets the value of the otherPartyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherPartyName(String value) {
        this.otherPartyName = value;
    }

    /**
     * Gets the value of the userRole property.
     * 
     * @return
     *     possible object is
     *     {@link TradingRoleCodeType }
     *     
     */
    public TradingRoleCodeType getUserRole() {
        return userRole;
    }

    /**
     * Sets the value of the userRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradingRoleCodeType }
     *     
     */
    public void setUserRole(TradingRoleCodeType value) {
        this.userRole = value;
    }

    /**
     * Gets the value of the buyerUserID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyerUserID() {
        return buyerUserID;
    }

    /**
     * Sets the value of the buyerUserID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyerUserID(String value) {
        this.buyerUserID = value;
    }

    /**
     * Gets the value of the sellerUserID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerUserID() {
        return sellerUserID;
    }

    /**
     * Sets the value of the sellerUserID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerUserID(String value) {
        this.sellerUserID = value;
    }

    /**
     * Gets the value of the transactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionID() {
        return transactionID;
    }

    /**
     * Sets the value of the transactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionID(String value) {
        this.transactionID = value;
    }

    /**
     * Gets the value of the item property.
     * 
     * @return
     *     possible object is
     *     {@link ItemType }
     *     
     */
    public ItemType getItem() {
        return item;
    }

    /**
     * Sets the value of the item property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemType }
     *     
     */
    public void setItem(ItemType value) {
        this.item = value;
    }

    /**
     * Gets the value of the disputeReason property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeReasonCodeType }
     *     
     */
    public DisputeReasonCodeType getDisputeReason() {
        return disputeReason;
    }

    /**
     * Sets the value of the disputeReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeReasonCodeType }
     *     
     */
    public void setDisputeReason(DisputeReasonCodeType value) {
        this.disputeReason = value;
    }

    /**
     * Gets the value of the disputeExplanation property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeExplanationCodeType }
     *     
     */
    public DisputeExplanationCodeType getDisputeExplanation() {
        return disputeExplanation;
    }

    /**
     * Sets the value of the disputeExplanation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeExplanationCodeType }
     *     
     */
    public void setDisputeExplanation(DisputeExplanationCodeType value) {
        this.disputeExplanation = value;
    }

    /**
     * Gets the value of the disputeCreditEligibility property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeCreditEligibilityCodeType }
     *     
     */
    public DisputeCreditEligibilityCodeType getDisputeCreditEligibility() {
        return disputeCreditEligibility;
    }

    /**
     * Sets the value of the disputeCreditEligibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeCreditEligibilityCodeType }
     *     
     */
    public void setDisputeCreditEligibility(DisputeCreditEligibilityCodeType value) {
        this.disputeCreditEligibility = value;
    }

    /**
     * Gets the value of the disputeCreatedTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDisputeCreatedTime() {
        return disputeCreatedTime;
    }

    /**
     * Sets the value of the disputeCreatedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDisputeCreatedTime(XMLGregorianCalendar value) {
        this.disputeCreatedTime = value;
    }

    /**
     * Gets the value of the disputeModifiedTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDisputeModifiedTime() {
        return disputeModifiedTime;
    }

    /**
     * Sets the value of the disputeModifiedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDisputeModifiedTime(XMLGregorianCalendar value) {
        this.disputeModifiedTime = value;
    }

    /**
     * Gets the value of the disputeResolution property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disputeResolution property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisputeResolution().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DisputeResolutionType }
     * 
     * 
     */
    public List<DisputeResolutionType> getDisputeResolution() {
        if (disputeResolution == null) {
            disputeResolution = new ArrayList<DisputeResolutionType>();
        }
        return this.disputeResolution;
    }

    /**
     * Gets the value of the disputeMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disputeMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisputeMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DisputeMessageType }
     * 
     * 
     */
    public List<DisputeMessageType> getDisputeMessage() {
        if (disputeMessage == null) {
            disputeMessage = new ArrayList<DisputeMessageType>();
        }
        return this.disputeMessage;
    }

    /**
     * Gets the value of the escalation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEscalation() {
        return escalation;
    }

    /**
     * Sets the value of the escalation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEscalation(Boolean value) {
        this.escalation = value;
    }

    /**
     * Gets the value of the purchaseProtection property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPurchaseProtection() {
        return purchaseProtection;
    }

    /**
     * Sets the value of the purchaseProtection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPurchaseProtection(Boolean value) {
        this.purchaseProtection = value;
    }

    /**
     * Gets the value of the orderLineItemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderLineItemID() {
        return orderLineItemID;
    }

    /**
     * Sets the value of the orderLineItemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderLineItemID(String value) {
        this.orderLineItemID = value;
    }

}
