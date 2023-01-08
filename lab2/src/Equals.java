
public class Equals {
    public static void main(String[] args) {
        int[] array1 = {2, 6, 12, 9};
        int[] array2 = {3, 4, 7, 9};
        int[] array3 = {2, 6, 12, 9};

        System.out.println(equals(array1, array2));
        System.out.println(equals(array1, array3));
    }


    public static boolean equals(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        } else {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    return false;
                }
            }
            return true;
        }
    }
}
