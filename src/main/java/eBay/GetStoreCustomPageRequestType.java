
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Retrieves the custom page or pages for the authenticated user's Store.
 * 			
 * 
 * <p>Java class for GetStoreCustomPageRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetStoreCustomPageRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="PageID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetStoreCustomPageRequestType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "pageID"
})
public class GetStoreCustomPageRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "PageID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Long pageID;

    /**
     * Gets the value of the pageID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPageID() {
        return pageID;
    }

    /**
     * Sets the value of the pageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPageID(Long value) {
        this.pageID = value;
    }

}
