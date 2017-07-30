
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *  
 * 				Contains one or more stored comments for use as feedback to buyers.
 * 			
 * 
 * <p>Java class for FeedbackCommentArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeedbackCommentArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StoredCommentText" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeedbackCommentArrayType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "storedCommentText"
})
public class FeedbackCommentArrayType {

    @XmlElement(name = "StoredCommentText", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<String> storedCommentText;

    /**
     * Gets the value of the storedCommentText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the storedCommentText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStoredCommentText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getStoredCommentText() {
        if (storedCommentText == null) {
            storedCommentText = new ArrayList<String>();
        }
        return this.storedCommentText;
    }

}
