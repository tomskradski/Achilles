
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				For searches of Selling Manager listings, specifies search type, such as <b>ProductID</b> or <b>BuyerUserID</b>,
 * 				and search value.
 * 			
 * 
 * <p>Java class for SellingManagerSearchType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SellingManagerSearchType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SearchType" type="{urn:ebay:apis:eBLBaseComponents}SellingManagerSearchTypeCodeType" minOccurs="0"/>
 *         &lt;element name="SearchValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SellingManagerSearchType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "searchType",
    "searchValue"
})
public class SellingManagerSearchType {

    @XmlElement(name = "SearchType", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected SellingManagerSearchTypeCodeType searchType;
    @XmlElement(name = "SearchValue", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String searchValue;

    /**
     * Gets the value of the searchType property.
     * 
     * @return
     *     possible object is
     *     {@link SellingManagerSearchTypeCodeType }
     *     
     */
    public SellingManagerSearchTypeCodeType getSearchType() {
        return searchType;
    }

    /**
     * Sets the value of the searchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellingManagerSearchTypeCodeType }
     *     
     */
    public void setSearchType(SellingManagerSearchTypeCodeType value) {
        this.searchType = value;
    }

    /**
     * Gets the value of the searchValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchValue() {
        return searchValue;
    }

    /**
     * Sets the value of the searchValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchValue(String value) {
        this.searchValue = value;
    }

}
