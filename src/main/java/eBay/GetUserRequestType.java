
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Retrieves data pertaining to a single eBay user. Callers can use this call to
 * 				return their own user data or the data of another eBay user. Unless the caller
 * 				passes in an ItemID that identifies a current or past common order, not all
 * 				data (like email addresses) will be returned in the User object.
 * 			
 * 
 * <p>Java class for GetUserRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetUserRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="ItemID" type="{urn:ebay:apis:eBLBaseComponents}ItemIDType" minOccurs="0"/>
 *         &lt;element name="UserID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IncludeExpressRequirements" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IncludeFeatureEligibility" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetUserRequestType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "itemID",
    "userID",
    "includeExpressRequirements",
    "includeFeatureEligibility"
})
public class GetUserRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "ItemID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String itemID;
    @XmlElement(name = "UserID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String userID;
    @XmlElement(name = "IncludeExpressRequirements", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean includeExpressRequirements;
    @XmlElement(name = "IncludeFeatureEligibility", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean includeFeatureEligibility;

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
     * Gets the value of the userID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserID(String value) {
        this.userID = value;
    }

    /**
     * Gets the value of the includeExpressRequirements property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeExpressRequirements() {
        return includeExpressRequirements;
    }

    /**
     * Sets the value of the includeExpressRequirements property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeExpressRequirements(Boolean value) {
        this.includeExpressRequirements = value;
    }

    /**
     * Gets the value of the includeFeatureEligibility property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeFeatureEligibility() {
        return includeFeatureEligibility;
    }

    /**
     * Sets the value of the includeFeatureEligibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeFeatureEligibility(Boolean value) {
        this.includeFeatureEligibility = value;
    }

}
