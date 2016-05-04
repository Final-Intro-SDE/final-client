
package final1.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deleteType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="delType" type="{http://ws.final1/}type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteType", propOrder = {
    "delType"
})
public class DeleteType {

    protected Type delType;

    /**
     * Gets the value of the delType property.
     * 
     * @return
     *     possible object is
     *     {@link Type }
     *     
     */
    public Type getDelType() {
        return delType;
    }

    /**
     * Sets the value of the delType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Type }
     *     
     */
    public void setDelType(Type value) {
        this.delType = value;
    }

}
