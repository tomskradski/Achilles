
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				The base response type for the <b>GetSellerDashboard</b> call. This call retrieves seller performance data, including seller standards level, Power Seller status, Buyer Satisfaction status, eBay Search standing, and any seller fee discounts.
 * 			
 * 
 * <p>Java class for GetSellerDashboardResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSellerDashboardResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="SearchStanding" type="{urn:ebay:apis:eBLBaseComponents}SearchStandingDashboardType" minOccurs="0"/>
 *         &lt;element name="SellerFeeDiscount" type="{urn:ebay:apis:eBLBaseComponents}SellerFeeDiscountDashboardType" minOccurs="0"/>
 *         &lt;element name="PowerSellerStatus" type="{urn:ebay:apis:eBLBaseComponents}PowerSellerDashboardType" minOccurs="0"/>
 *         &lt;element name="PolicyCompliance" type="{urn:ebay:apis:eBLBaseComponents}PolicyComplianceDashboardType" minOccurs="0"/>
 *         &lt;element name="BuyerSatisfaction" type="{urn:ebay:apis:eBLBaseComponents}BuyerSatisfactionDashboardType" minOccurs="0"/>
 *         &lt;element name="SellerAccount" type="{urn:ebay:apis:eBLBaseComponents}SellerAccountDashboardType" minOccurs="0"/>
 *         &lt;element name="Performance" type="{urn:ebay:apis:eBLBaseComponents}PerformanceDashboardType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSellerDashboardResponseType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "searchStanding",
    "sellerFeeDiscount",
    "powerSellerStatus",
    "policyCompliance",
    "buyerSatisfaction",
    "sellerAccount",
    "performance"
})
public class GetSellerDashboardResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "SearchStanding", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected SearchStandingDashboardType searchStanding;
    @XmlElement(name = "SellerFeeDiscount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected SellerFeeDiscountDashboardType sellerFeeDiscount;
    @XmlElement(name = "PowerSellerStatus", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected PowerSellerDashboardType powerSellerStatus;
    @XmlElement(name = "PolicyCompliance", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected PolicyComplianceDashboardType policyCompliance;
    @XmlElement(name = "BuyerSatisfaction", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected BuyerSatisfactionDashboardType buyerSatisfaction;
    @XmlElement(name = "SellerAccount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected SellerAccountDashboardType sellerAccount;
    @XmlElement(name = "Performance", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<PerformanceDashboardType> performance;

    /**
     * Gets the value of the searchStanding property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStandingDashboardType }
     *     
     */
    public SearchStandingDashboardType getSearchStanding() {
        return searchStanding;
    }

    /**
     * Sets the value of the searchStanding property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStandingDashboardType }
     *     
     */
    public void setSearchStanding(SearchStandingDashboardType value) {
        this.searchStanding = value;
    }

    /**
     * Gets the value of the sellerFeeDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link SellerFeeDiscountDashboardType }
     *     
     */
    public SellerFeeDiscountDashboardType getSellerFeeDiscount() {
        return sellerFeeDiscount;
    }

    /**
     * Sets the value of the sellerFeeDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellerFeeDiscountDashboardType }
     *     
     */
    public void setSellerFeeDiscount(SellerFeeDiscountDashboardType value) {
        this.sellerFeeDiscount = value;
    }

    /**
     * Gets the value of the powerSellerStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PowerSellerDashboardType }
     *     
     */
    public PowerSellerDashboardType getPowerSellerStatus() {
        return powerSellerStatus;
    }

    /**
     * Sets the value of the powerSellerStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PowerSellerDashboardType }
     *     
     */
    public void setPowerSellerStatus(PowerSellerDashboardType value) {
        this.powerSellerStatus = value;
    }

    /**
     * Gets the value of the policyCompliance property.
     * 
     * @return
     *     possible object is
     *     {@link PolicyComplianceDashboardType }
     *     
     */
    public PolicyComplianceDashboardType getPolicyCompliance() {
        return policyCompliance;
    }

    /**
     * Sets the value of the policyCompliance property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyComplianceDashboardType }
     *     
     */
    public void setPolicyCompliance(PolicyComplianceDashboardType value) {
        this.policyCompliance = value;
    }

    /**
     * Gets the value of the buyerSatisfaction property.
     * 
     * @return
     *     possible object is
     *     {@link BuyerSatisfactionDashboardType }
     *     
     */
    public BuyerSatisfactionDashboardType getBuyerSatisfaction() {
        return buyerSatisfaction;
    }

    /**
     * Sets the value of the buyerSatisfaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuyerSatisfactionDashboardType }
     *     
     */
    public void setBuyerSatisfaction(BuyerSatisfactionDashboardType value) {
        this.buyerSatisfaction = value;
    }

    /**
     * Gets the value of the sellerAccount property.
     * 
     * @return
     *     possible object is
     *     {@link SellerAccountDashboardType }
     *     
     */
    public SellerAccountDashboardType getSellerAccount() {
        return sellerAccount;
    }

    /**
     * Sets the value of the sellerAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellerAccountDashboardType }
     *     
     */
    public void setSellerAccount(SellerAccountDashboardType value) {
        this.sellerAccount = value;
    }

    /**
     * Gets the value of the performance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the performance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPerformance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PerformanceDashboardType }
     * 
     * 
     */
    public List<PerformanceDashboardType> getPerformance() {
        if (performance == null) {
            performance = new ArrayList<PerformanceDashboardType>();
        }
        return this.performance;
    }

}
