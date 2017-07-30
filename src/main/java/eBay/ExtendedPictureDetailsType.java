
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This container returns the URLs of the seller's self-hosted (hosted outside of eBay) pictures and the URL for the corresponding eBay
 * 				Picture Services (EPS), that was generated when the self-hosted picture was uploaded.
 * 			
 * 
 * <p>Java class for ExtendedPictureDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtendedPictureDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PictureURLs" type="{urn:ebay:apis:eBLBaseComponents}PictureURLsType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtendedPictureDetailsType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "pictureURLs"
})
public class ExtendedPictureDetailsType {

    @XmlElement(name = "PictureURLs", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<PictureURLsType> pictureURLs;

    /**
     * Gets the value of the pictureURLs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pictureURLs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPictureURLs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PictureURLsType }
     * 
     * 
     */
    public List<PictureURLsType> getPictureURLs() {
        if (pictureURLs == null) {
            pictureURLs = new ArrayList<PictureURLsType>();
        }
        return this.pictureURLs;
    }

}
