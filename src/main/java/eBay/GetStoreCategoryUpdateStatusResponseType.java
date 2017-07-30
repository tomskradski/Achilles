
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Returns the store category structure update status, when a prior 
 * 				SetStoreCategories call was processed asynchronously. If a SetStoreCategories 
 * 				request affects many listings, then the category structure changes will be 
 * 				processed asynchronously. If not many listings are affected by category structure 
 * 				changes, the status is returned in the SetStoreCategories response.
 * 			
 * 
 * <p>Java class for GetStoreCategoryUpdateStatusResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetStoreCategoryUpdateStatusResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="Status" type="{urn:ebay:apis:eBLBaseComponents}TaskStatusCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetStoreCategoryUpdateStatusResponseType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "status"
})
public class GetStoreCategoryUpdateStatusResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "Status", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected TaskStatusCodeType status;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link TaskStatusCodeType }
     *     
     */
    public TaskStatusCodeType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskStatusCodeType }
     *     
     */
    public void setStatus(TaskStatusCodeType value) {
        this.status = value;
    }

}
