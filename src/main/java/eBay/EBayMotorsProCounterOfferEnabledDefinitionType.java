
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Type defining the <b>eBayMotorsProCounterOfferEnabled</b> field that is returned under the <b>FeatureDefinitions</b> container if <code>eBayMotorsProCounterOfferEnabled</code> is used as a <b>FeatureID</b> value in the request, or if no <b>FeatureID</b> values are used in the request. This field is returned as an empty element (a boolean value is not returned) if one or more eBay API-enabled sites support counter offers to Best Offers for eBay Motors Classified Ad listings. Only eBay Motors Pro users are eligible to use eBay Motors Classified Ad listings.
 * 				<br/><br/>
 * 				To verify if a specific eBay site supports counter offers to Best Offers for eBay Motors Classified Ad listings (for most categories), look for a <code>true</code> value in the <b>SiteDefaults.eBayMotorsProCounterOfferEnabled</b> field.
 * 				<br/><br/>
 * 				To verify if a specific category on a specific eBay site supports counter offers to Best Offers for eBay Motors Classified Ad listings, pass in a <b>CategoryID</b> value in the request, and then look for a <code>true</code> value in the <b>eBayMotorsProCounterOfferEnabled</b> field of the corresponding <b>Category</b> node (match up the <b>CategoryID</b> values if more than one Category IDs were passed in the request).
 * 			
 * 
 * <p>Java class for eBayMotorsProCounterOfferEnabledDefinitionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="eBayMotorsProCounterOfferEnabledDefinitionType">
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
@XmlType(name = "eBayMotorsProCounterOfferEnabledDefinitionType", namespace = "urn:ebay:apis:eBLBaseComponents")
public class EBayMotorsProCounterOfferEnabledDefinitionType {


}
