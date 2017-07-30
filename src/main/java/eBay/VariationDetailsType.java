
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * 				Type defining the <b>VariationDetails</b> container that is returned in 
 * 				<b>GeteBayDetails</b> if <b>VariationDetails</b> is included 
 * 				in the request as a <b>DetailName</b> filter, or if <b>GeteBayDetails</b> 
 * 				is called with no <b>DetailName</b> filters.
 * 			
 * 
 * <p>Java class for VariationDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VariationDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MaxVariationsPerItem" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MaxNamesPerVariationSpecificsSet" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MaxValuesPerVariationSpecificsSetName" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
@XmlType(name = "VariationDetailsType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "maxVariationsPerItem",
    "maxNamesPerVariationSpecificsSet",
    "maxValuesPerVariationSpecificsSetName",
    "detailVersion",
    "updateTime"
})
public class VariationDetailsType {

    @XmlElement(name = "MaxVariationsPerItem", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer maxVariationsPerItem;
    @XmlElement(name = "MaxNamesPerVariationSpecificsSet", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer maxNamesPerVariationSpecificsSet;
    @XmlElement(name = "MaxValuesPerVariationSpecificsSetName", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer maxValuesPerVariationSpecificsSetName;
    @XmlElement(name = "DetailVersion", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String detailVersion;
    @XmlElement(name = "UpdateTime", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updateTime;

    /**
     * Gets the value of the maxVariationsPerItem property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxVariationsPerItem() {
        return maxVariationsPerItem;
    }

    /**
     * Sets the value of the maxVariationsPerItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxVariationsPerItem(Integer value) {
        this.maxVariationsPerItem = value;
    }

    /**
     * Gets the value of the maxNamesPerVariationSpecificsSet property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxNamesPerVariationSpecificsSet() {
        return maxNamesPerVariationSpecificsSet;
    }

    /**
     * Sets the value of the maxNamesPerVariationSpecificsSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxNamesPerVariationSpecificsSet(Integer value) {
        this.maxNamesPerVariationSpecificsSet = value;
    }

    /**
     * Gets the value of the maxValuesPerVariationSpecificsSetName property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxValuesPerVariationSpecificsSetName() {
        return maxValuesPerVariationSpecificsSetName;
    }

    /**
     * Sets the value of the maxValuesPerVariationSpecificsSetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxValuesPerVariationSpecificsSetName(Integer value) {
        this.maxValuesPerVariationSpecificsSetName = value;
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
