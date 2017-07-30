
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This type is deprecated.
 * 			
 * 
 * <p>Java class for WantItNowPostArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WantItNowPostArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WantItNowPost" type="{urn:ebay:apis:eBLBaseComponents}WantItNowPostType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WantItNowPostArrayType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "wantItNowPost"
})
public class WantItNowPostArrayType {

    @XmlElement(name = "WantItNowPost", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<WantItNowPostType> wantItNowPost;

    /**
     * Gets the value of the wantItNowPost property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wantItNowPost property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWantItNowPost().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WantItNowPostType }
     * 
     * 
     */
    public List<WantItNowPostType> getWantItNowPost() {
        if (wantItNowPost == null) {
            wantItNowPost = new ArrayList<WantItNowPostType>();
        }
        return this.wantItNowPost;
    }

}
