package decorator.demoprogram.shape;

public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape shape) {
        super(shape);
        this.shape = shape;
    }

    private void setRedBorder() {
        System.out.println("Set red border");
    }

    @Override
    public void draw() {
        super.draw();
        setRedBorder();
    }
}
