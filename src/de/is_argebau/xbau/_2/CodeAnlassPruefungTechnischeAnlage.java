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
import de.xoev.schemata.code._1_0.Code;


/**
 * Anlass der Prüfung einer überwachungspflilchtigen Anlage gemäß Musterprüfverordnung §2 Abs. 2
 * 
 * <p>Java class for Code.AnlassPruefungTechnischeAnlage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Code.AnlassPruefungTechnischeAnlage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://xoev.de/schemata/code/1_0}Code">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://www.is-argebau.de/xbau/2}Codelist.AnlassPruefungTechnAnlage" form="unqualified"/>
 *       &lt;/sequence>
 *       &lt;attribute name="listURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" fixed="urn:xoev-de:xbau:codeliste:mppvopruefungtechnischeanlage" />
 *       &lt;attribute name="listVersionID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" fixed="1.0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Code.AnlassPruefungTechnischeAnlage")
public class CodeAnlassPruefungTechnischeAnlage
    extends Code
{


}
