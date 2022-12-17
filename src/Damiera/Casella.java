package Damiera;
import Pedine.*;

public class Casella extends Damiera {
    private PedinaClient pedinaSopra;

    public void setPedinaSopra(PedinaClient pedina){
        this.pedinaSopra = pedina;
    }

    public PedinaClient getPedinaSopra(){
        return pedinaSopra;
    }
}
