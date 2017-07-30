
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * 				Contains information about a Selling Manager folder.
 * 			
 * 
 * <p>Java class for SellingManagerFolderDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SellingManagerFolderDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FolderID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ParentFolderID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="FolderLevel" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="FolderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FolderComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChildFolder" type="{urn:ebay:apis:eBLBaseComponents}SellingManagerFolderDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CreationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SellingManagerFolderDetailsType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "folderID",
    "parentFolderID",
    "folderLevel",
    "folderName",
    "folderComment",
    "childFolder",
    "creationTime"
})
public class SellingManagerFolderDetailsType {

    @XmlElement(name = "FolderID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Long folderID;
    @XmlElement(name = "ParentFolderID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Long parentFolderID;
    @XmlElement(name = "FolderLevel", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected Long folderLevel;
    @XmlElement(name = "FolderName", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String folderName;
    @XmlElement(name = "FolderComment", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String folderComment;
    @XmlElement(name = "ChildFolder", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<SellingManagerFolderDetailsType> childFolder;
    @XmlElement(name = "CreationTime", namespace = "urn:ebay:apis:eBLBaseComponents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationTime;

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
     * Gets the value of the parentFolderID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getParentFolderID() {
        return parentFolderID;
    }

    /**
     * Sets the value of the parentFolderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setParentFolderID(Long value) {
        this.parentFolderID = value;
    }

    /**
     * Gets the value of the folderLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFolderLevel() {
        return folderLevel;
    }

    /**
     * Sets the value of the folderLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFolderLevel(Long value) {
        this.folderLevel = value;
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

    /**
     * Gets the value of the folderComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolderComment() {
        return folderComment;
    }

    /**
     * Sets the value of the folderComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolderComment(String value) {
        this.folderComment = value;
    }

    /**
     * Gets the value of the childFolder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the childFolder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildFolder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SellingManagerFolderDetailsType }
     * 
     * 
     */
    public List<SellingManagerFolderDetailsType> getChildFolder() {
        if (childFolder == null) {
            childFolder = new ArrayList<SellingManagerFolderDetailsType>();
        }
        return this.childFolder;
    }

    /**
     * Gets the value of the creationTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationTime() {
        return creationTime;
    }

    /**
     * Sets the value of the creationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationTime(XMLGregorianCalendar value) {
        this.creationTime = value;
    }

}
