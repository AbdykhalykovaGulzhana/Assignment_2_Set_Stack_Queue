import java.util.ArrayDeque;

public class Task_12 {
    public static void main(String[] args) {
        ArrayDeque <String> stack = new ArrayDeque<>();

        stack.push("blue");
        stack.push("red");
        stack.push("black");

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
