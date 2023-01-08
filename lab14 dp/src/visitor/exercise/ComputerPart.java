package visitor.exercise;

import visitor.demoprogram.Visitor;

public interface ComputerPart {
    void accept(ComputerPartVisitor visitor);
}
