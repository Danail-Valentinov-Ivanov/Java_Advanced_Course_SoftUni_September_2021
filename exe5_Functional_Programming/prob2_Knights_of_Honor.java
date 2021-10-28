package exe5_Functional_Programming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class prob2_Knights_of_Honor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] arrInput = input.split("\\s+");
        Consumer<String> printLine = name -> System.out.println("Sir " + name);
        Arrays.stream(arrInput).forEach(e -> printLine.accept(e));
    }
}
