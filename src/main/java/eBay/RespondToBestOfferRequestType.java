
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This call enables the seller to accept or decline a buyer's Best Offer on an item, or make a counter offer to the buyer's Best Offer. A seller can decline multiple Best Offers with one call, but the seller cannot accept or counter offer multiple Best Offers with one call. Best Offers are not applicable to auction listings.
 * 			
 * 
 * <p>Java class for RespondToBestOfferRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RespondToBestOfferRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="ItemID" type="{urn:ebay:apis:eBLBaseComponents}ItemIDType" minOccurs="0"/>
 *         &lt;element name="BestOfferID" type="{urn:ebay:apis:eBLBaseComponents}BestOfferIDType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Action" type="{urn:ebay:apis:eBLBaseComponents}BestOfferActionCodeType" minOccurs="0"/>
 *         &lt;element name="SellerResponse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CounterOfferPrice" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="CounterOfferQuantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RespondToBestOfferRequestType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "itemID",
    "bestOfferID",
    "action",
    "sellerResponse",
    "counterOfferPrice",
    "counterOfferQuantity"
})
public class RespondToBestOfferRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "ItemID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String itemID;
    @XmlElement(name = "BestOfferID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<String> bestOfferID;
    @XmlElement(name = "Action", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected BestOfferActionCodeType action;
    @XmlElement(name = "SellerResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String sellerResponse;
    @XmlElement(name = "CounterOfferPrice", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType counterOfferPrice;
    @XmlElement(name = "CounterOfferQuantity", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer counterOfferQuantity;

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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bestOfferID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBestOfferID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBestOfferID() {
        if (bestOfferID == null) {
            bestOfferID = new ArrayList<String>();
        }
        return this.bestOfferID;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link BestOfferActionCodeType }
     *     
     */
    public BestOfferActionCodeType getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link BestOfferActionCodeType }
     *     
     */
    public void setAction(BestOfferActionCodeType value) {
        this.action = value;
    }

    /**
     * Gets the value of the sellerResponse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerResponse() {
        return sellerResponse;
    }

    /**
     * Sets the value of the sellerResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerResponse(String value) {
        this.sellerResponse = value;
    }

    /**
     * Gets the value of the counterOfferPrice property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCounterOfferPrice() {
        return counterOfferPrice;
    }

    /**
     * Sets the value of the counterOfferPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCounterOfferPrice(AmountType value) {
        this.counterOfferPrice = value;
    }

    /**
     * Gets the value of the counterOfferQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCounterOfferQuantity() {
        return counterOfferQuantity;
    }

    /**
     * Sets the value of the counterOfferQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCounterOfferQuantity(Integer value) {
        this.counterOfferQuantity = value;
    }

}
