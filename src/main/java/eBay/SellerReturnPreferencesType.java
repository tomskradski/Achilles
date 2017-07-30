
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Type defining the <b>SellerReturnPreferences</b> container, which consists of the <b>OptedIn</b> flag that indicates whether or not the seller has opted in to eBay Managed Returns. 
 * 				<br><br>
 * 				eBay Managed Returns are currently only available on the US and UK sites. 
 * 			
 * 
 * <p>Java class for SellerReturnPreferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SellerReturnPreferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OptedIn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SellerReturnPreferencesType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "optedIn"
})
public class SellerReturnPreferencesType {

    @XmlElement(name = "OptedIn", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Boolean optedIn;

    /**
     * Gets the value of the optedIn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOptedIn() {
        return optedIn;
    }

    /**
     * Sets the value of the optedIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOptedIn(Boolean value) {
        this.optedIn = value;
    }

}
