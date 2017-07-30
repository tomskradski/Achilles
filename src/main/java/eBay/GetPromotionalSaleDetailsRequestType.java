
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
 * 				The base request type for the <b>GetPromotionalSaleDetails</b> call. This call retrieves information about promotional sales set up by an eBay store owner. The eBay store owner has the option to retrieve all promotional sales, a specific promotional sale, or promotional sales in a specific state.
 * 			
 * 
 * <p>Java class for GetPromotionalSaleDetailsRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetPromotionalSaleDetailsRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="PromotionalSaleID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PromotionalSaleStatus" type="{urn:ebay:apis:eBLBaseComponents}PromotionalSaleStatusCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetPromotionalSaleDetailsRequestType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "promotionalSaleID",
    "promotionalSaleStatus"
})
public class GetPromotionalSaleDetailsRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "PromotionalSaleID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Long promotionalSaleID;
    @XmlElement(name = "PromotionalSaleStatus", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected List<PromotionalSaleStatusCodeType> promotionalSaleStatus;

    /**
     * Gets the value of the promotionalSaleID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPromotionalSaleID() {
        return promotionalSaleID;
    }

    /**
     * Sets the value of the promotionalSaleID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPromotionalSaleID(Long value) {
        this.promotionalSaleID = value;
    }

    /**
     * Gets the value of the promotionalSaleStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the promotionalSaleStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPromotionalSaleStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PromotionalSaleStatusCodeType }
     * 
     * 
     */
    public List<PromotionalSaleStatusCodeType> getPromotionalSaleStatus() {
        if (promotionalSaleStatus == null) {
            promotionalSaleStatus = new ArrayList<PromotionalSaleStatusCodeType>();
        }
        return this.promotionalSaleStatus;
    }

}
