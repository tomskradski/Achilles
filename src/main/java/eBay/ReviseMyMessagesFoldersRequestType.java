
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
 * 				Renames, removes, or restores the specified My Messages folders for
 * 				a given user.
 * 			
 * 
 * <p>Java class for ReviseMyMessagesFoldersRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReviseMyMessagesFoldersRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="Operation" type="{urn:ebay:apis:eBLBaseComponents}MyMessagesFolderOperationCodeType" minOccurs="0"/>
 *         &lt;element name="FolderID" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FolderName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReviseMyMessagesFoldersRequestType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "operation",
    "folderID",
    "folderName"
})
public class ReviseMyMessagesFoldersRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "Operation", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "token")
    protected MyMessagesFolderOperationCodeType operation;
    @XmlElement(name = "FolderID", namespace = "urn:ebay:apis:eBLBaseComponents", type = Long.class)
    protected List<Long> folderID;
    @XmlElement(name = "FolderName", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<String> folderName;

    /**
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link MyMessagesFolderOperationCodeType }
     *     
     */
    public MyMessagesFolderOperationCodeType getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link MyMessagesFolderOperationCodeType }
     *     
     */
    public void setOperation(MyMessagesFolderOperationCodeType value) {
        this.operation = value;
    }

    /**
     * Gets the value of the folderID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the folderID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFolderID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getFolderID() {
        if (folderID == null) {
            folderID = new ArrayList<Long>();
        }
        return this.folderID;
    }

    /**
     * Gets the value of the folderName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the folderName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFolderName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFolderName() {
        if (folderName == null) {
            folderName = new ArrayList<String>();
        }
        return this.folderName;
    }

}
