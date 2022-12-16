package Cpu;

public class StatoDifensivo implements StatoCpu{
    private IStrategia strategia = new StrategiaDifensiva();
    @Override
    public IStrategia impostaStrategia() {
        System.out.println("Stato difensivo");
        return strategia;

    }
}
