package Cpu;

public class Cpu {
    private IStrategia strategia;
    private StatoCpu stato;


    public void setStato(StatoCpu stato){
        this.stato = stato;
    }

    public StatoCpu getStato(){
        return stato;
    }

    public void setStrategia(){
        strategia = stato.impostaStrategia();
    }

    public IStrategia getStrategia(){
        return strategia;
    }

    public void muoviPedina(){
        strategia.muoviPedina();
    }

}
