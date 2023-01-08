import java.util.Scanner;

public class FibonacciRecursive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = in.nextInt();
        System.out.printf("Fibonacci (%1$d) = %2$d\n", num, fibonacci(num));
    }

    public static int fibonacci(int n){
        if (n <= 1){
            return n;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}
