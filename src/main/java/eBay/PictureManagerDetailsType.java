
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PictureManagerDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PictureManagerDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubscriptionLevel" type="{urn:ebay:apis:eBLBaseComponents}PictureManagerSubscriptionLevelCodeType" minOccurs="0"/>
 *         &lt;element name="StorageUsed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TotalStorageAvailable" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="KeepOriginal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="WatermarkEPS" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="WatermarkUserID" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Folder" type="{urn:ebay:apis:eBLBaseComponents}PictureManagerFolderType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PictureManagerDetailsType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "subscriptionLevel",
    "storageUsed",
    "totalStorageAvailable",
    "keepOriginal",
    "watermarkEPS",
    "watermarkUserID",
    "folder"
})
public class PictureManagerDetailsType {

    @XmlElement(name = "SubscriptionLevel", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected PictureManagerSubscriptionLevelCodeType subscriptionLevel;
    @XmlElement(name = "StorageUsed", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer storageUsed;
    @XmlElement(name = "TotalStorageAvailable", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer totalStorageAvailable;
    @XmlElement(name = "KeepOriginal", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean keepOriginal;
    @XmlElement(name = "WatermarkEPS", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean watermarkEPS;
    @XmlElement(name = "WatermarkUserID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean watermarkUserID;
    @XmlElement(name = "Folder", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<PictureManagerFolderType> folder;

    /**
     * Gets the value of the subscriptionLevel property.
     * 
     * @return
     *     possible object is
     *     {@link PictureManagerSubscriptionLevelCodeType }
     *     
     */
    public PictureManagerSubscriptionLevelCodeType getSubscriptionLevel() {
        return subscriptionLevel;
    }

    /**
     * Sets the value of the subscriptionLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link PictureManagerSubscriptionLevelCodeType }
     *     
     */
    public void setSubscriptionLevel(PictureManagerSubscriptionLevelCodeType value) {
        this.subscriptionLevel = value;
    }

    /**
     * Gets the value of the storageUsed property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStorageUsed() {
        return storageUsed;
    }

    /**
     * Sets the value of the storageUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStorageUsed(Integer value) {
        this.storageUsed = value;
    }

    /**
     * Gets the value of the totalStorageAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalStorageAvailable() {
        return totalStorageAvailable;
    }

    /**
     * Sets the value of the totalStorageAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalStorageAvailable(Integer value) {
        this.totalStorageAvailable = value;
    }

    /**
     * Gets the value of the keepOriginal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKeepOriginal() {
        return keepOriginal;
    }

    /**
     * Sets the value of the keepOriginal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKeepOriginal(Boolean value) {
        this.keepOriginal = value;
    }

    /**
     * Gets the value of the watermarkEPS property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWatermarkEPS() {
        return watermarkEPS;
    }

    /**
     * Sets the value of the watermarkEPS property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWatermarkEPS(Boolean value) {
        this.watermarkEPS = value;
    }

    /**
     * Gets the value of the watermarkUserID property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWatermarkUserID() {
        return watermarkUserID;
    }

    /**
     * Sets the value of the watermarkUserID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWatermarkUserID(Boolean value) {
        this.watermarkUserID = value;
    }

    /**
     * Gets the value of the folder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the folder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFolder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PictureManagerFolderType }
     * 
     * 
     */
    public List<PictureManagerFolderType> getFolder() {
        if (folder == null) {
            folder = new ArrayList<PictureManagerFolderType>();
        }
        return this.folder;
    }

}
