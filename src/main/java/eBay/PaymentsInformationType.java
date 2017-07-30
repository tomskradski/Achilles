
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This type defines the <strong>MonetaryDetails</strong> container, which consists of detailed information about one or more exchanges of funds that occur between the buyer, seller, eBay, and eBay partners during the lifecycle of an order, as well as detailed information about a merchant's refund (or store credit) to a buyer who has returned an In-Store Pickup item. 
 * 				<br/><br/>
 * 				<span class="tablenote">
 * 				<strong>Note:</strong> At this time, the In-Store Pickup feature is generally only available to large retail merchants, and can only be applied to multi-quantity, fixed-price listings. 
 * 				</span>
 * 			
 * 
 * <p>Java class for PaymentsInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentsInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Payments" type="{urn:ebay:apis:eBLBaseComponents}PaymentInformationType" minOccurs="0"/>
 *         &lt;element name="Refunds" type="{urn:ebay:apis:eBLBaseComponents}RefundInformationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentsInformationType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "payments",
    "refunds"
})
public class PaymentsInformationType {

    @XmlElement(name = "Payments", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected PaymentInformationType payments;
    @XmlElement(name = "Refunds", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected RefundInformationType refunds;

    /**
     * Gets the value of the payments property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInformationType }
     *     
     */
    public PaymentInformationType getPayments() {
        return payments;
    }

    /**
     * Sets the value of the payments property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInformationType }
     *     
     */
    public void setPayments(PaymentInformationType value) {
        this.payments = value;
    }

    /**
     * Gets the value of the refunds property.
     * 
     * @return
     *     possible object is
     *     {@link RefundInformationType }
     *     
     */
    public RefundInformationType getRefunds() {
        return refunds;
    }

    /**
     * Sets the value of the refunds property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefundInformationType }
     *     
     */
    public void setRefunds(RefundInformationType value) {
        this.refunds = value;
    }

}
