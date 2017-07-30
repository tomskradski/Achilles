
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This type is deprecated.
 * 			
 * 
 * <p>Java class for ListingAnalyzerRecommendationsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListingAnalyzerRecommendationsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListingTipArray" type="{urn:ebay:apis:eBLBaseComponents}ListingTipArrayType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListingAnalyzerRecommendationsType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "listingTipArray"
})
public class ListingAnalyzerRecommendationsType {

    @XmlElement(name = "ListingTipArray", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected ListingTipArrayType listingTipArray;

    /**
     * Gets the value of the listingTipArray property.
     * 
     * @return
     *     possible object is
     *     {@link ListingTipArrayType }
     *     
     */
    public ListingTipArrayType getListingTipArray() {
        return listingTipArray;
    }

    /**
     * Sets the value of the listingTipArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListingTipArrayType }
     *     
     */
    public void setListingTipArray(ListingTipArrayType value) {
        this.listingTipArray = value;
    }

}
