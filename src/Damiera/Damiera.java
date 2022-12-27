package Damiera;

public class Damiera {
    private static Damiera istanza;
    public Casella[][] tavolaDaGioco;
    public Casella[][] getTavolaDaGioco() {
        return tavolaDaGioco;
    }

    public static Damiera getInstanza(){
        if (istanza == null){
            istanza = new Damiera();
        }
        return istanza;
    }

    public void setupDamiera(){
        for (int i = 0; i<8; i++){
            for (int j = 0; j<8; j++){
                tavolaDaGioco[i][j] = new Casella();
            }
        }
    }

    private Damiera(){
        tavolaDaGioco = new Casella[8][8];
    }



}
