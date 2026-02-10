import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Task_2 {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        HashSet<String> userNames = new HashSet<>(Arrays.asList("Madina", "Rayana", "Bema", "Tom"));
        System.out.println("Enter the name: ");
        String name = scanner.nextLine();

        System.out.println(userNames.contains(name));
    }
}
