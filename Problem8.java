import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String s1 = "bcabc";
        String s2 = "cbacdcbc";

        System.out.println("After removing duplicates from \"" + s1 + "\": " + removeDuplicateLetters(s1));
        System.out.println("After removing duplicates from \"" + s2 + "\": " + removeDuplicateLetters(s2));
    }

    public static String removeDuplicateLetters(String s) {
        Set<Character> set = new LinkedHashSet<>();
        for (char c : s.toCharArray()) {
            set.add(c);
        }
        StringBuilder result = new StringBuilder();
        for (char c : set) {
            result.append(c);
        }
        return result.toString();
    }
}
