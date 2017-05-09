package org.company.Model;

/**
 * Created by marco on 9/5/17.
 */
public enum Escuderia {
    Mercedes,
    RedBull,
    Ferrari,
    ForceIndia,
    Williams,
    McLaren,
    ToroRosso,
    Haas,
    Renault,
    Sauber;

    private final String tipoEscuderia;

    // Constructores

    Escuderia() {
        tipoEscuderia = "Sin escudería";
    }

    Escuderia(String tipoEscuderia) {
        this.tipoEscuderia = tipoEscuderia;
    }

    // Accesores

    public String getTipoEscuderia() {
        return tipoEscuderia;
    }
}
