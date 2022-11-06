import java.util.Arrays;
import java.util.stream.Collectors;

public class Algorithms {

    // my solution
    public static String reverseEachWord(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }
        return Arrays.stream(s.split(" "))
                .map(String::trim)
                .map(Algorithms::reverse)
                .collect(Collectors.joining(" "));
    }

    public static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseEachWord(null));
        System.out.println(reverseEachWord(""));
        System.out.println(reverseEachWord(" "));
        System.out.println(reverseEachWord("sally is a great worker"));
        System.out.println(reverseEachWord("racer racecar madam"));
        System.out.println(reverseEachWord("what can I do today"));
    }
}
