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
 * Diese Komponente beinhaltet Informationen zur geografischen Bestimmung von Dingen.
 * 
 * <p>Java class for Geokodierung complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Geokodierung">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="flurnummer" type="{http://xoev.de/latinchars/1_1/datatypes}String.Latin" minOccurs="0"/>
 *         &lt;element name="flurstueck" type="{http://xoev.de/latinchars/1_1/datatypes}String.Latin" minOccurs="0"/>
 *         &lt;element name="gemarkung" type="{http://xoev.de/latinchars/1_1/datatypes}String.Latin" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Geokodierung", propOrder = {
    "flurnummer",
    "flurstueck",
    "gemarkung"
})
public class Geokodierung {

    protected String flurnummer;
    protected String flurstueck;
    protected String gemarkung;

    /**
     * Gets the value of the flurnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlurnummer() {
        return flurnummer;
    }

    /**
     * Sets the value of the flurnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlurnummer(String value) {
        this.flurnummer = value;
    }

    /**
     * Gets the value of the flurstueck property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlurstueck() {
        return flurstueck;
    }

    /**
     * Sets the value of the flurstueck property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlurstueck(String value) {
        this.flurstueck = value;
    }

    /**
     * Gets the value of the gemarkung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGemarkung() {
        return gemarkung;
    }

    /**
     * Sets the value of the gemarkung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGemarkung(String value) {
        this.gemarkung = value;
    }

}
