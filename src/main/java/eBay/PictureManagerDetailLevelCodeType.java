
package eBay;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PictureManagerDetailLevelCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PictureManagerDetailLevelCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="ReturnAll"/>
 *     &lt;enumeration value="ReturnSubscription"/>
 *     &lt;enumeration value="ReturnPicture"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PictureManagerDetailLevelCodeType", namespace = "urn:ebay:apis:eBLBaseComponents")
@XmlEnum
public enum PictureManagerDetailLevelCodeType {


    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("ReturnAll")
    RETURN_ALL("ReturnAll"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("ReturnSubscription")
    RETURN_SUBSCRIPTION("ReturnSubscription"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("ReturnPicture")
    RETURN_PICTURE("ReturnPicture"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    PictureManagerDetailLevelCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PictureManagerDetailLevelCodeType fromValue(String v) {
        for (PictureManagerDetailLevelCodeType c: PictureManagerDetailLevelCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
