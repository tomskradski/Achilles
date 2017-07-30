
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * 				Summary data for the requesting user's seller account as a whole. This includes a
 * 				balance for the account, any past due amount and date, and defining data for
 * 				additional accounts (if the user has changed country of residency while having an
 * 				active eBay account).
 * 			
 * 
 * <p>Java class for AccountSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountState" type="{urn:ebay:apis:eBLBaseComponents}AccountStateCodeType" minOccurs="0"/>
 *         &lt;element name="InvoicePayment" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="InvoiceCredit" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="InvoiceNewFee" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="AdditionalAccount" type="{urn:ebay:apis:eBLBaseComponents}AdditionalAccountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AmountPastDue" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="BankAccountInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BankModifyDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="BillingCycleDate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CreditCardExpiration" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CreditCardInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditCardModifyDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CurrentBalance" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InvoiceBalance" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="InvoiceDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastAmountPaid" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="LastPaymentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PastDue" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PaymentMethod" type="{urn:ebay:apis:eBLBaseComponents}SellerPaymentMethodCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountSummaryType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "accountState",
    "invoicePayment",
    "invoiceCredit",
    "invoiceNewFee",
    "additionalAccount",
    "amountPastDue",
    "bankAccountInfo",
    "bankModifyDate",
    "billingCycleDate",
    "creditCardExpiration",
    "creditCardInfo",
    "creditCardModifyDate",
    "currentBalance",
    "email",
    "invoiceBalance",
    "invoiceDate",
    "lastAmountPaid",
    "lastPaymentDate",
    "pastDue",
    "paymentMethod"
})
public class AccountSummaryType {

