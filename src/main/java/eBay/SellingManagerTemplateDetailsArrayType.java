
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				A list of Selling Manager templates.
 * 			
 * 
 * <p>Java class for SellingManagerTemplateDetailsArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SellingManagerTemplateDetailsArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SellingManagerTemplateDetails" type="{urn:ebay:apis:eBLBaseComponents}SellingManagerTemplateDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SellingManagerTemplateDetailsArrayType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "sellingManagerTemplateDetails"
})
public class SellingManagerTemplateDetailsArrayType {

    @XmlElement(name = "SellingManagerTemplateDetails", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<SellingManagerTemplateDetailsType> sellingManagerTemplateDetails;

    /**
     * Gets the value of the sellingManagerTemplateDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sellingManagerTemplateDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSellingManagerTemplateDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SellingManagerTemplateDetailsType }
     * 
     * 
     */
    public List<SellingManagerTemplateDetailsType> getSellingManagerTemplateDetails() {
        if (sellingManagerTemplateDetails == null) {
            sellingManagerTemplateDetails = new ArrayList<SellingManagerTemplateDetailsType>();
        }
        return this.sellingManagerTemplateDetails;
    }

}
