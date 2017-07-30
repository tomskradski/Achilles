
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
 * 				Type used by the <b>VeROSiteDetailType</b> container, which is returned in <b>GetVeROReasonCodeDetails</b>. Each <b>VeROSiteDetailType</b> container will contain one or more reasons how an eBay listing could possibly infringe upon the intellectual property rights of a product owner.
 * 			
 * 
 * <p>Java class for VeROSiteDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VeROSiteDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Site" type="{urn:ebay:apis:eBLBaseComponents}SiteCodeType" minOccurs="0"/>
 *         &lt;element name="ReasonCodeDetail" type="{urn:ebay:apis:eBLBaseComponents}ReasonCodeDetailType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VeROSiteDetailType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "site",
    "reasonCodeDetail"
})
public class VeROSiteDetailType {

    @XmlElement(name = "Site", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected SiteCodeType site;
    @XmlElement(name = "ReasonCodeDetail", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<ReasonCodeDetailType> reasonCodeDetail;

    /**
     * Gets the value of the site property.
     * 
     * @return
     *     possible object is
     *     {@link SiteCodeType }
     *     
     */
    public SiteCodeType getSite() {
        return site;
    }

    /**
     * Sets the value of the site property.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteCodeType }
     *     
     */
    public void setSite(SiteCodeType value) {
        this.site = value;
    }

    /**
     * Gets the value of the reasonCodeDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reasonCodeDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReasonCodeDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReasonCodeDetailType }
     * 
     * 
     */
    public List<ReasonCodeDetailType> getReasonCodeDetail() {
        if (reasonCodeDetail == null) {
            reasonCodeDetail = new ArrayList<ReasonCodeDetailType>();
        }
        return this.reasonCodeDetail;
    }

}
