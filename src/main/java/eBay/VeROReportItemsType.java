
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Type defining the <b>ReportItems</b> container in the <b>VeROReportItems</b> request. The <b>ReportItems</b> container is an array of one or more eBay items which, according to the product's owner, are infringing upon the product owner's copyright, trademark, or intellectual property rights.
 * 			
 * 
 * <p>Java class for VeROReportItemsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VeROReportItemsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReportItem" type="{urn:ebay:apis:eBLBaseComponents}VeROReportItemType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VeROReportItemsType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "reportItem"
})
public class VeROReportItemsType {

    @XmlElement(name = "ReportItem", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<VeROReportItemType> reportItem;

    /**
     * Gets the value of the reportItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reportItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReportItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VeROReportItemType }
     * 
     * 
     */
    public List<VeROReportItemType> getReportItem() {
        if (reportItem == null) {
            reportItem = new ArrayList<VeROReportItemType>();
        }
        return this.reportItem;
    }

}
