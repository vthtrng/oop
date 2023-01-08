package observer.demoprogram;

public class App {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        BinaryObserver binaryObserver = new BinaryObserver(subject);

        System.out.println("Decimal: 1234");
        subject.setState(1234);
        System.out.println();
        subject.remove(binaryObserver);
        System.out.println("Decimal: 129");
        subject.setState(129);

    }
}