    @XmlElement(name = "AccountState", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected AccountStateCodeType accountState;
    @XmlElement(name = "InvoicePayment", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType invoicePayment;
    @XmlElement(name = "InvoiceCredit", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType invoiceCredit;
    @XmlElement(name = "InvoiceNewFee", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType invoiceNewFee;
    @XmlElement(name = "AdditionalAccount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<AdditionalAccountType> additionalAccount;
    @XmlElement(name = "AmountPastDue", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType amountPastDue;
    @XmlElement(name = "BankAccountInfo", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String bankAccountInfo;
    @XmlElement(name = "BankModifyDate", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar bankModifyDate;
    @XmlElement(name = "BillingCycleDate", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer billingCycleDate;
    @XmlElement(name = "CreditCardExpiration", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creditCardExpiration;
    @XmlElement(name = "CreditCardInfo", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String creditCardInfo;
    @XmlElement(name = "CreditCardModifyDate", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creditCardModifyDate;
    @XmlElement(name = "CurrentBalance", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType currentBalance;
    @XmlElement(name = "Email", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String email;
    @XmlElement(name = "InvoiceBalance", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType invoiceBalance;
    @XmlElement(name = "InvoiceDate", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar invoiceDate;
    @XmlElement(name = "LastAmountPaid", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AmountType lastAmountPaid;
    @XmlElement(name = "LastPaymentDate", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastPaymentDate;
    @XmlElement(name = "PastDue", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean pastDue;
    @XmlElement(name = "PaymentMethod", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected SellerPaymentMethodCodeType paymentMethod;

    /**
     * Gets the value of the accountState property.
     * 
     * @return
     *     possible object is
     *     {@link AccountStateCodeType }
     *     
     */
    public AccountStateCodeType getAccountState() {
        return accountState;
    }

    /**
     * Sets the value of the accountState property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountStateCodeType }
     *     
     */
    public void setAccountState(AccountStateCodeType value) {
        this.accountState = value;
    }

    /**
     * Gets the value of the invoicePayment property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getInvoicePayment() {
        return invoicePayment;
    }

    /**
     * Sets the value of the invoicePayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setInvoicePayment(AmountType value) {
        this.invoicePayment = value;
    }

    /**
     * Gets the value of the invoiceCredit property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getInvoiceCredit() {
        return invoiceCredit;
    }

    /**
     * Sets the value of the invoiceCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setInvoiceCredit(AmountType value) {
        this.invoiceCredit = value;
    }

    /**
     * Gets the value of the invoiceNewFee property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getInvoiceNewFee() {
        return invoiceNewFee;
    }

    /**
     * Sets the value of the invoiceNewFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setInvoiceNewFee(AmountType value) {
        this.invoiceNewFee = value;
    }

    /**
     * Gets the value of the additionalAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalAccountType }
     * 
     * 
     */
    public List<AdditionalAccountType> getAdditionalAccount() {
        if (additionalAccount == null) {
            additionalAccount = new ArrayList<AdditionalAccountType>();
        }
        return this.additionalAccount;
    }

    /**
     * Gets the value of the amountPastDue property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmountPastDue() {
        return amountPastDue;
    }

    /**
     * Sets the value of the amountPastDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmountPastDue(AmountType value) {
        this.amountPastDue = value;
    }

    /**
     * Gets the value of the bankAccountInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAccountInfo() {
        return bankAccountInfo;
    }

    /**
     * Sets the value of the bankAccountInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAccountInfo(String value) {
        this.bankAccountInfo = value;
    }

    /**
     * Gets the value of the bankModifyDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBankModifyDate() {
        return bankModifyDate;
    }

    /**
     * Sets the value of the bankModifyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBankModifyDate(XMLGregorianCalendar value) {
        this.bankModifyDate = value;
    }

    /**
     * Gets the value of the billingCycleDate property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBillingCycleDate() {
        return billingCycleDate;
    }

    /**
     * Sets the value of the billingCycleDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBillingCycleDate(Integer value) {
        this.billingCycleDate = value;
    }

    /**
     * Gets the value of the creditCardExpiration property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreditCardExpiration() {
        return creditCardExpiration;
    }

    /**
     * Sets the value of the creditCardExpiration property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreditCardExpiration(XMLGregorianCalendar value) {
        this.creditCardExpiration = value;
    }

    /**
     * Gets the value of the creditCardInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardInfo() {
        return creditCardInfo;
    }

    /**
     * Sets the value of the creditCardInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardInfo(String value) {
        this.creditCardInfo = value;
    }

    /**
     * Gets the value of the creditCardModifyDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreditCardModifyDate() {
        return creditCardModifyDate;
    }

    /**
     * Sets the value of the creditCardModifyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreditCardModifyDate(XMLGregorianCalendar value) {
        this.creditCardModifyDate = value;
    }

    /**
     * Gets the value of the currentBalance property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCurrentBalance() {
        return currentBalance;
    }

    /**
     * Sets the value of the currentBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCurrentBalance(AmountType value) {
        this.currentBalance = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the invoiceBalance property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getInvoiceBalance() {
        return invoiceBalance;
    }

    /**
     * Sets the value of the invoiceBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setInvoiceBalance(AmountType value) {
        this.invoiceBalance = value;
    }

    /**
     * Gets the value of the invoiceDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInvoiceDate() {
        return invoiceDate;
    }

    /**
     * Sets the value of the invoiceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInvoiceDate(XMLGregorianCalendar value) {
        this.invoiceDate = value;
    }

    /**
     * Gets the value of the lastAmountPaid property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLastAmountPaid() {
        return lastAmountPaid;
    }

    /**
     * Sets the value of the lastAmountPaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLastAmountPaid(AmountType value) {
        this.lastAmountPaid = value;
    }

    /**
     * Gets the value of the lastPaymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastPaymentDate() {
        return lastPaymentDate;
    }

    /**
     * Sets the value of the lastPaymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastPaymentDate(XMLGregorianCalendar value) {
        this.lastPaymentDate = value;
    }

    /**
     * Gets the value of the pastDue property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPastDue() {
        return pastDue;
    }

    /**
     * Sets the value of the pastDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPastDue(Boolean value) {
        this.pastDue = value;
    }

    /**
     * Gets the value of the paymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link SellerPaymentMethodCodeType }
     *     
     */
    public SellerPaymentMethodCodeType getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Sets the value of the paymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellerPaymentMethodCodeType }
     *     
     */
    public void setPaymentMethod(SellerPaymentMethodCodeType value) {
        this.paymentMethod = value;
    }

}
