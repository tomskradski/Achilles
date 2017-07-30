
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Type that provides detailed information on a Listing Designer Theme or Layout.
 * 			
 * 
 * <p>Java class for DescriptionTemplateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescriptionTemplateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GroupID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ImageURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TemplateXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type" type="{urn:ebay:apis:eBLBaseComponents}DescriptionTemplateCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescriptionTemplateType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "groupID",
    "id",
    "imageURL",
    "name",
    "templateXML",
    "type"
})
public class DescriptionTemplateType {

    @XmlElement(name = "GroupID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer groupID;
    @XmlElement(name = "ID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer id;
    @XmlElement(name = "ImageURL", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "anyURI")
    protected String imageURL;
    @XmlElement(name = "Name", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String name;
    @XmlElement(name = "TemplateXML", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String templateXML;
    @XmlElement(name = "Type", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected DescriptionTemplateCodeType type;

    /**
     * Gets the value of the groupID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGroupID() {
        return groupID;
    }

    /**
     * Sets the value of the groupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGroupID(Integer value) {
        this.groupID = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setID(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the imageURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageURL() {
        return imageURL;
    }

    /**
     * Sets the value of the imageURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageURL(String value) {
        this.imageURL = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the templateXML property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateXML() {
        return templateXML;
    }

    /**
     * Sets the value of the templateXML property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateXML(String value) {
        this.templateXML = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link DescriptionTemplateCodeType }
     *     
     */
    public DescriptionTemplateCodeType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescriptionTemplateCodeType }
     *     
     */
    public void setType(DescriptionTemplateCodeType value) {
        this.type = value;
    }

}
