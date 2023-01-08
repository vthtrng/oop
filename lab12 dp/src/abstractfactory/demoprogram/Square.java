package abstractfactory.demoprogram;

import abstractfactory.demoprogram.Shape;

public class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Draw Square");
    }
}
