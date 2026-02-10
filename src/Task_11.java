import java.util.ArrayDeque;

public class Task_11 {
    public static void main (String[] args) {
        ArrayDeque<Integer> nums = new ArrayDeque<>();

        nums.offer(1);
        nums.offer(9);
        nums.offer(5);
        nums.offer(3);

        System.out.println("Peek: " + nums.peek());

        while (nums.peek() != null) {
            System.out.println("Poll: " + nums.poll());
        }
    }
}
