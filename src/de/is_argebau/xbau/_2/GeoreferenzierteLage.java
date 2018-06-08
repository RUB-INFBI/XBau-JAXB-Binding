//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.08 at 11:08:34 AM CEST 
//


package de.is_argebau.xbau._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml._3.PolygonType;


/**
 * In eine Instanz diesen Typs werden die Geodaten eines Vorhabens oder einer sonstigen Entität eintragen.
 * 
 * <p>Java class for GeoreferenzierteLage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeoreferenzierteLage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="flaeche" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.opengis.net/gml/3.2}Polygon"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="erlaeuterung" type="{http://xoev.de/latinchars/1_1/datatypes}String.Latin" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeoreferenzierteLage", propOrder = {
    "flaeche",
    "erlaeuterung"
})
public class GeoreferenzierteLage {

    @XmlElement(required = true)
    protected List<GeoreferenzierteLage.Flaeche> flaeche;
    protected String erlaeuterung;

    /**
     * Gets the value of the flaeche property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flaeche property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlaeche().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeoreferenzierteLage.Flaeche }
     * 
     * 
     */
    public List<GeoreferenzierteLage.Flaeche> getFlaeche() {
        if (flaeche == null) {
            flaeche = new ArrayList<GeoreferenzierteLage.Flaeche>();
        }
        return this.flaeche;
    }

    /**
     * Gets the value of the erlaeuterung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErlaeuterung() {
        return erlaeuterung;
    }

    /**
     * Sets the value of the erlaeuterung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErlaeuterung(String value) {
        this.erlaeuterung = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.opengis.net/gml/3.2}Polygon"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "polygon"
    })
    public static class Flaeche {

        @XmlElement(name = "Polygon", namespace = "http://www.opengis.net/gml/3.2", required = true)
        protected PolygonType polygon;

        /**
         * Das Element (globales Element gml:Polygon) enthält die GML-Darstellung einer Grundfläche (es können Außenkanten und Innenkanten dargestellt werden).
         * Aus der GML-Dokumentation: "A Polygon is a special surface that is defined by a single surface patch. The boundary of this patch is coplanar and the polygon uses planar interpolation in its interior. The elements exterior and interior describe the surface boundary of the polygon." Quelle: http://www.datypic.com/sc/niem21/e-gml32_Polygon.html
         * 
         * @return
         *     possible object is
         *     {@link PolygonType }
         *     
         */
        public PolygonType getPolygon() {
            return polygon;
        }

        /**
         * Sets the value of the polygon property.
         * 
         * @param value
         *     allowed object is
         *     {@link PolygonType }
         *     
         */
        public void setPolygon(PolygonType value) {
            this.polygon = value;
        }

    }

}
