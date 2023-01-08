import java.util.Scanner;

public class PerfectPrimeFactorList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the upper bound: ");
        int aPosInt = in.nextInt();
        perfectPrimeFactorList(aPosInt);
    }

    public static void perfectPrimeFactorList(int aPosInt){
        int count = 0;
        System.out.println("These numbers are equal to the product of prime factors: ");
        for (int i=6; i<=aPosInt; i++){
            if (isProductOfPrimeFactor(i)){
                System.out.print(i + " ");
                count += 1;
            }
        }
        double percent = (double) (count * 100.00 / aPosInt);
        System.out.println();
        System.out.println(count + " numbers found (" + percent + "%)");
    }

    public static boolean isProductOfPrimeFactor(int aPosInt){
        int product = 1;
        for (int i=2; i<= aPosInt/2; i++){
            if ((aPosInt % i == 0) && (isPrime(i))){
                product *= i;
            }
        }
        return product == aPosInt;
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
