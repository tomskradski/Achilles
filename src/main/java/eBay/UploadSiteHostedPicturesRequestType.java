
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
 * 				Uploads a picture to the eBay Picture Service and returns a URL of the picture.
 * 				You will use this URL when creating the listing using one of the <b>AddItem</b> calls.
 * 			
 * 
 * <p>Java class for UploadSiteHostedPicturesRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UploadSiteHostedPicturesRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="PictureName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PictureSystemVersion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PictureSet" type="{urn:ebay:apis:eBLBaseComponents}PictureSetCodeType" minOccurs="0"/>
 *         &lt;element name="PictureData" type="{urn:ebay:apis:eBLBaseComponents}Base64BinaryType" minOccurs="0"/>
 *         &lt;element name="PictureUploadPolicy" type="{urn:ebay:apis:eBLBaseComponents}PictureUploadPolicyCodeType" minOccurs="0"/>
 *         &lt;element name="ExternalPictureURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PictureWatermark" type="{urn:ebay:apis:eBLBaseComponents}PictureWatermarkCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ExtensionInDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UploadSiteHostedPicturesRequestType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "pictureName",
    "pictureSystemVersion",
    "pictureSet",
    "pictureData",
    "pictureUploadPolicy",
    "externalPictureURL",
    "pictureWatermark",
    "extensionInDays"
})
public class UploadSiteHostedPicturesRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "PictureName", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String pictureName;
    @XmlElement(name = "PictureSystemVersion", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer pictureSystemVersion;
    @XmlElement(name = "PictureSet", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected PictureSetCodeType pictureSet;
    @XmlElement(name = "PictureData", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Base64BinaryType pictureData;
    @XmlElement(name = "PictureUploadPolicy", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected PictureUploadPolicyCodeType pictureUploadPolicy;
    @XmlElement(name = "ExternalPictureURL", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "anyURI")
    protected List<String> externalPictureURL;
    @XmlElement(name = "PictureWatermark", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected List<PictureWatermarkCodeType> pictureWatermark;
    @XmlElement(name = "ExtensionInDays", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer extensionInDays;

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
     * Gets the value of the pictureSystemVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPictureSystemVersion() {
        return pictureSystemVersion;
    }

    /**
     * Sets the value of the pictureSystemVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPictureSystemVersion(Integer value) {
        this.pictureSystemVersion = value;
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
     * Gets the value of the pictureData property.
     * 
     * @return
     *     possible object is
     *     {@link Base64BinaryType }
     *     
     */
    public Base64BinaryType getPictureData() {
        return pictureData;
    }

    /**
     * Sets the value of the pictureData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Base64BinaryType }
     *     
     */
    public void setPictureData(Base64BinaryType value) {
        this.pictureData = value;
    }

    /**
     * Gets the value of the pictureUploadPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link PictureUploadPolicyCodeType }
     *     
     */
    public PictureUploadPolicyCodeType getPictureUploadPolicy() {
        return pictureUploadPolicy;
    }

    /**
     * Sets the value of the pictureUploadPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link PictureUploadPolicyCodeType }
     *     
     */
    public void setPictureUploadPolicy(PictureUploadPolicyCodeType value) {
        this.pictureUploadPolicy = value;
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
     * Gets the value of the pictureWatermark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pictureWatermark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPictureWatermark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PictureWatermarkCodeType }
     * 
     * 
     */
    public List<PictureWatermarkCodeType> getPictureWatermark() {
        if (pictureWatermark == null) {
            pictureWatermark = new ArrayList<PictureWatermarkCodeType>();
        }
        return this.pictureWatermark;
    }

    /**
     * Gets the value of the extensionInDays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExtensionInDays() {
        return extensionInDays;
    }

    /**
     * Sets the value of the extensionInDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExtensionInDays(Integer value) {
        this.extensionInDays = value;
    }

}
