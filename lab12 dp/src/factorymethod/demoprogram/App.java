package factorymethod.demoprogram;

public class App {
    public static void main(String[] args) {
        FruitFactory fruitFactory = new FruitFactory();

        Fruit apple = fruitFactory.provideFruit("Apple");
        apple.produceJuice();

        Fruit banana = fruitFactory.provideFruit("Banana");
        banana.produceJuice();

        Fruit orange = fruitFactory.provideFruit("Orange");
        orange.produceJuice();
    }
}
