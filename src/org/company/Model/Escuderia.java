package org.company.Model;

/**
 * Created by marco on 9/5/17.
 */
public class Escuderia {
    private int posicion;
    private TipoEscuderia tipoEscuderia;

    // Constructores

    public Escuderia() {
    }

    public Escuderia(int posicion, TipoEscuderia tipoEscuderia) {
        this.posicion = posicion;
        this.tipoEscuderia = tipoEscuderia;
    }

    // Accesores


    public TipoEscuderia getTipoEscuderia() {
        return tipoEscuderia;
    }

    public void setTipoEscuderia(TipoEscuderia tipoEscuderia) {
        this.tipoEscuderia = tipoEscuderia;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(char posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "Escuderia: " +
                "tipoEscuderia = " + tipoEscuderia +
                "," + " posicion = " + posicion;
    }
}

