import java.util.Scanner;

public class PrintArray {
    public static void main (String[] args) {
        //Declare variables
        final int NUM_ITEMS;
        int[] items;

        // Read the input as int
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        NUM_ITEMS = sc.nextInt();

        // Allocate the array
        items = new int [NUM_ITEMS];

        System.out.print("Enter the value of all items (separated by space): ");

        // Read values
        if (items.length > 0) {
            for (int i = 0; i < items.length; i++) {
                items[i] = sc.nextInt();
            }
        }
        sc.close();

        // Print array contents
        System.out.print("The value are: [");
        System.out.print(items[0]);
        for (int i=1; i < items.length; i++) {
            System.out.print(", " + items[i]);
        }
        System.out.print("]");
    }
}
