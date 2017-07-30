
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Defines the payment options group feature. If a field of this type is present, the corresponding feature applies to the site. The field is returned as an integer. The below are the integer values returned and its meanings.
 * 				0 - Ebay Payment Process Enabled
 * 				1 - Non Standard Payments Enabled
 * 				2 - Ebay Payment Process Excluded
 * 			
 * 
 * <p>Java class for PaymentOptionsGroupEnabledDefinitionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentOptionsGroupEnabledDefinitionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentOptionsGroupEnabledDefinitionType", namespace = "urn:ebay:apis:eBLBaseComponents")
public class PaymentOptionsGroupEnabledDefinitionType {


}
