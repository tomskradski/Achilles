
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 *  
 * 				For the US, Canada and Australia sites, users are 
 * 				required to offer at least one safe payment method (i.e. PayPal/PaisaPay, or one 
 * 				of the credit cards specified in Item.PaymentMethods).
 * 				<br>
 * 				If a seller has a 'SafePaymentExempt' status, they are exempt from the category 
 * 				requirement to offer at least one safe payment method when listing an item on a 
 * 				site that has the safe payment requirement.
 * 				<br>
 * 				The safe payment requirement also applies to two-category listings that have one 
 * 				ship-to or available-to location in the US, Canada, or Australia. The French 
 * 				Canadian (CAFR) site is a special case, because listings on the CAFR site with 
 * 				ship-to or available-to locations in Canada do not require a Safe Payment method, 
 * 				yet listings on the CAFR site with ship-to or available-to locations in the US or 
 * 				Australia do require a safe payment method.
 * 				<br>
 * 				The Business and Industrial, Motors, Real Estate, and Mature Audiences categories, 
 * 				and all listings that don't support Item.PaymentMethods are exempt from this 
 * 				requirement. Therefore, listings in those categories do not require a safe payment 
 * 				method.
 * 				<br>
 * 				Currently, this field contains no other special meta-data.(An empty element is 
 * 				returned.)
 * 				<br> 
 * 				Use SiteDefaults.SafePaymentRequired and Category.SafePaymentRequired to determine 
 * 				which categories require a safe payment method.
 * 			
 * 
 * <p>Java class for SafePaymentRequiredDefinitionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SafePaymentRequiredDefinitionType">
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
@XmlType(name = "SafePaymentRequiredDefinitionType", namespace = "urn:ebay:apis:eBLBaseComponents")
public class SafePaymentRequiredDefinitionType {


}
