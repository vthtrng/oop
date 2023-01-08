package strategy;

public class ConcreteStrategySubtract implements Strategy {
    @Override
    public double excecute(double a, double b) {
        return a - b;
    }
}
