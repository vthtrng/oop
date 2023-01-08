import java.util.Scanner;

public class PrintArrayInStars {
    public static void main(String[] args) {
        // Declare variables
        final int NUM_ITEMS;
        int[] items;

        // Read number of items
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        NUM_ITEMS = sc.nextInt();

        // Allocate the array
        items = new int[NUM_ITEMS];
        System.out.print("Enter the value of all items (separated by space): ");

        // Read values
        if (items.length > 0) {
            for (int i = 0; i < items.length; i++) {
                items[i] = sc.nextInt();
            }
        }
        sc.close();

        //Print array in "index: number of stars" using a nested-loop
        for (int idx = 0; idx < items.length; idx++) { // row
            System.out.print(idx + ": ");
            // Print value as number of stars
            for (int starNo = 1; starNo <= items[idx]; starNo++) { // col
                System.out.print("*");
            }
            System.out.print("(" + items[idx] + ")");
            System.out.println();
        }
    }
}
