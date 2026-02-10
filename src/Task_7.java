import java.util.Arrays;
import java.util.HashSet;

public class Task_7 {
    public static void main (String[] args) {
        HashSet<String> setX = new HashSet<>(Arrays.asList("boy", "shape", "java", "PL"));
        HashSet<String> setY = new HashSet<>(Arrays.asList("ball", "java", "python", "PL"));

        setX.retainAll(setY);
        System.out.println(setX);
    }
}
