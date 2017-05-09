package org.company.Model;

/**
 * Created by marco on 9/5/17.
 */
public class PilotoInf {
    private char dorsal;
    private String nombrePiloto;
    private String nacionalidad;

    // Constructores

    public PilotoInf() {
    }

    public PilotoInf(char dorsal, String nombrePiloto, String nacionalidad) {
        this.dorsal = dorsal;
        this.nombrePiloto = nombrePiloto;
        this.nacionalidad = nacionalidad;
    }

    // Accesores

    public char getDorsal() {
        return dorsal;
    }

    public void setDorsal(char dorsal) {
        this.dorsal = dorsal;
    }

    public String getNombrePiloto() {
        return nombrePiloto;
    }

    public void setNombrePiloto(String nombrePiloto) {
        this.nombrePiloto = nombrePiloto;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
}
