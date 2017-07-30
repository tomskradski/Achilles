
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 	  		Set of Store custom pages.
 * 	  	
 * 
 * <p>Java class for StoreCustomPageArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StoreCustomPageArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomPage" type="{urn:ebay:apis:eBLBaseComponents}StoreCustomPageType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StoreCustomPageArrayType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "customPage"
})
public class StoreCustomPageArrayType {

    @XmlElement(name = "CustomPage", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<StoreCustomPageType> customPage;

    /**
     * Gets the value of the customPage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customPage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomPage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StoreCustomPageType }
     * 
     * 
     */
    public List<StoreCustomPageType> getCustomPage() {
        if (customPage == null) {
            customPage = new ArrayList<StoreCustomPageType>();
        }
        return this.customPage;
    }

}
