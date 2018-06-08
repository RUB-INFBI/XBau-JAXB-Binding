//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.08 at 11:08:34 AM CEST 
//


package de.is_argebau.xbau._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.is-argebau.de/xbau/2}Nachricht.G2privat">
 *       &lt;sequence>
 *         &lt;element name="bezug" type="{http://www.is-argebau.de/xbau/2}Bezug"/>
 *         &lt;element name="aufforderungZurStellungnahme" type="{http://www.is-argebau.de/xbau/2}Text"/>
 *         &lt;element name="bescheidlage" type="{http://www.is-argebau.de/xbau/2}BefundlisteMateriell"/>
 *         &lt;element name="frist" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bezug",
    "aufforderungZurStellungnahme",
    "bescheidlage",
    "frist"
})
@XmlRootElement(name = "baugenehmigung.anhoerung.0203")
public class BaugenehmigungAnhoerung0203
    extends NachrichtG2Privat
{

    @XmlElement(required = true)
    protected Bezug bezug;
    @XmlElement(required = true)
    protected Text aufforderungZurStellungnahme;
    @XmlElement(required = true)
    protected BefundlisteMateriell bescheidlage;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar frist;

    /**
     * Gets the value of the bezug property.
     * 
     * @return
     *     possible object is
     *     {@link Bezug }
     *     
     */
    public Bezug getBezug() {
        return bezug;
    }

    /**
     * Sets the value of the bezug property.
     * 
     * @param value
     *     allowed object is
     *     {@link Bezug }
     *     
     */
    public void setBezug(Bezug value) {
        this.bezug = value;
    }

    /**
     * Gets the value of the aufforderungZurStellungnahme property.
     * 
     * @return
     *     possible object is
     *     {@link Text }
     *     
     */
    public Text getAufforderungZurStellungnahme() {
        return aufforderungZurStellungnahme;
    }

    /**
     * Sets the value of the aufforderungZurStellungnahme property.
     * 
     * @param value
     *     allowed object is
     *     {@link Text }
     *     
     */
    public void setAufforderungZurStellungnahme(Text value) {
        this.aufforderungZurStellungnahme = value;
    }

    /**
     * Gets the value of the bescheidlage property.
     * 
     * @return
     *     possible object is
     *     {@link BefundlisteMateriell }
     *     
     */
    public BefundlisteMateriell getBescheidlage() {
        return bescheidlage;
    }

    /**
     * Sets the value of the bescheidlage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BefundlisteMateriell }
     *     
     */
    public void setBescheidlage(BefundlisteMateriell value) {
        this.bescheidlage = value;
    }

    /**
     * Gets the value of the frist property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFrist() {
        return frist;
    }

    /**
     * Sets the value of the frist property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFrist(XMLGregorianCalendar value) {
        this.frist = value;
    }

}