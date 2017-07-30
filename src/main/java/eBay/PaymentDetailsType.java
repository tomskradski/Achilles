
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 			Type defining the <b>PaymentDetails</b> container, which is used by the seller to
 * 			specify amounts and due dates for deposits and full payment on motor vehicle listings.
 * 		
 * 
 * <p>Java class for PaymentDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HoursToDeposit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DaysToFullPayment" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DepositAmount" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="DepositType" type="{urn:ebay:apis:eBLBaseComponents}DepositTypeCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentDetailsType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "hoursToDeposit",
    "daysToFullPayment",
    "depositAmount",
    "depositType"
})
public class PaymentDetailsType {

    @XmlElement(name = "HoursToDeposit", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer hoursToDeposit;
    @XmlElement(name = "DaysToFullPayment", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer daysToFullPayment;
    @XmlElement(name = "DepositAmount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType depositAmount;
    @XmlElement(name = "DepositType", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected DepositTypeCodeType depositType;

    /**
     * Gets the value of the hoursToDeposit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHoursToDeposit() {
        return hoursToDeposit;
    }

    /**
     * Sets the value of the hoursToDeposit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHoursToDeposit(Integer value) {
        this.hoursToDeposit = value;
    }

    /**
     * Gets the value of the daysToFullPayment property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDaysToFullPayment() {
        return daysToFullPayment;
    }

    /**
     * Sets the value of the daysToFullPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDaysToFullPayment(Integer value) {
        this.daysToFullPayment = value;
    }

    /**
     * Gets the value of the depositAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDepositAmount() {
        return depositAmount;
    }

    /**
     * Sets the value of the depositAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDepositAmount(AmountType value) {
        this.depositAmount = value;
    }

    /**
     * Gets the value of the depositType property.
     * 
     * @return
     *     possible object is
     *     {@link DepositTypeCodeType }
     *     
     */
    public DepositTypeCodeType getDepositType() {
        return depositType;
    }

    /**
     * Sets the value of the depositType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepositTypeCodeType }
     *     
     */
    public void setDepositType(DepositTypeCodeType value) {
        this.depositType = value;
    }

}
