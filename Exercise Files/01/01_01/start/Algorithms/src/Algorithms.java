/**
 * all-or-nothing properties
 */
public class Algorithms {

    static boolean isUppercase(String s) {
        return s.chars().allMatch(Character::isUpperCase);
    }

    static boolean isLowercase(String s) {
        return s.chars().noneMatch(Character::isUpperCase);
    }

    public static void main(String[] args) {
        System.out.println("is uppercase: " + isUppercase("hello"));
        System.out.println("is lowercase: " + isLowercase("hello"));
    }
}
