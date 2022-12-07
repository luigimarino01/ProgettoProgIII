package Utility;

import Model.Casella;
import Model.Damiera;
import Model.Pedina;

public class PedinaLogica extends DamieraLogica{


    Casella[][] tavolaDaGioco = damiera.getTavolaDaGioco();
    public Pedina pedina;


    public void creaPedineRosse(){
        for (int i = 0; i<4; i++){
            pedina = new Pedina(true,7,i*2);
            tavolaDaGioco[pedina.getX()][pedina.getY()].setPedinaSopra(pedina);
            pedina = new Pedina(true,6,i*2+1);
            tavolaDaGioco[pedina.getX()][pedina.getY()].setPedinaSopra(pedina);
            pedina = new Pedina(true,5,i*2);
            tavolaDaGioco[pedina.getX()][pedina.getY()].setPedinaSopra(pedina);
            pedina = new Pedina(0,i*2+1,true);
            tavolaDaGioco[pedina.getX()][pedina.getY()].setPedinaSopra(pedina);
            pedina = new Pedina(1,i*2,true);
            tavolaDaGioco[pedina.getX()][pedina.getY()].setPedinaSopra(pedina);
            pedina = new Pedina(2,i*2+1,true);
            tavolaDaGioco[pedina.getX()][pedina.getY()].setPedinaSopra(pedina);
        }

    }


    public void creaPedineNere(){
        for (int i = 0; i<4; i++){
            pedina = new Pedina(true,0,i*2);
            tavolaDaGioco[pedina.getX()][pedina.getY()].setPedinaSopra(pedina);
            pedina = new Pedina(true,1,i*2+1);
            tavolaDaGioco[pedina.getX()][pedina.getY()].setPedinaSopra(pedina);
            pedina = new Pedina(true,2,i*2);
            tavolaDaGioco[pedina.getX()][pedina.getY()].setPedinaSopra(pedina);

            pedina = new Pedina(7,i*2+1,true);
            tavolaDaGioco[pedina.getX()][pedina.getY()].setPedinaSopra(pedina);
            pedina = new Pedina(6,i*2,true);
            tavolaDaGioco[pedina.getX()][pedina.getY()].setPedinaSopra(pedina);
            pedina = new Pedina(5,i*2,true);
            tavolaDaGioco[pedina.getX()][pedina.getY()].setPedinaSopra(pedina);
        }

    }
}
