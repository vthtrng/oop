package abstractfactory.demoprogram;

import abstractfactory.demoprogram.Shape;

public class RoundedSquare extends Shape {
    @Override
    public void draw() {
        System.out.println("Draw Rounded Square");
    }
}
