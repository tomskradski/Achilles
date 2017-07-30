
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Returns a Selling Manager user's sold listings. Response can be filtered by date, search
 * 				values, and stores.
 * 			
 * 
 * <p>Java class for GetSellingManagerSoldListingsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSellingManagerSoldListingsResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="SaleRecord" type="{urn:ebay:apis:eBLBaseComponents}SellingManagerSoldOrderType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PaginationResult" type="{urn:ebay:apis:eBLBaseComponents}PaginationResultType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSellingManagerSoldListingsResponseType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "saleRecord",
    "paginationResult"
})
public class GetSellingManagerSoldListingsResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "SaleRecord", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<SellingManagerSoldOrderType> saleRecord;
    @XmlElement(name = "PaginationResult", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected PaginationResultType paginationResult;

    /**
     * Gets the value of the saleRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the saleRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSaleRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SellingManagerSoldOrderType }
     * 
     * 
     */
    public List<SellingManagerSoldOrderType> getSaleRecord() {
        if (saleRecord == null) {
            saleRecord = new ArrayList<SellingManagerSoldOrderType>();
        }
        return this.saleRecord;
    }

    /**
     * Gets the value of the paginationResult property.
     * 
     * @return
     *     possible object is
     *     {@link PaginationResultType }
     *     
     */
    public PaginationResultType getPaginationResult() {
        return paginationResult;
    }

    /**
     * Sets the value of the paginationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaginationResultType }
     *     
     */
    public void setPaginationResult(PaginationResultType value) {
        this.paginationResult = value;
    }

}
