
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Contains a list of up to 10 external message IDs.
 * 			
 * 
 * <p>Java class for MyMessagesExternalMessageIDArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MyMessagesExternalMessageIDArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExternalMessageID" type="{urn:ebay:apis:eBLBaseComponents}MyMessagesExternalMessageIDType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MyMessagesExternalMessageIDArrayType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "externalMessageID"
})
public class MyMessagesExternalMessageIDArrayType {

    @XmlElement(name = "ExternalMessageID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<String> externalMessageID;

    /**
     * Gets the value of the externalMessageID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the externalMessageID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExternalMessageID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getExternalMessageID() {
        if (externalMessageID == null) {
            externalMessageID = new ArrayList<String>();
        }
        return this.externalMessageID;
    }

}
