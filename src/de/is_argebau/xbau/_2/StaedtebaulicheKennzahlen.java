//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.08 at 11:08:34 AM CEST 
//


package de.is_argebau.xbau._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Dieser Typ fasst die städtebaulichen Kennzahlen des Vorhabens zusammen.
 * 
 * <p>Java class for StaedtebaulicheKennzahlen complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StaedtebaulicheKennzahlen">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="geschossflaechenzahl" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="grundflaechenzahl" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="baumassenzahl" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StaedtebaulicheKennzahlen", propOrder = {
    "geschossflaechenzahl",
    "grundflaechenzahl",
    "baumassenzahl"
})
public class StaedtebaulicheKennzahlen {

    protected short geschossflaechenzahl;
    protected short grundflaechenzahl;
    protected short baumassenzahl;

    /**
     * Gets the value of the geschossflaechenzahl property.
     * 
     */
    public short getGeschossflaechenzahl() {
        return geschossflaechenzahl;
    }

    /**
     * Sets the value of the geschossflaechenzahl property.
     * 
     */
    public void setGeschossflaechenzahl(short value) {
        this.geschossflaechenzahl = value;
    }

    /**
     * Gets the value of the grundflaechenzahl property.
     * 
     */
    public short getGrundflaechenzahl() {
        return grundflaechenzahl;
    }

    /**
     * Sets the value of the grundflaechenzahl property.
     * 
     */
    public void setGrundflaechenzahl(short value) {
        this.grundflaechenzahl = value;
    }

    /**
     * Gets the value of the baumassenzahl property.
     * 
     */
    public short getBaumassenzahl() {
        return baumassenzahl;
    }

    /**
     * Sets the value of the baumassenzahl property.
     * 
     */
    public void setBaumassenzahl(short value) {
        this.baumassenzahl = value;
    }

}
