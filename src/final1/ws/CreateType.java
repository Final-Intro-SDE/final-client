
package final1.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="creType" type="{http://ws.final1/}type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createType", propOrder = {
    "creType"
})
public class CreateType {

    protected Type creType;

    /**
     * Gets the value of the creType property.
     * 
     * @return
     *     possible object is
     *     {@link Type }
     *     
     */
    public Type getCreType() {
        return creType;
    }

    /**
     * Sets the value of the creType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Type }
     *     
     */
    public void setCreType(Type value) {
        this.creType = value;
    }

}
