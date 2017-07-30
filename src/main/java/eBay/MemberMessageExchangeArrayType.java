
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Container for messages. Returned for GetMemberMessages if messages that meet the request criteria exist.
 * 			
 * 
 * <p>Java class for MemberMessageExchangeArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MemberMessageExchangeArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MemberMessageExchange" type="{urn:ebay:apis:eBLBaseComponents}MemberMessageExchangeType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MemberMessageExchangeArrayType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "memberMessageExchange"
})
public class MemberMessageExchangeArrayType {

    @XmlElement(name = "MemberMessageExchange", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<MemberMessageExchangeType> memberMessageExchange;

    /**
     * Gets the value of the memberMessageExchange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the memberMessageExchange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMemberMessageExchange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MemberMessageExchangeType }
     * 
     * 
     */
    public List<MemberMessageExchangeType> getMemberMessageExchange() {
        if (memberMessageExchange == null) {
            memberMessageExchange = new ArrayList<MemberMessageExchangeType>();
        }
        return this.memberMessageExchange;
    }

}
