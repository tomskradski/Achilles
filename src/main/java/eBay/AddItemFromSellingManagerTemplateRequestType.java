
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * 				This is the base request type of the <b>AddItemFromSellingManagerTemplate</b> call, which is used to create listings based on settings contained in a Selling Manager template.
 * 			
 * 
 * <p>Java class for AddItemFromSellingManagerTemplateRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddItemFromSellingManagerTemplateRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="SaleTemplateID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ScheduleTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Item" type="{urn:ebay:apis:eBLBaseComponents}ItemType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddItemFromSellingManagerTemplateRequestType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "saleTemplateID",
    "scheduleTime",
    "item"
})
public class AddItemFromSellingManagerTemplateRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "SaleTemplateID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Long saleTemplateID;
    @XmlElement(name = "ScheduleTime", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduleTime;
    @XmlElement(name = "Item", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected ItemType item;

    /**
     * Gets the value of the saleTemplateID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSaleTemplateID() {
        return saleTemplateID;
    }

    /**
     * Sets the value of the saleTemplateID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSaleTemplateID(Long value) {
        this.saleTemplateID = value;
    }

    /**
     * Gets the value of the scheduleTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduleTime() {
        return scheduleTime;
    }

    /**
     * Sets the value of the scheduleTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduleTime(XMLGregorianCalendar value) {
        this.scheduleTime = value;
    }

    /**
     * Gets the value of the item property.
     * 
     * @return
     *     possible object is
     *     {@link ItemType }
     *     
     */
    public ItemType getItem() {
        return item;
    }

    /**
     * Sets the value of the item property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemType }
     *     
     */
    public void setItem(ItemType value) {
        this.item = value;
    }

}
