
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This type is deprecated.
 * 			
 * 
 * <p>Java class for RefundLineType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RefundLineType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;urn:ebay:apis:eBLBaseComponents>AmountType">
 *       &lt;attribute name="type" type="{urn:ebay:apis:eBLBaseComponents}RefundLineTypeCodeType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RefundLineType", namespace = "urn:ebay:apis:eBLBaseComponents")
public class RefundLineType
    extends AmountType
{

    @XmlAttribute(name = "type")
    protected RefundLineTypeCodeType type;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link RefundLineTypeCodeType }
     *     
     */
    public RefundLineTypeCodeType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefundLineTypeCodeType }
     *     
     */
    public void setType(RefundLineTypeCodeType value) {
        this.type = value;
    }

}
