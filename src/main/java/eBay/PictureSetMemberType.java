
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				URL and size information for each generated and stored picture.
 * 				This data is provided for use in application previews of pictures.
 * 				This data is used for display control for specific pictures in the generated imageset.
 * 				This container is supplied for all generated pictures.
 * 			
 * 
 * <p>Java class for PictureSetMemberType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PictureSetMemberType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MemberURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="PictureHeight" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PictureWidth" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PictureSetMemberType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "memberURL",
    "pictureHeight",
    "pictureWidth"
})
public class PictureSetMemberType {

    @XmlElement(name = "MemberURL", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "anyURI")
    protected String memberURL;
    @XmlElement(name = "PictureHeight", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer pictureHeight;
    @XmlElement(name = "PictureWidth", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer pictureWidth;

    /**
     * Gets the value of the memberURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberURL() {
        return memberURL;
    }

    /**
     * Sets the value of the memberURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberURL(String value) {
        this.memberURL = value;
    }

    /**
     * Gets the value of the pictureHeight property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPictureHeight() {
        return pictureHeight;
    }

    /**
     * Sets the value of the pictureHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPictureHeight(Integer value) {
        this.pictureHeight = value;
    }

    /**
     * Gets the value of the pictureWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPictureWidth() {
        return pictureWidth;
    }

    /**
     * Sets the value of the pictureWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPictureWidth(Integer value) {
        this.pictureWidth = value;
    }

}
