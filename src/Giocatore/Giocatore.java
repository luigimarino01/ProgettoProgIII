package Giocatore;

import Pedine.PedinaClient;

import java.util.ArrayList;

public class Giocatore {
    private GiocatoreBean giocatore = new GiocatoreBean();
    private ArrayList<PedinaClient> pedineAssegnate = new ArrayList<PedinaClient>();



    public Giocatore(String nome, String cognome, String nickname){
        giocatore.setNome(nome);
        giocatore.setCognome(cognome);
        giocatore.setNickname(nickname);
        giocatore.setNumeroVittorie(0);
        //aggiungere creazione al db
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
}
