import java.util.Scanner;

public class GradesStatistics {
    public static void main(String[] args) {
        // Declare variables
        int numStudents;
        int[] grades;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        // Read number of student
        numStudents = sc.nextInt();

        // Allocate the array
        grades = new int[numStudents];
        // Read grades
        for (int i = 0; i < grades.length; i++) {
            System.out.print("Enter the grade for student " + (i+1) +": ");
            grades[i] = sc.nextInt();
        }

        calAver(grades);
        getMin(grades);
        getMax(grades);

    }
    public static void calAver (int[] grades) {
        int sum = 0;
        int length = grades.length;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        double aver = sum / length;
        System.out.println("The averge is: " + aver);
    }

    public static void getMin (int[] grades) {
        int min = grades[0];
        for (int i = 1; i < grades.length; i++) {
            if (grades[i] < min) {
                min = grades[i];
            }
        }
        System.out.println("The minimum is: " + min);
    }

    public static void getMax (int[] grades) {
        int max = grades[0];
        for (int i = 1; i < grades.length; i++) {
            if (grades[i] > max) {
                max = grades[i];
            }
        }
        System.out.println("The maximum is: " + max);
    }
}
