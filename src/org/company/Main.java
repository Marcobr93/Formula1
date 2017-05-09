package org.company;

import org.company.Model.Escuderia;
import org.company.Model.Piloto;
import org.company.Model.TipoEscuderia;
import org.company.Model.TipoPiloto;

public class Main {

    public static void main(String[] args) {

        Piloto piloto = new Piloto(44,"Lewis Hamilton","Británico", TipoPiloto.PrimerPiloto, TipoEscuderia.Mercedes);
        System.out.println(piloto);

        Escuderia escuderia = new Escuderia(1,TipoEscuderia.Mercedes);
        System.out.println(escuderia);

    }
}
