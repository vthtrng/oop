import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        final int secretNumber = (int) (Math.random() * 100);
        numberGuess(secretNumber);
    }

    public static void numberGuess(int secretNumber) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Key in your guess:");

        int trials = 0;
        int trialNumber = sc.nextInt();

        while (trialNumber != secretNumber) {
            trials++;
            if (trialNumber < secretNumber) {
                System.out.println("Try higher");
            } else {
                System.out.println("Try lower");
            }
            trialNumber = sc.nextInt();
        }
        System.out.print("You got it in " + trials + " trials!");

    }
}
