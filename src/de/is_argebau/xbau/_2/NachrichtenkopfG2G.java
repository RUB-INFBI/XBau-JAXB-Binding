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
 * Nachrichtenkopf für Nachrichten von Behörden an andere Behörden.
 * 
 * <p>Java class for Nachrichtenkopf.G2G complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Nachrichtenkopf.G2G">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.osci.de/xinneres/basisnachricht/3}Nachrichtenkopf.G2G">
 *       &lt;sequence>
 *         &lt;element name="identifikation.nachricht" type="{http://www.is-argebau.de/xbau/2}Identifikation.Nachricht" form="unqualified"/>
 *         &lt;element name="leser" type="{http://www.osci.de/xinneres/behoerde/3}Behoerde" form="unqualified"/>
 *         &lt;element name="autor" type="{http://www.osci.de/xinneres/behoerde/3}Behoerde.Erreichbar" form="unqualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Nachrichtenkopf.G2G")
public class NachrichtenkopfG2G
    extends de.osci.xinneres.basisnachricht._3.NachrichtenkopfG2G
{


}
