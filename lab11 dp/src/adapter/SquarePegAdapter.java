package adapter;

public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg squarePeg) {
        super(squarePeg.getWidth());
        this.peg = squarePeg;
    }

    @Override
    public double getRadius() {
        return this.peg.getWidth() * Math.sqrt(2) / 2;
    }
}
