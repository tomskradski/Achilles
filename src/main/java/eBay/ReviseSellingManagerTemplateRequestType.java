
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Revises a Selling Manager template.
 * 				This call is subject to change without notice; the
 * 				deprecation process is inapplicable to this call.
 * 			
 * 
 * <p>Java class for ReviseSellingManagerTemplateRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReviseSellingManagerTemplateRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="SaleTemplateID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ProductID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SaleTemplateName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Item" type="{urn:ebay:apis:eBLBaseComponents}ItemType" minOccurs="0"/>
 *         &lt;element name="DeletedField" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="VerifyOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReviseSellingManagerTemplateRequestType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "saleTemplateID",
    "productID",
    "saleTemplateName",
    "item",
    "deletedField",
    "verifyOnly"
})
public class ReviseSellingManagerTemplateRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "SaleTemplateID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Long saleTemplateID;
    @XmlElement(name = "ProductID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Long productID;
    @XmlElement(name = "SaleTemplateName", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String saleTemplateName;
    @XmlElement(name = "Item", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected ItemType item;
    @XmlElement(name = "DeletedField", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<String> deletedField;
    @XmlElement(name = "VerifyOnly", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean verifyOnly;

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
     * Gets the value of the productID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProductID() {
        return productID;
    }

    /**
     * Sets the value of the productID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProductID(Long value) {
        this.productID = value;
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
     * Gets the value of the item property.
     * 
     * @return
     *     possible object is
     *     {@link ItemType }
     *     
     */
    public ItemType getItem() {
        return item;
    }

    /**
     * Sets the value of the item property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemType }
     *     
     */
    public void setItem(ItemType value) {
        this.item = value;
    }

    /**
     * Gets the value of the deletedField property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deletedField property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeletedField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDeletedField() {
        if (deletedField == null) {
            deletedField = new ArrayList<String>();
        }
        return this.deletedField;
    }

    /**
     * Gets the value of the verifyOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVerifyOnly() {
        return verifyOnly;
    }

    /**
     * Sets the value of the verifyOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVerifyOnly(Boolean value) {
        this.verifyOnly = value;
    }

}
