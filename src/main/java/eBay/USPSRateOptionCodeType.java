
package eBay;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for USPSRateOptionCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="USPSRateOptionCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="USPSDiscounted"/>
 *     &lt;enumeration value="USPSRetail"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "USPSRateOptionCodeType", namespace = "urn:ebay:apis:eBLBaseComponents")
@XmlEnum
public enum USPSRateOptionCodeType {


    /**
     * 
     * 						USPS Discounted
     * 					
     * 
     */
    @XmlEnumValue("USPSDiscounted")
    USPS_DISCOUNTED("USPSDiscounted"),

    /**
     * 
     * 						USPS Retail
     * 					
     * 
     */
    @XmlEnumValue("USPSRetail")
    USPS_RETAIL("USPSRetail"),

    /**
     * 
     * 						 Reserved for internal or future use
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    USPSRateOptionCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static USPSRateOptionCodeType fromValue(String v) {
        for (USPSRateOptionCodeType c: USPSRateOptionCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
