import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
public class Task_9 {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sentence: ");

        String sentence = scanner.nextLine();
        String[] words = sentence.split(" ");

        HashSet<String> uniquewords = new HashSet<>(Arrays.asList(words));
        System.out.println("Unique words: " + uniquewords);
    }
}

