
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Contains the items, searches and sellers that the user has saved to this 
 * 				list using the "Add to list" feature.  The name of the list is given by the 
 * 				"Name" element.
 * 			
 * 
 * <p>Java class for UserDefinedListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserDefinedListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ItemCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FavoriteSearcheCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FavoriteSellerCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ItemArray" type="{urn:ebay:apis:eBLBaseComponents}ItemArrayType" minOccurs="0"/>
 *         &lt;element name="FavoriteSearches" type="{urn:ebay:apis:eBLBaseComponents}MyeBayFavoriteSearchListType" minOccurs="0"/>
 *         &lt;element name="FavoriteSellers" type="{urn:ebay:apis:eBLBaseComponents}MyeBayFavoriteSellerListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserDefinedListType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "name",
    "itemCount",
    "favoriteSearcheCount",
    "favoriteSellerCount",
    "itemArray",
    "favoriteSearches",
    "favoriteSellers"
})
public class UserDefinedListType {

    @XmlElement(name = "Name", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String name;
    @XmlElement(name = "ItemCount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer itemCount;
    @XmlElement(name = "FavoriteSearcheCount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer favoriteSearcheCount;
    @XmlElement(name = "FavoriteSellerCount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer favoriteSellerCount;
    @XmlElement(name = "ItemArray", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected ItemArrayType itemArray;
    @XmlElement(name = "FavoriteSearches", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected MyeBayFavoriteSearchListType favoriteSearches;
    @XmlElement(name = "FavoriteSellers", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected MyeBayFavoriteSellerListType favoriteSellers;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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
     * Gets the value of the favoriteSearcheCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFavoriteSearcheCount() {
        return favoriteSearcheCount;
    }

    /**
     * Sets the value of the favoriteSearcheCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFavoriteSearcheCount(Integer value) {
        this.favoriteSearcheCount = value;
    }

    /**
     * Gets the value of the favoriteSellerCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFavoriteSellerCount() {
        return favoriteSellerCount;
    }

    /**
     * Sets the value of the favoriteSellerCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFavoriteSellerCount(Integer value) {
        this.favoriteSellerCount = value;
    }

    /**
     * Gets the value of the itemArray property.
     * 
     * @return
     *     possible object is
     *     {@link ItemArrayType }
     *     
     */
    public ItemArrayType getItemArray() {
        return itemArray;
    }

    /**
     * Sets the value of the itemArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemArrayType }
     *     
     */
    public void setItemArray(ItemArrayType value) {
        this.itemArray = value;
    }

    /**
     * Gets the value of the favoriteSearches property.
     * 
     * @return
     *     possible object is
     *     {@link MyeBayFavoriteSearchListType }
     *     
     */
    public MyeBayFavoriteSearchListType getFavoriteSearches() {
        return favoriteSearches;
    }

    /**
     * Sets the value of the favoriteSearches property.
     * 
     * @param value
     *     allowed object is
     *     {@link MyeBayFavoriteSearchListType }
     *     
     */
    public void setFavoriteSearches(MyeBayFavoriteSearchListType value) {
        this.favoriteSearches = value;
    }

    /**
     * Gets the value of the favoriteSellers property.
     * 
     * @return
     *     possible object is
     *     {@link MyeBayFavoriteSellerListType }
     *     
     */
    public MyeBayFavoriteSellerListType getFavoriteSellers() {
        return favoriteSellers;
    }

    /**
     * Sets the value of the favoriteSellers property.
     * 
     * @param value
     *     allowed object is
     *     {@link MyeBayFavoriteSellerListType }
     *     
     */
    public void setFavoriteSellers(MyeBayFavoriteSellerListType value) {
        this.favoriteSellers = value;
    }

}
