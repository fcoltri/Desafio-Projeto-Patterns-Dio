package dio.patterns.strategy;

public class ComportamentoDefensivo implements IComportamento {

    @Override
    public void mover() {
        System.out.println("Mover-se Defensivamente....");
    }

}
