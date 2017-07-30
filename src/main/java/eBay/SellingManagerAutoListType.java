
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Provides information about an automated listing rule.   
 * 				Automated listing rules cannot be combined with automated relisting rules.
 * 				A template can have one set of information per automated listing rule specified.
 * 			
 * 
 * <p>Java class for SellingManagerAutoListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SellingManagerAutoListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SourceSaleTemplateID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="KeepMinActive" type="{urn:ebay:apis:eBLBaseComponents}SellingManagerAutoListMinActiveItemsType" minOccurs="0"/>
 *         &lt;element name="ListAccordingToSchedule" type="{urn:ebay:apis:eBLBaseComponents}SellingManagerAutoListAccordingToScheduleType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SellingManagerAutoListType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "sourceSaleTemplateID",
    "keepMinActive",
    "listAccordingToSchedule"
})
public class SellingManagerAutoListType {

    @XmlElement(name = "SourceSaleTemplateID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Long sourceSaleTemplateID;
    @XmlElement(name = "KeepMinActive", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected SellingManagerAutoListMinActiveItemsType keepMinActive;
    @XmlElement(name = "ListAccordingToSchedule", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected SellingManagerAutoListAccordingToScheduleType listAccordingToSchedule;

    /**
     * Gets the value of the sourceSaleTemplateID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSourceSaleTemplateID() {
        return sourceSaleTemplateID;
    }

    /**
     * Sets the value of the sourceSaleTemplateID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSourceSaleTemplateID(Long value) {
        this.sourceSaleTemplateID = value;
    }

    /**
     * Gets the value of the keepMinActive property.
     * 
     * @return
     *     possible object is
     *     {@link SellingManagerAutoListMinActiveItemsType }
     *     
     */
    public SellingManagerAutoListMinActiveItemsType getKeepMinActive() {
        return keepMinActive;
    }

    /**
     * Sets the value of the keepMinActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellingManagerAutoListMinActiveItemsType }
     *     
     */
    public void setKeepMinActive(SellingManagerAutoListMinActiveItemsType value) {
        this.keepMinActive = value;
    }

    /**
     * Gets the value of the listAccordingToSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link SellingManagerAutoListAccordingToScheduleType }
     *     
     */
    public SellingManagerAutoListAccordingToScheduleType getListAccordingToSchedule() {
        return listAccordingToSchedule;
    }

    /**
     * Sets the value of the listAccordingToSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellingManagerAutoListAccordingToScheduleType }
     *     
     */
    public void setListAccordingToSchedule(SellingManagerAutoListAccordingToScheduleType value) {
        this.listAccordingToSchedule = value;
    }

}
