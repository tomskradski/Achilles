
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
 * <p>Java class for CrossPromotionPreferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CrossPromotionPreferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CrossPromotionEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CrossSellItemFormatSortFilter" type="{urn:ebay:apis:eBLBaseComponents}ItemFormatSortFilterCodeType" minOccurs="0"/>
 *         &lt;element name="CrossSellGallerySortFilter" type="{urn:ebay:apis:eBLBaseComponents}GallerySortFilterCodeType" minOccurs="0"/>
 *         &lt;element name="CrossSellItemSortFilter" type="{urn:ebay:apis:eBLBaseComponents}ItemSortFilterCodeType" minOccurs="0"/>
 *         &lt;element name="UpSellItemFormatSortFilter" type="{urn:ebay:apis:eBLBaseComponents}ItemFormatSortFilterCodeType" minOccurs="0"/>
 *         &lt;element name="UpSellGallerySortFilter" type="{urn:ebay:apis:eBLBaseComponents}GallerySortFilterCodeType" minOccurs="0"/>
 *         &lt;element name="UpSellItemSortFilter" type="{urn:ebay:apis:eBLBaseComponents}ItemSortFilterCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CrossPromotionPreferencesType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "crossPromotionEnabled",
    "crossSellItemFormatSortFilter",
    "crossSellGallerySortFilter",
    "crossSellItemSortFilter",
    "upSellItemFormatSortFilter",
    "upSellGallerySortFilter",
    "upSellItemSortFilter"
})
public class CrossPromotionPreferencesType {

    @XmlElement(name = "CrossPromotionEnabled", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean crossPromotionEnabled;
    @XmlElement(name = "CrossSellItemFormatSortFilter", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected ItemFormatSortFilterCodeType crossSellItemFormatSortFilter;
    @XmlElement(name = "CrossSellGallerySortFilter", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected GallerySortFilterCodeType crossSellGallerySortFilter;
    @XmlElement(name = "CrossSellItemSortFilter", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected ItemSortFilterCodeType crossSellItemSortFilter;
    @XmlElement(name = "UpSellItemFormatSortFilter", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected ItemFormatSortFilterCodeType upSellItemFormatSortFilter;
    @XmlElement(name = "UpSellGallerySortFilter", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected GallerySortFilterCodeType upSellGallerySortFilter;
    @XmlElement(name = "UpSellItemSortFilter", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected ItemSortFilterCodeType upSellItemSortFilter;

    /**
     * Gets the value of the crossPromotionEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCrossPromotionEnabled() {
        return crossPromotionEnabled;
    }

    /**
     * Sets the value of the crossPromotionEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCrossPromotionEnabled(Boolean value) {
        this.crossPromotionEnabled = value;
    }

    /**
     * Gets the value of the crossSellItemFormatSortFilter property.
     * 
     * @return
     *     possible object is
     *     {@link ItemFormatSortFilterCodeType }
     *     
     */
    public ItemFormatSortFilterCodeType getCrossSellItemFormatSortFilter() {
        return crossSellItemFormatSortFilter;
    }

    /**
     * Sets the value of the crossSellItemFormatSortFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemFormatSortFilterCodeType }
     *     
     */
    public void setCrossSellItemFormatSortFilter(ItemFormatSortFilterCodeType value) {
        this.crossSellItemFormatSortFilter = value;
    }

    /**
     * Gets the value of the crossSellGallerySortFilter property.
     * 
     * @return
     *     possible object is
     *     {@link GallerySortFilterCodeType }
     *     
     */
    public GallerySortFilterCodeType getCrossSellGallerySortFilter() {
        return crossSellGallerySortFilter;
    }

    /**
     * Sets the value of the crossSellGallerySortFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link GallerySortFilterCodeType }
     *     
     */
    public void setCrossSellGallerySortFilter(GallerySortFilterCodeType value) {
        this.crossSellGallerySortFilter = value;
    }

    /**
     * Gets the value of the crossSellItemSortFilter property.
     * 
     * @return
     *     possible object is
     *     {@link ItemSortFilterCodeType }
     *     
     */
    public ItemSortFilterCodeType getCrossSellItemSortFilter() {
        return crossSellItemSortFilter;
    }

    /**
     * Sets the value of the crossSellItemSortFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSortFilterCodeType }
     *     
     */
    public void setCrossSellItemSortFilter(ItemSortFilterCodeType value) {
        this.crossSellItemSortFilter = value;
    }

    /**
     * Gets the value of the upSellItemFormatSortFilter property.
     * 
     * @return
     *     possible object is
     *     {@link ItemFormatSortFilterCodeType }
     *     
     */
    public ItemFormatSortFilterCodeType getUpSellItemFormatSortFilter() {
        return upSellItemFormatSortFilter;
    }

    /**
     * Sets the value of the upSellItemFormatSortFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemFormatSortFilterCodeType }
     *     
     */
    public void setUpSellItemFormatSortFilter(ItemFormatSortFilterCodeType value) {
        this.upSellItemFormatSortFilter = value;
    }

    /**
     * Gets the value of the upSellGallerySortFilter property.
     * 
     * @return
     *     possible object is
     *     {@link GallerySortFilterCodeType }
     *     
     */
    public GallerySortFilterCodeType getUpSellGallerySortFilter() {
        return upSellGallerySortFilter;
    }

    /**
     * Sets the value of the upSellGallerySortFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link GallerySortFilterCodeType }
     *     
     */
    public void setUpSellGallerySortFilter(GallerySortFilterCodeType value) {
        this.upSellGallerySortFilter = value;
    }

    /**
     * Gets the value of the upSellItemSortFilter property.
     * 
     * @return
     *     possible object is
     *     {@link ItemSortFilterCodeType }
     *     
     */
    public ItemSortFilterCodeType getUpSellItemSortFilter() {
        return upSellItemSortFilter;
    }

    /**
     * Sets the value of the upSellItemSortFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSortFilterCodeType }
     *     
     */
    public void setUpSellItemSortFilter(ItemSortFilterCodeType value) {
        this.upSellItemSortFilter = value;
    }

}
