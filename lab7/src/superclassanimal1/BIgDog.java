package superclassanimal1;

public class BIgDog extends Dog {
    public BIgDog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Wooow");
    }

    @Override
    public void greets(Dog another) {
        System.out.println("Woooooow");
    }

    public void greets(BIgDog another) {
        System.out.println("Wooooooooow");
    }
}
