package pointandline;

public class Line {
    private Point begin;    // beginning point
    private Point end;      // ending point

    public Line(Point begin, Point end) {  // caller to construct the Points
        this.begin = begin;
        this.end = end;
    }

    public Line(int beginX, int beginY, int endX, int endY) {
        begin = new Point(beginX, beginY);
        end = new Point(endX, endY);
    }

    public Point getBegin() {
        return begin;
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public int getBeginX() {
        return begin.getX();
    }

    public int getBeginY() {
        return begin.getY();
    }

    public int getEndX() {
        return end.getX();
    }

    public int getEndY() {
        return end.getY();
    }

    public void setBeginX(int x) {
        this.begin.setX(x);
    }

    public void setBeginY(int y) {
        this.begin.setY(y);
    }

    public void setBeginXY(int x, int y) {
        this.begin.setXY(x, y);
    }

    public void setEndX(int x) {
        this.end.setX(x);
    }

    public void setEndY(int y) {
        this.end.setY(y);
    }

    public void setEndXY(int x, int y) {
        this.end.setXY(x, y);
    }

    public int getLength() {
        return (int) Math.sqrt((begin.getX() - end.getX()) * (begin.getX() - end.getX())
                + (begin.getY() - end.getY()) * (begin.getY() - end.getY()));
    }

    public double getGradient() {
        return Math.atan2((begin.getY() - end.getY()), (begin.getX() - end.getX()));
    }

    @Override
    public String toString() {
        return "Line: begin(" + getBeginX() + "," + getBeginY() + "), end("
                + getEndX() + "," + getEndY() + ")";
    }
}
