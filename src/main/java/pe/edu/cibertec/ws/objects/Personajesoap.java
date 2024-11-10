//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.11.10 a las 11:11:10 AM PET 
//


package pe.edu.cibertec.ws.objects;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para personajesoap complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="personajesoap"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nombrePersonaje" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="apellidoPersonaje" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Nacimiento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "personajesoap", propOrder = {
    "id",
    "nombrePersonaje",
    "apellidoPersonaje",
    "nacimiento"
})
public class Personajesoap {

    protected int id;
    @XmlElement(required = true)
    protected String nombrePersonaje;
    @XmlElement(required = true)
    protected String apellidoPersonaje;
    @XmlElement(name = "Nacimiento", required = true)
    protected String nacimiento;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad nombrePersonaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombrePersonaje() {
        return nombrePersonaje;
    }

    /**
     * Define el valor de la propiedad nombrePersonaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombrePersonaje(String value) {
        this.nombrePersonaje = value;
    }

    /**
     * Obtiene el valor de la propiedad apellidoPersonaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellidoPersonaje() {
        return apellidoPersonaje;
    }

    /**
     * Define el valor de la propiedad apellidoPersonaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellidoPersonaje(String value) {
        this.apellidoPersonaje = value;
    }

    /**
     * Obtiene el valor de la propiedad nacimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNacimiento() {
        return nacimiento;
    }

    /**
     * Define el valor de la propiedad nacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNacimiento(String value) {
        this.nacimiento = value;
    }

}
