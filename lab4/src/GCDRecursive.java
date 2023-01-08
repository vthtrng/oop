import java.util.Scanner;

public class GCDRecursive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.printf("GCD of %1$d and %2$d is %3$d\n", a, b, gcd(a, b));

    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

}
