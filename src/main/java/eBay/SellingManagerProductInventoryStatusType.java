
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes the inventory status of a specific Selling Manager Product
 * 
 * <p>Java class for SellingManagerProductInventoryStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SellingManagerProductInventoryStatusType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="QuantityScheduled" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="QuantityActive" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="QuantitySold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="QuantityUnsold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SuccessPercent" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="AverageSellingPrice" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SellingManagerProductInventoryStatusType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "quantityScheduled",
    "quantityActive",
    "quantitySold",
    "quantityUnsold",
    "successPercent",
    "averageSellingPrice"
})
public class SellingManagerProductInventoryStatusType {

    @XmlElement(name = "QuantityScheduled", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer quantityScheduled;
    @XmlElement(name = "QuantityActive", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer quantityActive;
    @XmlElement(name = "QuantitySold", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer quantitySold;
    @XmlElement(name = "QuantityUnsold", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer quantityUnsold;
    @XmlElement(name = "SuccessPercent", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Float successPercent;
    @XmlElement(name = "AverageSellingPrice", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType averageSellingPrice;

    /**
     * Gets the value of the quantityScheduled property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantityScheduled() {
        return quantityScheduled;
    }

    /**
     * Sets the value of the quantityScheduled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantityScheduled(Integer value) {
        this.quantityScheduled = value;
    }

    /**
     * Gets the value of the quantityActive property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantityActive() {
        return quantityActive;
    }

    /**
     * Sets the value of the quantityActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantityActive(Integer value) {
        this.quantityActive = value;
    }

    /**
     * Gets the value of the quantitySold property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantitySold() {
        return quantitySold;
    }

    /**
     * Sets the value of the quantitySold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantitySold(Integer value) {
        this.quantitySold = value;
    }

    /**
     * Gets the value of the quantityUnsold property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantityUnsold() {
        return quantityUnsold;
    }

    /**
     * Sets the value of the quantityUnsold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantityUnsold(Integer value) {
        this.quantityUnsold = value;
    }

    /**
     * Gets the value of the successPercent property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSuccessPercent() {
        return successPercent;
    }

    /**
     * Sets the value of the successPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSuccessPercent(Float value) {
        this.successPercent = value;
    }

    /**
     * Gets the value of the averageSellingPrice property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAverageSellingPrice() {
        return averageSellingPrice;
    }

    /**
     * Sets the value of the averageSellingPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAverageSellingPrice(AmountType value) {
        this.averageSellingPrice = value;
    }

}
