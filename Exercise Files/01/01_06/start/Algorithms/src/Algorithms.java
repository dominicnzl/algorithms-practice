public class Algorithms {

    static String reverse(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }
        var reversed = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed.append(s.charAt(i));
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverse(null));
        System.out.println(reverse(""));
        System.out.println(reverse("Hello"));
        System.out.println(reverse("radar"));
        System.out.println(reverse("Hi!"));
    }
}
