
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				 A list of possible My eBay Second Chance Offers.
 * 			
 * 
 * <p>Java class for MyeBaySecondChanceOfferListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MyeBaySecondChanceOfferListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TotalAvailable" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SecondChanceOffer" type="{urn:ebay:apis:eBLBaseComponents}ItemType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MyeBaySecondChanceOfferListType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "totalAvailable",
    "secondChanceOffer"
})
public class MyeBaySecondChanceOfferListType {

    @XmlElement(name = "TotalAvailable", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer totalAvailable;
    @XmlElement(name = "SecondChanceOffer", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<ItemType> secondChanceOffer;

    /**
     * Gets the value of the totalAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalAvailable() {
        return totalAvailable;
    }

    /**
     * Sets the value of the totalAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalAvailable(Integer value) {
        this.totalAvailable = value;
    }

    /**
     * Gets the value of the secondChanceOffer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the secondChanceOffer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecondChanceOffer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemType }
     * 
     * 
     */
    public List<ItemType> getSecondChanceOffer() {
        if (secondChanceOffer == null) {
            secondChanceOffer = new ArrayList<ItemType>();
        }
        return this.secondChanceOffer;
    }

}
