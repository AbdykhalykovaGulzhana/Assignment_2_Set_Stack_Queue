import java.util.ArrayDeque;

public class Task_15 {
    public static void main (String[] args) {
        ArrayDeque<Integer> nums = new ArrayDeque<>();

        nums.add(3);
        nums.add(12);
        nums.add(4);

        System.out.println(nums.peek());
        System.out.println(nums.peekFirst());
        System.out.println(nums.peekLast());
    }
}
