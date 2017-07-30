
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 * 				Type defining the <b>ReturnPolicyDetails.ReturnsAccepted</b> container that 
 * 				is returned in <b>GeteBayDetails</b>. This container contains the values 
 * 				that may be used in the <b>ReturnPolicy.ReturnsAcceptedOption</b> field of Add/Revise/Relist 
 * 				API calls.
 * 			
 * 
 * <p>Java class for ReturnsAcceptedDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReturnsAcceptedDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReturnsAcceptedOption" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReturnsAcceptedDetailsType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "returnsAcceptedOption",
    "description"
})
public class ReturnsAcceptedDetailsType {

    @XmlElement(name = "ReturnsAcceptedOption", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String returnsAcceptedOption;
    @XmlElement(name = "Description", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String description;

    /**
     * Gets the value of the returnsAcceptedOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnsAcceptedOption() {
        return returnsAcceptedOption;
    }

    /**
     * Sets the value of the returnsAcceptedOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnsAcceptedOption(String value) {
        this.returnsAcceptedOption = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
