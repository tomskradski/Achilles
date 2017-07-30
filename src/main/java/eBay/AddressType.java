
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 			Contains the data for an eBay user's address. This is the base type for a
 * 			number of user addresses, including seller payment address, buyer
 * 			shipping address and buyer and seller registration address.
 * 		
 * 
 * <p>Java class for AddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Street" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Street1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Street2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="County" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StateOrProvince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country" type="{urn:ebay:apis:eBLBaseComponents}CountryCodeType" minOccurs="0"/>
 *         &lt;element name="CountryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PhoneCountryCode" type="{urn:ebay:apis:eBLBaseComponents}CountryCodeType" minOccurs="0"/>
 *         &lt;element name="PhoneCountryPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PhoneAreaOrCityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PhoneLocalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Phone2CountryCode" type="{urn:ebay:apis:eBLBaseComponents}CountryCodeType" minOccurs="0"/>
 *         &lt;element name="Phone2CountryPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Phone2AreaOrCityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Phone2LocalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressOwner" type="{urn:ebay:apis:eBLBaseComponents}AddressOwnerCodeType" minOccurs="0"/>
 *         &lt;element name="AddressStatus" type="{urn:ebay:apis:eBLBaseComponents}AddressStatusCodeType" minOccurs="0"/>
 *         &lt;element name="ExternalAddressID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InternationalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InternationalStateAndCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InternationalStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompanyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressRecordType" type="{urn:ebay:apis:eBLBaseComponents}AddressRecordTypeCodeType" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Phone2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressUsage" type="{urn:ebay:apis:eBLBaseComponents}AddressUsageCodeType" minOccurs="0"/>
 *         &lt;element name="ReferenceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressAttribute" type="{urn:ebay:apis:eBLBaseComponents}AddressAttributeType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "name",
    "street",
    "street1",
    "street2",
    "cityName",
    "county",
    "stateOrProvince",
    "country",
    "countryName",
    "phone",
    "phoneCountryCode",
    "phoneCountryPrefix",
    "phoneAreaOrCityCode",
    "phoneLocalNumber",
    "phone2CountryCode",
    "phone2CountryPrefix",
    "phone2AreaOrCityCode",
    "phone2LocalNumber",
    "postalCode",
    "addressID",
    "addressOwner",
    "addressStatus",
    "externalAddressID",
    "internationalName",
    "internationalStateAndCity",
    "internationalStreet",
    "companyName",
    "addressRecordType",
    "firstName",
    "lastName",
    "phone2",
    "addressUsage",
    "referenceID",
    "addressAttribute"
})
public class AddressType {

