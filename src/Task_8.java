import java.util.Arrays;
import java.util.HashSet;

public class Task_8 {
    public static void main (String[] args) {
        HashSet<String> setA = new HashSet<>(Arrays.asList("Apple", "Banana", "Ananas", "Kiwi", "Strawberry"));
        HashSet<String> setB = new HashSet<>(Arrays.asList("Kiwi", "Banana"));

        if (setA.containsAll(setB)) {
            System.out.println("Set A contains all elements of set B");
        } else {
            System.out.println("Set A does not contain all elements of set B");
        }
    }
}
