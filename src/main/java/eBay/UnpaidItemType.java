
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Type defining the <strong>UnpaidItem</strong> container, which consists of
 * 				details related to the type and status of an Unpaid Item case.
 * 			
 * 
 * <p>Java class for UnpaidItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnpaidItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Status" type="{urn:ebay:apis:eBLBaseComponents}UnpaidItemCaseStatusTypeCodeType" minOccurs="0"/>
 *         &lt;element name="Type" type="{urn:ebay:apis:eBLBaseComponents}UnpaidItemCaseOpenTypeCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnpaidItemType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "status",
    "type"
})
public class UnpaidItemType {

    @XmlElement(name = "Status", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected UnpaidItemCaseStatusTypeCodeType status;
    @XmlElement(name = "Type", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected UnpaidItemCaseOpenTypeCodeType type;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link UnpaidItemCaseStatusTypeCodeType }
     *     
     */
    public UnpaidItemCaseStatusTypeCodeType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnpaidItemCaseStatusTypeCodeType }
     *     
     */
    public void setStatus(UnpaidItemCaseStatusTypeCodeType value) {
        this.status = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link UnpaidItemCaseOpenTypeCodeType }
     *     
     */
    public UnpaidItemCaseOpenTypeCodeType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnpaidItemCaseOpenTypeCodeType }
     *     
     */
    public void setType(UnpaidItemCaseOpenTypeCodeType value) {
        this.type = value;
    }

}
