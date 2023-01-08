package singleton;

public class TestSingleton {
    public static void main(String[] args) {
        Database dt1 = Database.getInstance();
        System.out.println(dt1);
    }
}
