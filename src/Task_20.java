import java.util.ArrayDeque;
import java.util.Arrays;

public class Task_20 {
    public static void main (String[] args) {
        ArrayDeque<Character> letter = new ArrayDeque<>();
        String word = "level";

        for (char ch : word.toCharArray()) {
            letter.add(ch);
        }
        while (letter.size() > 1) {
            if (letter.poll() != letter.pollLast()) {
                System.out.println("Not a palindrome");
                return;
            }
        }
        System.out.println("Palindrome");
    }
}
