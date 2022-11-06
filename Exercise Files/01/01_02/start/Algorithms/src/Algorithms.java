/**
 * Specific properties
 */
public class Algorithms {

    // this will autofail if s.length is < 3
    static boolean isPasswordComplex(String s) {
        return s.chars().anyMatch(Character::isUpperCase)
                && s.chars().anyMatch(Character::isLowerCase)
                && s.chars().anyMatch(Character::isDigit);
    }

    public static void main(String[] args) {
        System.out.println("complex " + isPasswordComplex("Hell0"));
        System.out.println("complex " + isPasswordComplex("Hello"));
        System.out.println("complex " + isPasswordComplex("HELLO"));
        System.out.println("complex " + isPasswordComplex("hello"));
    }
}
