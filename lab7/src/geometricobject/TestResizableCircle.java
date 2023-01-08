package geometricobject;

public class TestResizableCircle {
    public static void main(String[] args) {
        Resizable g1 = new ResizableCircle(5.5);
        System.out.println(g1);
        g1.resize(50);
        System.out.println(g1);
    }
}