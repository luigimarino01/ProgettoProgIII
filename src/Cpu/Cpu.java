package Cpu;

public class Cpu {
    private IStrategia strategia;
    private StatoCpu stato;
    private static Cpu istanza;
    private boolean squadraRossa;

    public boolean isSquadraRossa() {
        return squadraRossa;
    }

    public void setSquadraRossa(boolean squadraRossa) {
        this.squadraRossa = squadraRossa;
    }

    public boolean isSquadraNera() {
        return squadraNera;
    }

    public void setSquadraNera(boolean squadraNera) {
        this.squadraNera = squadraNera;
    }

    private boolean squadraNera;

    private Cpu(){

    }
    public static Cpu getIstanza(){
        if (istanza==null){
            istanza = new Cpu();
        }
            return istanza;
    }

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
