
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 *  
 *  				Type defining the <b>CrossBorderTradeGBEnabled</b> field that is 
 * 				returned under the <b>FeatureDefinitions</b> container of the 
 * 				<b>GetCategoryFeatures</b> response (as long as 
 * 				'CrossBorderTradeEnabled' is included as a <b>FeatureID</b> value in 
 * 				the call request or no <b>FeatureID</b> values are passed into the call 
 * 				request). This field is returned as an
 * 				empty element (a boolean value is not returned) if one or more eBay API-enabled sites 
 * 				support Cross Border Trade listings on the eBay UK and eBay Ireland sites. 
 * 				<br/><br/>
 * 				To verify if a specific eBay site supports Cross Border Trade listings on the eBay UK and eBay Ireland sites (for most
 * 				categories), look for a 'true' value in the 
 * 				<b>SiteDefaults.CrossBorderTradeGBEnabled</b> field.
 * 				<br/><br/>
 * 				To verify if a specific category on a specific eBay site supports Cross Border Trade listings on the eBay UK and eBay Ireland sites, pass in a <b>CategoryID</b> value in the request, and then 
 * 				look for a 'true' value in the <b>CrossBorderTradeGBEnabled</b> field 
 * 				of the corresponding Category node (match up the <b>CategoryID</b> values 
 * 				if more than one Category IDs were passed in the request).
 * 			
 * 
 * <p>Java class for CrossBorderTradeGBEnabledDefinitionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CrossBorderTradeGBEnabledDefinitionType">
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
@XmlType(name = "CrossBorderTradeGBEnabledDefinitionType", namespace = "urn:ebay:apis:eBLBaseComponents")
public class CrossBorderTradeGBEnabledDefinitionType {


}
