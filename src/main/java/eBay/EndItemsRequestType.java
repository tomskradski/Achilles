
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Ends up to 10 specified item listings before the date and time at which it would normally end per the listing duration.&nbsp;<b>Also for Half.com</b>.
 * 			
 * 
 * <p>Java class for EndItemsRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EndItemsRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="EndItemRequestContainer" type="{urn:ebay:apis:eBLBaseComponents}EndItemRequestContainerType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EndItemsRequestType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "endItemRequestContainer"
})
public class EndItemsRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "EndItemRequestContainer", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<EndItemRequestContainerType> endItemRequestContainer;

    /**
     * Gets the value of the endItemRequestContainer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the endItemRequestContainer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEndItemRequestContainer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EndItemRequestContainerType }
     * 
     * 
     */
    public List<EndItemRequestContainerType> getEndItemRequestContainer() {
        if (endItemRequestContainer == null) {
            endItemRequestContainer = new ArrayList<EndItemRequestContainerType>();
        }
        return this.endItemRequestContainer;
    }

}
