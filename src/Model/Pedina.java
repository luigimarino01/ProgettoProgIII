package Model;

import Model.Damiera;

public class Pedina extends Damiera{
     private int x;
     private int y;
     private boolean eRossa;
     private boolean eNera;




    private boolean eMangiata;
     private boolean eDama;

    public boolean iseNera() {
        return eNera;
    }

    public void seteNera(boolean eNera) {
        this.eNera = eNera;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean iseRossa() {
        return eRossa;
    }

    public void seteRossa(boolean eRossa) {
        this.eRossa = eRossa;
    }

    public boolean iseMangiata() {
        return eMangiata;
    }

    public void seteMangiata(boolean eMangiata) {
        this.eMangiata = eMangiata;
    }

    public boolean iseDama() {
        return eDama;
    }

    public void seteDama(boolean eDama) {
        this.eDama = eDama;
    }

    public boolean isBordoLaterale() {
        return bordoLaterale;
    }

    public void setBordoLaterale(boolean bordoLaterale) {
        this.bordoLaterale = bordoLaterale;
    }

    private boolean bordoLaterale;

    public String toString(){
        if (eNera)
            return "nero";
        else
            return "rosso";
    }

     public Pedina(){}

     public Pedina(boolean rossa,int xiniziale,int yiniziale){
         this.x = xiniziale;
         this.y = yiniziale;
         this.eRossa = rossa;
         this.eMangiata = false;
         this.eDama = false;
     }

    public Pedina(int xiniziale, int yiniziale, boolean nero){
        this.x = xiniziale;
        this.y = yiniziale;
        this.eNera = nero;
        this.eMangiata = false;
        this.eDama = false;
    }

}
