
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
 * <p>Java class for RefundLineArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RefundLineArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RefundLine" type="{urn:ebay:apis:eBLBaseComponents}RefundLineType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RefundLineArrayType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "refundLine"
})
public class RefundLineArrayType {

    @XmlElement(name = "RefundLine", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<RefundLineType> refundLine;

    /**
     * Gets the value of the refundLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refundLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefundLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RefundLineType }
     * 
     * 
     */
    public List<RefundLineType> getRefundLine() {
        if (refundLine == null) {
            refundLine = new ArrayList<RefundLineType>();
        }
        return this.refundLine;
    }

}
