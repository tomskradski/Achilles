
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 			This type is used by the <b>ASQPreferences</b> container to allow the seller to add custom Ask Seller a Question (ASQ) subjects to item listings, or to reset the custom subjects to the default eBay values.
 * 		
 * 
 * <p>Java class for ASQPreferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ASQPreferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResetDefaultSubjects" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ASQPreferencesType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "resetDefaultSubjects",
    "subject"
})
public class ASQPreferencesType {

    @XmlElement(name = "ResetDefaultSubjects", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean resetDefaultSubjects;
    @XmlElement(name = "Subject", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<String> subject;

    /**
     * Gets the value of the resetDefaultSubjects property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isResetDefaultSubjects() {
        return resetDefaultSubjects;
    }

    /**
     * Sets the value of the resetDefaultSubjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setResetDefaultSubjects(Boolean value) {
        this.resetDefaultSubjects = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSubject() {
        if (subject == null) {
            subject = new ArrayList<String>();
        }
        return this.subject;
    }

}
