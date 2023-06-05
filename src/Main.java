import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.printf("Merge Sort -Enyimé");


        int[] array = {1, 4, 3, 563, -2, 5, -12, 1, 23, 45, 45, 6, 7, 34, -5, 2412, 12};
        array = mergeSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static int[] merge(int[] left, int[] right) {
        int[] array = new int[left.length + right.length];
        int arrayIndex = 0;
        int leftIndex = 0;
        int rightIndex = 0;
        while (arrayIndex < array.length &&
                rightIndex < right.length &&
                leftIndex < left.length) {
            if (left[leftIndex] < right[rightIndex]) {
                array[arrayIndex] = left[leftIndex];
                leftIndex++;
            } else {
                array[arrayIndex] = right[rightIndex];
                rightIndex++;
            }
            arrayIndex++;
        }
        while (rightIndex < right.length) {
            array[arrayIndex] = right[rightIndex];
            rightIndex++;
            arrayIndex++;
        }
        while (leftIndex < left.length) {
            array[arrayIndex] = left[leftIndex];
            leftIndex++;
            arrayIndex++;
        }
        return array;
    }

    public static int[] mergeSort(int[] array) {
        if (isSorted(array)) {
            return array;
        }
        int[] left = Arrays.copyOfRange(array, 0, array.length / 2);
        int[] right = Arrays.copyOfRange(array, array.length / 2, array.length);
        left = mergeSort(left);
        right = mergeSort(right);
        int[] merged = merge(left, right);
        return merged;
    }
}

