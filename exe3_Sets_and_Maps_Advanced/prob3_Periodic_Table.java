package exe3_Sets_and_Maps_Advanced;

import java.util.Scanner;
import java.util.TreeSet;

public class prob3_Periodic_Table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<String> setCompounds = new TreeSet<>();
        int input = Integer.parseInt(scanner.nextLine());
        while (input-- > 0) {
            String[] compoundsLine = scanner.nextLine().split("\\s+");
            for (String e : compoundsLine) {
                setCompounds.add(e);
            }
        }
        setCompounds.forEach(e -> System.out.print(e + " "));
    }
}
