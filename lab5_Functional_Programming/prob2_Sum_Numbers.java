package lab5_Functional_Programming;

import java.util.Scanner;
import java.util.function.Function;

public class prob2_Sum_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Function<String, Integer> countIntegers = e -> e.split(",\\s+").length;
        System.out.println("Count = " + countIntegers.apply(input));
        Function<String, Integer> sumIntegers = e -> {
            String[] arrayInput = e.split(",\\s+");
            int sum = 0;
            for (String element : arrayInput) {
                sum += Integer.parseInt(element);
            }
            return sum;
        };
        System.out.println("Sum = " + sumIntegers.apply(input));
    }
}
