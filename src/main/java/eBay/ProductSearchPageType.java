
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
 * <p>Java class for ProductSearchPageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductSearchPageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SearchCharacteristicsSet" type="{urn:ebay:apis:eBLBaseComponents}CharacteristicsSetType" minOccurs="0"/>
 *         &lt;element name="SearchType" type="{urn:ebay:apis:eBLBaseComponents}CharacteristicsSearchCodeType" minOccurs="0"/>
 *         &lt;element name="SortCharacteristics" type="{urn:ebay:apis:eBLBaseComponents}CharacteristicType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DataElementSet" type="{urn:ebay:apis:eBLBaseComponents}DataElementSetType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductSearchPageType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "searchCharacteristicsSet",
    "searchType",
    "sortCharacteristics",
    "dataElementSet"
})
public class ProductSearchPageType {

    @XmlElement(name = "SearchCharacteristicsSet", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected CharacteristicsSetType searchCharacteristicsSet;
    @XmlElement(name = "SearchType", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected CharacteristicsSearchCodeType searchType;
    @XmlElement(name = "SortCharacteristics", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<CharacteristicType> sortCharacteristics;
    @XmlElement(name = "DataElementSet", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<DataElementSetType> dataElementSet;

    /**
     * Gets the value of the searchCharacteristicsSet property.
     * 
     * @return
     *     possible object is
     *     {@link CharacteristicsSetType }
     *     
     */
    public CharacteristicsSetType getSearchCharacteristicsSet() {
        return searchCharacteristicsSet;
    }

    /**
     * Sets the value of the searchCharacteristicsSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacteristicsSetType }
     *     
     */
    public void setSearchCharacteristicsSet(CharacteristicsSetType value) {
        this.searchCharacteristicsSet = value;
    }

    /**
     * Gets the value of the searchType property.
     * 
     * @return
     *     possible object is
     *     {@link CharacteristicsSearchCodeType }
     *     
     */
    public CharacteristicsSearchCodeType getSearchType() {
        return searchType;
    }

    /**
     * Sets the value of the searchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacteristicsSearchCodeType }
     *     
     */
    public void setSearchType(CharacteristicsSearchCodeType value) {
        this.searchType = value;
    }

    /**
     * Gets the value of the sortCharacteristics property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sortCharacteristics property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSortCharacteristics().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CharacteristicType }
     * 
     * 
     */
    public List<CharacteristicType> getSortCharacteristics() {
        if (sortCharacteristics == null) {
            sortCharacteristics = new ArrayList<CharacteristicType>();
        }
        return this.sortCharacteristics;
    }

    /**
     * Gets the value of the dataElementSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataElementSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataElementSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataElementSetType }
     * 
     * 
     */
    public List<DataElementSetType> getDataElementSet() {
        if (dataElementSet == null) {
            dataElementSet = new ArrayList<DataElementSetType>();
        }
        return this.dataElementSet;
    }

}
