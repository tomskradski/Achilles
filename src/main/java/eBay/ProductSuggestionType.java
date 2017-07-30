
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Identifies an individual product suggestion. The product details include the EPID, Title, Stock photo url and if it is 
 * 				an exact match.
 * 			
 * 
 * <p>Java class for ProductSuggestionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductSuggestionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EPID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StockPhoto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Recommended" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductSuggestionType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "title",
    "epid",
    "stockPhoto",
    "recommended"
})
public class ProductSuggestionType {

    @XmlElement(name = "Title", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String title;
    @XmlElement(name = "EPID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String epid;
    @XmlElement(name = "StockPhoto", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String stockPhoto;
    @XmlElement(name = "Recommended", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean recommended;

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the epid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEPID() {
        return epid;
    }

    /**
     * Sets the value of the epid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEPID(String value) {
        this.epid = value;
    }

    /**
     * Gets the value of the stockPhoto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStockPhoto() {
        return stockPhoto;
    }

    /**
     * Sets the value of the stockPhoto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStockPhoto(String value) {
        this.stockPhoto = value;
    }

    /**
     * Gets the value of the recommended property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRecommended() {
        return recommended;
    }

    /**
     * Sets the value of the recommended property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRecommended(Boolean value) {
        this.recommended = value;
    }

}
