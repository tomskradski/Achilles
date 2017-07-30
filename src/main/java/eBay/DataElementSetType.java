
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This type is deprecated.
 * 			
 * 
 * <p>Java class for DataElementSetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataElementSetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DataElement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataElementID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="attributeSetID" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataElementSetType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "dataElement",
    "dataElementID"
})
public class DataElementSetType {

    @XmlElement(name = "DataElement", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String dataElement;
    @XmlElement(name = "DataElementID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer dataElementID;
    @XmlAttribute(name = "attributeSetID")
    protected Integer attributeSetID;

    /**
     * Gets the value of the dataElement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataElement() {
        return dataElement;
    }

    /**
     * Sets the value of the dataElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataElement(String value) {
        this.dataElement = value;
    }

    /**
     * Gets the value of the dataElementID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDataElementID() {
        return dataElementID;
    }

    /**
     * Sets the value of the dataElementID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDataElementID(Integer value) {
        this.dataElementID = value;
    }

    /**
     * Gets the value of the attributeSetID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAttributeSetID() {
        return attributeSetID;
    }

    /**
     * Sets the value of the attributeSetID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAttributeSetID(Integer value) {
        this.attributeSetID = value;
    }

}