    @XmlElement(name = "Name", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String name;
    @XmlElement(name = "Street", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String street;
    @XmlElement(name = "Street1", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String street1;
    @XmlElement(name = "Street2", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String street2;
    @XmlElement(name = "CityName", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String cityName;
    @XmlElement(name = "County", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String county;
    @XmlElement(name = "StateOrProvince", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String stateOrProvince;
    @XmlElement(name = "Country", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected CountryCodeType country;
    @XmlElement(name = "CountryName", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String countryName;
    @XmlElement(name = "Phone", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String phone;
    @XmlElement(name = "PhoneCountryCode", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected CountryCodeType phoneCountryCode;
    @XmlElement(name = "PhoneCountryPrefix", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String phoneCountryPrefix;
    @XmlElement(name = "PhoneAreaOrCityCode", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String phoneAreaOrCityCode;
    @XmlElement(name = "PhoneLocalNumber", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String phoneLocalNumber;
    @XmlElement(name = "Phone2CountryCode", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected CountryCodeType phone2CountryCode;
    @XmlElement(name = "Phone2CountryPrefix", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String phone2CountryPrefix;
    @XmlElement(name = "Phone2AreaOrCityCode", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String phone2AreaOrCityCode;
    @XmlElement(name = "Phone2LocalNumber", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String phone2LocalNumber;
    @XmlElement(name = "PostalCode", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String postalCode;
    @XmlElement(name = "AddressID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String addressID;
    @XmlElement(name = "AddressOwner", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected AddressOwnerCodeType addressOwner;
    @XmlElement(name = "AddressStatus", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected AddressStatusCodeType addressStatus;
    @XmlElement(name = "ExternalAddressID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String externalAddressID;
    @XmlElement(name = "InternationalName", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String internationalName;
    @XmlElement(name = "InternationalStateAndCity", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String internationalStateAndCity;
    @XmlElement(name = "InternationalStreet", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String internationalStreet;
    @XmlElement(name = "CompanyName", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String companyName;
    @XmlElement(name = "AddressRecordType", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected AddressRecordTypeCodeType addressRecordType;
    @XmlElement(name = "FirstName", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String firstName;
    @XmlElement(name = "LastName", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String lastName;
    @XmlElement(name = "Phone2", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String phone2;
    @XmlElement(name = "AddressUsage", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected AddressUsageCodeType addressUsage;
    @XmlElement(name = "ReferenceID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String referenceID;
    @XmlElement(name = "AddressAttribute", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<AddressAttributeType> addressAttribute;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the street property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets the value of the street property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet(String value) {
        this.street = value;
    }

    /**
     * Gets the value of the street1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet1() {
        return street1;
    }

    /**
     * Sets the value of the street1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet1(String value) {
        this.street1 = value;
    }

    /**
     * Gets the value of the street2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet2() {
        return street2;
    }

    /**
     * Sets the value of the street2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet2(String value) {
        this.street2 = value;
    }

    /**
     * Gets the value of the cityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * Sets the value of the cityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityName(String value) {
        this.cityName = value;
    }

    /**
     * Gets the value of the county property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCounty() {
        return county;
    }

    /**
     * Sets the value of the county property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCounty(String value) {
        this.county = value;
    }

    /**
     * Gets the value of the stateOrProvince property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateOrProvince() {
        return stateOrProvince;
    }

    /**
     * Sets the value of the stateOrProvince property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateOrProvince(String value) {
        this.stateOrProvince = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCodeType }
     *     
     */
    public CountryCodeType getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCodeType }
     *     
     */
    public void setCountry(CountryCodeType value) {
        this.country = value;
    }

    /**
     * Gets the value of the countryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * Sets the value of the countryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryName(String value) {
        this.countryName = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the phoneCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCodeType }
     *     
     */
    public CountryCodeType getPhoneCountryCode() {
        return phoneCountryCode;
    }

    /**
     * Sets the value of the phoneCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCodeType }
     *     
     */
    public void setPhoneCountryCode(CountryCodeType value) {
        this.phoneCountryCode = value;
    }

    /**
     * Gets the value of the phoneCountryPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneCountryPrefix() {
        return phoneCountryPrefix;
    }

    /**
     * Sets the value of the phoneCountryPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneCountryPrefix(String value) {
        this.phoneCountryPrefix = value;
    }

    /**
     * Gets the value of the phoneAreaOrCityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneAreaOrCityCode() {
        return phoneAreaOrCityCode;
    }

    /**
     * Sets the value of the phoneAreaOrCityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneAreaOrCityCode(String value) {
        this.phoneAreaOrCityCode = value;
    }

    /**
     * Gets the value of the phoneLocalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneLocalNumber() {
        return phoneLocalNumber;
    }

    /**
     * Sets the value of the phoneLocalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneLocalNumber(String value) {
        this.phoneLocalNumber = value;
    }

    /**
     * Gets the value of the phone2CountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCodeType }
     *     
     */
    public CountryCodeType getPhone2CountryCode() {
        return phone2CountryCode;
    }

    /**
     * Sets the value of the phone2CountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCodeType }
     *     
     */
    public void setPhone2CountryCode(CountryCodeType value) {
        this.phone2CountryCode = value;
    }

    /**
     * Gets the value of the phone2CountryPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone2CountryPrefix() {
        return phone2CountryPrefix;
    }

    /**
     * Sets the value of the phone2CountryPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone2CountryPrefix(String value) {
        this.phone2CountryPrefix = value;
    }

    /**
     * Gets the value of the phone2AreaOrCityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone2AreaOrCityCode() {
        return phone2AreaOrCityCode;
    }

    /**
     * Sets the value of the phone2AreaOrCityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone2AreaOrCityCode(String value) {
        this.phone2AreaOrCityCode = value;
    }

    /**
     * Gets the value of the phone2LocalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone2LocalNumber() {
        return phone2LocalNumber;
    }

    /**
     * Sets the value of the phone2LocalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone2LocalNumber(String value) {
        this.phone2LocalNumber = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the addressID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressID() {
        return addressID;
    }

    /**
     * Sets the value of the addressID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressID(String value) {
        this.addressID = value;
    }

    /**
     * Gets the value of the addressOwner property.
     * 
     * @return
     *     possible object is
     *     {@link AddressOwnerCodeType }
     *     
     */
    public AddressOwnerCodeType getAddressOwner() {
        return addressOwner;
    }

    /**
     * Sets the value of the addressOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressOwnerCodeType }
     *     
     */
    public void setAddressOwner(AddressOwnerCodeType value) {
        this.addressOwner = value;
    }

    /**
     * Gets the value of the addressStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AddressStatusCodeType }
     *     
     */
    public AddressStatusCodeType getAddressStatus() {
        return addressStatus;
    }

    /**
     * Sets the value of the addressStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressStatusCodeType }
     *     
     */
    public void setAddressStatus(AddressStatusCodeType value) {
        this.addressStatus = value;
    }

    /**
     * Gets the value of the externalAddressID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalAddressID() {
        return externalAddressID;
    }

    /**
     * Sets the value of the externalAddressID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalAddressID(String value) {
        this.externalAddressID = value;
    }

    /**
     * Gets the value of the internationalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternationalName() {
        return internationalName;
    }

    /**
     * Sets the value of the internationalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternationalName(String value) {
        this.internationalName = value;
    }

    /**
     * Gets the value of the internationalStateAndCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternationalStateAndCity() {
        return internationalStateAndCity;
    }

    /**
     * Sets the value of the internationalStateAndCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternationalStateAndCity(String value) {
        this.internationalStateAndCity = value;
    }

    /**
     * Gets the value of the internationalStreet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternationalStreet() {
        return internationalStreet;
    }

    /**
     * Sets the value of the internationalStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternationalStreet(String value) {
        this.internationalStreet = value;
    }

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the addressRecordType property.
     * 
     * @return
     *     possible object is
     *     {@link AddressRecordTypeCodeType }
     *     
     */
    public AddressRecordTypeCodeType getAddressRecordType() {
        return addressRecordType;
    }

    /**
     * Sets the value of the addressRecordType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressRecordTypeCodeType }
     *     
     */
    public void setAddressRecordType(AddressRecordTypeCodeType value) {
        this.addressRecordType = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the phone2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone2() {
        return phone2;
    }

    /**
     * Sets the value of the phone2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone2(String value) {
        this.phone2 = value;
    }

    /**
     * Gets the value of the addressUsage property.
     * 
     * @return
     *     possible object is
     *     {@link AddressUsageCodeType }
     *     
     */
    public AddressUsageCodeType getAddressUsage() {
        return addressUsage;
    }

    /**
     * Sets the value of the addressUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressUsageCodeType }
     *     
     */
    public void setAddressUsage(AddressUsageCodeType value) {
        this.addressUsage = value;
    }

    /**
     * Gets the value of the referenceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceID() {
        return referenceID;
    }

    /**
     * Sets the value of the referenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceID(String value) {
        this.referenceID = value;
    }

    /**
     * Gets the value of the addressAttribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressAttribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressAttributeType }
     * 
     * 
     */
    public List<AddressAttributeType> getAddressAttribute() {
        if (addressAttribute == null) {
            addressAttribute = new ArrayList<AddressAttributeType>();
        }
        return this.addressAttribute;
    }

}
