package org.company.Model;

/**
 * Created by marco on 9/5/17.
 */
public enum TipoEscuderia {
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

    TipoEscuderia() {
        tipoEscuderia = "Sin escudería";
    }

    TipoEscuderia(String tipoEscuderia) {
        this.tipoEscuderia = tipoEscuderia;
    }

    // Accesores

    public String getTipoEscuderia() {
        return tipoEscuderia;
    }
}
