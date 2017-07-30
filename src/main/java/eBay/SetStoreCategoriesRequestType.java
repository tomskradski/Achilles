
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Changes the category structure of an eBay store.
 * 			
 * 
 * <p>Java class for SetStoreCategoriesRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetStoreCategoriesRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="Action" type="{urn:ebay:apis:eBLBaseComponents}StoreCategoryUpdateActionCodeType" minOccurs="0"/>
 *         &lt;element name="ItemDestinationCategoryID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="DestinationParentCategoryID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="StoreCategories" type="{urn:ebay:apis:eBLBaseComponents}StoreCustomCategoryArrayType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetStoreCategoriesRequestType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "action",
    "itemDestinationCategoryID",
    "destinationParentCategoryID",
    "storeCategories"
})
public class SetStoreCategoriesRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "Action", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected StoreCategoryUpdateActionCodeType action;
    @XmlElement(name = "ItemDestinationCategoryID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Long itemDestinationCategoryID;
    @XmlElement(name = "DestinationParentCategoryID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Long destinationParentCategoryID;
    @XmlElement(name = "StoreCategories", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected StoreCustomCategoryArrayType storeCategories;

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link StoreCategoryUpdateActionCodeType }
     *     
     */
    public StoreCategoryUpdateActionCodeType getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoreCategoryUpdateActionCodeType }
     *     
     */
    public void setAction(StoreCategoryUpdateActionCodeType value) {
        this.action = value;
    }

    /**
     * Gets the value of the itemDestinationCategoryID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getItemDestinationCategoryID() {
        return itemDestinationCategoryID;
    }

    /**
     * Sets the value of the itemDestinationCategoryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setItemDestinationCategoryID(Long value) {
        this.itemDestinationCategoryID = value;
    }

    /**
     * Gets the value of the destinationParentCategoryID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDestinationParentCategoryID() {
        return destinationParentCategoryID;
    }

    /**
     * Sets the value of the destinationParentCategoryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDestinationParentCategoryID(Long value) {
        this.destinationParentCategoryID = value;
    }

    /**
     * Gets the value of the storeCategories property.
     * 
     * @return
     *     possible object is
     *     {@link StoreCustomCategoryArrayType }
     *     
     */
    public StoreCustomCategoryArrayType getStoreCategories() {
        return storeCategories;
    }

    /**
     * Sets the value of the storeCategories property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoreCustomCategoryArrayType }
     *     
     */
    public void setStoreCategories(StoreCustomCategoryArrayType value) {
        this.storeCategories = value;
    }

}
