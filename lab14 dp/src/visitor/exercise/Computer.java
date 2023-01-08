package visitor.exercise;

public class Computer implements ComputerPart {
    private ComputerPart[] computerParts;

    public Computer(ComputerPart[] computerParts){
        this.computerParts = computerParts;
    }

    @Override
    public void accept(ComputerPartVisitor visitor) {
        for (ComputerPart computerPart : computerParts){
            computerPart.accept(visitor);
        }
        visitor.visit(this);
    }
}
