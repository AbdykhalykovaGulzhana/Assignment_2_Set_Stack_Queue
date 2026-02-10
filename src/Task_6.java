import java.util.Arrays;
import java.util.HashSet;

public class Task_6 {
    public static void main (String[] args) {

        HashSet<Integer> setA = new HashSet<>(Arrays.asList(78, 43, 6, 8, 10, 7));
        HashSet<Integer> setB = new HashSet<>(Arrays.asList(6, 98, 11, 45, 43, 7));

        setA.removeAll(setB);

        System.out.println(setA);
    }
}
