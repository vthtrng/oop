package visitor.demoprogram;

public class JavaCoreBook extends ProgramingBook {
    private String resource;
    private String favoriteBook;

    public JavaCoreBook(double price, String resource, String favoriteBook) {
        super(price);
        this.resource = resource;
        this.favoriteBook = favoriteBook;
    }

    public String getResource() {
        return this.resource;
    }

    public String getFavoriteBook() {
        return this.favoriteBook;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
