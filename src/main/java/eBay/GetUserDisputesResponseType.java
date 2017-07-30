
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Returns a list of disputes that involve the calling user
 * 				as buyer or seller, in response to a <b>GetUserDisputesRequest</b>.
 * 			
 * 
 * <p>Java class for GetUserDisputesResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetUserDisputesResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="StartingDisputeID" type="{urn:ebay:apis:eBLBaseComponents}DisputeIDType" minOccurs="0"/>
 *         &lt;element name="EndingDisputeID" type="{urn:ebay:apis:eBLBaseComponents}DisputeIDType" minOccurs="0"/>
 *         &lt;element name="DisputeArray" type="{urn:ebay:apis:eBLBaseComponents}DisputeArrayType" minOccurs="0"/>
 *         &lt;element name="ItemsPerPage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PageNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DisputeFilterCount" type="{urn:ebay:apis:eBLBaseComponents}DisputeFilterCountType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "GetUserDisputesResponseType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "startingDisputeID",
    "endingDisputeID",
    "disputeArray",
    "itemsPerPage",
    "pageNumber",
    "disputeFilterCount",
    "paginationResult"
})
public class GetUserDisputesResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "StartingDisputeID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String startingDisputeID;
    @XmlElement(name = "EndingDisputeID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String endingDisputeID;
    @XmlElement(name = "DisputeArray", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected DisputeArrayType disputeArray;
    @XmlElement(name = "ItemsPerPage", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer itemsPerPage;
    @XmlElement(name = "PageNumber", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Integer pageNumber;
    @XmlElement(name = "DisputeFilterCount", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<DisputeFilterCountType> disputeFilterCount;
    @XmlElement(name = "PaginationResult", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected PaginationResultType paginationResult;

    /**
     * Gets the value of the startingDisputeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartingDisputeID() {
        return startingDisputeID;
    }

    /**
     * Sets the value of the startingDisputeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartingDisputeID(String value) {
        this.startingDisputeID = value;
    }

    /**
     * Gets the value of the endingDisputeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndingDisputeID() {
        return endingDisputeID;
    }

    /**
     * Sets the value of the endingDisputeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndingDisputeID(String value) {
        this.endingDisputeID = value;
    }

    /**
     * Gets the value of the disputeArray property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeArrayType }
     *     
     */
    public DisputeArrayType getDisputeArray() {
        return disputeArray;
    }

    /**
     * Sets the value of the disputeArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeArrayType }
     *     
     */
    public void setDisputeArray(DisputeArrayType value) {
        this.disputeArray = value;
    }

    /**
     * Gets the value of the itemsPerPage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getItemsPerPage() {
        return itemsPerPage;
    }

    /**
     * Sets the value of the itemsPerPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setItemsPerPage(Integer value) {
        this.itemsPerPage = value;
    }

    /**
     * Gets the value of the pageNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * Sets the value of the pageNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageNumber(Integer value) {
        this.pageNumber = value;
    }

    /**
     * Gets the value of the disputeFilterCount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disputeFilterCount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisputeFilterCount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DisputeFilterCountType }
     * 
     * 
     */
    public List<DisputeFilterCountType> getDisputeFilterCount() {
        if (disputeFilterCount == null) {
            disputeFilterCount = new ArrayList<DisputeFilterCountType>();
        }
        return this.disputeFilterCount;
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
