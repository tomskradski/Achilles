
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Returned if the user is a Selling Manager user. Defines product information for Selling Manager
 * 				users.
 * 			
 * 
 * <p>Java class for SellingManagerProductDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SellingManagerProductDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CustomLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QuantityAvailable" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UnitCost" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="FolderID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="RestockAlert" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RestockThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="VendorInfo" type="{urn:ebay:apis:eBLBaseComponents}SellingManagerVendorDetailsType" minOccurs="0"/>
 *         &lt;element name="Note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SellingManagerProductDetailsType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "productName",
    "productID",
    "customLabel",
    "quantityAvailable",
    "unitCost",
    "folderID",
    "restockAlert",
    "restockThreshold",
    "vendorInfo",
    "note"
})
public class SellingManagerProductDetailsType {

    @XmlElement(name = "ProductName", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String productName;
    @XmlElement(name = "ProductID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Long productID;
    @XmlElement(name = "CustomLabel", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String customLabel;
    @XmlElement(name = "QuantityAvailable", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer quantityAvailable;
    @XmlElement(name = "UnitCost", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType unitCost;
    @XmlElement(name = "FolderID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Long folderID;
    @XmlElement(name = "RestockAlert", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean restockAlert;
    @XmlElement(name = "RestockThreshold", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer restockThreshold;
    @XmlElement(name = "VendorInfo", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected SellingManagerVendorDetailsType vendorInfo;
    @XmlElement(name = "Note", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String note;

    /**
     * Gets the value of the productName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets the value of the productName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
    }

    /**
     * Gets the value of the productID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProductID() {
        return productID;
    }

    /**
     * Sets the value of the productID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProductID(Long value) {
        this.productID = value;
    }

    /**
     * Gets the value of the customLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomLabel() {
        return customLabel;
    }

    /**
     * Sets the value of the customLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomLabel(String value) {
        this.customLabel = value;
    }

    /**
     * Gets the value of the quantityAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantityAvailable() {
        return quantityAvailable;
    }

    /**
     * Sets the value of the quantityAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantityAvailable(Integer value) {
        this.quantityAvailable = value;
    }

    /**
     * Gets the value of the unitCost property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getUnitCost() {
        return unitCost;
    }

    /**
     * Sets the value of the unitCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setUnitCost(AmountType value) {
        this.unitCost = value;
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
     * Gets the value of the restockAlert property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRestockAlert() {
        return restockAlert;
    }

    /**
     * Sets the value of the restockAlert property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRestockAlert(Boolean value) {
        this.restockAlert = value;
    }

    /**
     * Gets the value of the restockThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRestockThreshold() {
        return restockThreshold;
    }

    /**
     * Sets the value of the restockThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRestockThreshold(Integer value) {
        this.restockThreshold = value;
    }

    /**
     * Gets the value of the vendorInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SellingManagerVendorDetailsType }
     *     
     */
    public SellingManagerVendorDetailsType getVendorInfo() {
        return vendorInfo;
    }

    /**
     * Sets the value of the vendorInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellingManagerVendorDetailsType }
     *     
     */
    public void setVendorInfo(SellingManagerVendorDetailsType value) {
        this.vendorInfo = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

}
