
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * 				Details about custom Item Specifics validation rules.
 * 			
 * 
 * <p>Java class for ItemSpecificDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemSpecificDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MaxItemSpecificsPerItem" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MaxValuesPerName" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MaxCharactersPerValue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MaxCharactersPerName" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
@XmlType(name = "ItemSpecificDetailsType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "maxItemSpecificsPerItem",
    "maxValuesPerName",
    "maxCharactersPerValue",
    "maxCharactersPerName",
    "detailVersion",
    "updateTime"
})
public class ItemSpecificDetailsType {

    @XmlElement(name = "MaxItemSpecificsPerItem", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer maxItemSpecificsPerItem;
    @XmlElement(name = "MaxValuesPerName", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer maxValuesPerName;
    @XmlElement(name = "MaxCharactersPerValue", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer maxCharactersPerValue;
    @XmlElement(name = "MaxCharactersPerName", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer maxCharactersPerName;
    @XmlElement(name = "DetailVersion", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String detailVersion;
    @XmlElement(name = "UpdateTime", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updateTime;

    /**
     * Gets the value of the maxItemSpecificsPerItem property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxItemSpecificsPerItem() {
        return maxItemSpecificsPerItem;
    }

    /**
     * Sets the value of the maxItemSpecificsPerItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxItemSpecificsPerItem(Integer value) {
        this.maxItemSpecificsPerItem = value;
    }

    /**
     * Gets the value of the maxValuesPerName property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxValuesPerName() {
        return maxValuesPerName;
    }

    /**
     * Sets the value of the maxValuesPerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxValuesPerName(Integer value) {
        this.maxValuesPerName = value;
    }

    /**
     * Gets the value of the maxCharactersPerValue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxCharactersPerValue() {
        return maxCharactersPerValue;
    }

    /**
     * Sets the value of the maxCharactersPerValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxCharactersPerValue(Integer value) {
        this.maxCharactersPerValue = value;
    }

    /**
     * Gets the value of the maxCharactersPerName property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxCharactersPerName() {
        return maxCharactersPerName;
    }

    /**
     * Sets the value of the maxCharactersPerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxCharactersPerName(Integer value) {
        this.maxCharactersPerName = value;
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
