package dio.patterns.strategy;

public class Robo {

    private IComportamento comportamento;


    public Robo() {
    }

    public void setComportamento(IComportamento comportamento) {
        this.comportamento = comportamento;
    }

    public void mover() {
        comportamento.mover();
    }


}
