
package eBay;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BidGroupStatusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BidGroupStatusCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Open"/>
 *     &lt;enumeration value="Closed"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BidGroupStatusCodeType", namespace = "urn:ebay:apis:eBLBaseComponents")
@XmlEnum
public enum BidGroupStatusCodeType {


    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("Open")
    OPEN("Open"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("Closed")
    CLOSED("Closed"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    BidGroupStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BidGroupStatusCodeType fromValue(String v) {
        for (BidGroupStatusCodeType c: BidGroupStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
