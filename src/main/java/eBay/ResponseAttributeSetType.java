
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
 * <p>Java class for ResponseAttributeSetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseAttributeSetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ApproximatePages" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AttributeSetID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="HasMore" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ProductFamilies" type="{urn:ebay:apis:eBLBaseComponents}ProductFamilyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ProductFinderConstraints" type="{urn:ebay:apis:eBLBaseComponents}ProductFinderConstraintType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TooManyMatchesFound" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="TotalProducts" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseAttributeSetType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "approximatePages",
    "attributeSetID",
    "hasMore",
    "productFamilies",
    "productFinderConstraints",
    "tooManyMatchesFound",
    "totalProducts"
})
public class ResponseAttributeSetType {

    @XmlElement(name = "ApproximatePages", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected int approximatePages;
    @XmlElement(name = "AttributeSetID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected int attributeSetID;
    @XmlElement(name = "HasMore", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected boolean hasMore;
    @XmlElement(name = "ProductFamilies", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<ProductFamilyType> productFamilies;
    @XmlElement(name = "ProductFinderConstraints", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<ProductFinderConstraintType> productFinderConstraints;
    @XmlElement(name = "TooManyMatchesFound", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected boolean tooManyMatchesFound;
    @XmlElement(name = "TotalProducts", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected int totalProducts;

    /**
     * Gets the value of the approximatePages property.
     * 
     */
    public int getApproximatePages() {
        return approximatePages;
    }

    /**
     * Sets the value of the approximatePages property.
     * 
     */
    public void setApproximatePages(int value) {
        this.approximatePages = value;
    }

    /**
     * Gets the value of the attributeSetID property.
     * 
     */
    public int getAttributeSetID() {
        return attributeSetID;
    }

    /**
     * Sets the value of the attributeSetID property.
     * 
     */
    public void setAttributeSetID(int value) {
        this.attributeSetID = value;
    }

    /**
     * Gets the value of the hasMore property.
     * 
     */
    public boolean isHasMore() {
        return hasMore;
    }

    /**
     * Sets the value of the hasMore property.
     * 
     */
    public void setHasMore(boolean value) {
        this.hasMore = value;
    }

    /**
     * Gets the value of the productFamilies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productFamilies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductFamilies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductFamilyType }
     * 
     * 
     */
    public List<ProductFamilyType> getProductFamilies() {
        if (productFamilies == null) {
            productFamilies = new ArrayList<ProductFamilyType>();
        }
        return this.productFamilies;
    }

    /**
     * Gets the value of the productFinderConstraints property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productFinderConstraints property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductFinderConstraints().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductFinderConstraintType }
     * 
     * 
     */
    public List<ProductFinderConstraintType> getProductFinderConstraints() {
        if (productFinderConstraints == null) {
            productFinderConstraints = new ArrayList<ProductFinderConstraintType>();
        }
        return this.productFinderConstraints;
    }

    /**
     * Gets the value of the tooManyMatchesFound property.
     * 
     */
    public boolean isTooManyMatchesFound() {
        return tooManyMatchesFound;
    }

    /**
     * Sets the value of the tooManyMatchesFound property.
     * 
     */
    public void setTooManyMatchesFound(boolean value) {
        this.tooManyMatchesFound = value;
    }

    /**
     * Gets the value of the totalProducts property.
     * 
     */
    public int getTotalProducts() {
        return totalProducts;
    }

    /**
     * Sets the value of the totalProducts property.
     * 
     */
    public void setTotalProducts(int value) {
        this.totalProducts = value;
    }

}
