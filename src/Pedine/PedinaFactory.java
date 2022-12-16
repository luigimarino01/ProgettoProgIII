package Pedine;

public class PedinaFactory {
    private static PedinaInterfaccia pedina;

    public static PedinaInterfaccia getPedina(){
        if (pedina==null){
            pedina = new PedinaImplementazione();
        }
        return pedina;
    }
}
