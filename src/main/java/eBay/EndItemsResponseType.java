
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Contains a response of the resulting status of ending each item.				
 * 			
 * 
 * <p>Java class for EndItemsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EndItemsResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="EndItemResponseContainer" type="{urn:ebay:apis:eBLBaseComponents}EndItemResponseContainerType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EndItemsResponseType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "endItemResponseContainer"
})
public class EndItemsResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "EndItemResponseContainer", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<EndItemResponseContainerType> endItemResponseContainer;

    /**
     * Gets the value of the endItemResponseContainer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the endItemResponseContainer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEndItemResponseContainer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EndItemResponseContainerType }
     * 
     * 
     */
    public List<EndItemResponseContainerType> getEndItemResponseContainer() {
        if (endItemResponseContainer == null) {
            endItemResponseContainer = new ArrayList<EndItemResponseContainerType>();
        }
        return this.endItemResponseContainer;
    }

}
