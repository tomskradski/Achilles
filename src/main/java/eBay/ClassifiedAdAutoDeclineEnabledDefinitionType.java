
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Type defining the <b>ClassifiedAdAutoDeclineEnabled</b> field that is 
 * 				returned under the <b>FeatureDefinitions</b> container of the 
 * 				<b>GetCategoryFeatures</b> response (as long as 
 * 				'ClassifiedAdAutoDeclineEnabled' or 'ClassifiedAdAutoAcceptEnabled' is included as a <b>FeatureID</b> value in 
 * 				the call request or no <b>FeatureID</b> values are passed into the call 
 * 				request). This field is returned as an
 * 				empty element (a boolean value is not returned) if one or more eBay API-enabled sites 
 * 				support the Classified Ad Auto Decline feature. 
 * 				<br/><br/>
 * 				To verify if a specific eBay site supports the Classified Ad Auto Decline feature (for most
 * 				categories), look for a 'true' value in the 
 * 				<b>SiteDefaults.ClassifiedAdAutoDeclineEnabled</b> field.
 * 				<br/><br/>
 * 				To verify if a specific category on a specific eBay site supports the Classified Ad Auto Decline feature, pass in a <b>CategoryID</b> value in the request, and then 
 * 				look for a 'true' value in the <b>ClassifiedAdAutoDeclineEnabled</b> field 
 * 				of the corresponding Category node (match up the <b>CategoryID</b> values 
 * 				if more than one Category IDs were passed in the request).
 * 			
 * 
 * <p>Java class for ClassifiedAdAutoDeclineEnabledDefinitionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClassifiedAdAutoDeclineEnabledDefinitionType">
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
@XmlType(name = "ClassifiedAdAutoDeclineEnabledDefinitionType", namespace = "urn:ebay:apis:eBLBaseComponents")
public class ClassifiedAdAutoDeclineEnabledDefinitionType {


}
