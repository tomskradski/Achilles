
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Revises a Selling Manager product.
 * 				<br><br>
 * 				This call is subject to change without notice; the
 * 				deprecation process is inapplicable to this call.
 * 			
 * 
 * <p>Java class for ReviseSellingManagerProductRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReviseSellingManagerProductRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="SellingManagerProductDetails" type="{urn:ebay:apis:eBLBaseComponents}SellingManagerProductDetailsType" minOccurs="0"/>
 *         &lt;element name="SellingManagerFolderDetails" type="{urn:ebay:apis:eBLBaseComponents}SellingManagerFolderDetailsType" minOccurs="0"/>
 *         &lt;element name="DeletedField" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SellingManagerProductSpecifics" type="{urn:ebay:apis:eBLBaseComponents}SellingManagerProductSpecificsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReviseSellingManagerProductRequestType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "sellingManagerProductDetails",
    "sellingManagerFolderDetails",
    "deletedField",
    "sellingManagerProductSpecifics"
})
public class ReviseSellingManagerProductRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "SellingManagerProductDetails", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected SellingManagerProductDetailsType sellingManagerProductDetails;
    @XmlElement(name = "SellingManagerFolderDetails", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected SellingManagerFolderDetailsType sellingManagerFolderDetails;
    @XmlElement(name = "DeletedField", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<String> deletedField;
    @XmlElement(name = "SellingManagerProductSpecifics", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected SellingManagerProductSpecificsType sellingManagerProductSpecifics;

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
     * Gets the value of the sellingManagerFolderDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SellingManagerFolderDetailsType }
     *     
     */
    public SellingManagerFolderDetailsType getSellingManagerFolderDetails() {
        return sellingManagerFolderDetails;
    }

    /**
     * Sets the value of the sellingManagerFolderDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellingManagerFolderDetailsType }
     *     
     */
    public void setSellingManagerFolderDetails(SellingManagerFolderDetailsType value) {
        this.sellingManagerFolderDetails = value;
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
     * Gets the value of the sellingManagerProductSpecifics property.
     * 
     * @return
     *     possible object is
     *     {@link SellingManagerProductSpecificsType }
     *     
     */
    public SellingManagerProductSpecificsType getSellingManagerProductSpecifics() {
        return sellingManagerProductSpecifics;
    }

    /**
     * Sets the value of the sellingManagerProductSpecifics property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellingManagerProductSpecificsType }
     *     
     */
    public void setSellingManagerProductSpecifics(SellingManagerProductSpecificsType value) {
        this.sellingManagerProductSpecifics = value;
    }

}
