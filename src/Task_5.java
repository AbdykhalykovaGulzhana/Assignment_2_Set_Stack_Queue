import java.util.Arrays;
import java.util.HashSet;

public class Task_5 {
    public static void main (String[] args) {
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(78, 43, 6, 8));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(6, 98, 11, 45));

        set1.addAll(set2);

        System.out.println(set1);
    }
}
