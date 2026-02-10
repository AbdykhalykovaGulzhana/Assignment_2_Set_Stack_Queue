import org.w3c.dom.ls.LSOutput;

import java.util.ArrayDeque;
import java.util.Arrays;

public class Task_21 {
    static  class Shedule {
        ArrayDeque<String> tasks = new ArrayDeque<>();
        void  addTask(String task, boolean highPriority) {
            if (highPriority) {
                tasks.addFirst(task);
            } else {
                tasks.addLast(task);
            }
        }
        String processTask() {
            return tasks.poll();
        }
    }
    public static void main (String[] args) {
        Shedule scheduler = new Shedule();

        scheduler.addTask("Meeting ", true);
        scheduler.addTask("Go to the market", false);
        scheduler.addTask("Homework", true);

        System.out.println(scheduler.processTask());
        System.out.println(scheduler.processTask());
        System.out.println(scheduler.processTask());

    }
}
