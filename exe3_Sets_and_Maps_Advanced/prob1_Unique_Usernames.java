package exe3_Sets_and_Maps_Advanced;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class prob1_Unique_Usernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashSet<String> setNames = new LinkedHashSet<>();
        int input = Integer.parseInt(scanner.nextLine());
        while (input-- > 0) {
            setNames.add(scanner.nextLine());
        }
        setNames.forEach(System.out::println);
    }
}
