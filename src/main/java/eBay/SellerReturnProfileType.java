
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Type defining the <b>SellerReturnProfile</b> container, which is used in an 
 * 				Add/Revise/Relist Trading API call to reference a Business Policies return policy profile.
 * 				Business Policies return policy profiles contain detailed information on 
 * 				the seller's return policy, including the refund option, how many days the buyer has
 * 				to return the item for a refund, warranty information, and restocking fee (if any).
 * 				<br/><br/>
 * 				Business Policies return policy profiles are also returned in 
 * 				<b>GetItem</b>, <b>GetMyeBaySelling</b>, and other 
 * 				Trading calls that retrieve Item data.
 * 			
 * 
 * <p>Java class for SellerReturnProfileType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SellerReturnProfileType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReturnProfileID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ReturnProfileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SellerReturnProfileType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "returnProfileID",
    "returnProfileName"
})
public class SellerReturnProfileType {

    @XmlElement(name = "ReturnProfileID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Long returnProfileID;
    @XmlElement(name = "ReturnProfileName", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String returnProfileName;

    /**
     * Gets the value of the returnProfileID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReturnProfileID() {
        return returnProfileID;
    }

    /**
     * Sets the value of the returnProfileID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReturnProfileID(Long value) {
        this.returnProfileID = value;
    }

    /**
     * Gets the value of the returnProfileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnProfileName() {
        return returnProfileName;
    }

    /**
     * Sets the value of the returnProfileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnProfileName(String value) {
        this.returnProfileName = value;
    }

}
