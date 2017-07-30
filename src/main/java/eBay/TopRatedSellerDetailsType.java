
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 			Container for top-rated seller program information.
 * 		
 * 
 * <p>Java class for TopRatedSellerDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TopRatedSellerDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TopRatedProgram" type="{urn:ebay:apis:eBLBaseComponents}TopRatedProgramCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TopRatedSellerDetailsType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "topRatedProgram"
})
public class TopRatedSellerDetailsType {

    @XmlElement(name = "TopRatedProgram", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected List<TopRatedProgramCodeType> topRatedProgram;

    /**
     * Gets the value of the topRatedProgram property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the topRatedProgram property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTopRatedProgram().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TopRatedProgramCodeType }
     * 
     * 
     */
    public List<TopRatedProgramCodeType> getTopRatedProgram() {
        if (topRatedProgram == null) {
            topRatedProgram = new ArrayList<TopRatedProgramCodeType>();
        }
        return this.topRatedProgram;
    }

}
