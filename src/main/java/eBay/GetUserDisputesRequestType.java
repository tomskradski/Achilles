
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * 				Requests a list of disputes the requester is involved in as buyer or seller. eBay Money Back Guarantee Item Not Received and Return cases are not returned with this call. To retrieve eBay Money Back Guarantee cases, use the <b>Search Cases</b> call of the Post-Order API (or alternatively, the <b>getUserCases</b> call of the Resolution Case Management API.
 * 			
 * 
 * <p>Java class for GetUserDisputesRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetUserDisputesRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="DisputeFilterType" type="{urn:ebay:apis:eBLBaseComponents}DisputeFilterTypeCodeType" minOccurs="0"/>
 *         &lt;element name="DisputeSortType" type="{urn:ebay:apis:eBLBaseComponents}DisputeSortTypeCodeType" minOccurs="0"/>
 *         &lt;element name="ModTimeFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ModTimeTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Pagination" type="{urn:ebay:apis:eBLBaseComponents}PaginationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetUserDisputesRequestType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "disputeFilterType",
    "disputeSortType",
    "modTimeFrom",
    "modTimeTo",
    "pagination"
})
public class GetUserDisputesRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "DisputeFilterType", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected DisputeFilterTypeCodeType disputeFilterType;
    @XmlElement(name = "DisputeSortType", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected DisputeSortTypeCodeType disputeSortType;
    @XmlElement(name = "ModTimeFrom", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modTimeFrom;
    @XmlElement(name = "ModTimeTo", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modTimeTo;
    @XmlElement(name = "Pagination", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected PaginationType pagination;

    /**
     * Gets the value of the disputeFilterType property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeFilterTypeCodeType }
     *     
     */
    public DisputeFilterTypeCodeType getDisputeFilterType() {
        return disputeFilterType;
    }

    /**
     * Sets the value of the disputeFilterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeFilterTypeCodeType }
     *     
     */
    public void setDisputeFilterType(DisputeFilterTypeCodeType value) {
        this.disputeFilterType = value;
    }

    /**
     * Gets the value of the disputeSortType property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeSortTypeCodeType }
     *     
     */
    public DisputeSortTypeCodeType getDisputeSortType() {
        return disputeSortType;
    }

    /**
     * Sets the value of the disputeSortType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeSortTypeCodeType }
     *     
     */
    public void setDisputeSortType(DisputeSortTypeCodeType value) {
        this.disputeSortType = value;
    }

    /**
     * Gets the value of the modTimeFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModTimeFrom() {
        return modTimeFrom;
    }

    /**
     * Sets the value of the modTimeFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModTimeFrom(XMLGregorianCalendar value) {
        this.modTimeFrom = value;
    }

    /**
     * Gets the value of the modTimeTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModTimeTo() {
        return modTimeTo;
    }

    /**
     * Sets the value of the modTimeTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModTimeTo(XMLGregorianCalendar value) {
        this.modTimeTo = value;
    }

    /**
     * Gets the value of the pagination property.
     * 
     * @return
     *     possible object is
     *     {@link PaginationType }
     *     
     */
    public PaginationType getPagination() {
        return pagination;
    }

    /**
     * Sets the value of the pagination property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaginationType }
     *     
     */
    public void setPagination(PaginationType value) {
        this.pagination = value;
    }

}
