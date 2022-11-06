import java.util.Arrays;

public class Algorithms {

    public static boolean linearSearch(int[] arr, int item) {
        return Arrays.stream(arr)
                .anyMatch(i -> i == item);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
    }
}
