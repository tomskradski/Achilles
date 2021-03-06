
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This is the base request type of the <b>GetBestOffers</b> call. Depending on the input parameters that are used, this call can be used by a seller to retrieve all active Best Offers, all Best Offers on a specific listing, a specific Best Offer for a specific listing, or Best Offers in a specific state.
 * 			
 * 
 * <p>Java class for GetBestOffersRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetBestOffersRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="ItemID" type="{urn:ebay:apis:eBLBaseComponents}ItemIDType" minOccurs="0"/>
 *         &lt;element name="BestOfferID" type="{urn:ebay:apis:eBLBaseComponents}BestOfferIDType" minOccurs="0"/>
 *         &lt;element name="BestOfferStatus" type="{urn:ebay:apis:eBLBaseComponents}BestOfferStatusCodeType" minOccurs="0"/>
 *         &lt;element name="Pagination" type="{urn:ebay:apis:eBLBaseComponents}PaginationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetBestOffersRequestType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "itemID",
    "bestOfferID",
    "bestOfferStatus",
    "pagination"
})
public class GetBestOffersRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "ItemID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String itemID;
    @XmlElement(name = "BestOfferID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String bestOfferID;
    @XmlElement(name = "BestOfferStatus", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected BestOfferStatusCodeType bestOfferStatus;
    @XmlElement(name = "Pagination", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected PaginationType pagination;

    /**
     * Gets the value of the itemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemID() {
        return itemID;
    }

    /**
     * Sets the value of the itemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemID(String value) {
        this.itemID = value;
    }

    /**
     * Gets the value of the bestOfferID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBestOfferID() {
        return bestOfferID;
    }

    /**
     * Sets the value of the bestOfferID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBestOfferID(String value) {
        this.bestOfferID = value;
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
     * Gets the value of the pagination property.
     * 
     * @return
     *     possible object is
     *     {@link PaginationType }
     *     
     */
    public PaginationType getPagination() {
        return pagination;
    }

    /**
     * Sets the value of the pagination property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaginationType }
     *     
     */
    public void setPagination(PaginationType value) {
        this.pagination = value;
    }

}
