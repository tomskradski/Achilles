
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Type defining the <b>DigitalGoodDeliveryEnabled</b> field that is returned under the <b>FeatureDefinitions</b> container of the <b>GetCategoryFeatures</b> response (as long as <b>DigitalGoodDeliveryEnabled</b> is included as a <b>FeatureID</b> value in the call request or no <b>FeatureID</b> values are passed into the call request). The <b>DigitalGoodDeliveryEnabled</b> field is returned as an empty element (a boolean value is not returned) if one or more eBay API-enabled sites support digital gift card listings.
 * 				<br><br>
 * 				To verify if a specific eBay site supports digital gift card listings (for most categories), look for a <code>true</code> value in the <b>SiteDefaults.DigitalGoodDeliveryEnabled</b> field.
 * 				<br><br>
 * 				To verify if a specific category on a specific eBay site supports digital gift card listings, pass in a <b>DigitalGoodDeliveryEnabled</b> value in the request, and then look for a <code>true</code> value in the <b>DigitalGoodDeliveryEnabled</b> field of the corresponding <b>Category</b> node (match up the <b>CategoryID</b> values if more than one category ID was passed in the request).
 * 			
 * 
 * <p>Java class for DigitalGoodDeliveryEnabledDefinitionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DigitalGoodDeliveryEnabledDefinitionType">
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
@XmlType(name = "DigitalGoodDeliveryEnabledDefinitionType", namespace = "urn:ebay:apis:eBLBaseComponents")
public class DigitalGoodDeliveryEnabledDefinitionType {


}
