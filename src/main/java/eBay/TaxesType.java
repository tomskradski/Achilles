
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Type defining the Taxes container, which contains detailed sales tax information for an
 * 				order line item. The Taxes container is only returned if the seller is using the Vertex-
 * 				based Premium Sales Tax Engine solution. The information in this container
 * 				supercedes/overrides the sales tax information in the ShippingDetails.SalesTax container.
 * 			
 * 
 * <p>Java class for TaxesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TotalTaxAmount" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="TaxDetails" type="{urn:ebay:apis:eBLBaseComponents}TaxDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxesType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "totalTaxAmount",
    "taxDetails"
})
public class TaxesType {

    @XmlElement(name = "TotalTaxAmount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType totalTaxAmount;
    @XmlElement(name = "TaxDetails", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<TaxDetailsType> taxDetails;

    /**
     * Gets the value of the totalTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalTaxAmount() {
        return totalTaxAmount;
    }

    /**
     * Sets the value of the totalTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalTaxAmount(AmountType value) {
        this.totalTaxAmount = value;
    }

    /**
     * Gets the value of the taxDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxDetailsType }
     * 
     * 
     */
    public List<TaxDetailsType> getTaxDetails() {
        if (taxDetails == null) {
            taxDetails = new ArrayList<TaxDetailsType>();
        }
        return this.taxDetails;
    }

}
