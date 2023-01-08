import java.util.Scanner;

public class PerfectNumberList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the upper bound: ");
        int aPosInt = in.nextInt();
        perfectNum(aPosInt);
        notPerfectDeficient(aPosInt);
    }


    public static void perfectNum(int aPosInt) {
        int count = 0;
        System.out.println("These numbers are perfect: ");
        for (int i = 1; i <= aPosInt; i++) {
            if (isPerfect(i)) {
                System.out.print(i + " ");
                count += 1;
            }
        }
        double percent = (double)(count*100.00/aPosInt);
        System.out.println();
        System.out.println(count + " numbers found ("+ percent + "%)");
    }

    public static void notPerfectDeficient(int aPosInt) {
        int count = 0;
        System.out.println("These numbers are neither deficient nor perfect: ");
        for (int i = 1; i <= aPosInt; i++) {
            if ((!isPerfect(i)) && (!isDeficient(i))) {
                System.out.print(i + " ");
                count += 1;
            }
        }
        double percent = (double)(count*100.00/aPosInt);
        System.out.println();
        System.out.println(count + " perfect numbers found ("+ percent + "%)");
    }

    public static boolean isPerfect(int aPosInt) {
        int sum = 0;
        for (int i = 1; i <= aPosInt / 2; i++) {
            if (aPosInt % i == 0) {
                sum += i;
            }
        }
        return sum == aPosInt;
    }

    public static boolean isDeficient(int aPosInt) {
        int sum = 0;
        for (int i = 1; i <= aPosInt / 2; i++) {
            if (aPosInt % i == 0) {
                sum += i;
            }
        }
        return sum < aPosInt;
    }
}
