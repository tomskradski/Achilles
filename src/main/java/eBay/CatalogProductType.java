
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This type is deprecated.
 * 			
 * 
 * <p>Java class for CatalogProductType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CatalogProductType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DetailsURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="StockPhotoURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="DisplayStockPhotos" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ItemCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ExternalProductID" type="{urn:ebay:apis:eBLBaseComponents}ExternalProductIDType" minOccurs="0"/>
 *         &lt;element name="ProductReferenceID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AttributeSetID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ItemSpecifics" type="{urn:ebay:apis:eBLBaseComponents}NameValueListArrayType" minOccurs="0"/>
 *         &lt;element name="ReviewCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ReviewDetails" type="{urn:ebay:apis:eBLBaseComponents}ReviewDetailsType" minOccurs="0"/>
 *         &lt;element name="ProductState" type="{urn:ebay:apis:eBLBaseComponents}ProductStateCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CatalogProductType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "title",
    "detailsURL",
    "stockPhotoURL",
    "displayStockPhotos",
    "itemCount",
    "externalProductID",
    "productReferenceID",
    "attributeSetID",
    "itemSpecifics",
    "reviewCount",
    "reviewDetails",
    "productState"
})
public class CatalogProductType {

    @XmlElement(name = "Title", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String title;
    @XmlElement(name = "DetailsURL", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "anyURI")
    protected String detailsURL;
    @XmlElement(name = "StockPhotoURL", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "anyURI")
    protected String stockPhotoURL;
    @XmlElement(name = "DisplayStockPhotos", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean displayStockPhotos;
    @XmlElement(name = "ItemCount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer itemCount;
    @XmlElement(name = "ExternalProductID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected ExternalProductIDType externalProductID;
    @XmlElement(name = "ProductReferenceID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Long productReferenceID;
    @XmlElement(name = "AttributeSetID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer attributeSetID;
    @XmlElement(name = "ItemSpecifics", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected NameValueListArrayType itemSpecifics;
    @XmlElement(name = "ReviewCount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer reviewCount;
    @XmlElement(name = "ReviewDetails", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected ReviewDetailsType reviewDetails;
    @XmlElement(name = "ProductState", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected ProductStateCodeType productState;

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the detailsURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetailsURL() {
        return detailsURL;
    }

    /**
     * Sets the value of the detailsURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetailsURL(String value) {
        this.detailsURL = value;
    }

    /**
     * Gets the value of the stockPhotoURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStockPhotoURL() {
        return stockPhotoURL;
    }

    /**
     * Sets the value of the stockPhotoURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStockPhotoURL(String value) {
        this.stockPhotoURL = value;
    }

    /**
     * Gets the value of the displayStockPhotos property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisplayStockPhotos() {
        return displayStockPhotos;
    }

    /**
     * Sets the value of the displayStockPhotos property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisplayStockPhotos(Boolean value) {
        this.displayStockPhotos = value;
    }

    /**
     * Gets the value of the itemCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getItemCount() {
        return itemCount;
    }

    /**
     * Sets the value of the itemCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setItemCount(Integer value) {
        this.itemCount = value;
    }

    /**
     * Gets the value of the externalProductID property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalProductIDType }
     *     
     */
    public ExternalProductIDType getExternalProductID() {
        return externalProductID;
    }

    /**
     * Sets the value of the externalProductID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalProductIDType }
     *     
     */
    public void setExternalProductID(ExternalProductIDType value) {
        this.externalProductID = value;
    }

    /**
     * Gets the value of the productReferenceID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProductReferenceID() {
        return productReferenceID;
    }

    /**
     * Sets the value of the productReferenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProductReferenceID(Long value) {
        this.productReferenceID = value;
    }

    /**
     * Gets the value of the attributeSetID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAttributeSetID() {
        return attributeSetID;
    }

    /**
     * Sets the value of the attributeSetID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAttributeSetID(Integer value) {
        this.attributeSetID = value;
    }

    /**
     * Gets the value of the itemSpecifics property.
     * 
     * @return
     *     possible object is
     *     {@link NameValueListArrayType }
     *     
     */
    public NameValueListArrayType getItemSpecifics() {
        return itemSpecifics;
    }

    /**
     * Sets the value of the itemSpecifics property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameValueListArrayType }
     *     
     */
    public void setItemSpecifics(NameValueListArrayType value) {
        this.itemSpecifics = value;
    }

    /**
     * Gets the value of the reviewCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReviewCount() {
        return reviewCount;
    }

    /**
     * Sets the value of the reviewCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReviewCount(Integer value) {
        this.reviewCount = value;
    }

    /**
     * Gets the value of the reviewDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ReviewDetailsType }
     *     
     */
    public ReviewDetailsType getReviewDetails() {
        return reviewDetails;
    }

    /**
     * Sets the value of the reviewDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReviewDetailsType }
     *     
     */
    public void setReviewDetails(ReviewDetailsType value) {
        this.reviewDetails = value;
    }

    /**
     * Gets the value of the productState property.
     * 
     * @return
     *     possible object is
     *     {@link ProductStateCodeType }
     *     
     */
    public ProductStateCodeType getProductState() {
        return productState;
    }

    /**
     * Sets the value of the productState property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductStateCodeType }
     *     
     */
    public void setProductState(ProductStateCodeType value) {
        this.productState = value;
    }

}
