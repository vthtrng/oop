import java.util.Scanner;

public class Exponent {
    public static void main(String[] args) {
        // Declare variables
        int exp; // exponent (non-negative integer)
        int base; // base (integer)

        // Prompt and read exponent and base
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base: ");
        base = sc.nextInt();
        System.out.print("Enter the exponent: ");
        exp = sc.nextInt();

        // Print result
        System.out.println(base + " raises to the power of " + exp + " is " + exponent(base, exp));
    }

    public static int exponent(int base, int exp) {
        int product = 1; // resulting product
        // Multiply product and base for exp number of time
        for (int i = 1; i <= exp; i++) {
            product *= base;
        }
        return product;
    }
}
