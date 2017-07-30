
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This type is deprecated.
 * 			
 * 
 * <p>Java class for RefundFundingSourceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RefundFundingSourceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RefundingSourceType" type="{urn:ebay:apis:eBLBaseComponents}RefundingSourceTypeCodeType" minOccurs="0"/>
 *         &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RefundAmount" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="SellerExternalTransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BuyerExternalTransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RefundFundingSourceType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "refundingSourceType",
    "accountNumber",
    "refundAmount",
    "sellerExternalTransactionID",
    "buyerExternalTransactionID"
})
public class RefundFundingSourceType {

    @XmlElement(name = "RefundingSourceType", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected RefundingSourceTypeCodeType refundingSourceType;
    @XmlElement(name = "AccountNumber", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String accountNumber;
    @XmlElement(name = "RefundAmount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType refundAmount;
    @XmlElement(name = "SellerExternalTransactionID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String sellerExternalTransactionID;
    @XmlElement(name = "BuyerExternalTransactionID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String buyerExternalTransactionID;

    /**
     * Gets the value of the refundingSourceType property.
     * 
     * @return
     *     possible object is
     *     {@link RefundingSourceTypeCodeType }
     *     
     */
    public RefundingSourceTypeCodeType getRefundingSourceType() {
        return refundingSourceType;
    }

    /**
     * Sets the value of the refundingSourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefundingSourceTypeCodeType }
     *     
     */
    public void setRefundingSourceType(RefundingSourceTypeCodeType value) {
        this.refundingSourceType = value;
    }

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the refundAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getRefundAmount() {
        return refundAmount;
    }

    /**
     * Sets the value of the refundAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setRefundAmount(AmountType value) {
        this.refundAmount = value;
    }

    /**
     * Gets the value of the sellerExternalTransactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerExternalTransactionID() {
        return sellerExternalTransactionID;
    }

    /**
     * Sets the value of the sellerExternalTransactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerExternalTransactionID(String value) {
        this.sellerExternalTransactionID = value;
    }

    /**
     * Gets the value of the buyerExternalTransactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyerExternalTransactionID() {
        return buyerExternalTransactionID;
    }

    /**
     * Sets the value of the buyerExternalTransactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyerExternalTransactionID(String value) {
        this.buyerExternalTransactionID = value;
    }

}
