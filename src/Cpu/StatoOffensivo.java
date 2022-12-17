package Cpu;

public class StatoOffensivo implements StatoCpu{
    private IStrategia strategia = new StrategiaOffensiva();
    @Override
    public IStrategia impostaStrategia() {
        return strategia;
    }
}
