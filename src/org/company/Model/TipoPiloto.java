package org.company.Model;

/**
 * Created by marco on 9/5/17.
 */
public enum TipoPiloto {
    PrimerPiloto,
    SegundoPiloto,
    PilotoProbador;

    private final String tipoPiloto;

    // Constructores

    TipoPiloto() {
        tipoPiloto = "Sin tipo de piloto";
    }

    TipoPiloto(String tipoPiloto) {
        this.tipoPiloto = tipoPiloto;
    }

    // Accesores

    public String getTipoPiloto() {
        return tipoPiloto;
    }
}
