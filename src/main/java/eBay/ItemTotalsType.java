
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 			Details about items involved in the summary for the specified time period.
 * 		
 * 
 * <p>Java class for ItemTotalsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemTotalsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TotalQuantity" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="TotalValue" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemTotalsType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "totalQuantity",
    "totalValue"
})
public class ItemTotalsType {

    @XmlElement(name = "TotalQuantity", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Long totalQuantity;
    @XmlElement(name = "TotalValue", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType totalValue;

    /**
     * Gets the value of the totalQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalQuantity() {
        return totalQuantity;
    }

    /**
     * Sets the value of the totalQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalQuantity(Long value) {
        this.totalQuantity = value;
    }

    /**
     * Gets the value of the totalValue property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalValue() {
        return totalValue;
    }

    /**
     * Sets the value of the totalValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalValue(AmountType value) {
        this.totalValue = value;
    }

}
