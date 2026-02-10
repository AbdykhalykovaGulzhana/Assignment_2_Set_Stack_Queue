import java.util.ArrayDeque;
import java.util.Arrays;

public class Task_19 {
    public static void main (String[] args) {
        ArrayDeque<Integer> nums = new ArrayDeque<>(Arrays.asList(1, 4, 8));

        nums.clear();
        System.out.println(nums.peek());
        System.out.println(nums.isEmpty());
    }
}
