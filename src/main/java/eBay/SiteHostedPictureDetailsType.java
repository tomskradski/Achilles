
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 *         Type defining the <b>SiteHostedPictureDetails</b> container that is returned
 * 				in an <b>UploadSiteHostedPictures</b> call. 
 *       
 * 
 * <p>Java class for SiteHostedPictureDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SiteHostedPictureDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PictureName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PictureSet" type="{urn:ebay:apis:eBLBaseComponents}PictureSetCodeType" minOccurs="0"/>
 *         &lt;element name="PictureFormat" type="{urn:ebay:apis:eBLBaseComponents}PictureFormatCodeType" minOccurs="0"/>
 *         &lt;element name="FullURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="BaseURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="PictureSetMember" type="{urn:ebay:apis:eBLBaseComponents}PictureSetMemberType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ExternalPictureURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="UseByDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SiteHostedPictureDetailsType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "pictureName",
    "pictureSet",
    "pictureFormat",
    "fullURL",
    "baseURL",
    "pictureSetMember",
    "externalPictureURL",
    "useByDate"
})
public class SiteHostedPictureDetailsType {

    @XmlElement(name = "PictureName", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String pictureName;
    @XmlElement(name = "PictureSet", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected PictureSetCodeType pictureSet;
    @XmlElement(name = "PictureFormat", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected PictureFormatCodeType pictureFormat;
    @XmlElement(name = "FullURL", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "anyURI")
    protected String fullURL;
    @XmlElement(name = "BaseURL", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "anyURI")
    protected String baseURL;
    @XmlElement(name = "PictureSetMember", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<PictureSetMemberType> pictureSetMember;
    @XmlElement(name = "ExternalPictureURL", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "anyURI")
    protected String externalPictureURL;
    @XmlElement(name = "UseByDate", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar useByDate;

    /**
     * Gets the value of the pictureName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPictureName() {
        return pictureName;
    }

    /**
     * Sets the value of the pictureName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPictureName(String value) {
        this.pictureName = value;
    }

    /**
     * Gets the value of the pictureSet property.
     * 
     * @return
     *     possible object is
     *     {@link PictureSetCodeType }
     *     
     */
    public PictureSetCodeType getPictureSet() {
        return pictureSet;
    }

    /**
     * Sets the value of the pictureSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link PictureSetCodeType }
     *     
     */
    public void setPictureSet(PictureSetCodeType value) {
        this.pictureSet = value;
    }

    /**
     * Gets the value of the pictureFormat property.
     * 
     * @return
     *     possible object is
     *     {@link PictureFormatCodeType }
     *     
     */
    public PictureFormatCodeType getPictureFormat() {
        return pictureFormat;
    }

    /**
     * Sets the value of the pictureFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link PictureFormatCodeType }
     *     
     */
    public void setPictureFormat(PictureFormatCodeType value) {
        this.pictureFormat = value;
    }

    /**
     * Gets the value of the fullURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullURL() {
        return fullURL;
    }

    /**
     * Sets the value of the fullURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullURL(String value) {
        this.fullURL = value;
    }

    /**
     * Gets the value of the baseURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseURL() {
        return baseURL;
    }

    /**
     * Sets the value of the baseURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseURL(String value) {
        this.baseURL = value;
    }

    /**
     * Gets the value of the pictureSetMember property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pictureSetMember property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPictureSetMember().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PictureSetMemberType }
     * 
     * 
     */
    public List<PictureSetMemberType> getPictureSetMember() {
        if (pictureSetMember == null) {
            pictureSetMember = new ArrayList<PictureSetMemberType>();
        }
        return this.pictureSetMember;
    }

    /**
     * Gets the value of the externalPictureURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalPictureURL() {
        return externalPictureURL;
    }

    /**
     * Sets the value of the externalPictureURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalPictureURL(String value) {
        this.externalPictureURL = value;
    }

    /**
     * Gets the value of the useByDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUseByDate() {
        return useByDate;
    }

    /**
     * Sets the value of the useByDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUseByDate(XMLGregorianCalendar value) {
        this.useByDate = value;
    }

}
