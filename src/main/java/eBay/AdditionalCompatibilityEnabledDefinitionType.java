
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Type defining the <b>AdditionalCompatibilityEnabled</b> field that is
 * 				returned under the <b>FeatureDefinitions</b> container of the
 * 				<b>GetCategoryFeatures</b> response (as long as
 * 				<code>AdditionalCompatibilityEnabled</code> is included as a <b>FeatureID</b> value in
 * 				the call request or no <b>FeatureID</b> values are passed into the call
 * 				request). This field is returned as an
 * 				empty element (a boolean value is not returned) if one or more eBay API-enabled sites
 * 				support the Boats Parts Compatibility feature.
 * 				<br/><br/>
 * 				To verify if a specific eBay site supports Boats Parts Compatibility (for most
 * 				categories), look for a <code>true</code> value in the
 * 				<b>SiteDefaults.AdditionalCompatibilityEnabled</b> field.
 * 				<br/><br/>
 * 				To verify if a specific category on a specific eBay site supports Boats Parts
 * 				Compatibility, pass in a <b>CategoryID</b> value in the request, and then
 * 				look for a <code>true</code> value in the <b>AdditionalCompatibilityEnabled</b> field
 * 				of the corresponding Category node (match up the <b>CategoryID</b> values
 * 				if more than one Category IDs were passed in the request).
 * 			
 * 
 * <p>Java class for AdditionalCompatibilityEnabledDefinitionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalCompatibilityEnabledDefinitionType">
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
@XmlType(name = "AdditionalCompatibilityEnabledDefinitionType", namespace = "urn:ebay:apis:eBLBaseComponents")
public class AdditionalCompatibilityEnabledDefinitionType {


}
