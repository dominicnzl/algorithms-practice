public class Algorithms {

    // incrementing by two will cut the time complexity in half, but we will need to adjust the terminating statement to
    // prevent a nullpointer
    public static boolean isAtEvenIndex(String s, char item) {
        if (s == null || s.isEmpty()) {
            return false;
        }
        for (int i = 0; i < s.length() / 2 + 1; i = i + 2) {
            if (s.charAt(i) == item) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isAtEvenIndex("HeLLo", 'L'));
        System.out.println(isAtEvenIndex("HeLLo", 'T'));
        System.out.println(isAtEvenIndex("HeLLo", 'H'));
        System.out.println(isAtEvenIndex("HeLLo", 'f'));
    }
}
