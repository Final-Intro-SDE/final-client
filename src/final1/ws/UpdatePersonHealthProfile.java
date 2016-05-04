
package final1.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updatePersonHealthProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updatePersonHealthProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="uphis_pid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="uphis_measure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MeasureObj" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="mid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updatePersonHealthProfile", propOrder = {
    "uphisPid",
    "uphisMeasure",
    "measureObj",
    "mid"
})
public class UpdatePersonHealthProfile {

    @XmlElement(name = "uphis_pid")
    protected int uphisPid;
    @XmlElement(name = "uphis_measure")
    protected String uphisMeasure;
    @XmlElement(name = "MeasureObj")
    protected int measureObj;
    protected int mid;

    /**
     * Gets the value of the uphisPid property.
     * 
     */
    public int getUphisPid() {
        return uphisPid;
    }

    /**
     * Sets the value of the uphisPid property.
     * 
     */
    public void setUphisPid(int value) {
        this.uphisPid = value;
    }

    /**
     * Gets the value of the uphisMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUphisMeasure() {
        return uphisMeasure;
    }

    /**
     * Sets the value of the uphisMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUphisMeasure(String value) {
        this.uphisMeasure = value;
    }

    /**
     * Gets the value of the measureObj property.
     * 
     */
    public int getMeasureObj() {
        return measureObj;
    }

    /**
     * Sets the value of the measureObj property.
     * 
     */
    public void setMeasureObj(int value) {
        this.measureObj = value;
    }

    /**
     * Gets the value of the mid property.
     * 
     */
    public int getMid() {
        return mid;
    }

    /**
     * Sets the value of the mid property.
     * 
     */
    public void setMid(int value) {
        this.mid = value;
    }

}
