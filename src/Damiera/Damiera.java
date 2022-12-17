package Damiera;

public class Damiera {
    private static Damiera istanza;
    static Casella[][] tavolaDaGioco;
    public Casella[][] getTavolaDaGioco() {
        return tavolaDaGioco;
    }

    public static Damiera getInstanza(){
        if (istanza == null){
            istanza = new Damiera();
        }
        return istanza;
    }

    private Damiera(){
        tavolaDaGioco = new Casella[8][8];
    }



}
