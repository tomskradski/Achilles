
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
 * 				Type used by the <b>CalculatedShippingDiscount</b> container, which is used in the <b>SetShippingDiscountProfiles</b> call to create one or more discounted calculated shipping rules. The <b>CalculatedShippingDiscount</b> container is returned in the response of all other calls that use this type.
 * 			
 * 
 * <p>Java class for CalculatedShippingDiscountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CalculatedShippingDiscountType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DiscountName" type="{urn:ebay:apis:eBLBaseComponents}DiscountNameCodeType" minOccurs="0"/>
 *         &lt;element name="DiscountProfile" type="{urn:ebay:apis:eBLBaseComponents}DiscountProfileType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalculatedShippingDiscountType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "discountName",
    "discountProfile"
})
public class CalculatedShippingDiscountType {

    @XmlElement(name = "DiscountName", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected DiscountNameCodeType discountName;
    @XmlElement(name = "DiscountProfile", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<DiscountProfileType> discountProfile;

    /**
     * Gets the value of the discountName property.
     * 
     * @return
     *     possible object is
     *     {@link DiscountNameCodeType }
     *     
     */
    public DiscountNameCodeType getDiscountName() {
        return discountName;
    }

    /**
     * Sets the value of the discountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountNameCodeType }
     *     
     */
    public void setDiscountName(DiscountNameCodeType value) {
        this.discountName = value;
    }

    /**
     * Gets the value of the discountProfile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the discountProfile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiscountProfile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DiscountProfileType }
     * 
     * 
     */
    public List<DiscountProfileType> getDiscountProfile() {
        if (discountProfile == null) {
            discountProfile = new ArrayList<DiscountProfileType>();
        }
        return this.discountProfile;
    }

}
