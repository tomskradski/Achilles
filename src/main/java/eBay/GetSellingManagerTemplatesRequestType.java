
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 	 			Retrieves Selling Manager templates.
 * 				This call is subject to change without notice; the
 * 				deprecation process is inapplicable to this call.
 * 			
 * 
 * <p>Java class for GetSellingManagerTemplatesRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSellingManagerTemplatesRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="SaleTemplateID" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSellingManagerTemplatesRequestType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "saleTemplateID"
})
public class GetSellingManagerTemplatesRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "SaleTemplateID", namespace = "urn:ebay:apis:eBLBaseComponents", type = Long.class)
    protected List<Long> saleTemplateID;

    /**
     * Gets the value of the saleTemplateID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the saleTemplateID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSaleTemplateID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getSaleTemplateID() {
        if (saleTemplateID == null) {
            saleTemplateID = new ArrayList<Long>();
        }
        return this.saleTemplateID;
    }

}
