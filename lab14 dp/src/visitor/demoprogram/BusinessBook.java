package visitor.demoprogram;

public class BusinessBook extends Book {
    private String publisher;

    public BusinessBook(double price, String publisher) {
        super(price);
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
