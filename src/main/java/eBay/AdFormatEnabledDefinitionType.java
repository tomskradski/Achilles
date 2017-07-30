
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Type defining the <b>AdFormatEnabled</b> field that is returned under the <b>FeatureDefinitions</b> container if <code>AdFormatEnabled</code> is used as a <b>FeatureID</b> value in the request, or if no <b>FeatureID</b> values are used in the request. This field is returned as an empty element (a boolean value is not returned) if one or more eBay API-enabled sites support Classified Ad listings.
 * 				<br>
 * 				<br>
 * 				To verify if a specific eBay site supports Classified Ad listings (for most categories), look for a <code>true</code> value in the <b>SiteDefaults.AdFormatEnabled</b> field.
 * 				<br>
 * 				<br>
 * 				To verify if a specific category on a specific eBay site supports Classified Ad listings, pass in a <b>CategoryID</b> value in the request, and then look for a <code>true</code> value in the <b>AdFormatEnabled</b> field of the corresponding <b>Category</b> node (match up the <b>CategoryID</b> values if more than one Category IDs were passed in the request).
 * 			
 * 
 * <p>Java class for AdFormatEnabledDefinitionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdFormatEnabledDefinitionType">
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
@XmlType(name = "AdFormatEnabledDefinitionType", namespace = "urn:ebay:apis:eBLBaseComponents")
public class AdFormatEnabledDefinitionType {


}
