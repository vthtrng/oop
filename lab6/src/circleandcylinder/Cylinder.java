package circleandcylinder;

import circleandcylinder.Circle;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        super();
        this.height = 1.0;
    }

    public Cylinder(double height) {
        super();
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        return 2 * Math.PI * this.getRadius() * this.height
                + 2 * Math.PI * this.getRadius() * this.getRadius();
    }

    public double getVolume() {
        return super.getArea() * height;
    }

    @Override
    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("circleandcylinder.Cylinder[")
                .append(super.toString())
                .append("height=")
                .append(this.height)
                .append("]");
        return description.toString();
    }
}
