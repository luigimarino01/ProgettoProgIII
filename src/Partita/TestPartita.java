package Partita;

import Giocatore.Giocatore;

import java.util.regex.Pattern;

public class TestPartita {
    public static void main(String[] args){
        Giocatore giocatore = new Giocatore("Luigi", "Marino", "Buongustaio");
        Partita game = new Partita();
        game.assegnaGiocatore(giocatore);
        game.iniziaPartita();




    }
}
