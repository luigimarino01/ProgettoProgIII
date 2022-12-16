package Damiera;

import Damiera.Damiera;
import Pedine.*;

public class Casella extends Damiera {
    PedinaClient pedinaSopra;

    public void setPedinaSopra(PedinaClient pedina){
        this.pedinaSopra = pedina;
    }

    public PedinaClient getPedinaSopra(){
        return pedinaSopra;
    }
}
