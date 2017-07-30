
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This type defines the <b>Storefront</b> container, which can be used by eBay Stores sellers to list an item under two primary custom categories either by category ID or category name. A custom category is a category that was created by a seller in their eBay store. This container is used by Add/Revise/Relist calls.
 * 				<br/><br/>
 * 				The <b>Storefront</b> container is also returned in <b>GetItem</b> and other Trading calls that retrieve Item data.
 * 				<br/><br/>
 * 				<span class="tablenote"><b>Note: </b>
 * 				This type is applicable only for eBay Store sellers.
 * 				</span>  <br/><br/>
 *  			
 * 
 * <p>Java class for StorefrontType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StorefrontType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StoreCategoryID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="StoreCategory2ID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="StoreCategoryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StoreCategory2Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StoreURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="StoreName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StorefrontType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "storeCategoryID",
    "storeCategory2ID",
    "storeCategoryName",
    "storeCategory2Name",
    "storeURL",
    "storeName"
})
public class StorefrontType {

    @XmlElement(name = "StoreCategoryID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected long storeCategoryID;
    @XmlElement(name = "StoreCategory2ID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected long storeCategory2ID;
    @XmlElement(name = "StoreCategoryName", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String storeCategoryName;
    @XmlElement(name = "StoreCategory2Name", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String storeCategory2Name;
    @XmlElement(name = "StoreURL", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "anyURI")
    protected String storeURL;
    @XmlElement(name = "StoreName", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String storeName;

    /**
     * Gets the value of the storeCategoryID property.
     * 
     */
    public long getStoreCategoryID() {
        return storeCategoryID;
    }

    /**
     * Sets the value of the storeCategoryID property.
     * 
     */
    public void setStoreCategoryID(long value) {
        this.storeCategoryID = value;
    }

    /**
     * Gets the value of the storeCategory2ID property.
     * 
     */
    public long getStoreCategory2ID() {
        return storeCategory2ID;
    }

    /**
     * Sets the value of the storeCategory2ID property.
     * 
     */
    public void setStoreCategory2ID(long value) {
        this.storeCategory2ID = value;
    }

    /**
     * Gets the value of the storeCategoryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreCategoryName() {
        return storeCategoryName;
    }

    /**
     * Sets the value of the storeCategoryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreCategoryName(String value) {
        this.storeCategoryName = value;
    }

    /**
     * Gets the value of the storeCategory2Name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreCategory2Name() {
        return storeCategory2Name;
    }

    /**
     * Sets the value of the storeCategory2Name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreCategory2Name(String value) {
        this.storeCategory2Name = value;
    }

    /**
     * Gets the value of the storeURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreURL() {
        return storeURL;
    }

    /**
     * Sets the value of the storeURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreURL(String value) {
        this.storeURL = value;
    }

    /**
     * Gets the value of the storeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreName() {
        return storeName;
    }

    /**
     * Sets the value of the storeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreName(String value) {
        this.storeName = value;
    }

}