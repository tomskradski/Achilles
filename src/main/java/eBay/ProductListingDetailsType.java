
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
 * 				Type used by the <b>ProductListingDetails</b> container, which is used by a seller in an add/revise/relist call to identify a product through a Global Trade Item Number (EAN, ISBN, UPC, etc.) or EPID. If that product identifier is matched to a product in the eBay catalog, some of the details for the product listing, such as item title, listing description, item specifics, and stock photo are prefilled.
 * 				<br>
 * 				<br>
 * 				<span class="tablenote"><b>Note:</b>
 * 				The <b>NameValueList</b> container was added in Version 997, but it is not yet available for use in Sandbox or Production environments. Ultimately, specifying product identifiers through the <b>NameValueList</b> container will replace the process of specifying product identifiers through the <b>BrandMPN</b> container, or through the <b>EAN</b>, <b>ISBN</b>, or <b>UPC</b> fields. See the documentation for the <b>NameValueList</b> container for more information on how product identifiers are specified through this container. For more information on effective dates on this feature change and transition, see the <a href="https://developer.ebay.com/devzone/guides/ebayfeatures/Development/Listing-AnItem.html#RequiredProductIdentifiersMandate">Required Product Identifiers Mandate</a>.
 * 				</span>
 * 			
 * 
 * <p>Java class for ProductListingDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductListingDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IncludeStockPhotoURL" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UseStockPhotoURLAsGallery" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="StockPhotoURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="Copyright" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ProductReferenceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DetailsURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="ProductDetailsURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="ReturnSearchResultOnDuplicates" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ISBN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UPC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BrandMPN" type="{urn:ebay:apis:eBLBaseComponents}BrandMPNType" minOccurs="0"/>
 *         &lt;element name="TicketListingDetails" type="{urn:ebay:apis:eBLBaseComponents}TicketListingDetailsType" minOccurs="0"/>
 *         &lt;element name="UseFirstProduct" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IncludeeBayProductDetails" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NameValueList" type="{urn:ebay:apis:eBLBaseComponents}NameValueListType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductListingDetailsType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "includeStockPhotoURL",
    "useStockPhotoURLAsGallery",
    "stockPhotoURL",
    "copyright",
    "productReferenceID",
    "detailsURL",
    "productDetailsURL",
    "returnSearchResultOnDuplicates",
    "isbn",
    "upc",
    "ean",
    "brandMPN",
    "ticketListingDetails",
    "useFirstProduct",
    "includeeBayProductDetails",
    "nameValueList"
})
public class ProductListingDetailsType {

