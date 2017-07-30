
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				A container for VeRO reason code details.
 * 			
 * 
 * <p>Java class for ReasonCodeDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReasonCodeDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BriefText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DetailedText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="codeID" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReasonCodeDetailType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "briefText",
    "detailedText"
})
public class ReasonCodeDetailType {

    @XmlElement(name = "BriefText", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String briefText;
    @XmlElement(name = "DetailedText", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String detailedText;
    @XmlAttribute(name = "codeID")
    protected Long codeID;

    /**
     * Gets the value of the briefText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBriefText() {
        return briefText;
    }

    /**
     * Sets the value of the briefText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBriefText(String value) {
        this.briefText = value;
    }

    /**
     * Gets the value of the detailedText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetailedText() {
        return detailedText;
    }

    /**
     * Sets the value of the detailedText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetailedText(String value) {
        this.detailedText = value;
    }

    /**
     * Gets the value of the codeID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCodeID() {
        return codeID;
    }

    /**
     * Sets the value of the codeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCodeID(Long value) {
        this.codeID = value;
    }

}
