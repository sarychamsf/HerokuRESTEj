package org.o7planning.restfulcrud.model;
 
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
 
@XmlRootElement(name = "equipo")
@XmlAccessorType(XmlAccessType.FIELD)

public class Equipo {
 
    private String idEquipo;
    private String nombreEquipo;
 
    // This default constructor is required if there are other constructors.
    public Equipo() {
 
    }

    public Equipo(String idEquipo, String nombreEquipo) {
        this.idEquipo = idEquipo;
        this.nombreEquipo = nombreEquipo;
    }

    public String getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(String idEquipo) {
        this.idEquipo = idEquipo;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

}