
package final1.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createPerson complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createPerson">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cre_person" type="{http://ws.final1/}person" minOccurs="0"/>
 *         &lt;element name="healthp" type="{http://ws.final1/}healthprofile" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createPerson", propOrder = {
    "crePerson",
    "healthp"
})
public class CreatePerson {

    @XmlElement(name = "cre_person")
    protected Person crePerson;
    protected Healthprofile healthp;

    /**
     * Gets the value of the crePerson property.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getCrePerson() {
        return crePerson;
    }

    /**
     * Sets the value of the crePerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setCrePerson(Person value) {
        this.crePerson = value;
    }

    /**
     * Gets the value of the healthp property.
     * 
     * @return
     *     possible object is
     *     {@link Healthprofile }
     *     
     */
    public Healthprofile getHealthp() {
        return healthp;
    }

    /**
     * Sets the value of the healthp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Healthprofile }
     *     
     */
    public void setHealthp(Healthprofile value) {
        this.healthp = value;
    }

}
