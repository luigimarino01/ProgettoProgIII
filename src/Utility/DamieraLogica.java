package Utility;

import Model.Casella;
import Model.Damiera;
import Model.Pedina;

public class DamieraLogica{
    public Damiera damiera = new Damiera();
    Casella [][] tavolaDaGioco = damiera.getTavolaDaGioco();

    public Pedina pedina;

    public void creaTavolaDaGioco(){
        for (int i = 0; i<8;i++){
            for (int j = 0; j<8; j++){
                tavolaDaGioco[i][j] = new Casella();
            }
        }
    }


}
