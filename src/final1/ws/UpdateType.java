
package final1.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="upType" type="{http://ws.final1/}type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateType", propOrder = {
    "upType"
})
public class UpdateType {

    protected Type upType;

    /**
     * Gets the value of the upType property.
     * 
     * @return
     *     possible object is
     *     {@link Type }
     *     
     */
    public Type getUpType() {
        return upType;
    }

    /**
     * Sets the value of the upType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Type }
     *     
     */
    public void setUpType(Type value) {
        this.upType = value;
    }

}
