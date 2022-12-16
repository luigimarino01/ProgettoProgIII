package Pedine;

public class TestPedine {
    public static void main(String [] args){
        PedinaClient a = new PedinaClient();
        PedinaClient b = new PedinaClient();
        PedinaClient c = new PedinaClient();

        a.muoviPedina(10,20);
        b.muoviPedina(30,50);
        c.muoviPedina(120,200);

        System.out.println("a : " + a.getxCorrente() + ", " + a.getyCorrente());
        System.out.println("b : " + b.getxCorrente() + ", " + b.getyCorrente());
        System.out.println("c : " + c.getxCorrente() + ", " + c.getyCorrente());
    }
}
