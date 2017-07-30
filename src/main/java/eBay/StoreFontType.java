
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 	  		Store font set.
 * 	  	
 * 
 * <p>Java class for StoreFontType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StoreFontType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NameFace" type="{urn:ebay:apis:eBLBaseComponents}StoreFontFaceCodeType" minOccurs="0"/>
 *         &lt;element name="NameSize" type="{urn:ebay:apis:eBLBaseComponents}StoreFontSizeCodeType" minOccurs="0"/>
 *         &lt;element name="NameColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TitleFace" type="{urn:ebay:apis:eBLBaseComponents}StoreFontFaceCodeType" minOccurs="0"/>
 *         &lt;element name="TitleSize" type="{urn:ebay:apis:eBLBaseComponents}StoreFontSizeCodeType" minOccurs="0"/>
 *         &lt;element name="TitleColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DescFace" type="{urn:ebay:apis:eBLBaseComponents}StoreFontFaceCodeType" minOccurs="0"/>
 *         &lt;element name="DescSize" type="{urn:ebay:apis:eBLBaseComponents}StoreFontSizeCodeType" minOccurs="0"/>
 *         &lt;element name="DescColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StoreFontType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "nameFace",
    "nameSize",
    "nameColor",
    "titleFace",
    "titleSize",
    "titleColor",
    "descFace",
    "descSize",
    "descColor"
})
public class StoreFontType {

    @XmlElement(name = "NameFace", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected StoreFontFaceCodeType nameFace;
    @XmlElement(name = "NameSize", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected StoreFontSizeCodeType nameSize;
    @XmlElement(name = "NameColor", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String nameColor;
    @XmlElement(name = "TitleFace", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected StoreFontFaceCodeType titleFace;
    @XmlElement(name = "TitleSize", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected StoreFontSizeCodeType titleSize;
    @XmlElement(name = "TitleColor", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String titleColor;
    @XmlElement(name = "DescFace", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected StoreFontFaceCodeType descFace;
    @XmlElement(name = "DescSize", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected StoreFontSizeCodeType descSize;
    @XmlElement(name = "DescColor", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String descColor;

    /**
     * Gets the value of the nameFace property.
     * 
     * @return
     *     possible object is
     *     {@link StoreFontFaceCodeType }
     *     
     */
    public StoreFontFaceCodeType getNameFace() {
        return nameFace;
    }

    /**
     * Sets the value of the nameFace property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoreFontFaceCodeType }
     *     
     */
    public void setNameFace(StoreFontFaceCodeType value) {
        this.nameFace = value;
    }

    /**
     * Gets the value of the nameSize property.
     * 
     * @return
     *     possible object is
     *     {@link StoreFontSizeCodeType }
     *     
     */
    public StoreFontSizeCodeType getNameSize() {
        return nameSize;
    }

    /**
     * Sets the value of the nameSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoreFontSizeCodeType }
     *     
     */
    public void setNameSize(StoreFontSizeCodeType value) {
        this.nameSize = value;
    }

    /**
     * Gets the value of the nameColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameColor() {
        return nameColor;
    }

    /**
     * Sets the value of the nameColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameColor(String value) {
        this.nameColor = value;
    }

    /**
     * Gets the value of the titleFace property.
     * 
     * @return
     *     possible object is
     *     {@link StoreFontFaceCodeType }
     *     
     */
    public StoreFontFaceCodeType getTitleFace() {
        return titleFace;
    }

    /**
     * Sets the value of the titleFace property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoreFontFaceCodeType }
     *     
     */
    public void setTitleFace(StoreFontFaceCodeType value) {
        this.titleFace = value;
    }

    /**
     * Gets the value of the titleSize property.
     * 
     * @return
     *     possible object is
     *     {@link StoreFontSizeCodeType }
     *     
     */
    public StoreFontSizeCodeType getTitleSize() {
        return titleSize;
    }

    /**
     * Sets the value of the titleSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoreFontSizeCodeType }
     *     
     */
    public void setTitleSize(StoreFontSizeCodeType value) {
        this.titleSize = value;
    }

    /**
     * Gets the value of the titleColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleColor() {
        return titleColor;
    }

    /**
     * Sets the value of the titleColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleColor(String value) {
        this.titleColor = value;
    }

    /**
     * Gets the value of the descFace property.
     * 
     * @return
     *     possible object is
     *     {@link StoreFontFaceCodeType }
     *     
     */
    public StoreFontFaceCodeType getDescFace() {
        return descFace;
    }

    /**
     * Sets the value of the descFace property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoreFontFaceCodeType }
     *     
     */
    public void setDescFace(StoreFontFaceCodeType value) {
        this.descFace = value;
    }

    /**
     * Gets the value of the descSize property.
     * 
     * @return
     *     possible object is
     *     {@link StoreFontSizeCodeType }
     *     
     */
    public StoreFontSizeCodeType getDescSize() {
        return descSize;
    }

    /**
     * Sets the value of the descSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoreFontSizeCodeType }
     *     
     */
    public void setDescSize(StoreFontSizeCodeType value) {
        this.descSize = value;
    }

    /**
     * Gets the value of the descColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescColor() {
        return descColor;
    }

    /**
     * Sets the value of the descColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescColor(String value) {
        this.descColor = value;
    }

}
