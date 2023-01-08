import java.util.Scanner;

public class PrimeList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the upper bound: ");
        int num = in.nextInt();
        primeList(num);

    }

    public static void primeList(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                count += 1;
            }
        }
        double percent = (double) (count * 100.00 / num);
        System.out.println();
        System.out.println(count + " primes numbers found (" + percent + "%)");
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i <= (int) (Math.sqrt(num)); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
