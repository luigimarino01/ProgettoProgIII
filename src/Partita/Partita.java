package Partita;

import Cpu.Cpu;
import Giocatore.Giocatore;
import Pedine.PedinaClient;
import Damiera.*;

import java.util.ArrayList;
import java.util.Random;

public class Partita {

    Damiera damiera;
    Giocatore player;
    Cpu cpu = new Cpu();
    Random randomNumber = new Random();
    ArrayList<PedinaClient> pedineNere = new ArrayList<PedinaClient>();
    ArrayList<PedinaClient> pedineRosse = new ArrayList<PedinaClient>();


    private void inizializzaPartita(){
        for (int i = 0; i<12; i++){
            pedineRosse.add(new PedinaClient());
            pedineNere.add(new PedinaClient());

            pedineRosse.get(i).setRossa(true);
            pedineRosse.get(i).setNera(false);


            pedineNere.get(i).setNera(true);
            pedineNere.get(i).setRossa(false);
        }
    }

    private void assegnaPedine(Giocatore giocatore) {
        int interoRandom = randomNumber.nextInt(11);
        if (interoRandom < 5) {
            giocatore.setPedineAssegnate(pedineNere);
            System.out.println("PEDINE NERE ASSEGNATE");

        } else {
            giocatore.setPedineAssegnate(pedineRosse);
            System.out.println("PEDINE ROSSE ASSEGNATE");


        }
    }

    public void assegnaGiocatore(Giocatore giocatore){
        this.player = giocatore;
    }

    public void iniziaPartita(){
        inizializzaPartita();
        assegnaPedine(player);
        System.out.println("PARTITA DI DAMA INIZIATA");
    }
}
