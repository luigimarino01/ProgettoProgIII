package Pedine;

public class PedinaClient {
    private PedinaInterfaccia pedina = PedinaFactory.getPedina();
    private int xCorrente = 0;
    private int yCorrente = 0;
    private boolean Rossa;
    private boolean Nera;

    public boolean isRossa() {
        return Rossa;
    }

    public void setRossa(boolean rossa) {
        this.Rossa = rossa;
    }

    public boolean isNera() {
        return Nera;
    }

    public void setNera(boolean nera) {
        this.Nera = nera;
    }

    public PedinaClient(){
        //aggiungere al DB la pedina;
    }
    public void muoviPedina(int nuovaX, int nuovaY){
        pedina.muoviPedina(xCorrente,yCorrente,nuovaX,nuovaY);

        this.xCorrente = nuovaX;
        this.yCorrente = nuovaY;
    }

    public int getxCorrente() {
        return xCorrente;
    }

    public int getyCorrente() {
        return yCorrente;
    }
}
