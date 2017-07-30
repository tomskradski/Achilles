
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 * 				Type defining the <b>SellerDiscounts</b> container, which consists of one or
 * 				more <b>SellerDiscount</b> nodes, as well as the original purchase price and
 * 				shipping cost of the order line item.
 * 			
 * 
 * <p>Java class for SellerDiscountsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SellerDiscountsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OriginalItemPrice" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="OriginalItemShippingCost" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="OriginalShippingService" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="SellerDiscount" type="{urn:ebay:apis:eBLBaseComponents}SellerDiscountType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SellerDiscountsType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "originalItemPrice",
    "originalItemShippingCost",
    "originalShippingService",
    "sellerDiscount"
})
public class SellerDiscountsType {

    @XmlElement(name = "OriginalItemPrice", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType originalItemPrice;
    @XmlElement(name = "OriginalItemShippingCost", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType originalItemShippingCost;
    @XmlElement(name = "OriginalShippingService", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String originalShippingService;
    @XmlElement(name = "SellerDiscount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<SellerDiscountType> sellerDiscount;

    /**
     * Gets the value of the originalItemPrice property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOriginalItemPrice() {
        return originalItemPrice;
    }

    /**
     * Sets the value of the originalItemPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOriginalItemPrice(AmountType value) {
        this.originalItemPrice = value;
    }

    /**
     * Gets the value of the originalItemShippingCost property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOriginalItemShippingCost() {
        return originalItemShippingCost;
    }

    /**
     * Sets the value of the originalItemShippingCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOriginalItemShippingCost(AmountType value) {
        this.originalItemShippingCost = value;
    }

    /**
     * Gets the value of the originalShippingService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalShippingService() {
        return originalShippingService;
    }

    /**
     * Sets the value of the originalShippingService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalShippingService(String value) {
        this.originalShippingService = value;
    }

    /**
     * Gets the value of the sellerDiscount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sellerDiscount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSellerDiscount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SellerDiscountType }
     * 
     * 
     */
    public List<SellerDiscountType> getSellerDiscount() {
        if (sellerDiscount == null) {
            sellerDiscount = new ArrayList<SellerDiscountType>();
        }
        return this.sellerDiscount;
    }

}
