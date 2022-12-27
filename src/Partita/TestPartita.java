package Partita;

import Cpu.Cpu;
import Giocatore.Giocatore;

public class TestPartita {
    public static void main(String[] args){
        Partita game = new Partita();
        Giocatore player = new Giocatore("Luigi", "M", "B");
        game.assegnaGiocatore(player);
        game.iniziaPartita();
    }
}
