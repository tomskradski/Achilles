
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Returns the status of the processing progress for changes to the category
 * 				structure for a store.
 * 			
 * 
 * <p>Java class for SetStoreCategoriesResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetStoreCategoriesResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="TaskID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Status" type="{urn:ebay:apis:eBLBaseComponents}TaskStatusCodeType" minOccurs="0"/>
 *         &lt;element name="CustomCategory" type="{urn:ebay:apis:eBLBaseComponents}StoreCustomCategoryArrayType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetStoreCategoriesResponseType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "taskID",
    "status",
    "customCategory"
})
public class SetStoreCategoriesResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "TaskID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Long taskID;
    @XmlElement(name = "Status", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected TaskStatusCodeType status;
    @XmlElement(name = "CustomCategory", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected StoreCustomCategoryArrayType customCategory;

    /**
     * Gets the value of the taskID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTaskID() {
        return taskID;
    }

    /**
     * Sets the value of the taskID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTaskID(Long value) {
        this.taskID = value;
    }

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

    /**
     * Gets the value of the customCategory property.
     * 
     * @return
     *     possible object is
     *     {@link StoreCustomCategoryArrayType }
     *     
     */
    public StoreCustomCategoryArrayType getCustomCategory() {
        return customCategory;
    }

    /**
     * Sets the value of the customCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoreCustomCategoryArrayType }
     *     
     */
    public void setCustomCategory(StoreCustomCategoryArrayType value) {
        this.customCategory = value;
    }

}
