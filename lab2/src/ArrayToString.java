public class ArrayToString {
    public static void main(String[] args) {

    }
    public static String arrayToString(int[] array){
        StringBuilder arrayString = new StringBuilder("[");
        for (int element: array){ // for each
            arrayString.append(element).append(", ");
        }
        arrayString.delete(arrayString.length()-2,arrayString.length());
        arrayString.append("]");
        return arrayString.toString();
    }

    public
}
