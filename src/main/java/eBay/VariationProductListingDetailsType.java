
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This type defines the <b>VariationProductListingDetails</b> container that is used to specify an EAN, an ISBN, or a UPC value to identify a specific product variation in a multi-variation listing. For multi-variation listings, the same product identifier type must be used for all product variations within the listing. For instance, if one product variation uses ISBNs, all product variations must use ISBN values.
 * 				<br>
 * 				<br>
 * 				<span class="tablenote"><b>Note:</b>
 * 				The <b>NameValueList</b> container was added in Version 997, but it is not yet available for use in Sandbox or Production environments. Ultimately, specifying product identifiers for a product variation through the <b>NameValueList</b> container will replace the process of specifying product identifiers through the <b>EAN</b>, <b>ISBN</b>, or <b>UPC</b> fields. See the documentation for the <b>NameValueList</b> container for more information on how product identifiers are specified through this container. For more information on effective dates on this feature change and transition, see the <a href="https://developer.ebay.com/devzone/guides/ebayfeatures/Development/Listing-AnItem.html#RequiredProductIdentifiersMandate">Required Product Identifiers Mandate</a>.
 * 				</span>
 * 			
 * 
 * <p>Java class for VariationProductListingDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VariationProductListingDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ISBN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UPC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NameValueList" type="{urn:ebay:apis:eBLBaseComponents}NameValueListType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VariationProductListingDetailsType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "isbn",
    "upc",
    "ean",
    "nameValueList"
})
public class VariationProductListingDetailsType {

    @XmlElement(name = "ISBN", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String isbn;
    @XmlElement(name = "UPC", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String upc;
    @XmlElement(name = "EAN", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String ean;
    @XmlElement(name = "NameValueList", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<NameValueListType> nameValueList;

    /**
     * Gets the value of the isbn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISBN() {
        return isbn;
    }

    /**
     * Sets the value of the isbn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISBN(String value) {
        this.isbn = value;
    }

    /**
     * Gets the value of the upc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUPC() {
        return upc;
    }

    /**
     * Sets the value of the upc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUPC(String value) {
        this.upc = value;
    }

    /**
     * Gets the value of the ean property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEAN() {
        return ean;
    }

    /**
     * Sets the value of the ean property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEAN(String value) {
        this.ean = value;
    }

    /**
     * Gets the value of the nameValueList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nameValueList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNameValueList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameValueListType }
     * 
     * 
     */
    public List<NameValueListType> getNameValueList() {
        if (nameValueList == null) {
            nameValueList = new ArrayList<NameValueListType>();
        }
        return this.nameValueList;
    }

}
