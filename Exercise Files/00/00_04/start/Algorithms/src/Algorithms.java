public class Algorithms {

    public static int findMaximum(int a, int b, int c) {
        if (a > b) {
            if (a > c || a == c) {
                return a;
            }
        }

        if (b > c) {
            return b;
        }

        return c;
    }

    // reduce number of comparisons to two by adding another variable to hold the maximum value
    static int findMax2(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    public static void main(String[] args) {

        System.out.println(findMaximum(1, 2, 3));
        System.out.println(findMaximum(8, 8, 1));
        System.out.println(findMaximum(3, 2, 3));
        System.out.println(findMaximum(1, 1, 9));
        System.out.println(findMaximum(1, 9, 9));
    }
}
