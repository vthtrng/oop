package strategy;

public class ConcreteStrategyMultiply implements Strategy {
    @Override
    public double excecute(double a, double b) {
        return a * b;
    }
}
