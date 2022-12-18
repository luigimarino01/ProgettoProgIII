package Partita;

import Cpu.*;
import Giocatore.Giocatore;
import Pedine.PedinaClient;
import Damiera.*;

import java.util.ArrayList;
import java.util.Random;

public class Partita {

    Damiera damiera = Damiera.getInstanza();
    Giocatore player;
    Cpu cpu = Cpu.getIstanza();
    StatoCpu statoCpu;
    Random randomNumber = new Random();
    ArrayList<PedinaClient> pedineNere = new ArrayList<>();
    ArrayList<PedinaClient> pedineRosse = new ArrayList<>();




    private void inizializzaPartita(){
        for (int i = 0; i<12; i++){
            pedineRosse.add(new PedinaClient());
            pedineRosse.get(i).setRossa(true);
            pedineRosse.get(i).setNera(false);

        }

        for (int j = 0; j<12; j++){
            pedineNere.add(new PedinaClient());
            pedineNere.get(j).setNera(true);
            pedineNere.get(j).setRossa(false);
        }
    }

    private void assegnaPedine(Giocatore giocatore) {
        int interoRandom = randomNumber.nextInt(11);
        if (interoRandom < 5) {
            giocatore.setPedineAssegnate(pedineNere);
            giocatore.setSquadraNera(true);
            giocatore.setSquadraRossa(false);
            cpu.setSquadraRossa(true);
            cpu.setSquadraNera(false);

        } else {
            giocatore.setPedineAssegnate(pedineRosse);
            giocatore.setSquadraNera(false);
            giocatore.setSquadraRossa(true);
            cpu.setSquadraRossa(false);
            cpu.setSquadraNera(true);
        }
    }

    public void assegnaGiocatore(Giocatore giocatore){
        this.player = giocatore;
    }

    public void inizializzaCpu(Cpu cpu){
        int i = randomNumber.nextInt(11);
        if(i<6){
            statoCpu = new StatoDifensivo();
        }
        else {
            statoCpu = new StatoOffensivo();
        }
        cpu.setStato(statoCpu);
        cpu.setStrategia();
    }

    public void iniziaPartita(){
        inizializzaPartita();
        inizializzaCpu(cpu);
        assegnaPedine(player);
        System.out.println("PARTITA DI DAMA INIZIATA");
    }
}
