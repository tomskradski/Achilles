
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
 * 				Returns the listing recommendations (if applicable), the estimated fees for the proposed new listing (except the Final Value Fee, which isn't calculated until the item has sold), and other details.
 * 			
 * 
 * <p>Java class for VerifyAddItemResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VerifyAddItemResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="ItemID" type="{urn:ebay:apis:eBLBaseComponents}ItemIDType" minOccurs="0"/>
 *         &lt;element name="Fees" type="{urn:ebay:apis:eBLBaseComponents}FeesType" minOccurs="0"/>
 *         &lt;element name="ExpressListing" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ExpressItemRequirements" type="{urn:ebay:apis:eBLBaseComponents}ExpressItemRequirementsType" minOccurs="0"/>
 *         &lt;element name="CategoryID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Category2ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DiscountReason" type="{urn:ebay:apis:eBLBaseComponents}DiscountReasonCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ProductSuggestions" type="{urn:ebay:apis:eBLBaseComponents}ProductSuggestionsType" minOccurs="0"/>
 *         &lt;element name="ListingRecommendations" type="{urn:ebay:apis:eBLBaseComponents}ListingRecommendationsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerifyAddItemResponseType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "itemID",
    "fees",
    "expressListing",
    "expressItemRequirements",
    "categoryID",
    "category2ID",
    "discountReason",
    "productSuggestions",
    "listingRecommendations"
})
public class VerifyAddItemResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "ItemID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String itemID;
    @XmlElement(name = "Fees", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected FeesType fees;
    @XmlElement(name = "ExpressListing", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean expressListing;
    @XmlElement(name = "ExpressItemRequirements", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected ExpressItemRequirementsType expressItemRequirements;
    @XmlElement(name = "CategoryID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String categoryID;
    @XmlElement(name = "Category2ID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String category2ID;
    @XmlElement(name = "DiscountReason", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected List<DiscountReasonCodeType> discountReason;
    @XmlElement(name = "ProductSuggestions", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected ProductSuggestionsType productSuggestions;
    @XmlElement(name = "ListingRecommendations", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected ListingRecommendationsType listingRecommendations;

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
     * Gets the value of the fees property.
     * 
     * @return
     *     possible object is
     *     {@link FeesType }
     *     
     */
    public FeesType getFees() {
        return fees;
    }

    /**
     * Sets the value of the fees property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeesType }
     *     
     */
    public void setFees(FeesType value) {
        this.fees = value;
    }

    /**
     * Gets the value of the expressListing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExpressListing() {
        return expressListing;
    }

    /**
     * Sets the value of the expressListing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExpressListing(Boolean value) {
        this.expressListing = value;
    }

    /**
     * Gets the value of the expressItemRequirements property.
     * 
     * @return
     *     possible object is
     *     {@link ExpressItemRequirementsType }
     *     
     */
    public ExpressItemRequirementsType getExpressItemRequirements() {
        return expressItemRequirements;
    }

    /**
     * Sets the value of the expressItemRequirements property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpressItemRequirementsType }
     *     
     */
    public void setExpressItemRequirements(ExpressItemRequirementsType value) {
        this.expressItemRequirements = value;
    }

    /**
     * Gets the value of the categoryID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryID() {
        return categoryID;
    }

    /**
     * Sets the value of the categoryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryID(String value) {
        this.categoryID = value;
    }

    /**
     * Gets the value of the category2ID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory2ID() {
        return category2ID;
    }

    /**
     * Sets the value of the category2ID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory2ID(String value) {
        this.category2ID = value;
    }

    /**
     * Gets the value of the discountReason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the discountReason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiscountReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DiscountReasonCodeType }
     * 
     * 
     */
    public List<DiscountReasonCodeType> getDiscountReason() {
        if (discountReason == null) {
            discountReason = new ArrayList<DiscountReasonCodeType>();
        }
        return this.discountReason;
    }

    /**
     * Gets the value of the productSuggestions property.
     * 
     * @return
     *     possible object is
     *     {@link ProductSuggestionsType }
     *     
     */
    public ProductSuggestionsType getProductSuggestions() {
        return productSuggestions;
    }

    /**
     * Sets the value of the productSuggestions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductSuggestionsType }
     *     
     */
    public void setProductSuggestions(ProductSuggestionsType value) {
        this.productSuggestions = value;
    }

    /**
     * Gets the value of the listingRecommendations property.
     * 
     * @return
     *     possible object is
     *     {@link ListingRecommendationsType }
     *     
     */
    public ListingRecommendationsType getListingRecommendations() {
        return listingRecommendations;
    }

    /**
     * Sets the value of the listingRecommendations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListingRecommendationsType }
     *     
     */
    public void setListingRecommendations(ListingRecommendationsType value) {
        this.listingRecommendations = value;
    }

}
