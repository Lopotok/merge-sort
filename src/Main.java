import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.printf("Merge Sort -Enyimé");


    }

    public static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            if (array[i]>array[i+1]){
                return false;
            }
        } return true;
    }

    public static int[] merge(int[] left, int[] right) {
    return null;
    }
    public static int [] mergeSort ( int [] array){
        if ( isSorted(array)){
            return array;
        }
        int [] left= Arrays.copyOfRange(array,0,array.length/2);
        int [] right= Arrays.copyOfRange(array,array.length/2,array.length);
        left = mergeSort(left);
        right = mergeSort(right);
        int []merge = merge(left,right);
        return null;
    }
}
