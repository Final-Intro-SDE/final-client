
package final1.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updatePerson complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updatePerson">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="up_person" type="{http://ws.final1/}person" minOccurs="0"/>
 *         &lt;element name="up_pid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updatePerson", propOrder = {
    "upPerson",
    "upPid"
})
public class UpdatePerson {

    @XmlElement(name = "up_person")
    protected Person upPerson;
    @XmlElement(name = "up_pid")
    protected int upPid;

    /**
     * Gets the value of the upPerson property.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getUpPerson() {
        return upPerson;
    }

    /**
     * Sets the value of the upPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setUpPerson(Person value) {
        this.upPerson = value;
    }

    /**
     * Gets the value of the upPid property.
     * 
     */
    public int getUpPid() {
        return upPid;
    }

    /**
     * Sets the value of the upPid property.
     * 
     */
    public void setUpPid(int value) {
        this.upPid = value;
    }

}
