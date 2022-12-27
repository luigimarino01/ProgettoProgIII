package Partita;

import Cpu.*;
import Database.DamaDB;
import Giocatore.Giocatore;
import Pedine.PedinaClient;
import Damiera.*;

import java.util.ArrayList;
import java.util.Random;

public class Partita {

    Damiera damiera = Damiera.getInstanza();
    DamaDB damaDB = DamaDB.getIstanza();

    Giocatore player;
    Cpu cpu = Cpu.getIstanza();
    StatoCpu statoCpu;
    Random randomNumber = new Random();
    ArrayList<PedinaClient> pedineNere = new ArrayList<>();
    ArrayList<PedinaClient> pedineRosse = new ArrayList<>();




    private void inizializzaPartita(){
        damiera.setupDamiera();
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

    private void posizionaPedine(){

        if (this.player.isSquadraRossa()){
            for (int i = 0; i<4; i++){
                damiera.tavolaDaGioco[0][i*2+1].setPedinaSopra(pedineNere.get(i));
                pedineNere.get(i).setxCorrente(0);
                pedineNere.get(i).setyCorrente(i*2+1);



                damiera.tavolaDaGioco[1][i*2].setPedinaSopra(pedineNere.get(4+i));
                pedineNere.get(4+i).setxCorrente(1);
                pedineNere.get(4+i).setyCorrente(i*2);

                damiera.tavolaDaGioco[2][i*2+1].setPedinaSopra(pedineNere.get(8+i));
                pedineNere.get(8+i).setxCorrente(2);
                pedineNere.get(8+i).setyCorrente(i*2+1);
            }

            for (int i = 0; i<4; i++){
                damiera.tavolaDaGioco[7][i*2].setPedinaSopra(pedineRosse.get(i));
                pedineRosse.get(i).setxCorrente(7);
                pedineRosse.get(i).setyCorrente(i*2);

                damiera.tavolaDaGioco[6][i*2+1].setPedinaSopra(pedineRosse.get(4+i));
                pedineRosse.get(4+i).setxCorrente(6);
                pedineRosse.get(4+i).setyCorrente(i*2+1);


                damiera.tavolaDaGioco[5][i*2].setPedinaSopra(pedineRosse.get(8+i));
                pedineRosse.get(8+i).setxCorrente(5);
                pedineRosse.get(8+i).setyCorrente(i*2);
            }
        }

        else if (this.player.isSquadraNera())

        {
            for (int i = 0; i<4; i++){
                damiera.tavolaDaGioco[0][i*2+1].setPedinaSopra(pedineRosse.get(i));
                pedineRosse.get(i).setxCorrente(0);
                pedineRosse.get(i).setyCorrente(i*2+1);

                damiera.tavolaDaGioco[1][i*2].setPedinaSopra(pedineRosse.get(4+i));
                pedineRosse.get(4+i).setxCorrente(1);
                pedineRosse.get(4+i).setyCorrente(i*2);

                damiera.tavolaDaGioco[2][i*2+1].setPedinaSopra(pedineRosse.get(8+i));
                pedineRosse.get(8+i).setxCorrente(2);
                pedineRosse.get(8+i).setyCorrente(i*2+1);
            }

            for (int i = 0; i<4; i++){
                damiera.tavolaDaGioco[7][i*2].setPedinaSopra(pedineNere.get(i));
                pedineNere.get(i).setxCorrente(7);
                pedineNere.get(i).setyCorrente(i*2);

                damiera.tavolaDaGioco[6][i*2+1].setPedinaSopra(pedineNere.get(4+i));
                pedineNere.get(4+i).setxCorrente(6);
                pedineNere.get(4+i).setyCorrente(i*2+1);


                damiera.tavolaDaGioco[5][i*2].setPedinaSopra(pedineNere.get(8+i));
                pedineNere.get(8+i).setxCorrente(5);
                pedineNere.get(8+i).setyCorrente(i*2);
            }
        }
        damaDB.inizializzaPrimePedineDB(pedineRosse);
        damaDB.inizializzaSecondePedineDB(pedineNere);
    }

    public void iniziaPartita(){
        inizializzaPartita();
        inizializzaCpu(cpu);
        assegnaPedine(player);
        posizionaPedine();
        System.out.println("PARTITA DI DAMA INIZIATA");

        for (int i = 0; i<8; i++){
            for (int j = 0; j<8 ; j++){
                if (damiera.tavolaDaGioco[i][j].getPedinaSopra() != null && damiera.tavolaDaGioco[i][j].getPedinaSopra().isRossa()){
                    System.out.printf("R");
                }
                else if (damiera.tavolaDaGioco[i][j].getPedinaSopra() != null && damiera.tavolaDaGioco[i][j].getPedinaSopra().isNera()){
                    System.out.printf("N");
                }
                else{
                    System.out.printf("V");
                }
            }
            System.out.printf("\n");
        }
    }
}
