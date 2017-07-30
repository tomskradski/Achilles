
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 *  
 * 				This is for FSBO.
 * 				Each of the subscriptions will have following options, which will define
 * 				"National" vs "Local" ad format listing.
 * 				"LocalOptional" : This will allow national and local listing.
 * 				"LocalOnly" : Seller can have Local listings only.
 * 				"NationalOnly" : Seller can not opt into local only exposure. It has to be 
 * 				national listing.
 * 			
 * 
 * <p>Java class for NonSubscriptionDefinitionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NonSubscriptionDefinitionType">
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
@XmlType(name = "NonSubscriptionDefinitionType", namespace = "urn:ebay:apis:eBLBaseComponents")
public class NonSubscriptionDefinitionType {


}
