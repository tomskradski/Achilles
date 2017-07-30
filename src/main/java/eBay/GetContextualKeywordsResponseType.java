
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Response to a GetContextualKeywords request.
 * 			
 * 
 * <p>Java class for GetContextualKeywordsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetContextualKeywordsResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="ContextSearchAsset" type="{urn:ebay:apis:eBLBaseComponents}ContextSearchAssetType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetContextualKeywordsResponseType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "contextSearchAsset"
})
public class GetContextualKeywordsResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "ContextSearchAsset", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<ContextSearchAssetType> contextSearchAsset;

    /**
     * Gets the value of the contextSearchAsset property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contextSearchAsset property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContextSearchAsset().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContextSearchAssetType }
     * 
     * 
     */
    public List<ContextSearchAssetType> getContextSearchAsset() {
        if (contextSearchAsset == null) {
            contextSearchAsset = new ArrayList<ContextSearchAssetType>();
        }
        return this.contextSearchAsset;
    }

}
