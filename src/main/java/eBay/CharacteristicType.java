
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
 * <p>Java class for CharacteristicType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CharacteristicType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AttributeID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DateFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DisplaySequence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DisplayUOM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Label" type="{urn:ebay:apis:eBLBaseComponents}LabelType" minOccurs="0"/>
 *         &lt;element name="SortOrder" type="{urn:ebay:apis:eBLBaseComponents}SortOrderCodeType" minOccurs="0"/>
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
@XmlType(name = "CharacteristicType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "attributeID",
    "dateFormat",
    "displaySequence",
    "displayUOM",
    "label",
    "sortOrder",
    "valueList"
})
public class CharacteristicType {

    @XmlElement(name = "AttributeID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected int attributeID;
    @XmlElement(name = "DateFormat", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String dateFormat;
    @XmlElement(name = "DisplaySequence", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String displaySequence;
    @XmlElement(name = "DisplayUOM", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String displayUOM;
    @XmlElement(name = "Label", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected LabelType label;
    @XmlElement(name = "SortOrder", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected SortOrderCodeType sortOrder;
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
     * Gets the value of the dateFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateFormat() {
        return dateFormat;
    }

    /**
     * Sets the value of the dateFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateFormat(String value) {
        this.dateFormat = value;
    }

    /**
     * Gets the value of the displaySequence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplaySequence() {
        return displaySequence;
    }

    /**
     * Sets the value of the displaySequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplaySequence(String value) {
        this.displaySequence = value;
    }

    /**
     * Gets the value of the displayUOM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayUOM() {
        return displayUOM;
    }

    /**
     * Sets the value of the displayUOM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayUOM(String value) {
        this.displayUOM = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link LabelType }
     *     
     */
    public LabelType getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link LabelType }
     *     
     */
    public void setLabel(LabelType value) {
        this.label = value;
    }

    /**
     * Gets the value of the sortOrder property.
     * 
     * @return
     *     possible object is
     *     {@link SortOrderCodeType }
     *     
     */
    public SortOrderCodeType getSortOrder() {
        return sortOrder;
    }

    /**
     * Sets the value of the sortOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortOrderCodeType }
     *     
     */
    public void setSortOrder(SortOrderCodeType value) {
        this.sortOrder = value;
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
