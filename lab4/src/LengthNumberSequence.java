import java.util.Scanner;

public class LengthNumberSequence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = in.nextInt();
        System.out.println("Length of running number sequence: " + length(num));
    }

    public static int numOfDigits(int n) {
        return (int) (Math.log10(n) + 1);
    }

    public static int length(int n) {
        if (n == 1) {
            return 1;
        } else {
            return length(n - 1) + numOfDigits(n);
        }
    }
}
