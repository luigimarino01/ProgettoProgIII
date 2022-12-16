package Cpu;

public class TestStrategia {
    public static void main(String[] args){
        Cpu cpu = new Cpu();
        StatoCpu statoAggressivo = new StatoAggressivo();
        StatoCpu statoDifensivo = new StatoDifensivo();

        cpu.setStato(statoAggressivo);
        cpu.setStrategia();

        cpu.setStato(statoDifensivo);
        cpu.setStrategia();

    }
}
