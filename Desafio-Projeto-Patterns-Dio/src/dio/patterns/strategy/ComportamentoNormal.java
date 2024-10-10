package dio.patterns.strategy;

public class ComportamentoNormal implements IComportamento {

    @Override
    public void mover() {
        System.out.println("Monvendo-se Normalmente....");
    }

}
