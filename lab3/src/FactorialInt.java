public class FactorialInt {

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE + 1);

        System.out.println("Int factorials:");
        printIntFactorials();
        System.out.println("Long factorials:");
        printLongFactorials();
    }

    public static void printIntFactorials() {
        int i = 1;
        int fn = 1;
        while (true) {
            System.out.println("The factorial of " + i + " is " + fn);
            if (Integer.MAX_VALUE / fn < (i + 1)) {
                System.out.println("The factorial of " + (i + 1) + " is out of range");
                break;
            }
            i++;
            fn *= i;
        }
    }

    public static void printLongFactorials() {
        long i = 1;
        long fn = 1;
        while (true) {
            System.out.println("The factorial of " + i + " is " + fn);
            if (Long.MAX_VALUE / fn < (i + 1)) {
                System.out.println("The factorial of " + (i + 1) + " is out of range");
                break;
            }
            i++;
            fn *= i;
        }
    }
}
