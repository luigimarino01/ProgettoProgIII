package Pedine;

import Database.DamaDB;

public class PedinaClient {
    private PedinaInterfaccia pedina = PedinaFactory.getPedina();

    private DamaDB damaDB = DamaDB.getIstanza();
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
        damaDB.aggiungiPedinaDB(this);
    }
    public void muoviPedina(int nuovaX, int nuovaY){
        pedina.muoviPedina(xCorrente,yCorrente,nuovaX,nuovaY);
        damaDB.spostamentoPedinaDB(this,nuovaX,nuovaY);
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
