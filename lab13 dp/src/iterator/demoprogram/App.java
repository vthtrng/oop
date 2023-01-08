package iterator.demoprogram;

public class App {
    public static void main(String[] args) {
        ProductCatalog productCatalog = new ProductCatalog();
        productCatalog.add("Apple")
                .add("Banana")
                .add("Orange")
                .add("Melon")
                .add("Mango");

        Iterator it = productCatalog.getIterator();
        while (it.hasNext()) {
            System.out.println((String)it.next());
        }
    }
}
