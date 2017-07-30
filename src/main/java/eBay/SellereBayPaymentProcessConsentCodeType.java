
package eBay;

import java.util.ArrayList;
import java.util.List;
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
 * <p>Java class for SellereBayPaymentProcessConsentCodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SellereBayPaymentProcessConsentCodeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PayoutMethodSet" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PayoutMethod" type="{urn:ebay:apis:eBLBaseComponents}PayoutMethodType" minOccurs="0"/>
 *         &lt;element name="UserAgreementInfo" type="{urn:ebay:apis:eBLBaseComponents}UserAgreementInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SellereBayPaymentProcessConsentCodeType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "payoutMethodSet",
    "payoutMethod",
    "userAgreementInfo"
})
public class SellereBayPaymentProcessConsentCodeType {

    @XmlElement(name = "PayoutMethodSet", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean payoutMethodSet;
    @XmlElement(name = "PayoutMethod", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected PayoutMethodType payoutMethod;
    @XmlElement(name = "UserAgreementInfo", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<UserAgreementInfoType> userAgreementInfo;

    /**
     * Gets the value of the payoutMethodSet property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPayoutMethodSet() {
        return payoutMethodSet;
    }

    /**
     * Sets the value of the payoutMethodSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPayoutMethodSet(Boolean value) {
        this.payoutMethodSet = value;
    }

    /**
     * Gets the value of the payoutMethod property.
     * 
     * @return
     *     possible object is
     *     {@link PayoutMethodType }
     *     
     */
    public PayoutMethodType getPayoutMethod() {
        return payoutMethod;
    }

    /**
     * Sets the value of the payoutMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayoutMethodType }
     *     
     */
    public void setPayoutMethod(PayoutMethodType value) {
        this.payoutMethod = value;
    }

    /**
     * Gets the value of the userAgreementInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userAgreementInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserAgreementInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserAgreementInfoType }
     * 
     * 
     */
    public List<UserAgreementInfoType> getUserAgreementInfo() {
        if (userAgreementInfo == null) {
            userAgreementInfo = new ArrayList<UserAgreementInfoType>();
        }
        return this.userAgreementInfo;
    }

}
