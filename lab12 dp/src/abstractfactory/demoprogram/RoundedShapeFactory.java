package abstractfactory.demoprogram;

public class RoundedShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shape) {
        if (shape.equals("Rectangle")) {
            return new RoundedRectangle();
        } else if (shape.equals("Square")) {
            return new RoundedSquare();
        } else {
            return null;
        }
    }
}
