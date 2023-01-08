package decorator.demoprogram.icecream;

public class App {
    public static void main(String[] args) {
        IceCream chocolateIceCreamWithNuts = new NutsToppingDecorator(new ChocolateIceCream());
        System.out.println(chocolateIceCreamWithNuts.getDescription());

        IceCream strawberryIceCreamWithHoneyAndNuts =
                new NutsToppingDecorator(new HoneyToppingDecorator(new StrawberryIceCream()));
        System.out.println(strawberryIceCreamWithHoneyAndNuts.getDescription());
    }
}
