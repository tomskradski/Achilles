
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * 				Type defining the <b>BestOffer</b> container, which consists of information on one Best Offer or counter offer. This information includes the price of the offer, the expiration of the offer, and any messaging provided by the prospective buyer or seller.
 * 			
 * 
 * <p>Java class for BestOfferType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BestOfferType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BestOfferID" type="{urn:ebay:apis:eBLBaseComponents}BestOfferIDType" minOccurs="0"/>
 *         &lt;element name="ExpirationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Buyer" type="{urn:ebay:apis:eBLBaseComponents}UserType" minOccurs="0"/>
 *         &lt;element name="Price" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="Status" type="{urn:ebay:apis:eBLBaseComponents}BestOfferStatusCodeType" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BuyerMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SellerMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BestOfferCodeType" type="{urn:ebay:apis:eBLBaseComponents}BestOfferTypeCodeType" minOccurs="0"/>
 *         &lt;element name="CallStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NewBestOffer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ImmediatePayEligible" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BestOfferType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "bestOfferID",
    "expirationTime",
    "buyer",
    "price",
    "status",
    "quantity",
    "buyerMessage",
    "sellerMessage",
    "bestOfferCodeType",
    "callStatus",
    "newBestOffer",
    "immediatePayEligible"
})
public class BestOfferType {

    @XmlElement(name = "BestOfferID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String bestOfferID;
    @XmlElement(name = "ExpirationTime", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirationTime;
    @XmlElement(name = "Buyer", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected UserType buyer;
    @XmlElement(name = "Price", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType price;
    @XmlElement(name = "Status", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected BestOfferStatusCodeType status;
    @XmlElement(name = "Quantity", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer quantity;
    @XmlElement(name = "BuyerMessage", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String buyerMessage;
    @XmlElement(name = "SellerMessage", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String sellerMessage;
    @XmlElement(name = "BestOfferCodeType", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected BestOfferTypeCodeType bestOfferCodeType;
    @XmlElement(name = "CallStatus", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String callStatus;
    @XmlElement(name = "NewBestOffer", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean newBestOffer;
    @XmlElement(name = "ImmediatePayEligible", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean immediatePayEligible;

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
     * Gets the value of the expirationTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationTime() {
        return expirationTime;
    }

    /**
     * Sets the value of the expirationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationTime(XMLGregorianCalendar value) {
        this.expirationTime = value;
    }

    /**
     * Gets the value of the buyer property.
     * 
     * @return
     *     possible object is
     *     {@link UserType }
     *     
     */
    public UserType getBuyer() {
        return buyer;
    }

    /**
     * Sets the value of the buyer property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserType }
     *     
     */
    public void setBuyer(UserType value) {
        this.buyer = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPrice(AmountType value) {
        this.price = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link BestOfferStatusCodeType }
     *     
     */
    public BestOfferStatusCodeType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link BestOfferStatusCodeType }
     *     
     */
    public void setStatus(BestOfferStatusCodeType value) {
        this.status = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantity(Integer value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the buyerMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyerMessage() {
        return buyerMessage;
    }

    /**
     * Sets the value of the buyerMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyerMessage(String value) {
        this.buyerMessage = value;
    }

    /**
     * Gets the value of the sellerMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerMessage() {
        return sellerMessage;
    }

    /**
     * Sets the value of the sellerMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerMessage(String value) {
        this.sellerMessage = value;
    }

    /**
     * Gets the value of the bestOfferCodeType property.
     * 
     * @return
     *     possible object is
     *     {@link BestOfferTypeCodeType }
     *     
     */
    public BestOfferTypeCodeType getBestOfferCodeType() {
        return bestOfferCodeType;
    }

    /**
     * Sets the value of the bestOfferCodeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BestOfferTypeCodeType }
     *     
     */
    public void setBestOfferCodeType(BestOfferTypeCodeType value) {
        this.bestOfferCodeType = value;
    }

    /**
     * Gets the value of the callStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallStatus() {
        return callStatus;
    }

    /**
     * Sets the value of the callStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallStatus(String value) {
        this.callStatus = value;
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

    /**
     * Gets the value of the immediatePayEligible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isImmediatePayEligible() {
        return immediatePayEligible;
    }

    /**
     * Sets the value of the immediatePayEligible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setImmediatePayEligible(Boolean value) {
        this.immediatePayEligible = value;
    }

}
