
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Summary data for a given user's alerts and messages.
 * 				This includes the numbers of new alerts and messages,
 * 				unresolved alerts, flagged messages, and total alerts
 * 				and messages.
 * 			
 * 
 * <p>Java class for MyMessagesSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MyMessagesSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FolderSummary" type="{urn:ebay:apis:eBLBaseComponents}MyMessagesFolderSummaryType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NewAlertCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NewMessageCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UnresolvedAlertCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FlaggedMessageCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TotalAlertCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TotalMessageCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NewHighPriorityCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TotalHighPriorityCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MyMessagesSummaryType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "folderSummary",
    "newAlertCount",
    "newMessageCount",
    "unresolvedAlertCount",
    "flaggedMessageCount",
    "totalAlertCount",
    "totalMessageCount",
    "newHighPriorityCount",
    "totalHighPriorityCount"
})
public class MyMessagesSummaryType {

    @XmlElement(name = "FolderSummary", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<MyMessagesFolderSummaryType> folderSummary;
    @XmlElement(name = "NewAlertCount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer newAlertCount;
    @XmlElement(name = "NewMessageCount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer newMessageCount;
    @XmlElement(name = "UnresolvedAlertCount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer unresolvedAlertCount;
    @XmlElement(name = "FlaggedMessageCount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer flaggedMessageCount;
    @XmlElement(name = "TotalAlertCount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer totalAlertCount;
    @XmlElement(name = "TotalMessageCount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer totalMessageCount;
    @XmlElement(name = "NewHighPriorityCount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer newHighPriorityCount;
    @XmlElement(name = "TotalHighPriorityCount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer totalHighPriorityCount;

    /**
     * Gets the value of the folderSummary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the folderSummary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFolderSummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MyMessagesFolderSummaryType }
     * 
     * 
     */
    public List<MyMessagesFolderSummaryType> getFolderSummary() {
        if (folderSummary == null) {
            folderSummary = new ArrayList<MyMessagesFolderSummaryType>();
        }
        return this.folderSummary;
    }

    /**
     * Gets the value of the newAlertCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNewAlertCount() {
        return newAlertCount;
    }

    /**
     * Sets the value of the newAlertCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNewAlertCount(Integer value) {
        this.newAlertCount = value;
    }

    /**
     * Gets the value of the newMessageCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNewMessageCount() {
        return newMessageCount;
    }

    /**
     * Sets the value of the newMessageCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNewMessageCount(Integer value) {
        this.newMessageCount = value;
    }

    /**
     * Gets the value of the unresolvedAlertCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUnresolvedAlertCount() {
        return unresolvedAlertCount;
    }

    /**
     * Sets the value of the unresolvedAlertCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUnresolvedAlertCount(Integer value) {
        this.unresolvedAlertCount = value;
    }

    /**
     * Gets the value of the flaggedMessageCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFlaggedMessageCount() {
        return flaggedMessageCount;
    }

    /**
     * Sets the value of the flaggedMessageCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFlaggedMessageCount(Integer value) {
        this.flaggedMessageCount = value;
    }

    /**
     * Gets the value of the totalAlertCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalAlertCount() {
        return totalAlertCount;
    }

    /**
     * Sets the value of the totalAlertCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalAlertCount(Integer value) {
        this.totalAlertCount = value;
    }

    /**
     * Gets the value of the totalMessageCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalMessageCount() {
        return totalMessageCount;
    }

    /**
     * Sets the value of the totalMessageCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalMessageCount(Integer value) {
        this.totalMessageCount = value;
    }

    /**
     * Gets the value of the newHighPriorityCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNewHighPriorityCount() {
        return newHighPriorityCount;
    }

    /**
     * Sets the value of the newHighPriorityCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNewHighPriorityCount(Integer value) {
        this.newHighPriorityCount = value;
    }

    /**
     * Gets the value of the totalHighPriorityCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalHighPriorityCount() {
        return totalHighPriorityCount;
    }

    /**
     * Sets the value of the totalHighPriorityCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalHighPriorityCount(Integer value) {
        this.totalHighPriorityCount = value;
    }

}
