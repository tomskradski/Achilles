
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 * 				Contains the data for the pictures associated with an item.
 * 				 Not applicable to Half.com.
 * 			
 * 
 * <p>Java class for PictureDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PictureDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GalleryType" type="{urn:ebay:apis:eBLBaseComponents}GalleryTypeCodeType" minOccurs="0"/>
 *         &lt;element name="PhotoDisplay" type="{urn:ebay:apis:eBLBaseComponents}PhotoDisplayCodeType" minOccurs="0"/>
 *         &lt;element name="PictureURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PictureSource" type="{urn:ebay:apis:eBLBaseComponents}PictureSourceCodeType" minOccurs="0"/>
 *         &lt;element name="GalleryDuration" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="GalleryStatus" type="{urn:ebay:apis:eBLBaseComponents}GalleryStatusCodeType" minOccurs="0"/>
 *         &lt;element name="GalleryErrorInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExternalPictureURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ExtendedPictureDetails" type="{urn:ebay:apis:eBLBaseComponents}ExtendedPictureDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PictureDetailsType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "galleryType",
    "photoDisplay",
    "pictureURL",
    "pictureSource",
    "galleryDuration",
    "galleryStatus",
    "galleryErrorInfo",
    "externalPictureURL",
    "extendedPictureDetails"
})
public class PictureDetailsType {

    @XmlElement(name = "GalleryType", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected GalleryTypeCodeType galleryType;
    @XmlElement(name = "PhotoDisplay", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected PhotoDisplayCodeType photoDisplay;
    @XmlElement(name = "PictureURL", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "anyURI")
    protected List<String> pictureURL;
    @XmlElement(name = "PictureSource", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected PictureSourceCodeType pictureSource;
    @XmlElement(name = "GalleryDuration", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String galleryDuration;
    @XmlElement(name = "GalleryStatus", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected GalleryStatusCodeType galleryStatus;
    @XmlElement(name = "GalleryErrorInfo", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String galleryErrorInfo;
    @XmlElement(name = "ExternalPictureURL", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "anyURI")
    protected List<String> externalPictureURL;
    @XmlElement(name = "ExtendedPictureDetails", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected ExtendedPictureDetailsType extendedPictureDetails;

    /**
     * Gets the value of the galleryType property.
     * 
     * @return
     *     possible object is
     *     {@link GalleryTypeCodeType }
     *     
     */
    public GalleryTypeCodeType getGalleryType() {
        return galleryType;
    }

    /**
     * Sets the value of the galleryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GalleryTypeCodeType }
     *     
     */
    public void setGalleryType(GalleryTypeCodeType value) {
        this.galleryType = value;
    }

    /**
     * Gets the value of the photoDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link PhotoDisplayCodeType }
     *     
     */
    public PhotoDisplayCodeType getPhotoDisplay() {
        return photoDisplay;
    }

    /**
     * Sets the value of the photoDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhotoDisplayCodeType }
     *     
     */
    public void setPhotoDisplay(PhotoDisplayCodeType value) {
        this.photoDisplay = value;
    }

    /**
     * Gets the value of the pictureURL property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pictureURL property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPictureURL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPictureURL() {
        if (pictureURL == null) {
            pictureURL = new ArrayList<String>();
        }
        return this.pictureURL;
    }

    /**
     * Gets the value of the pictureSource property.
     * 
     * @return
     *     possible object is
     *     {@link PictureSourceCodeType }
     *     
     */
    public PictureSourceCodeType getPictureSource() {
        return pictureSource;
    }

    /**
     * Sets the value of the pictureSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link PictureSourceCodeType }
     *     
     */
    public void setPictureSource(PictureSourceCodeType value) {
        this.pictureSource = value;
    }

    /**
     * Gets the value of the galleryDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGalleryDuration() {
        return galleryDuration;
    }

    /**
     * Sets the value of the galleryDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGalleryDuration(String value) {
        this.galleryDuration = value;
    }

    /**
     * Gets the value of the galleryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link GalleryStatusCodeType }
     *     
     */
    public GalleryStatusCodeType getGalleryStatus() {
        return galleryStatus;
    }

    /**
     * Sets the value of the galleryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link GalleryStatusCodeType }
     *     
     */
    public void setGalleryStatus(GalleryStatusCodeType value) {
        this.galleryStatus = value;
    }

    /**
     * Gets the value of the galleryErrorInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGalleryErrorInfo() {
        return galleryErrorInfo;
    }

    /**
     * Sets the value of the galleryErrorInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGalleryErrorInfo(String value) {
        this.galleryErrorInfo = value;
    }

    /**
     * Gets the value of the externalPictureURL property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the externalPictureURL property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExternalPictureURL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getExternalPictureURL() {
        if (externalPictureURL == null) {
            externalPictureURL = new ArrayList<String>();
        }
        return this.externalPictureURL;
    }

    /**
     * Gets the value of the extendedPictureDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedPictureDetailsType }
     *     
     */
    public ExtendedPictureDetailsType getExtendedPictureDetails() {
        return extendedPictureDetails;
    }

    /**
     * Sets the value of the extendedPictureDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedPictureDetailsType }
     *     
     */
    public void setExtendedPictureDetails(ExtendedPictureDetailsType value) {
        this.extendedPictureDetails = value;
    }

}
