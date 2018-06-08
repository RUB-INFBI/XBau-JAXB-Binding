//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.08 at 11:08:34 AM CEST 
//


package org.isotc211._2005.gmd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.isotc211._2005.gco.BooleanPropertyType;
import org.isotc211._2005.gco.CharacterStringPropertyType;
import org.isotc211._2005.gss.GMPointPropertyType;


/**
 * <p>Java class for MD_Georectified_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MD_Georectified_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gmd}MD_GridSpatialRepresentation_Type">
 *       &lt;sequence>
 *         &lt;element name="checkPointAvailability" type="{http://www.isotc211.org/2005/gco}Boolean_PropertyType"/>
 *         &lt;element name="checkPointDescription" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         &lt;element name="cornerPoints" type="{http://www.isotc211.org/2005/gss}GM_Point_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="centerPoint" type="{http://www.isotc211.org/2005/gss}GM_Point_PropertyType" minOccurs="0"/>
 *         &lt;element name="pointInPixel" type="{http://www.isotc211.org/2005/gmd}MD_PixelOrientationCode_PropertyType"/>
 *         &lt;element name="transformationDimensionDescription" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         &lt;element name="transformationDimensionMapping" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" maxOccurs="2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_Georectified_Type", propOrder = {
    "checkPointAvailability",
    "checkPointDescription",
    "cornerPoints",
    "centerPoint",
    "pointInPixel",
    "transformationDimensionDescription",
    "transformationDimensionMapping"
})
public class MDGeorectifiedType
    extends MDGridSpatialRepresentationType
{

    @XmlElement(required = true)
    protected BooleanPropertyType checkPointAvailability;
    protected CharacterStringPropertyType checkPointDescription;
    protected List<GMPointPropertyType> cornerPoints;
    protected GMPointPropertyType centerPoint;
    @XmlElement(required = true)
    protected MDPixelOrientationCodePropertyType pointInPixel;
    protected CharacterStringPropertyType transformationDimensionDescription;
    protected List<CharacterStringPropertyType> transformationDimensionMapping;

    /**
     * Gets the value of the checkPointAvailability property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanPropertyType }
     *     
     */
    public BooleanPropertyType getCheckPointAvailability() {
        return checkPointAvailability;
    }

    /**
     * Sets the value of the checkPointAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanPropertyType }
     *     
     */
    public void setCheckPointAvailability(BooleanPropertyType value) {
        this.checkPointAvailability = value;
    }

    /**
     * Gets the value of the checkPointDescription property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getCheckPointDescription() {
        return checkPointDescription;
    }

    /**
     * Sets the value of the checkPointDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setCheckPointDescription(CharacterStringPropertyType value) {
        this.checkPointDescription = value;
    }

    /**
     * Gets the value of the cornerPoints property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cornerPoints property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCornerPoints().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GMPointPropertyType }
     * 
     * 
     */
    public List<GMPointPropertyType> getCornerPoints() {
        if (cornerPoints == null) {
            cornerPoints = new ArrayList<GMPointPropertyType>();
        }
        return this.cornerPoints;
    }

    /**
     * Gets the value of the centerPoint property.
     * 
     * @return
     *     possible object is
     *     {@link GMPointPropertyType }
     *     
     */
    public GMPointPropertyType getCenterPoint() {
        return centerPoint;
    }

    /**
     * Sets the value of the centerPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link GMPointPropertyType }
     *     
     */
    public void setCenterPoint(GMPointPropertyType value) {
        this.centerPoint = value;
    }

    /**
     * Gets the value of the pointInPixel property.
     * 
     * @return
     *     possible object is
     *     {@link MDPixelOrientationCodePropertyType }
     *     
     */
    public MDPixelOrientationCodePropertyType getPointInPixel() {
        return pointInPixel;
    }

    /**
     * Sets the value of the pointInPixel property.
     * 
     * @param value
     *     allowed object is
     *     {@link MDPixelOrientationCodePropertyType }
     *     
     */
    public void setPointInPixel(MDPixelOrientationCodePropertyType value) {
        this.pointInPixel = value;
    }

    /**
     * Gets the value of the transformationDimensionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getTransformationDimensionDescription() {
        return transformationDimensionDescription;
    }

    /**
     * Sets the value of the transformationDimensionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setTransformationDimensionDescription(CharacterStringPropertyType value) {
        this.transformationDimensionDescription = value;
    }

    /**
     * Gets the value of the transformationDimensionMapping property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transformationDimensionMapping property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransformationDimensionMapping().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CharacterStringPropertyType }
     * 
     * 
     */
    public List<CharacterStringPropertyType> getTransformationDimensionMapping() {
        if (transformationDimensionMapping == null) {
            transformationDimensionMapping = new ArrayList<CharacterStringPropertyType>();
        }
        return this.transformationDimensionMapping;
    }

}
