
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 			This type is deprecated.
 * 		
 * 
 * <p>Java class for ProStoresDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProStoresDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SellerThirdPartyUsername" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StoreName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{urn:ebay:apis:eBLBaseComponents}EnableCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProStoresDetailsType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "sellerThirdPartyUsername",
    "storeName",
    "status"
})
public class ProStoresDetailsType {

    @XmlElement(name = "SellerThirdPartyUsername", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String sellerThirdPartyUsername;
    @XmlElement(name = "StoreName", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String storeName;
    @XmlElement(name = "Status", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected EnableCodeType status;

    /**
     * Gets the value of the sellerThirdPartyUsername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerThirdPartyUsername() {
        return sellerThirdPartyUsername;
    }

    /**
     * Sets the value of the sellerThirdPartyUsername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerThirdPartyUsername(String value) {
        this.sellerThirdPartyUsername = value;
    }

    /**
     * Gets the value of the storeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreName() {
        return storeName;
    }

    /**
     * Sets the value of the storeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreName(String value) {
        this.storeName = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link EnableCodeType }
     *     
     */
    public EnableCodeType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnableCodeType }
     *     
     */
    public void setStatus(EnableCodeType value) {
        this.status = value;
    }

}
