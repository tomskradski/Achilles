
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Type defining the <b>KTypeSupported</b> field that is returned under the <b>FeatureDefinitions</b> container of the <b>GetCategoryFeatures</b> response (as long as <b>KTypeSupported</b> is included as a <b>FeatureID</b> value in the call request, or no <b>FeatureID</b> values are passed into the call request). The <b>KTypeSupported</b> field is returned as an empty element (a boolean value is not returned) if one or more eBay API-enabled sites support specifying parts compatibility through a K Type vehicle number.
 * 				<br><br>
 * 				At this time, this feature is only supported for car and truck listings on the Germany site.
 * 				<br><br>
 * 				To verify if a specific category supports specifying parts compatibility through a K Type vehicle number, pass in a <b>KTypeSupported</b> value in the request, and then look for a <code>true</code> value in the <b>KTypeSupported</b> field of the corresponding <b>Category</b> node (match up the <b>CategoryID<b> values if more than one category ID was passed in the request).
 * 			
 * 
 * <p>Java class for KTypeSupportedDefinitionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KTypeSupportedDefinitionType">
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
@XmlType(name = "KTypeSupportedDefinitionType", namespace = "urn:ebay:apis:eBLBaseComponents")
public class KTypeSupportedDefinitionType {


}
