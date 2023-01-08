package abstractfactory.demoprogram;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shape) {
        if (shape.equals("Rectangle")) {
            return new Rectangle();
        } else if (shape.equals("Square")) {
            return new Square();
        } else {
            return null;
        }
    }
}
