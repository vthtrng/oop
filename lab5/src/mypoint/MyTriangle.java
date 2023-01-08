package mypoint;

public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.v1 = new MyPoint(x1, y1);
        this.v2 = new MyPoint(x2, y2);
        this.v3 = new MyPoint(x3, y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("MyTriangle[")
                .append(this.v1.toString())
                .append(",")
                .append(this.v2.toString())
                .append(",")
                .append(this.v3.toString())
                .append("]");
        return description.toString();
    }

    public double getPerimeter() {
        return v1.distance(v2) + v1.distance(v3) + v2.distance(v3);
    }

    public String getType() {
        double d1 = v1.distance(v2);
        double d2 = v1.distance(v3);
        double d3 = v2.distance(v3);

        if (d1 == d2 && d2 == d3) {
            return "Equilateral";
        } else if (d1 == d2 || d1 == d3 || d2 == d3) {
            return "Isosceles";
        }
        return "Scalene";
    }
}
