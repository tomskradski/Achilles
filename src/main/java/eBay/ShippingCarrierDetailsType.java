
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 *         Details about type of Carrier used to ship an item.
 *       
 * 
 * <p>Java class for ShippingCarrierDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShippingCarrierDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ShippingCarrierID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShippingCarrier" type="{urn:ebay:apis:eBLBaseComponents}ShippingCarrierCodeType" minOccurs="0"/>
 *         &lt;element name="DetailVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UpdateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShippingCarrierDetailsType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "shippingCarrierID",
    "description",
    "shippingCarrier",
    "detailVersion",
    "updateTime"
})
public class ShippingCarrierDetailsType {

    @XmlElement(name = "ShippingCarrierID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer shippingCarrierID;
    @XmlElement(name = "Description", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String description;
    @XmlElement(name = "ShippingCarrier", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected ShippingCarrierCodeType shippingCarrier;
    @XmlElement(name = "DetailVersion", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String detailVersion;
    @XmlElement(name = "UpdateTime", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updateTime;

    /**
     * Gets the value of the shippingCarrierID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getShippingCarrierID() {
        return shippingCarrierID;
    }

    /**
     * Sets the value of the shippingCarrierID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setShippingCarrierID(Integer value) {
        this.shippingCarrierID = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the shippingCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingCarrierCodeType }
     *     
     */
    public ShippingCarrierCodeType getShippingCarrier() {
        return shippingCarrier;
    }

    /**
     * Sets the value of the shippingCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingCarrierCodeType }
     *     
     */
    public void setShippingCarrier(ShippingCarrierCodeType value) {
        this.shippingCarrier = value;
    }

    /**
     * Gets the value of the detailVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetailVersion() {
        return detailVersion;
    }

    /**
     * Sets the value of the detailVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetailVersion(String value) {
        this.detailVersion = value;
    }

    /**
     * Gets the value of the updateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdateTime() {
        return updateTime;
    }

    /**
     * Sets the value of the updateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdateTime(XMLGregorianCalendar value) {
        this.updateTime = value;
    }

}
