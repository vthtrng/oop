package visitor.demoprogram;

public class ConcreteVisitor implements Visitor {
    private double totalPrice;

    public ConcreteVisitor() {
        this.totalPrice = 0.0;
    }

    @Override
    public void visit(BusinessBook businessBook) {
        this.totalPrice += businessBook.price;
        System.out.println("Business Book");
        System.out.println("Publisher: " + businessBook.getPublisher());
    }

    @Override
    public void visit(DesignPatternBook designPatternBook) {
        this.totalPrice += designPatternBook.price;
        System.out.println("Design Pattern Book");
        System.out.println("Resource: " + designPatternBook.getResource());
        System.out.println("Bestseller: " + designPatternBook.getBestSeller());
    }

    @Override
    public void visit(JavaCoreBook javaCoreBook) {
        this.totalPrice += javaCoreBook.price;
        System.out.println("Java Core Book");
        System.out.println("Resource: " + javaCoreBook.getResource());
        System.out.println("Favorite Book: " + javaCoreBook.getFavoriteBook());
    }

    public double getTotalPrice() {
        return this.totalPrice;
    }
}
