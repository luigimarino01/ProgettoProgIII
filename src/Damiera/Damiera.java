package Damiera;

public class Damiera {
    static Casella[][] tavolaDaGioco;
    public Casella[][] getTavolaDaGioco() {
        return tavolaDaGioco;
    }

    public Damiera(){
        tavolaDaGioco = new Casella[8][8];
    }



}
