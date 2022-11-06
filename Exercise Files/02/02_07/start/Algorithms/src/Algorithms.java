import java.util.Arrays;

public class Algorithms {

    // my solution
    public static void rotateArrayLeft(int[] arr) {
        int temp = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                arr[i] = temp;
            } else {
                arr[i] = arr[i + 1];
            }
        }
    }

    // my solution
    static void rotateArrayRight(int[] arr) {
        int temp = arr[arr.length - 1];
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i == 0) {
                arr[i] = temp;
            } else {
                arr[i] = arr[i - 1];
            }
        }
    }

    // course solution
    static void rotateLeft(int[] arr) {
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = temp;
    }

    // course solution
    static void rotateRight(int[] arr) {
        int temp = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        rotateArrayLeft(arr);
        Arrays.stream(arr).forEach(System.out::println);
        rotateArrayRight(arr);
        Arrays.stream(arr).forEach(System.out::println);
        rotateArrayRight(arr);
        Arrays.stream(arr).forEach(System.out::println);
        System.out.println("course solution below");
        rotateLeft(arr);
        Arrays.stream(arr).forEach(System.out::println);
        rotateRight(arr);
        Arrays.stream(arr).forEach(System.out::println);
        rotateRight(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }
}
