
package final1.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for savePersonMeasure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="savePersonMeasure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="s_pid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="s_measure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "savePersonMeasure", propOrder = {
    "sPid",
    "sMeasure",
    "value"
})
public class SavePersonMeasure {

    @XmlElement(name = "s_pid")
    protected int sPid;
    @XmlElement(name = "s_measure")
    protected String sMeasure;
    protected String value;

    /**
     * Gets the value of the sPid property.
     * 
     */
    public int getSPid() {
        return sPid;
    }

    /**
     * Sets the value of the sPid property.
     * 
     */
    public void setSPid(int value) {
        this.sPid = value;
    }

    /**
     * Gets the value of the sMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSMeasure() {
        return sMeasure;
    }

    /**
     * Sets the value of the sMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSMeasure(String value) {
        this.sMeasure = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

}
