
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This type is deprecated.
 * 			
 * 
 * <p>Java class for ProductSearchResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductSearchResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumProducts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AttributeSet" type="{urn:ebay:apis:eBLBaseComponents}ResponseAttributeSetType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DisplayStockPhotos" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductSearchResultType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "id",
    "numProducts",
    "attributeSet",
    "displayStockPhotos"
})
public class ProductSearchResultType {

    @XmlElement(name = "ID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String id;
    @XmlElement(name = "NumProducts", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String numProducts;
    @XmlElement(name = "AttributeSet", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<ResponseAttributeSetType> attributeSet;
    @XmlElement(name = "DisplayStockPhotos", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean displayStockPhotos;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the numProducts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumProducts() {
        return numProducts;
    }

    /**
     * Sets the value of the numProducts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumProducts(String value) {
        this.numProducts = value;
    }

    /**
     * Gets the value of the attributeSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributeSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributeSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResponseAttributeSetType }
     * 
     * 
     */
    public List<ResponseAttributeSetType> getAttributeSet() {
        if (attributeSet == null) {
            attributeSet = new ArrayList<ResponseAttributeSetType>();
        }
        return this.attributeSet;
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

}
