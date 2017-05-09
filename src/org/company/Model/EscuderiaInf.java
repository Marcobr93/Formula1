package org.company.Model;

/**
 * Created by marco on 9/5/17.
 */
public class EscuderiaInf {
    private String nombreEscuderia;
    private char posicion;

    // Constructores

    public EscuderiaInf() {
    }

    public EscuderiaInf(String nombreEscuderia, char posicion) {
        this.nombreEscuderia = nombreEscuderia;
        this.posicion = posicion;
    }

    // Accesores

    public String getNombreEscuderia() {
        return nombreEscuderia;
    }

    public void setNombreEscuderia(String nombreEscuderia) {
        this.nombreEscuderia = nombreEscuderia;
    }

    public char getPosicion() {
        return posicion;
    }

    public void setPosicion(char posicion) {
        this.posicion = posicion;
    }
}

