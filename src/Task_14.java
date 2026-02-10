import java.util.ArrayDeque;

public class Task_14 {
    public static void main (String[] args) {
        ArrayDeque<Integer> nums = new ArrayDeque<>();

        nums.offerFirst(17);
        nums.offerLast(9);

        System.out.println(nums);
    }
}
