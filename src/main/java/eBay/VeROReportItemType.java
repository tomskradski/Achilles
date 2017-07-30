
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
 * 				This type is used by the <b>ReportItem</b> container. A <b>ReportItem</b> container is required for each eBay item that the product owner is reporting as violating the product owner's copyright, trademark, or intellectual property rights.
 * 			
 * 
 * <p>Java class for VeROReportItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VeROReportItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ItemID" type="{urn:ebay:apis:eBLBaseComponents}ItemIDType" minOccurs="0"/>
 *         &lt;element name="VeROReasonCodeID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="MessageToSeller" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CopyEmailToRightsOwner" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Region" type="{urn:ebay:apis:eBLBaseComponents}ShippingRegionCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Country" type="{urn:ebay:apis:eBLBaseComponents}CountryCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Patent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DetailedMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VeROReportItemType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "itemID",
    "veROReasonCodeID",
    "messageToSeller",
    "copyEmailToRightsOwner",
    "region",
    "country",
    "patent",
    "detailedMessage"
})
public class VeROReportItemType {

    @XmlElement(name = "ItemID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String itemID;
    @XmlElement(name = "VeROReasonCodeID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Long veROReasonCodeID;
    @XmlElement(name = "MessageToSeller", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String messageToSeller;
    @XmlElement(name = "CopyEmailToRightsOwner", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean copyEmailToRightsOwner;
    @XmlElement(name = "Region", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected List<ShippingRegionCodeType> region;
    @XmlElement(name = "Country", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected List<CountryCodeType> country;
    @XmlElement(name = "Patent", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String patent;
    @XmlElement(name = "DetailedMessage", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String detailedMessage;

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
     * Gets the value of the veROReasonCodeID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVeROReasonCodeID() {
        return veROReasonCodeID;
    }

    /**
     * Sets the value of the veROReasonCodeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVeROReasonCodeID(Long value) {
        this.veROReasonCodeID = value;
    }

    /**
     * Gets the value of the messageToSeller property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageToSeller() {
        return messageToSeller;
    }

    /**
     * Sets the value of the messageToSeller property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageToSeller(String value) {
        this.messageToSeller = value;
    }

    /**
     * Gets the value of the copyEmailToRightsOwner property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCopyEmailToRightsOwner() {
        return copyEmailToRightsOwner;
    }

    /**
     * Sets the value of the copyEmailToRightsOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCopyEmailToRightsOwner(Boolean value) {
        this.copyEmailToRightsOwner = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the region property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShippingRegionCodeType }
     * 
     * 
     */
    public List<ShippingRegionCodeType> getRegion() {
        if (region == null) {
            region = new ArrayList<ShippingRegionCodeType>();
        }
        return this.region;
    }

    /**
     * Gets the value of the country property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the country property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CountryCodeType }
     * 
     * 
     */
    public List<CountryCodeType> getCountry() {
        if (country == null) {
            country = new ArrayList<CountryCodeType>();
        }
        return this.country;
    }

    /**
     * Gets the value of the patent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatent() {
        return patent;
    }

    /**
     * Sets the value of the patent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatent(String value) {
        this.patent = value;
    }

    /**
     * Gets the value of the detailedMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetailedMessage() {
        return detailedMessage;
    }

    /**
     * Sets the value of the detailedMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetailedMessage(String value) {
        this.detailedMessage = value;
    }

}
