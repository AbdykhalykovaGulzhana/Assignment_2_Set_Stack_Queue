import java.util.ArrayDeque;
import java.util.Arrays;

public class Task_16 {
    public static void main (String[] args) {
        ArrayDeque<Integer> nums = new ArrayDeque<>(Arrays.asList(1, 4, 8, 12));

        while (!nums.isEmpty()) {
            System.out.println(nums.poll());
        }
    }
}
