
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
 * 				This type is deprecated.  
 * 			
 * 
 * <p>Java class for SearchAttributesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchAttributesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AttributeID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DateSpecifier" type="{urn:ebay:apis:eBLBaseComponents}DateSpecifierCodeType" minOccurs="0"/>
 *         &lt;element name="RangeSpecifier" type="{urn:ebay:apis:eBLBaseComponents}RangeCodeType" minOccurs="0"/>
 *         &lt;element name="ValueList" type="{urn:ebay:apis:eBLBaseComponents}ValType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchAttributesType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "attributeID",
    "dateSpecifier",
    "rangeSpecifier",
    "valueList"
})
public class SearchAttributesType {

    @XmlElement(name = "AttributeID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected int attributeID;
    @XmlElement(name = "DateSpecifier", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected DateSpecifierCodeType dateSpecifier;
    @XmlElement(name = "RangeSpecifier", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected RangeCodeType rangeSpecifier;
    @XmlElement(name = "ValueList", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<ValType> valueList;

    /**
     * Gets the value of the attributeID property.
     * 
     */
    public int getAttributeID() {
        return attributeID;
    }

    /**
     * Sets the value of the attributeID property.
     * 
     */
    public void setAttributeID(int value) {
        this.attributeID = value;
    }

    /**
     * Gets the value of the dateSpecifier property.
     * 
     * @return
     *     possible object is
     *     {@link DateSpecifierCodeType }
     *     
     */
    public DateSpecifierCodeType getDateSpecifier() {
        return dateSpecifier;
    }

    /**
     * Sets the value of the dateSpecifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateSpecifierCodeType }
     *     
     */
    public void setDateSpecifier(DateSpecifierCodeType value) {
        this.dateSpecifier = value;
    }

    /**
     * Gets the value of the rangeSpecifier property.
     * 
     * @return
     *     possible object is
     *     {@link RangeCodeType }
     *     
     */
    public RangeCodeType getRangeSpecifier() {
        return rangeSpecifier;
    }

    /**
     * Sets the value of the rangeSpecifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link RangeCodeType }
     *     
     */
    public void setRangeSpecifier(RangeCodeType value) {
        this.rangeSpecifier = value;
    }

    /**
     * Gets the value of the valueList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valueList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValueList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValType }
     * 
     * 
     */
    public List<ValType> getValueList() {
        if (valueList == null) {
            valueList = new ArrayList<ValType>();
        }
        return this.valueList;
    }

}
