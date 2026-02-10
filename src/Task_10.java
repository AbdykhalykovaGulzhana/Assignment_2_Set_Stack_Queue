import java.util.HashSet;
import java.util.Locale;

public class Task_10 {
    public static void main (String[] args) {
        String [] words = {"Apple", "apple", "APPLE", "ananas"};

        HashSet<String> unique = new HashSet<>();
        for (String word : words) {
            unique.add(word.toLowerCase());
        }
        System.out.println("Case-insensitive unique words: " + unique);
    }
}