    @XmlElement(name = "IncludeStockPhotoURL", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean includeStockPhotoURL;
    @XmlElement(name = "UseStockPhotoURLAsGallery", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean useStockPhotoURLAsGallery;
    @XmlElement(name = "StockPhotoURL", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "anyURI")
    protected String stockPhotoURL;
    @XmlElement(name = "Copyright", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<String> copyright;
    @XmlElement(name = "ProductReferenceID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String productReferenceID;
    @XmlElement(name = "DetailsURL", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "anyURI")
    protected String detailsURL;
    @XmlElement(name = "ProductDetailsURL", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "anyURI")
    protected String productDetailsURL;
    @XmlElement(name = "ReturnSearchResultOnDuplicates", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean returnSearchResultOnDuplicates;
    @XmlElement(name = "ISBN", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String isbn;
    @XmlElement(name = "UPC", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String upc;
    @XmlElement(name = "EAN", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String ean;
    @XmlElement(name = "BrandMPN", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected BrandMPNType brandMPN;
    @XmlElement(name = "TicketListingDetails", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected TicketListingDetailsType ticketListingDetails;
    @XmlElement(name = "UseFirstProduct", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean useFirstProduct;
    @XmlElement(name = "IncludeeBayProductDetails", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean includeeBayProductDetails;
    @XmlElement(name = "NameValueList", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<NameValueListType> nameValueList;

    /**
     * Gets the value of the includeStockPhotoURL property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeStockPhotoURL() {
        return includeStockPhotoURL;
    }

    /**
     * Sets the value of the includeStockPhotoURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeStockPhotoURL(Boolean value) {
        this.includeStockPhotoURL = value;
    }

    /**
     * Gets the value of the useStockPhotoURLAsGallery property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseStockPhotoURLAsGallery() {
        return useStockPhotoURLAsGallery;
    }

    /**
     * Sets the value of the useStockPhotoURLAsGallery property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseStockPhotoURLAsGallery(Boolean value) {
        this.useStockPhotoURLAsGallery = value;
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
     * Gets the value of the copyright property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the copyright property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCopyright().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCopyright() {
        if (copyright == null) {
            copyright = new ArrayList<String>();
        }
        return this.copyright;
    }

    /**
     * Gets the value of the productReferenceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductReferenceID() {
        return productReferenceID;
    }

    /**
     * Sets the value of the productReferenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductReferenceID(String value) {
        this.productReferenceID = value;
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
     * Gets the value of the productDetailsURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductDetailsURL() {
        return productDetailsURL;
    }

    /**
     * Sets the value of the productDetailsURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductDetailsURL(String value) {
        this.productDetailsURL = value;
    }

    /**
     * Gets the value of the returnSearchResultOnDuplicates property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnSearchResultOnDuplicates() {
        return returnSearchResultOnDuplicates;
    }

    /**
     * Sets the value of the returnSearchResultOnDuplicates property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnSearchResultOnDuplicates(Boolean value) {
        this.returnSearchResultOnDuplicates = value;
    }

    /**
     * Gets the value of the isbn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISBN() {
        return isbn;
    }

    /**
     * Sets the value of the isbn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISBN(String value) {
        this.isbn = value;
    }

    /**
     * Gets the value of the upc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUPC() {
        return upc;
    }

    /**
     * Sets the value of the upc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUPC(String value) {
        this.upc = value;
    }

    /**
     * Gets the value of the ean property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEAN() {
        return ean;
    }

    /**
     * Sets the value of the ean property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEAN(String value) {
        this.ean = value;
    }

    /**
     * Gets the value of the brandMPN property.
     * 
     * @return
     *     possible object is
     *     {@link BrandMPNType }
     *     
     */
    public BrandMPNType getBrandMPN() {
        return brandMPN;
    }

    /**
     * Sets the value of the brandMPN property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrandMPNType }
     *     
     */
    public void setBrandMPN(BrandMPNType value) {
        this.brandMPN = value;
    }

    /**
     * Gets the value of the ticketListingDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TicketListingDetailsType }
     *     
     */
    public TicketListingDetailsType getTicketListingDetails() {
        return ticketListingDetails;
    }

    /**
     * Sets the value of the ticketListingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketListingDetailsType }
     *     
     */
    public void setTicketListingDetails(TicketListingDetailsType value) {
        this.ticketListingDetails = value;
    }

    /**
     * Gets the value of the useFirstProduct property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseFirstProduct() {
        return useFirstProduct;
    }

    /**
     * Sets the value of the useFirstProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseFirstProduct(Boolean value) {
        this.useFirstProduct = value;
    }

    /**
     * Gets the value of the includeeBayProductDetails property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeeBayProductDetails() {
        return includeeBayProductDetails;
    }

    /**
     * Sets the value of the includeeBayProductDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeeBayProductDetails(Boolean value) {
        this.includeeBayProductDetails = value;
    }

    /**
     * Gets the value of the nameValueList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nameValueList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNameValueList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameValueListType }
     * 
     * 
     */
    public List<NameValueListType> getNameValueList() {
        if (nameValueList == null) {
            nameValueList = new ArrayList<NameValueListType>();
        }
        return this.nameValueList;
    }

}
