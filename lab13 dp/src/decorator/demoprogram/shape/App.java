package decorator.demoprogram.shape;

public class App {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();
        System.out.println();
        RedShapeDecorator redShapeDecorator = new RedShapeDecorator(circle);
        redShapeDecorator.draw();
    }
}
