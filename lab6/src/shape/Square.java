package shape;

public class Square extends Rectangle {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }
    public void setSide(double side) {
        this.setWidth(side);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }

    @Override
    public void setLength(double size) {
        super.setLength(size);
    }

    @Override
    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("[Square[")
                .append(super.toString())
                .append("]");
        return description.toString();
    }
}
