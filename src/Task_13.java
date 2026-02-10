import java.util.ArrayDeque;

public class Task_13 {
    public static void main (String[] args) {
        ArrayDeque<Integer> nums = new ArrayDeque<>();
        nums.addFirst(3);
        nums.addLast(8);
        nums.addFirst(11);
        nums.addLast(9);

        System.out.println(nums);
    }
}
