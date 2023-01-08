package geometricobject;

public class TestGeometricObject {
    public static void main(String[] args) {
        GeometricObject g1 = new Circle(5.5);
        System.out.println(g1);
        System.out.println("Area = " + g1.getArea());
        System.out.println("Perimeter = " + g1.getPerimeter());

        GeometricObject g2 = new Rectangle(2, 3);
        System.out.println(g2);
        System.out.println("Area = " + g2.getArea());
        System.out.println("Perimeter = " + g2.getPerimeter());
    }
}
