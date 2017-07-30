
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes a Selling Manager Template
 * 			
 * 
 * <p>Java class for SellingManagerTemplateDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SellingManagerTemplateDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SaleTemplateID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SaleTemplateName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SuccessPercent" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="SellingManagerProductDetails" type="{urn:ebay:apis:eBLBaseComponents}SellingManagerProductDetailsType" minOccurs="0"/>
 *         &lt;element name="Template" type="{urn:ebay:apis:eBLBaseComponents}ItemType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SellingManagerTemplateDetailsType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "saleTemplateID",
    "saleTemplateName",
    "successPercent",
    "sellingManagerProductDetails",
    "template"
})
public class SellingManagerTemplateDetailsType {

    @XmlElement(name = "SaleTemplateID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String saleTemplateID;
    @XmlElement(name = "SaleTemplateName", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String saleTemplateName;
    @XmlElement(name = "SuccessPercent", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Float successPercent;
    @XmlElement(name = "SellingManagerProductDetails", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected SellingManagerProductDetailsType sellingManagerProductDetails;
    @XmlElement(name = "Template", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected ItemType template;

    /**
     * Gets the value of the saleTemplateID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleTemplateID() {
        return saleTemplateID;
    }

    /**
     * Sets the value of the saleTemplateID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleTemplateID(String value) {
        this.saleTemplateID = value;
    }

    /**
     * Gets the value of the saleTemplateName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleTemplateName() {
        return saleTemplateName;
    }

    /**
     * Sets the value of the saleTemplateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleTemplateName(String value) {
        this.saleTemplateName = value;
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
     * Gets the value of the sellingManagerProductDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SellingManagerProductDetailsType }
     *     
     */
    public SellingManagerProductDetailsType getSellingManagerProductDetails() {
        return sellingManagerProductDetails;
    }

    /**
     * Sets the value of the sellingManagerProductDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellingManagerProductDetailsType }
     *     
     */
    public void setSellingManagerProductDetails(SellingManagerProductDetailsType value) {
        this.sellingManagerProductDetails = value;
    }

    /**
     * Gets the value of the template property.
     * 
     * @return
     *     possible object is
     *     {@link ItemType }
     *     
     */
    public ItemType getTemplate() {
        return template;
    }

    /**
     * Sets the value of the template property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemType }
     *     
     */
    public void setTemplate(ItemType value) {
        this.template = value;
    }

}
