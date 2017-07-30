
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
 * <p>Java class for SearchDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BuyItNowEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Picture" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RecentListing" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchDetailsType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "buyItNowEnabled",
    "picture",
    "recentListing"
})
public class SearchDetailsType {

    @XmlElement(name = "BuyItNowEnabled", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean buyItNowEnabled;
    @XmlElement(name = "Picture", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean picture;
    @XmlElement(name = "RecentListing", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean recentListing;

    /**
     * Gets the value of the buyItNowEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBuyItNowEnabled() {
        return buyItNowEnabled;
    }

    /**
     * Sets the value of the buyItNowEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBuyItNowEnabled(Boolean value) {
        this.buyItNowEnabled = value;
    }

    /**
     * Gets the value of the picture property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPicture() {
        return picture;
    }

    /**
     * Sets the value of the picture property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPicture(Boolean value) {
        this.picture = value;
    }

    /**
     * Gets the value of the recentListing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRecentListing() {
        return recentListing;
    }

    /**
     * Sets the value of the recentListing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRecentListing(Boolean value) {
        this.recentListing = value;
    }

}
