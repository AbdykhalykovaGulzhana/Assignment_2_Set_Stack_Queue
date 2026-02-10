import java.util.ArrayDeque;
import java.util.Arrays;

public class Task_17 {
    public static void main (String[] args) {
        ArrayDeque<String> letters = new ArrayDeque<>(Arrays.asList("a", "b", "c", "b"));

        letters.removeFirstOccurrence("b");

        System.out.println(letters);
    }
}
