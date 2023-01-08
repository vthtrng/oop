package abstractfactory.demoprogram;

public class FactoryProducer {
    public AbstractFactory getFactory(String type) {
        if (type.equals("RoundedShape")) {
            return new RoundedShapeFactory();
        } else {
            return new ShapeFactory();
        }
    }
}
