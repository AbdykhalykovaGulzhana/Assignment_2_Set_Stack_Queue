import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Task_4 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> names = new HashSet<>(Arrays.asList("Bema", "Tora", "Hara", "Roma", "Toma"));

        System.out.println("Enter the name that need to remove: ");
        String deleteName = scanner.nextLine();
        names.remove(deleteName);

        System.out.println("Name that was deleted: " + deleteName);
        System.out.println(names);
    }
}
