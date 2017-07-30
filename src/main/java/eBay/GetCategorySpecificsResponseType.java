
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This is the base response type for the <b>GetCategorySpecifics</b> call. This call retrieves recommended Item Specifics names and values for one or multiple eBay Categories.
 * 		
 * 
 * <p>Java class for GetCategorySpecificsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCategorySpecificsResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="Recommendations" type="{urn:ebay:apis:eBLBaseComponents}RecommendationsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TaskReferenceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FileReferenceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCategorySpecificsResponseType", namespace = "urn:ebay:apis:eBLBaseComponents", propOrder = {
    "recommendations",
    "taskReferenceID",
    "fileReferenceID"
})
public class GetCategorySpecificsResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "Recommendations", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<RecommendationsType> recommendations;
    @XmlElement(name = "TaskReferenceID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String taskReferenceID;
    @XmlElement(name = "FileReferenceID", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected String fileReferenceID;

    /**
     * Gets the value of the recommendations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recommendations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecommendations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecommendationsType }
     * 
     * 
     */
    public List<RecommendationsType> getRecommendations() {
        if (recommendations == null) {
            recommendations = new ArrayList<RecommendationsType>();
        }
        return this.recommendations;
    }

    /**
     * Gets the value of the taskReferenceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskReferenceID() {
        return taskReferenceID;
    }

    /**
     * Sets the value of the taskReferenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskReferenceID(String value) {
        this.taskReferenceID = value;
    }

    /**
     * Gets the value of the fileReferenceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileReferenceID() {
        return fileReferenceID;
    }

    /**
     * Sets the value of the fileReferenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileReferenceID(String value) {
        this.fileReferenceID = value;
    }

}
