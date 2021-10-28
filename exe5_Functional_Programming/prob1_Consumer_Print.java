package exe5_Functional_Programming;

import java.util.Scanner;
import java.util.function.Consumer;

public class prob1_Consumer_Print {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] arrInput = input.split("\\s+");
        Consumer<String[]> printNames = name -> {
            for (String e : name) {
                System.out.println(e);
            }
        };
        printNames.accept(arrInput);
    }
}
