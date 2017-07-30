
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
 * 				Retrieves one, many, or all Feedback records for a specific eBay user. There is a filter option in the call request to limit Feedback records to those that are received, or to those that are left for other buyers, as well as a filter option to limit Feedback records to those that are received as a buyer or seller.
 * 			
 * 
 * <p>Java class for GetFeedbackRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetFeedbackRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="UserID" type="{urn:ebay:apis:eBLBaseComponents}UserIDType" minOccurs="0"/>
 *         &lt;element name="FeedbackID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ItemID" type="{urn:ebay:apis:eBLBaseComponents}ItemIDType" minOccurs="0"/>
 *         &lt;element name="TransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CommentType" type="{urn:ebay:apis:eBLBaseComponents}CommentTypeCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FeedbackType" type="{urn:ebay:apis:eBLBaseComponents}FeedbackTypeCodeType" minOccurs="0"/>
 *         &lt;element name="Pagination" type="{urn:ebay:apis:eBLBaseComponents}PaginationType" minOccurs="0"/>
 *         &lt;element name="OrderLineItemID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetFeedbackRequestType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "userID",
    "feedbackID",
    "itemID",
    "transactionID",
    "commentType",
    "feedbackType",
    "pagination",
    "orderLineItemID"
})
public class GetFeedbackRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "UserID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String userID;
    @XmlElement(name = "FeedbackID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String feedbackID;
    @XmlElement(name = "ItemID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String itemID;
    @XmlElement(name = "TransactionID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String transactionID;
    @XmlElement(name = "CommentType", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected List<CommentTypeCodeType> commentType;
    @XmlElement(name = "FeedbackType", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected FeedbackTypeCodeType feedbackType;
    @XmlElement(name = "Pagination", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected PaginationType pagination;
    @XmlElement(name = "OrderLineItemID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String orderLineItemID;

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
     * Gets the value of the feedbackID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeedbackID() {
        return feedbackID;
    }

    /**
     * Sets the value of the feedbackID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeedbackID(String value) {
        this.feedbackID = value;
    }

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
     * Gets the value of the commentType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commentType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommentType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommentTypeCodeType }
     * 
     * 
     */
    public List<CommentTypeCodeType> getCommentType() {
        if (commentType == null) {
            commentType = new ArrayList<CommentTypeCodeType>();
        }
        return this.commentType;
    }

    /**
     * Gets the value of the feedbackType property.
     * 
     * @return
     *     possible object is
     *     {@link FeedbackTypeCodeType }
     *     
     */
    public FeedbackTypeCodeType getFeedbackType() {
        return feedbackType;
    }

    /**
     * Sets the value of the feedbackType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeedbackTypeCodeType }
     *     
     */
    public void setFeedbackType(FeedbackTypeCodeType value) {
        this.feedbackType = value;
    }

    /**
     * Gets the value of the pagination property.
     * 
     * @return
     *     possible object is
     *     {@link PaginationType }
     *     
     */
    public PaginationType getPagination() {
        return pagination;
    }

    /**
     * Sets the value of the pagination property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaginationType }
     *     
     */
    public void setPagination(PaginationType value) {
        this.pagination = value;
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
