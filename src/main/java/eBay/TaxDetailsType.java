
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Type defining the TaxDetails container, which consists of detailed sales tax
 * 			 information for an order line item, including the tax type and description, sales tax
 * 			 on the item cost, and sales tax related to shipping and handling. The information in
 * 			 this container supercedes/overrides the sales tax information in the
 * 			 ShippingDetails.SalesTax container.
 * 			
 * 
 * <p>Java class for TaxDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Imposition" type="{urn:ebay:apis:eBLBaseComponents}TaxTypeCodeType" minOccurs="0"/>
 *         &lt;element name="TaxDescription" type="{urn:ebay:apis:eBLBaseComponents}TaxDescriptionCodeType" minOccurs="0"/>
 *         &lt;element name="TaxAmount" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="TaxOnSubtotalAmount" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="TaxOnShippingAmount" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="TaxOnHandlingAmount" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="TaxCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxDetailsType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "imposition",
    "taxDescription",
    "taxAmount",
    "taxOnSubtotalAmount",
    "taxOnShippingAmount",
    "taxOnHandlingAmount",
    "taxCode"
})
public class TaxDetailsType {

    @XmlElement(name = "Imposition", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected TaxTypeCodeType imposition;
    @XmlElement(name = "TaxDescription", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected TaxDescriptionCodeType taxDescription;
    @XmlElement(name = "TaxAmount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType taxAmount;
    @XmlElement(name = "TaxOnSubtotalAmount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType taxOnSubtotalAmount;
    @XmlElement(name = "TaxOnShippingAmount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType taxOnShippingAmount;
    @XmlElement(name = "TaxOnHandlingAmount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType taxOnHandlingAmount;
    @XmlElement(name = "TaxCode", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String taxCode;

    /**
     * Gets the value of the imposition property.
     * 
     * @return
     *     possible object is
     *     {@link TaxTypeCodeType }
     *     
     */
    public TaxTypeCodeType getImposition() {
        return imposition;
    }

    /**
     * Sets the value of the imposition property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxTypeCodeType }
     *     
     */
    public void setImposition(TaxTypeCodeType value) {
        this.imposition = value;
    }

    /**
     * Gets the value of the taxDescription property.
     * 
     * @return
     *     possible object is
     *     {@link TaxDescriptionCodeType }
     *     
     */
    public TaxDescriptionCodeType getTaxDescription() {
        return taxDescription;
    }

    /**
     * Sets the value of the taxDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxDescriptionCodeType }
     *     
     */
    public void setTaxDescription(TaxDescriptionCodeType value) {
        this.taxDescription = value;
    }

    /**
     * Gets the value of the taxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTaxAmount() {
        return taxAmount;
    }

    /**
     * Sets the value of the taxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTaxAmount(AmountType value) {
        this.taxAmount = value;
    }

    /**
     * Gets the value of the taxOnSubtotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTaxOnSubtotalAmount() {
        return taxOnSubtotalAmount;
    }

    /**
     * Sets the value of the taxOnSubtotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTaxOnSubtotalAmount(AmountType value) {
        this.taxOnSubtotalAmount = value;
    }

    /**
     * Gets the value of the taxOnShippingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTaxOnShippingAmount() {
        return taxOnShippingAmount;
    }

    /**
     * Sets the value of the taxOnShippingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTaxOnShippingAmount(AmountType value) {
        this.taxOnShippingAmount = value;
    }

    /**
     * Gets the value of the taxOnHandlingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTaxOnHandlingAmount() {
        return taxOnHandlingAmount;
    }

    /**
     * Sets the value of the taxOnHandlingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTaxOnHandlingAmount(AmountType value) {
        this.taxOnHandlingAmount = value;
    }

    /**
     * Gets the value of the taxCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxCode() {
        return taxCode;
    }

    /**
     * Sets the value of the taxCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxCode(String value) {
        this.taxCode = value;
    }

}
