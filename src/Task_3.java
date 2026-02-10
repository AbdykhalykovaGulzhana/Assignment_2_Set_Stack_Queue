import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

public class Task_3 {
    public static void main (String[] args) {

        HashSet<Integer> nums = new HashSet<>(Arrays.asList(1, 5, 12, 4, 9 ));

        System.out.println("Size: " + nums.size());

        nums.clear();

        System.out.println("Is it empty?: " + nums.isEmpty());




    }
}
