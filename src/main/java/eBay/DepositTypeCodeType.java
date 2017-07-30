
package eBay;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DepositTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DepositTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="OtherMethod"/>
 *     &lt;enumeration value="FastDeposit"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DepositTypeCodeType", namespace = "urn:ebay:apis:eBLBaseComponents")
@XmlEnum
public enum DepositTypeCodeType {


    /**
     * 
     * 					  (out) No deposit needed.
     * 					
     * 
     */
    @XmlEnumValue("None")
    NONE("None"),

    /**
     * 
     * 					  (out) Pay the deposit using PayPal, and then
     * 					  use any of the other specified payment methods to pay the balance.
     * 					
     * 
     */
    @XmlEnumValue("OtherMethod")
    OTHER_METHOD("OtherMethod"),

    /**
     * 
     * 					   (out) No longer used.
     * 					
     * 
     */
    @XmlEnumValue("FastDeposit")
    FAST_DEPOSIT("FastDeposit"),

    /**
     * 
     * 					  (out) Reserved for internal or future use
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    DepositTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DepositTypeCodeType fromValue(String v) {
        for (DepositTypeCodeType c: DepositTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}