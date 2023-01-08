import java.util.Scanner;

public class FactorialRecusive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = in.nextInt();
        System.out.println("Factorial of " + num + " = " + factorial(num));
    }

    public static int factorial(int n){
        if (n == 0){
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }
}
