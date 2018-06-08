//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.08 at 11:08:34 AM CEST 
//


package de.osci.xinneres.basisnachricht._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Dieser Typ enthält die für die Identifikation einer Nachricht erforderlichen Informationen, wobei der Nachrichtentyp hier als Typ-4 Code-Datentyp modelliert ist. 
 * Dieser Typ sollte daher an den Stellen genutzt werden, in denen identifizierende Angaben zu Nachrichten aus mehr als einem Fachstandard übermittelt werden müssen.
 * 
 * <p>Java class for Identifikation.Nachricht.Typ4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Identifikation.Nachricht.Typ4">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.osci.de/xinneres/basisnachricht/3}Identifikation.Nachricht">
 *       &lt;sequence>
 *         &lt;element name="nachrichtenUUID" type="{http://www.osci.de/xinneres/basisnachricht/3}UUID" form="unqualified"/>
 *         &lt;element name="nachrichtentyp" type="{http://www.osci.de/xinneres/basisnachricht/3}Code.Nachrichtentyp.Typ4" form="unqualified"/>
 *         &lt;element name="erstellungszeitpunkt" type="{http://www.w3.org/2001/XMLSchema}dateTime" form="unqualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Identifikation.Nachricht.Typ4")
public class IdentifikationNachrichtTyp4
    extends IdentifikationNachricht
{


}
