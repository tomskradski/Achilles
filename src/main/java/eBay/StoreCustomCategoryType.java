
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Configuration of a store custom category.
 * 			
 * 
 * <p>Java class for StoreCustomCategoryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StoreCustomCategoryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CategoryID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Order" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ChildCategory" type="{urn:ebay:apis:eBLBaseComponents}StoreCustomCategoryType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StoreCustomCategoryType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "categoryID",
    "name",
    "order",
    "childCategory"
})
public class StoreCustomCategoryType {

    @XmlElement(name = "CategoryID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected long categoryID;
    @XmlElement(name = "Name", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String name;
    @XmlElement(name = "Order", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer order;
    @XmlElement(name = "ChildCategory", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<StoreCustomCategoryType> childCategory;

    /**
     * Gets the value of the categoryID property.
     * 
     */
    public long getCategoryID() {
        return categoryID;
    }

    /**
     * Sets the value of the categoryID property.
     * 
     */
    public void setCategoryID(long value) {
        this.categoryID = value;
    }

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
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrder(Integer value) {
        this.order = value;
    }

    /**
     * Gets the value of the childCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the childCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StoreCustomCategoryType }
     * 
     * 
     */
    public List<StoreCustomCategoryType> getChildCategory() {
        if (childCategory == null) {
            childCategory = new ArrayList<StoreCustomCategoryType>();
        }
        return this.childCategory;
    }

}
