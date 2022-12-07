package Model;

public class Casella extends Damiera{
    Pedina pedinaSopra;

    public void setPedinaSopra(Pedina pedina){
        this.pedinaSopra = pedina;
    }

    public Pedina getPedinaSopra(){
        return pedinaSopra;
    }
}
