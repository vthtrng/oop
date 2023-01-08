package visitor.demoprogram;

public interface Visitor {
    void visit(BusinessBook businessBook);
    void visit(DesignPatternBook designPatternBook);
    void visit(JavaCoreBook javaCoreBook);
    double getTotalPrice();
}
