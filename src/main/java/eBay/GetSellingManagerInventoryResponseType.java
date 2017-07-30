
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * 				Contains a list of the products created by the seller. The list of products is returned as a set
 * 				of tags, in which are returned zero, one, or multiple SellingManagerProductType objects. Each
 * 				SellingManagerProductType object contains the information about for one Selling Manager product
 * 				and any Selling Manager templates the product contains.
 * 			
 * 
 * <p>Java class for GetSellingManagerInventoryResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSellingManagerInventoryResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="InventoryCountLastCalculatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="SellingManagerProduct" type="{urn:ebay:apis:eBLBaseComponents}SellingManagerProductType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PaginationResult" type="{urn:ebay:apis:eBLBaseComponents}PaginationResultType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSellingManagerInventoryResponseType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "inventoryCountLastCalculatedDate",
    "sellingManagerProduct",
    "paginationResult"
})
public class GetSellingManagerInventoryResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "InventoryCountLastCalculatedDate", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inventoryCountLastCalculatedDate;
    @XmlElement(name = "SellingManagerProduct", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<SellingManagerProductType> sellingManagerProduct;
    @XmlElement(name = "PaginationResult", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected PaginationResultType paginationResult;

    /**
     * Gets the value of the inventoryCountLastCalculatedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInventoryCountLastCalculatedDate() {
        return inventoryCountLastCalculatedDate;
    }

    /**
     * Sets the value of the inventoryCountLastCalculatedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInventoryCountLastCalculatedDate(XMLGregorianCalendar value) {
        this.inventoryCountLastCalculatedDate = value;
    }

    /**
     * Gets the value of the sellingManagerProduct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sellingManagerProduct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSellingManagerProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SellingManagerProductType }
     * 
     * 
     */
    public List<SellingManagerProductType> getSellingManagerProduct() {
        if (sellingManagerProduct == null) {
            sellingManagerProduct = new ArrayList<SellingManagerProductType>();
        }
        return this.sellingManagerProduct;
    }

    /**
     * Gets the value of the paginationResult property.
     * 
     * @return
     *     possible object is
     *     {@link PaginationResultType }
     *     
     */
    public PaginationResultType getPaginationResult() {
        return paginationResult;
    }

    /**
     * Sets the value of the paginationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaginationResultType }
     *     
     */
    public void setPaginationResult(PaginationResultType value) {
        this.paginationResult = value;
    }

}
