
package eBay;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthTokenTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AuthTokenTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="ClientAlertsToken"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AuthTokenTypeCodeType", namespace = "urn:ebay:apis:eBLBaseComponents")
@XmlEnum
public enum AuthTokenTypeCodeType {


    /**
     * 
     * 						This value indicates that a Client Alerts token is required.
     * 					
     * 
     */
    @XmlEnumValue("ClientAlertsToken")
    CLIENT_ALERTS_TOKEN("ClientAlertsToken"),

    /**
     * 
     * 						 Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    AuthTokenTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AuthTokenTypeCodeType fromValue(String v) {
        for (AuthTokenTypeCodeType c: AuthTokenTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
