package org.company.Model;

/**
 * Created by marco on 9/5/17.
 */
public class Piloto {
    private int dorsal;
    private String nombrePiloto;
    private String nacionalidad;
    private TipoPiloto tipoPiloto;
    private TipoEscuderia escuderia;

    // Constructores

    public Piloto() {
    }

    public Piloto(int dorsal, String nombrePiloto, String nacionalidad, TipoPiloto tipoPiloto, TipoEscuderia escuderia) {
        this.dorsal = dorsal;
        this.nombrePiloto = nombrePiloto;
        this.nacionalidad = nacionalidad;
        this.tipoPiloto = tipoPiloto;
        this.escuderia = escuderia;
    }

    // Accesores


    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
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

    public TipoPiloto getTipoPiloto() {
        return tipoPiloto;
    }

    public void setTipoPiloto(TipoPiloto tipoPiloto) {
        this.tipoPiloto = tipoPiloto;
    }

    public TipoEscuderia getEscuderia() {
        return escuderia;
    }

    public void setEscuderia(TipoEscuderia escuderia) {
        this.escuderia = escuderia;
    }

    @Override
    public String toString() {
        return "Piloto: " +
                "dorsal = " + dorsal +
                ", nombre piloto = '" + nombrePiloto + '\'' +
                ", nacionalidad = '" + nacionalidad + '\'' +
                ", tipo piloto = " + tipoPiloto +
                ", escuderia = " + escuderia;
    }
}
