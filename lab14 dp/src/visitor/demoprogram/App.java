package visitor.demoprogram;

public class App {
    public static void main(String[] args) {
        Book book1 = new BusinessBook(20,"ABC");
        Book book2 = new DesignPatternBook(40, "idk", "Head First Design Patterns");
        Book book3 = new JavaCoreBook(90, "swh", "Head First Java");

        Visitor visitor = new ConcreteVisitor();

        book1.accept(visitor);
        System.out.println();

        book2.accept(visitor);
        System.out.println();

        book3.accept(visitor);
        System.out.println();

        System.out.println("Total price: " + visitor.getTotalPrice());

    }
}
