package org.company.Model;

/**
 * Created by marco on 9/5/17.
 */
public enum Piloto {
    PrimerPiloto,
    SegundoPiloto,
    PilotoProbador;

    private final String tipoPiloto;

    // Constructores

    Piloto() {
        tipoPiloto = "Sin tipo de piloto";
    }

    Piloto(String tipoPiloto) {
        this.tipoPiloto = tipoPiloto;
    }

    // Accesores

    public String getTipoPiloto() {
        return tipoPiloto;
    }
}
