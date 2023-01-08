package strategy;

public class ConcreteStrategyAdd implements Strategy {
    @Override
    public double excecute(double a, double b) {
        return a + b;
    }
}
