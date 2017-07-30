
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * 				Retrieves information about the messages sent to a given user.
 * 			
 * 
 * <p>Java class for GetMyMessagesRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetMyMessagesRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="AlertIDs" type="{urn:ebay:apis:eBLBaseComponents}MyMessagesAlertIDArrayType" minOccurs="0"/>
 *         &lt;element name="MessageIDs" type="{urn:ebay:apis:eBLBaseComponents}MyMessagesMessageIDArrayType" minOccurs="0"/>
 *         &lt;element name="FolderID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ExternalMessageIDs" type="{urn:ebay:apis:eBLBaseComponents}MyMessagesExternalMessageIDArrayType" minOccurs="0"/>
 *         &lt;element name="Pagination" type="{urn:ebay:apis:eBLBaseComponents}PaginationType" minOccurs="0"/>
 *         &lt;element name="IncludeHighPriorityMessageOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetMyMessagesRequestType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "alertIDs",
    "messageIDs",
    "folderID",
    "startTime",
    "endTime",
    "externalMessageIDs",
    "pagination",
    "includeHighPriorityMessageOnly"
})
public class GetMyMessagesRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "AlertIDs", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected MyMessagesAlertIDArrayType alertIDs;
    @XmlElement(name = "MessageIDs", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected MyMessagesMessageIDArrayType messageIDs;
    @XmlElement(name = "FolderID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Long folderID;
    @XmlElement(name = "StartTime", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTime;
    @XmlElement(name = "EndTime", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endTime;
    @XmlElement(name = "ExternalMessageIDs", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected MyMessagesExternalMessageIDArrayType externalMessageIDs;
    @XmlElement(name = "Pagination", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected PaginationType pagination;
    @XmlElement(name = "IncludeHighPriorityMessageOnly", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean includeHighPriorityMessageOnly;

    /**
     * Gets the value of the alertIDs property.
     * 
     * @return
     *     possible object is
     *     {@link MyMessagesAlertIDArrayType }
     *     
     */
    public MyMessagesAlertIDArrayType getAlertIDs() {
        return alertIDs;
    }

    /**
     * Sets the value of the alertIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link MyMessagesAlertIDArrayType }
     *     
     */
    public void setAlertIDs(MyMessagesAlertIDArrayType value) {
        this.alertIDs = value;
    }

    /**
     * Gets the value of the messageIDs property.
     * 
     * @return
     *     possible object is
     *     {@link MyMessagesMessageIDArrayType }
     *     
     */
    public MyMessagesMessageIDArrayType getMessageIDs() {
        return messageIDs;
    }

    /**
     * Sets the value of the messageIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link MyMessagesMessageIDArrayType }
     *     
     */
    public void setMessageIDs(MyMessagesMessageIDArrayType value) {
        this.messageIDs = value;
    }

    /**
     * Gets the value of the folderID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFolderID() {
        return folderID;
    }

    /**
     * Sets the value of the folderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFolderID(Long value) {
        this.folderID = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTime(XMLGregorianCalendar value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndTime(XMLGregorianCalendar value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the externalMessageIDs property.
     * 
     * @return
     *     possible object is
     *     {@link MyMessagesExternalMessageIDArrayType }
     *     
     */
    public MyMessagesExternalMessageIDArrayType getExternalMessageIDs() {
        return externalMessageIDs;
    }

    /**
     * Sets the value of the externalMessageIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link MyMessagesExternalMessageIDArrayType }
     *     
     */
    public void setExternalMessageIDs(MyMessagesExternalMessageIDArrayType value) {
        this.externalMessageIDs = value;
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
     * Gets the value of the includeHighPriorityMessageOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeHighPriorityMessageOnly() {
        return includeHighPriorityMessageOnly;
    }

    /**
     * Sets the value of the includeHighPriorityMessageOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeHighPriorityMessageOnly(Boolean value) {
        this.includeHighPriorityMessageOnly = value;
    }

}
