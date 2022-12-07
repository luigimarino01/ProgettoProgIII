package Model;

import View.DamieraGrafica;

public class Damiera {

    static Casella[][] tavolaDaGioco = new Casella[8][8];

    public Casella[][] getTavolaDaGioco() {
        return tavolaDaGioco;
    }

    public void setTavolaDaGioco(Casella[][] tavolaDaGioco) {
        this.tavolaDaGioco = tavolaDaGioco;
    }
}
