
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Details relating to a My Messages folder.
 * 			
 * 
 * <p>Java class for MyMessagesFolderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MyMessagesFolderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FolderID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="FolderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MyMessagesFolderType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "folderID",
    "folderName"
})
public class MyMessagesFolderType {

    @XmlElement(name = "FolderID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Long folderID;
    @XmlElement(name = "FolderName", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String folderName;

    /**
     * Gets the value of the folderID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFolderID() {
        return folderID;
    }

    /**
     * Sets the value of the folderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFolderID(Long value) {
        this.folderID = value;
    }

    /**
     * Gets the value of the folderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolderName() {
        return folderName;
    }

    /**
     * Sets the value of the folderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolderName(String value) {
        this.folderName = value;
    }

}
