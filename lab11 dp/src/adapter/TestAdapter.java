package adapter;

public class TestAdapter {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5.);
        RoundPeg roundPeg = new RoundPeg(5.);
        System.out.println(hole.fits(roundPeg));

        SquarePeg squarePeg1 = new SquarePeg(5);
        SquarePeg squarePeg2 = new SquarePeg(10);
        RoundPeg adapter1 = new SquarePegAdapter(squarePeg1);
        System.out.println(hole.fits(adapter1));

        RoundPeg adapter2 = new SquarePegAdapter(squarePeg2);
        System.out.println(hole.fits(adapter2));
    }
}
