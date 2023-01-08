package factorymethod.demoprogram;

import factorymethod.demoprogram.Fruit;

public class Orange extends Fruit {
    @Override
    public void produceJuice() {
        System.out.println("Orange Juice");
    }
}
