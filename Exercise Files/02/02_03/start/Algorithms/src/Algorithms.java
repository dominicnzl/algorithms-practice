import java.util.Arrays;

public class Algorithms {

    public static boolean binarySearch(int[] arr, int item) {
        int indexMin = 0;
        int indexMax = arr.length - 1;

        // when the indexMin > indexMax, the inner array we are searching through must be empty and the item we are
        // looking for does not exist in that array
        while (indexMin <= indexMax) {
            int indexMid = (indexMin + indexMax) / 2;
            System.out.println(indexMid);

            if (item == arr[indexMid]) {
                return true;
            }
            if (item < arr[indexMid]) {
                indexMax = indexMid - 1;
            } else {
                indexMin = indexMid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        System.out.println(binarySearch(arr, 3)); // true
        System.out.println(binarySearch(arr, 1)); // true
        System.out.println(binarySearch(arr, 8)); // false
        System.out.println(Arrays.binarySearch(arr, 4)); // returns index of the key: 3
    }
}
