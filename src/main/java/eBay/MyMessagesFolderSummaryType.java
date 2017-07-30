
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Summary details for a specified My Messages folder.
 * 			
 * 
 * <p>Java class for MyMessagesFolderSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MyMessagesFolderSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FolderID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="FolderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NewAlertCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NewMessageCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
@XmlType(name = "MyMessagesFolderSummaryType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "folderID",
    "folderName",
    "newAlertCount",
    "newMessageCount",
    "totalAlertCount",
    "totalMessageCount",
    "newHighPriorityCount",
    "totalHighPriorityCount"
})
public class MyMessagesFolderSummaryType {

    @XmlElement(name = "FolderID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Long folderID;
    @XmlElement(name = "FolderName", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String folderName;
    @XmlElement(name = "NewAlertCount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer newAlertCount;
    @XmlElement(name = "NewMessageCount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer newMessageCount;
    @XmlElement(name = "TotalAlertCount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer totalAlertCount;
    @XmlElement(name = "TotalMessageCount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer totalMessageCount;
    @XmlElement(name = "NewHighPriorityCount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer newHighPriorityCount;
    @XmlElement(name = "TotalHighPriorityCount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer totalHighPriorityCount;

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
     * Gets the value of the folderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolderName() {
        return folderName;
    }

    /**
     * Sets the value of the folderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolderName(String value) {
        this.folderName = value;
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
