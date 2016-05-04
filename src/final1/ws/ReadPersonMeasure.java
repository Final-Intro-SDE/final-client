
package final1.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for readPersonMeasure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="readPersonMeasure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="m_pid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="m_measure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "readPersonMeasure", propOrder = {
    "mPid",
    "mMeasure",
    "mid"
})
public class ReadPersonMeasure {

    @XmlElement(name = "m_pid")
    protected int mPid;
    @XmlElement(name = "m_measure")
    protected String mMeasure;
    protected int mid;

    /**
     * Gets the value of the mPid property.
     * 
     */
    public int getMPid() {
        return mPid;
    }

    /**
     * Sets the value of the mPid property.
     * 
     */
    public void setMPid(int value) {
        this.mPid = value;
    }

    /**
     * Gets the value of the mMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMMeasure() {
        return mMeasure;
    }

    /**
     * Sets the value of the mMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMMeasure(String value) {
        this.mMeasure = value;
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
