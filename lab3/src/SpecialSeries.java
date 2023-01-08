import java.util.Scanner;

public class SpecialSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter x and terms: ");
        double x = in.nextDouble();
        int numTerms = in.nextInt();

        System.out.println(specialSeries(x, numTerms));
    }

    public static double specialSeries(double x, int numTerms) {
        double sum = x;
        for (int k = 1; k < numTerms; k++) {
            double uk = Math.pow(x, 2 * k + 1) / (double) (2 * k + 1);
            for (int i = 2 * k - 1; i > 0; i -= 2) {
                uk *= i / (double) (i + 1);
            }
            sum += uk;
        }
        return sum;
    }
}