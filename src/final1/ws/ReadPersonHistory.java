
package final1.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for readPersonHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="readPersonHistory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="his_pid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="his_measure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "readPersonHistory", propOrder = {
    "hisPid",
    "hisMeasure"
})
public class ReadPersonHistory {

    @XmlElement(name = "his_pid")
    protected int hisPid;
    @XmlElement(name = "his_measure")
    protected String hisMeasure;

    /**
     * Gets the value of the hisPid property.
     * 
     */
    public int getHisPid() {
        return hisPid;
    }

    /**
     * Sets the value of the hisPid property.
     * 
     */
    public void setHisPid(int value) {
        this.hisPid = value;
    }

    /**
     * Gets the value of the hisMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHisMeasure() {
        return hisMeasure;
    }

    /**
     * Sets the value of the hisMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHisMeasure(String value) {
        this.hisMeasure = value;
    }

}
