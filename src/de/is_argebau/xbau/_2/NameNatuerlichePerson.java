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
import javax.xml.bind.annotation.XmlType;


/**
 * Der Name einer Person ist eine Benennung dieser Person, die dazu dient, diese Person von anderen Personen zu unterscheiden.
 * 
 * <p>Java class for NameNatuerlichePerson complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NameNatuerlichePerson">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="titel" type="{http://xoev.de/latinchars/1_1/datatypes}String.Latin" minOccurs="0"/>
 *         &lt;element name="anrede" type="{http://xoev.de/latinchars/1_1/datatypes}String.Latin"/>
 *         &lt;element name="familienname" type="{http://www.is-argebau.de/xbau/2}AllgemeinerName"/>
 *         &lt;element name="vorname" type="{http://www.is-argebau.de/xbau/2}AllgemeinerName"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NameNatuerlichePerson", propOrder = {
    "titel",
    "anrede",
    "familienname",
    "vorname"
})
public class NameNatuerlichePerson {

    protected String titel;
    @XmlElement(required = true)
    protected String anrede;
    @XmlElement(required = true)
    protected AllgemeinerName familienname;
    @XmlElement(required = true)
    protected AllgemeinerName vorname;

    /**
     * Gets the value of the titel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitel() {
        return titel;
    }

    /**
     * Sets the value of the titel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitel(String value) {
        this.titel = value;
    }

    /**
     * Gets the value of the anrede property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnrede() {
        return anrede;
    }

    /**
     * Sets the value of the anrede property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnrede(String value) {
        this.anrede = value;
    }

    /**
     * Gets the value of the familienname property.
     * 
     * @return
     *     possible object is
     *     {@link AllgemeinerName }
     *     
     */
    public AllgemeinerName getFamilienname() {
        return familienname;
    }

    /**
     * Sets the value of the familienname property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllgemeinerName }
     *     
     */
    public void setFamilienname(AllgemeinerName value) {
        this.familienname = value;
    }

    /**
     * Gets the value of the vorname property.
     * 
     * @return
     *     possible object is
     *     {@link AllgemeinerName }
     *     
     */
    public AllgemeinerName getVorname() {
        return vorname;
    }

    /**
     * Sets the value of the vorname property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllgemeinerName }
     *     
     */
    public void setVorname(AllgemeinerName value) {
        this.vorname = value;
    }

}
