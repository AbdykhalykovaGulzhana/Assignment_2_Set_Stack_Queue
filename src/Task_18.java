import java.util.ArrayDeque;
import java.util.Arrays;

public class Task_18 {
    public static void main (String[] args) {
        ArrayDeque<Integer> nums = new ArrayDeque<>(Arrays.asList(5, 8, 4, 2));

        while(!nums.isEmpty()) {
            System.out.println(nums.size());
            nums.remove();
            System.out.println(nums.isEmpty());
        }
    }
}
