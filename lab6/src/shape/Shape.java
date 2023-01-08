package shape;

public class Shape {
    private String color;
    private boolean filled;

    public Shape(){
        this.color = "red";
        this.filled = true;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("Shape[color=")
                .append(this.color)
                .append(",filled=")
                .append(this.filled)
                .append("]");
        return description.toString();
    }
}
