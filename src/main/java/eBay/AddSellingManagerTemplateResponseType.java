
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				The base response of the <b>AddSellingManagerTemplate</b> call. The response includes the unique identifier and name of the new Selling Manager template, the listing category, some information on the Selling Manager product associated with the template, and the expected listing fees if a listing is created using this Selling Manager template.
 * 			
 * 
 * <p>Java class for AddSellingManagerTemplateResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddSellingManagerTemplateResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="CategoryID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Category2ID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SaleTemplateID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SaleTemplateGroupID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SaleTemplateName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SellingManagerProductDetails" type="{urn:ebay:apis:eBLBaseComponents}SellingManagerProductDetailsType" minOccurs="0"/>
 *         &lt;element name="Fees" type="{urn:ebay:apis:eBLBaseComponents}FeesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddSellingManagerTemplateResponseType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "categoryID",
    "category2ID",
    "saleTemplateID",
    "saleTemplateGroupID",
    "saleTemplateName",
    "sellingManagerProductDetails",
    "fees"
})
public class AddSellingManagerTemplateResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "CategoryID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Long categoryID;
    @XmlElement(name = "Category2ID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Long category2ID;
    @XmlElement(name = "SaleTemplateID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Long saleTemplateID;
    @XmlElement(name = "SaleTemplateGroupID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Long saleTemplateGroupID;
    @XmlElement(name = "SaleTemplateName", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String saleTemplateName;
    @XmlElement(name = "SellingManagerProductDetails", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected SellingManagerProductDetailsType sellingManagerProductDetails;
    @XmlElement(name = "Fees", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected FeesType fees;

    /**
     * Gets the value of the categoryID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCategoryID() {
        return categoryID;
    }

    /**
     * Sets the value of the categoryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCategoryID(Long value) {
        this.categoryID = value;
    }

    /**
     * Gets the value of the category2ID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCategory2ID() {
        return category2ID;
    }

    /**
     * Sets the value of the category2ID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCategory2ID(Long value) {
        this.category2ID = value;
    }

    /**
     * Gets the value of the saleTemplateID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSaleTemplateID() {
        return saleTemplateID;
    }

    /**
     * Sets the value of the saleTemplateID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSaleTemplateID(Long value) {
        this.saleTemplateID = value;
    }

    /**
     * Gets the value of the saleTemplateGroupID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSaleTemplateGroupID() {
        return saleTemplateGroupID;
    }

    /**
     * Sets the value of the saleTemplateGroupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSaleTemplateGroupID(Long value) {
        this.saleTemplateGroupID = value;
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
     * Gets the value of the fees property.
     * 
     * @return
     *     possible object is
     *     {@link FeesType }
     *     
     */
    public FeesType getFees() {
        return fees;
    }

    /**
     * Sets the value of the fees property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeesType }
     *     
     */
    public void setFees(FeesType value) {
        this.fees = value;
    }

}
