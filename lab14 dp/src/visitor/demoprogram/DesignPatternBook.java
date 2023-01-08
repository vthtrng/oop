package visitor.demoprogram;

public class DesignPatternBook extends ProgramingBook {
    private String resource;
    public String bestSeller;

    public DesignPatternBook(double price, String resource, String bestSeller) {
        super(price);
        this.resource = resource;
        this.bestSeller = bestSeller;
    }

    public String getBestSeller(){
        return this.bestSeller;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getResource() {
        return this.resource;
    }
}
