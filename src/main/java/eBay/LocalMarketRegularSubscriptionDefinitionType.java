
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 *  
 * 				Defines the LocalMarketRegularSubscription feature. If this field 
 * 				is present, the corresponding feature applies to the category. The 
 * 				field is returned as an empty element (i.e., a boolean value is not 
 * 				returned). A subscription for Local Market for Vehicles will be 
 * 				returned by GetUser if a dealer has subscribed to any of the following 
 * 				Local Market Regular sub-types: Vehicles Regular Six Months, 
 * 				Vehicles Regular Special Promotion, Vehicles Regular Multistore 
 * 				Level S, Vehicles Regular Multistore Level M, or Vehicles Regular 
 * 				Multistore Level L. Each of these sub-types has a separate discount 
 * 				and billing cycle.
 * 			
 * 
 * <p>Java class for LocalMarketRegularSubscriptionDefinitionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocalMarketRegularSubscriptionDefinitionType">
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
@XmlType(name = "LocalMarketRegularSubscriptionDefinitionType", namespace = "urn:ebay:apis:eBLBaseComponents")
public class LocalMarketRegularSubscriptionDefinitionType {


}
