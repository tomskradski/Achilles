
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This type is used by the <b>ErrorParameters</b> container if one or more errors or warnings occur with the call, and if a specific request parameter has been pinpointed as the reason why the error or warning was triggered.
 * 			
 * 
 * <p>Java class for ErrorParameterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ErrorParameterType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ParamID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErrorParameterType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "value"
})
public class ErrorParameterType {

    @XmlElement(name = "Value", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String value;
    @XmlAttribute(name = "ParamID")
    protected String paramID;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the paramID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParamID() {
        return paramID;
    }

    /**
     * Sets the value of the paramID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParamID(String value) {
        this.paramID = value;
    }

}
