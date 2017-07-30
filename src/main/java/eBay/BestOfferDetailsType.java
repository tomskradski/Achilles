
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Type defining the <b>BestOfferDetails</b> container, which consists
 * 				of Best Offer details associated with an item. The <b>BestOfferEnabled</b>
 * 				field in this container is used by <b>Add</b>/<b>Revise</b>/<b>Relist</b> calls to enable the Best Offer feature on a listing.
 * 				<br/><br/>
 * 				<span class="tablenote"><b>Note: </b>
 * 				The Best Offer feature is not available for auction listings.
 * 				</span>
 * 			
 * 
 * <p>Java class for BestOfferDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BestOfferDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BestOfferCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BestOfferEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BestOffer" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="BestOfferStatus" type="{urn:ebay:apis:eBLBaseComponents}BestOfferStatusCodeType" minOccurs="0"/>
 *         &lt;element name="BestOfferType" type="{urn:ebay:apis:eBLBaseComponents}BestOfferTypeCodeType" minOccurs="0"/>
 *         &lt;element name="NewBestOffer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BestOfferDetailsType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "bestOfferCount",
    "bestOfferEnabled",
    "bestOffer",
    "bestOfferStatus",
    "bestOfferType",
    "newBestOffer"
})
public class BestOfferDetailsType {

    @XmlElement(name = "BestOfferCount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer bestOfferCount;
    @XmlElement(name = "BestOfferEnabled", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean bestOfferEnabled;
    @XmlElement(name = "BestOffer", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType bestOffer;
    @XmlElement(name = "BestOfferStatus", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected BestOfferStatusCodeType bestOfferStatus;
    @XmlElement(name = "BestOfferType", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected BestOfferTypeCodeType bestOfferType;
    @XmlElement(name = "NewBestOffer", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean newBestOffer;

    /**
     * Gets the value of the bestOfferCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBestOfferCount() {
        return bestOfferCount;
    }

    /**
     * Sets the value of the bestOfferCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBestOfferCount(Integer value) {
        this.bestOfferCount = value;
    }

    /**
     * Gets the value of the bestOfferEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBestOfferEnabled() {
        return bestOfferEnabled;
    }

    /**
     * Sets the value of the bestOfferEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBestOfferEnabled(Boolean value) {
        this.bestOfferEnabled = value;
    }

    /**
     * Gets the value of the bestOffer property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getBestOffer() {
        return bestOffer;
    }

    /**
     * Sets the value of the bestOffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setBestOffer(AmountType value) {
        this.bestOffer = value;
    }

    /**
     * Gets the value of the bestOfferStatus property.
     * 
     * @return
     *     possible object is
     *     {@link BestOfferStatusCodeType }
     *     
     */
    public BestOfferStatusCodeType getBestOfferStatus() {
        return bestOfferStatus;
    }

    /**
     * Sets the value of the bestOfferStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BestOfferStatusCodeType }
     *     
     */
    public void setBestOfferStatus(BestOfferStatusCodeType value) {
        this.bestOfferStatus = value;
    }

    /**
     * Gets the value of the bestOfferType property.
     * 
     * @return
     *     possible object is
     *     {@link BestOfferTypeCodeType }
     *     
     */
    public BestOfferTypeCodeType getBestOfferType() {
        return bestOfferType;
    }

    /**
     * Sets the value of the bestOfferType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BestOfferTypeCodeType }
     *     
     */
    public void setBestOfferType(BestOfferTypeCodeType value) {
        this.bestOfferType = value;
    }

    /**
     * Gets the value of the newBestOffer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNewBestOffer() {
        return newBestOffer;
    }

    /**
     * Sets the value of the newBestOffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNewBestOffer(Boolean value) {
        this.newBestOffer = value;
    }

}
