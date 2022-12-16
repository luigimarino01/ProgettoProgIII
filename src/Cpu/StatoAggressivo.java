package Cpu;

public class StatoAggressivo implements StatoCpu{
    private IStrategia strategia = new StrategiaOffensiva();
    @Override
    public IStrategia impostaStrategia() {
        System.out.println("Stato aggressivo");
        return strategia;
    }
}
