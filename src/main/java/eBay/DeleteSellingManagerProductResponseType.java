
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Response for deleting a Selling Manager product.
 * 			
 * 
 * <p>Java class for DeleteSellingManagerProductResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeleteSellingManagerProductResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="DeletedSellingManagerProductDetails" type="{urn:ebay:apis:eBLBaseComponents}SellingManagerProductDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteSellingManagerProductResponseType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "deletedSellingManagerProductDetails"
})
public class DeleteSellingManagerProductResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "DeletedSellingManagerProductDetails", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected SellingManagerProductDetailsType deletedSellingManagerProductDetails;

    /**
     * Gets the value of the deletedSellingManagerProductDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SellingManagerProductDetailsType }
     *     
     */
    public SellingManagerProductDetailsType getDeletedSellingManagerProductDetails() {
        return deletedSellingManagerProductDetails;
    }

    /**
     * Sets the value of the deletedSellingManagerProductDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellingManagerProductDetailsType }
     *     
     */
    public void setDeletedSellingManagerProductDetails(SellingManagerProductDetailsType value) {
        this.deletedSellingManagerProductDetails = value;
    }

}
