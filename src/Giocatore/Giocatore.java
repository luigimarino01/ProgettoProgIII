package Giocatore;

import Database.DamaDB;
import Pedine.PedinaClient;

import java.util.ArrayList;

public class Giocatore {
    DamaDB damaDB = DamaDB.getIstanza();
    private GiocatoreBean giocatore = new GiocatoreBean();
    private ArrayList<PedinaClient> pedineAssegnate = new ArrayList<PedinaClient>();



    public Giocatore(String nome, String cognome, String nickname){
        giocatore.setNome(nome);
        giocatore.setCognome(cognome);
        giocatore.setNickname(nickname);
        giocatore.setNumeroVittorie(0);
        damaDB.aggiungiGiocatoreDB(this);
    }

    public ArrayList<PedinaClient> getPedineAssegnate() {
        return pedineAssegnate;
    }

    public void setPedineAssegnate(ArrayList<PedinaClient> pedineAssegnate) {
        this.pedineAssegnate = pedineAssegnate;
    }

    public GiocatoreBean getGiocatore() {
        return giocatore;
    }

    public void aggiungiVittoria(){
        giocatore.setNumeroVittorie(giocatore.getNumeroVittorie()+1);
        damaDB.aggiungiVittoriaDB(this);
    }
}
